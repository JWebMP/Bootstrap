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
package com.jwebmp.plugins.bootstrap4.breadcrumbs;

import com.jwebmp.core.base.html.List;

/**
 * Breadcrumb
 * <p>
 * Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS through ::before and
 * content.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */

class BSBreadcrumbContainer<J extends BSBreadcrumbContainer<J>>
		extends List<BSBreadcrumbsChildren, BSBreadcrumbsAttributes, BSBreadcrumbsEvents, J>
{


	/**
	 * Breadcrumbs
	 * <p>
	 * Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS through ::before and
	 * content.
	 */
	@SuppressWarnings("")
	public BSBreadcrumbContainer()
	{
		super(true);
		addClass(BSComponentBreadcrumbOptions.Breadcrumb);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}
}
