package com.jwebmp.plugins.bootstrap.datetimepicker;

import com.google.common.base.*;
import com.jwebmp.core.base.angular.client.annotations.boot.*;
import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.html.*;

public class BSDateTimePicker<J extends BSDateTimePicker<J>>
		extends DivSimple<J>
		implements INgComponent<J>
{
	private String formControlName;
	private String name;
	private String placeholder;
	
	public BSDateTimePicker()
	{
		setTag("ng-bootstrap-datetime-angular");
		addAttribute("inputDatetimeFormat", "yyyy/MM/dd HH:mm:ss");
	}
	
	public BSDateTimePicker(String formControlName, String name)
	{
		this();
		this.formControlName = formControlName;
		this.name = name;
	}
	
	@Override
	public void init()
	{
		if (!Strings.isNullOrEmpty(formControlName))
		{
			addAttribute("formControlName", formControlName);
		}
		if(!Strings.isNullOrEmpty(name))
		{
			addAttribute("name", name);
		}
		if(!Strings.isNullOrEmpty(placeholder))
		{
			addAttribute("placeholder", placeholder);
		}
		super.init();
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public J setName(String name)
	{
		this.name = name;
		return (J)this;
	}
	
	public String getFormControlName()
	{
		return formControlName;
	}
	
	public J setFormControlName(String formControlName)
	{
		this.formControlName = formControlName;
		return (J)this;
	}
	
	public String getPlaceholder()
	{
		return placeholder;
	}
	
	public J setPlaceholder(String placeholder)
	{
		this.placeholder = placeholder;
		return (J)this;
	}
}
