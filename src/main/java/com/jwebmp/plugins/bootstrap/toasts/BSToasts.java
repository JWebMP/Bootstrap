package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.annotations.boot.*;
import com.jwebmp.core.base.angular.client.annotations.references.*;
import com.jwebmp.core.base.angular.client.annotations.structures.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import jakarta.validation.constraints.*;

import java.util.List;
import java.util.*;

import static com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils.*;

@NgComponent("app-toasts")
@NgImportReference(value = "TemplateRef", reference = "@angular/core")
@NgBootDeclaration("BSToasts")

@NgField("data?: any;")
@NgField("private updated: boolean = false;")
@NgMethod("isTemplate(toast : any) { return toast.textOrTpl instanceof TemplateRef; }")
public class BSToasts<J extends BSToasts<J>> extends DivSimple<J> implements INgComponent<J>
{
	private static ToastDataService<?> toastDataService;
	private boolean icon;
	
	public BSToasts(ToastDataService<?> toastDataService)
	{
		this();
		BSToasts.toastDataService = toastDataService;
	}
	
	public BSToasts()
	{
		setTag("ngb-toast");
	}
	
	@Override
	public List<NgComponentReference> getComponentReferences()
	{
		if (toastDataService != null)
		{
			return List.of(getNgComponentReference((Class<? extends IComponent<?>>) toastDataService.getClass()));
		}
		else
		{
			return List.of();
		}
	}
	
	public String getServiceName()
	{
		if (toastDataService == null)
		{
			return "toastDataService";
		}
		String name = getTsFilename(toastDataService.getClass());
		name = name.substring(0, 1)
		           .toLowerCase() + name.substring(1);
		return name;
	}
	
	@Override
	public java.util.List<String> componentConstructorParameters()
	{
		List<String> out = new ArrayList<>();
		if (toastDataService != null)
		{
			out.add("public " + getServiceName() + " : " + toastDataService.getClass()
			                                                               .getSimpleName());
		}
		return out;
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			String name = getServiceName();
			if (toastDataService != null)
			{
				addAttribute("*ngFor", "let toast of data?.out ");
				addAttribute("[class]", "toast.classname ");
				addAttribute("[autohide]", "toast.autohide ");
				addAttribute("[delay]", "toast.delay || 5000");
				addAttribute("(hidden)", "" + name + ".remove(toast) ");
			}
		}
	}
	
	@Override
	protected @NotNull StringBuilder renderChildren()
	{
		StringBuilder sb = new StringBuilder();
		if (toastDataService != null)
		{
			sb.append("<ng-template ngbToastHeader *ngIf=\"toast.header\"> <strong class=\"me-auto {{toast.classname}}\"> {{toast.header}} </strong> </ng-template>");
			sb.append("{{ toast.body }}");
		}
		return sb;
	}
	
	@Override
	public List<String> afterViewInit()
	{
		List<String> out =  INgComponent.super.afterViewInit();
		if(toastDataService != null)
		{
			out.add("        this." + getServiceName() + ".data.subscribe((dd : any) => {\n" +
			        "            this.data = dd;\n" +
			        "            this.updated = true;\n" +
			        "        });\n");
		}
		return out;
	}
	
	@Override
	public List<String> host()
	{
		return List.of("{'class': 'toast-container position-fixed top-0 end-0 p-3', 'style': 'z-index: 1200'}");
	}
	
	
}
