package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.enumerations;

import za.co.mmagon.jwebswing.base.interfaces.ICSSClassName;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

/**
 * The form group sizes available
 */
public enum BSFormGroupSizes
		implements ICSSClassName
{
	Form_Control_Lg,
	Form_Control_Sm,;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase()
		            .replace(StaticStrings.CHAR_UNDERSCORE, StaticStrings.CHAR_DASH);
	}
}
