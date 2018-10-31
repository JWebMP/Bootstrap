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
package com.jwebmp.plugins.bootstrap4.dropdown.parts;

import com.jwebmp.core.base.html.H6;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.dropdown.interfaces.BSDropDownChildren;
import com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions;

/**
 * Menu headers
 * <p>
 * Add a header to label sections of actions in any dropdown menu.
 *
 * @author GedMarc
 * @since 14 Jan 2017
 */
public class BSDropDownHeader<J extends BSDropDownHeader<J>>
		extends H6<J>
		implements BSDropDownChildren<IComponentHierarchyBase, J>
{


	/**
	 * Menu headers
	 * <p>
	 * Add a header to label sections of actions in any dropdown menu.
	 *
	 * @param text
	 */
	public BSDropDownHeader(String text)
	{
		this();
		setText(text);
	}

	public BSDropDownHeader()
	{
		dropdownConfig();
	}

	/**
	 * Sets tag to h6 and applies classes
	 */
	private void dropdownConfig()
	{
		addClass(BSDropDownOptions.Dropdown_Header);
	}
}
