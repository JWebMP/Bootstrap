package com.jwebmp.plugins.bootstrap.buttons.groups.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Button group
 * <p>
 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style behavior
 * with our buttons plugin.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public enum BSButtonGroupSizeOptions
		implements IBSComponentOptions
{
	/**
	 * Make all buttons below large
	 */
	Btn_Group_Lg,
	/**
	 * Make all buttons below small
	 */
	Btn_Group_Sm,
	;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
