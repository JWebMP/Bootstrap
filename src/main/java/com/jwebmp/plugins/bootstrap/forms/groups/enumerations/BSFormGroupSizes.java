package com.jwebmp.plugins.bootstrap.forms.groups.enumerations;

import com.jwebmp.core.base.interfaces.ICssClassName;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

/**
 * The form group sizes available
 */
public enum BSFormGroupSizes
		implements ICssClassName
{
	Form_Control_Lg,
	Form_Control_Sm,
	;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase()
		            .replace(StaticStrings.CHAR_UNDERSCORE, StaticStrings.CHAR_DASH);
	}
}
