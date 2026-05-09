package com.jwebmp.plugins.bootstrap.breadcrumbs;

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
