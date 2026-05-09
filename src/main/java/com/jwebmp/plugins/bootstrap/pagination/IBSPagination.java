package com.jwebmp.plugins.bootstrap.pagination;

import com.jwebmp.plugins.bootstrap.pagination.parts.BSPaginationLink;
import com.jwebmp.plugins.bootstrap.pagination.parts.BSPaginationList;

/**
 * @author GedMarc
 * @since 21 Feb 2017
 */
public interface IBSPagination
{

	/**
	 * Creates a new pagination button link.
	 * <p>
	 * Use .getParent() to access the list item object
	 *
	 * @param ariaLabel
	 *
	 * @return
	 */
	BSPaginationLink<?> createPageLink(String ariaLabel);

	/**
	 * The actual list for the pagination
	 *
	 * @return
	 */
	BSPaginationList<?> getPageList();

	/**
	 * The actual list for the pagination
	 *
	 * @param pageList
	 */
	void setPageList(BSPaginationList<?> pageList);

}
