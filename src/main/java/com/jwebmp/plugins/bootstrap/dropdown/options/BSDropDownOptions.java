package com.jwebmp.plugins.bootstrap.dropdown.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included
 * Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public enum BSDropDownOptions
		implements IBSComponentOptions
{
	Dropdown,
	Dropdown_Lg,
	Dropdown_Sm,
	DropUp,
	DropRight,
	DropLeft,
	Dropdown_Item,
	Dropdown_Menu,
	Dropdown_Toggle,
	Dropdown_Divider,
	Dropdown_Toggle_Split,
	Dropdown_Header,
	Arrow_None,
	Dropdown_Menu_Right;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
