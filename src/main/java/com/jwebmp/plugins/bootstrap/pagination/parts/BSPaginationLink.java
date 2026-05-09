package com.jwebmp.plugins.bootstrap.pagination.parts;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.pagination.options.BSPaginationOptions;

/**
 * A pagination link for an item, usually auto generated from BSPagination
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSPaginationLink<J extends BSPaginationLink<J>>
		extends Link<J>
{


	/**
	 * A pagination link for an item, usually auto generated from BSPagination
	 *
	 * @param ariaLabel
	 * 		In addition, as pages likely have more than one such navigation section, it’s advisable to provide a descriptive aria-label
	 * 		for the
	 * 		nav to reflect its purpose. For example, if
	 * 		the pagination component is used to navigate between a set of search results, an appropriate label could be aria-label="Search
	 * 		results pages".
	 */
	public BSPaginationLink(String ariaLabel)
	{
		addClass(BSPaginationOptions.Page_Link);
		addAttribute(LinkAttributes.HRef, StaticStrings.STRING_HASH);
		addAttribute(GlobalAttributes.Aria_Label, ariaLabel);
	}

	/**
	 * Returns this items parent (usually, may throw exceptions if used other than BSPagination.createLink();
	 *
	 * @return
	 */
	public BSPaginationListItem<?> getListItem()
	{
		return (BSPaginationListItem<?>) getParent();
	}
}
