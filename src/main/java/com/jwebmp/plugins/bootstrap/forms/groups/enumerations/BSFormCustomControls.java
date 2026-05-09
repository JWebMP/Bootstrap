package com.jwebmp.plugins.bootstrap.forms.groups.enumerations;

import com.jwebmp.core.base.interfaces.ICssClassName;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

/**
 * The form group sizes available
 */
public enum BSFormCustomControls
		implements ICssClassName
{
	Custom_Control,
	Custom_Radio,
	Custom_CheckBox,
	Custom_Control_Inline,
	Custom_Control_Input,
	Custom_Control_Label,
	Custom_Switch,

	;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase()
		            .replace(StaticStrings.CHAR_UNDERSCORE, StaticStrings.CHAR_DASH);
	}
}
