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

package com.jwebmp.plugins.bootstrap4.listgroup;

import com.jwebmp.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.listgroup.parts.BSListGroupButtonItem;
import com.jwebmp.plugins.bootstrap4.listgroup.parts.BSListGroupLinkItem;
import com.jwebmp.plugins.bootstrap4.listgroup.parts.BSListGroupListItem;

import javax.validation.constraints.NotNull;

public interface IBSListGroup<J extends BSListGroup<J>>
		extends ICssStructure<J>
{
	/**
	 * Adds a new button item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@NotNull
	BSListGroupButtonItem<?> addButtonItem(String text);

	@NotNull
	BSListGroupButtonItem<?> addButtonItem(ListItemChildren icon, String text);

	/**
	 * Adds a new link item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@NotNull
	BSListGroupLinkItem<?> addLinkItem(String text);

	/**
	 * Adds a new listem item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@NotNull
	BSListGroupListItem<?> addListItem(String text);

	/**
	 * Flush
	 * Add .list-group-flush to remove some borders and rounded corners to render list group items edge-to-edge in a parent container (e
	 * .g.,
	 * cards).
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setFlush();
}
