/*
 * Copyright (C) 2017 GedMarc
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

package com.jwebmp.plugins.bootstrap4.navbar.toggler;

import com.jwebmp.plugins.bootstrap4.navbar.enumerations.BSNavBarOptions;
import com.jwebmp.plugins.bootstrap4.navs.BSNavs;

/**
 * A container for the objects that adding a toggler create
 */
public class BSNavBarToggleContainer<J extends BSNavBarToggleContainer<J>>

{
	private final BSNavBarToggler<?,?,?,?,?> toggler;
	private final BSNavs<?> content;

	/**
	 * Constructs a new container
	 */
	public BSNavBarToggleContainer()
	{
		this(new BSNavBarToggler<>(), new BSNavs<>());
	}

	/**
	 * Constructs a new container with the given toggler and content
	 *
	 * @param toggler
	 * @param content
	 */
	public BSNavBarToggleContainer(BSNavBarToggler<?,?,?,?,?> toggler, BSNavs<?> content)
	{
		this.toggler = toggler;
		this.content = content;

		content.addClass(BSNavBarOptions.Collapse$Navbar_Collapse);
		content.addClass("navbar-nav");
	}

	/**
	 * Returns the associated toggler
	 *
	 * @return
	 */
	public BSNavBarToggler<?,?,?,?,?> getToggler()
	{
		return toggler;
	}

	/**
	 * Gets the content associated
	 *
	 * @return
	 */
	public BSNavs<?> getContent()
	{
		return content;
	}
}


