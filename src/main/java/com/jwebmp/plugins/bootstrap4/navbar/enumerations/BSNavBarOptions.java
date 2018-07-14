/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap4.navbar.enumerations;

import com.jwebmp.plugins.bootstrap4.options.IBSComponentOptions;
import com.jwebmp.utilities.StaticStrings;

import static com.jwebmp.utilities.StaticStrings.*;

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
