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

package com.jwebmp.plugins.bootstrap4.toggle;

import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.base.html.Button;
import com.jwebmp.base.html.Link;
import com.jwebmp.base.html.List;
import com.jwebmp.base.html.interfaces.children.ListChildren;

import javax.validation.constraints.NotNull;

public interface IBSDropDownToggle<J extends BSDropDownToggle<J>>
{
	/**
	 * Sets the title
	 *
	 * @param title
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setTitle(Button title);

	/**
	 * Returns the title component
	 *
	 * @return
	 */
	@NotNull
	ComponentHierarchyBase getTitle();

	/**
	 * Sets the title
	 *
	 * @param title
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setTitle(Link title);

	/**
	 * Returns the contents
	 *
	 * @return
	 */
	@NotNull
	List<ListChildren, ?, ?, ?> getContents();

	/**
	 * Sets the contents
	 *
	 * @param contents
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setContents(List contents);
}
