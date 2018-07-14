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

import com.jwebmp.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap4.dropdown.interfaces.BSDropDownChildren;
import com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions;

/**
 * @author GedMarc
 * @since 13 Jan 2017
 */
public class BSDropDownMenu<J extends BSDropDownMenu<J>>
		extends DivSimple<J>
		implements BSDropDownChildren
{

	private static final long serialVersionUID = 1L;

	/**
	 * Identifies a drop down menu
	 *
	 * @author GedMarc
	 * @since 13 Jan 2017
	 */
	public BSDropDownMenu()
	{
		addClass(BSDropDownOptions.Dropdown_Menu);
	}

	/**
	 * Adds a new item to the menu
	 *
	 * @param text
	 *
	 * @return
	 */
	public BSDropDownLink addItem(String text)
	{
		BSDropDownLink link = new BSDropDownLink();
		link.setText(text);
		add(link);
		return link;
	}

	/**
	 * Adds a divider to the menu
	 *
	 * @return
	 */
	public BSDropDownDivider<?> addDivider()
	{
		BSDropDownDivider divider = new BSDropDownDivider();
		add(divider);
		return divider;
	}

	/**
	 * Adds a header with the given text set
	 *
	 * @param text
	 *
	 * @return
	 */
	public BSDropDownHeader<?> addHeader(String text)
	{
		BSDropDownHeader<?> menu = new BSDropDownHeader<>();
		menu.setText(text);
		add(menu);
		return menu;
	}

	/**
	 * Sets this menu as displayed right aligned
	 *
	 * @return
	 */
	public J setRightAligned()
	{
		addClass(BSDropDownOptions.Dropdown_Menu_Right);
		return (J) this;
	}

}
