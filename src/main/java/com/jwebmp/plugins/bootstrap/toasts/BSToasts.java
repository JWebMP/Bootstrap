package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import jakarta.validation.constraints.*;

import java.util.List;
import java.util.*;

@NgComponent("app-toasts")
@NgImportReference(name = "TemplateRef, AfterViewInit", reference = "@angular/core")
@NgImportReference(name = "OnDestroy", reference = "@angular/core")
@NgBootDeclaration("BSToasts")
public class BSToasts<J extends BSToasts<J>> extends DivSimple<J> implements INgComponent<J>
{
	private static ToastDataService<?> toastDataService;
	
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
	public List<String> componentInterfaces()
	{
		return List.of("AfterViewInit");
	}
	
	@Override
	public List<NgComponentReference> getComponentReferences()
	{
		if (toastDataService != null)
		{
			return List.of(getNgComponentReference((Class<? extends ITSComponent<?>>) toastDataService.getClass()));
		}
		else
		{
			return List.of();
		}
	}
	
	@Override
	public List<String> componentFields()
	{
		return List.of("    data?: any;\n" +
		               "    private updated: boolean = false;");
	}
	
	public String getServiceName()
	{
		if (toastDataService == null)
		{
			return "toastDataService";
		}
		String name = ITSComponent.getTsFilename(toastDataService.getClass());
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
			sb.append("<ng-template ngbToastHeader> <strong class=\"me-auto\"> {{toast.header}} </strong> </ng-template>");
			sb.append("{{ toast.body }}");
		}
		return sb;
	}
	
	@Override
	public List<String> methods()
	{
		String name = getServiceName();
		if (toastDataService != null)
		{
			return List.of("ngAfterViewInit(): void {\n" +
			               "        this." + name + ".data.subscribe((dd : any) => {\n" +
			               "            this.data = dd;\n" +
			               "            this.updated = true;\n" +
			               "        });\n" +
			               "    }",
					
					
					"isTemplate(toast : any) { return toast.textOrTpl instanceof TemplateRef; }");
		}
		else
		{
			return List.of("ngAfterViewInit() {}");
		}
	}
	
	@Override
	public List<String> host()
	{
		return List.of("{'class': 'toast-container position-fixed top-0 end-0 p-3', 'style': 'z-index: 1200'}");
	}
}
