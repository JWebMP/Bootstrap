package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import jakarta.validation.constraints.*;

import java.util.List;
import java.util.*;

@NgComponent("app-toasts")
@NgImportReference(name = "TemplateRef", reference = "@angular/core")
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
	public List<NgComponentReference> getComponentReferences()
	{
		return List.of(getNgComponentReference((Class<? extends ITSComponent<?>>) toastDataService.getClass()));
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
			addAttribute("*ngFor", "let toast of " + name + ".data.toasts ");
			addAttribute("[class]", "toast.classname ");
			addAttribute("[autohide]", "toast.autohide ");
			addAttribute("[delay]", "toast.delay || 5000");
			addAttribute("(hidden)", "" + name + ".remove(toast) ");
		}
	}
	
	@Override
	protected @NotNull StringBuilder renderChildren()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("<ng-template ngbToastHeader> <strong class=\"me-auto\"> {{toast.header}} </strong> </ng-template>");
		sb.append("{{ toast.body }}");
		return sb;
	}
	
	@Override
	public List<String> methods()
	{
		return List.of("isTemplate(toast : any) { return toast.textOrTpl instanceof TemplateRef; }");
	}
	
	@Override
	public List<String> host()
	{
		return List.of("{'class': 'toast-container position-fixed top-0 end-0 p-3', 'style': 'z-index: 1200'}");
	}
}
