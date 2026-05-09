package com.jwebmp.plugins.bootstrap.pagination.parts;

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.interfaces.children.ListChildren;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;
import com.jwebmp.plugins.bootstrap.pagination.options.BSPaginationOptions;

/**
 * A pagination list item
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSPaginationListItem<J extends BSPaginationListItem<J>>
		extends ListItem<J>
		implements ListChildren
{


	/**
	 * A pagination list item
	 */
	public BSPaginationListItem()
	{
		addClass(BSPaginationOptions.Page_Item);
	}

	/**
	 * Disabled and active states
	 * <p>
	 * Pagination links are customizable for different circumstances. Use .disabled for links that appear un-clickable and .active to
	 * indicate the current page.
	 * <p>
	 * While the .disabled class uses pointer-events: none to try to disable the link functionality of A's, that CSS property is not yet
	 * standardized and doesn’t account for keyboard navigation. As
	 * such, you should always add tabindex="-1" on disabled links and use custom JavaScript to fully disable their functionality.
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setDisabled()
	{
		addClass(BSDefaultOptions.Disabled);
		addAttribute("tabindex", "-1");
		return (J) this;
	}

	/**
	 * Disabled and active states
	 * <p>
	 * Pagination links are customizable for different circumstances. Use .disabled for links that appear un-clickable and .active to
	 * indicate the current page.
	 * <p>
	 * While the .disabled class uses pointer-events: none to try to disable the link functionality of as, that CSS property is not yet
	 * standardized and doesn’t account for keyboard navigation. As
	 * such, you should always add tabindex="-1" on disabled links and use custom JavaScript to fully disable their functionality.
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setActive()
	{
		addClass(BSDefaultOptions.Active);
		return (J) this;
	}
}
