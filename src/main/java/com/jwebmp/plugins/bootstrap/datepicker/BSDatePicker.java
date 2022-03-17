package com.jwebmp.plugins.bootstrap.datepicker;

import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.inputs.*;
import com.jwebmp.core.base.interfaces.*;

@NgModuleImportReference(name = "NgbDateStruct, NgbCalendar", reference = "@ng-bootstrap/ng-bootstrap")
public class BSDatePicker<J extends BSDatePicker<J>> extends InputTextType<J> implements INgComponent<J>
{
	private IComponentHierarchyBase<?, ?> toggle;
	
	public BSDatePicker()
	{
	
	}
	
	@Override
	public void init()
	{
		if (toggle == null)
		{
			setTag("ngb-datepicker");
			setInlineClosingTag(false);
			setClosingTag(true);
		}
		else
		{
			addAttribute("ngbDatepicker", "");
			addClass("form-control");
			setTag("input");
			setInlineClosingTag(false);
			setClosingTag(false);
		}
		addAttribute("#" + getID(), "ngbDatepicker");
		super.init();
	}
	
	@Override
	public java.util.List<String> constructorParameters()
	{
		return java.util.List.of("private calendar: NgbCalendar");
	}
	
	@SuppressWarnings("unchecked")
	public <T extends IComponentHierarchyBase<?, ?>> J createToggle(T component)
	{
		this.toggle = component;
		component.asAttributeBase()
		         .addAttribute("(click)", getID() + ".toggle()");
		return (J) this;
	}
	
	@Override
	protected StringBuilder renderAfterTag()
	{
		if (this.toggle != null)
		{
			return new StringBuilder(toggle.toString(0));
		}
		return super.renderAfterTag();
	}
}
