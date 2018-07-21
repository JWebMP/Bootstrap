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

package com.jwebmp.plugins.bootstrap4.breadcrumbs;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.ICssStructure;

import javax.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSBreadCrumbItem<J extends BSBreadCrumbItem<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Adds a link to the Breadcrumb Link
	 *
	 * @param link
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J addLink(BSBreadCrumbLink link);

	/**
	 * Returns the crumb link, never null
	 *
	 * @return
	 */
	Link getCrumbLink();

	/**
	 * Sets the given crumb link
	 *
	 * @param crumbLink
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setCrumbLink(Link crumbLink);

	/**
	 * Sets this crumb to display as active
	 *
	 * @param active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setActive(boolean active);
}
