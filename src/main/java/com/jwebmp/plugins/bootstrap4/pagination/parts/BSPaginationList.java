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
package com.jwebmp.plugins.bootstrap4.pagination.parts;

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap4.pagination.BSPaginationChildren;
import com.jwebmp.plugins.bootstrap4.pagination.options.BSPaginationOptions;

/**
 * The default paging list
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSPaginationList<J extends BSPaginationList<J>>
		extends List<BSPaginationListItem, NoAttributes, GlobalEvents, J>
		implements BSPaginationChildren<BSPaginationListItem, J>
{


	/**
	 * The default paging list
	 */
	public BSPaginationList()
	{
		addClass(BSPaginationOptions.Pagination);
	}
}
