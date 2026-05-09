package com.jwebmp.plugins.bootstrap.pagination.parts;

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap.pagination.BSPaginationChildren;
import com.jwebmp.plugins.bootstrap.pagination.options.BSPaginationOptions;

/**
 * The default paging list
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSPaginationList<J extends BSPaginationList<J>>
		extends List<BSPaginationListItem, NoAttributes, GlobalEvents, J>
		implements BSPaginationChildren
{


	/**
	 * The default paging list
	 */
	public BSPaginationList()
	{
		addClass(BSPaginationOptions.Pagination);
	}
}
