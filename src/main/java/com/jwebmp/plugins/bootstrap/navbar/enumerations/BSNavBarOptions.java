package com.jwebmp.plugins.bootstrap.navbar.enumerations;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Navbar
 * <p>
 * The navbar is a wrapper that positions branding, navigation, and other elements in a concise header. It’s easily extensible and, thanks
 * to our Collapse plugin, can easily integrate responsive
 * behaviors.
 *
 * @author GedMarc
 */
public enum BSNavBarOptions
		implements IBSComponentOptions
{
	/**
	 * Default navbar
	 */
	$,

	/**
	 * .navbar-brand for your company, product, or project name.
	 */
	Brand,

	/**
	 * .navbar-nav for a full-height and lightweight navigation (including support for dropdowns).
	 */
	Nav,

	/**
	 * .navbar-toggler for use with our collapse plugin and other navigation toggling behaviors.
	 */
	Toggler,
	/**
	 * .navbar-text for adding vertically centered strings of text.
	 */
	Text,
	/**
	 * .collapse.navbar-collapse for grouping and hiding navbar contents by a parent breakpoint.
	 */
	Collapse$Navbar_Collapse,
	Navbar_Toggler_Icon,
	Navbar_Toggler;

	BSNavBarOptions()
	{

	}

	@Override
	public String toString()
	{
		String output = "";
		if (this != Collapse$Navbar_Collapse)
		{
			output = "navbar";
			if (this != $)
			{
				output += "-";
			}
		}
		output += name().toLowerCase()
		                .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH)
		                .replace(StaticStrings.CHAR_DOLLAR, CHAR_SPACE);
		return output.trim();
	}

}
