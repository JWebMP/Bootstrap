package com.jwebmp.plugins.bootstrap.buttons.groups.options;

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
public enum BSButtonGroupOptions
		implements IBSComponentOptions
{
	/**
	 * Button group
	 * <p>
	 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style
	 * behavior with our buttons plugin.
	 */
	Btn_Group,
	/**
	 * Make a set of buttons appear vertically stacked rather than horizontally. Split button dropdowns are not supported here.
	 */
	Btn_Group_Vertical;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
