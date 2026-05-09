package com.jwebmp.plugins.bootstrap.pagination.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Pagination
 * <p>
 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page approach
 * to long lists of content improves general performance, such
 * as in search results or inboxes.<p>
 * Included is support for left and right aligned content, content alignment options, nesting, and more.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSPaginationOptions
		implements IBSComponentOptions
{
	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 */
	Pagination,
	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 */
	Page_Item,
	/**
	 * Pagination
	 * <p>
	 * Pagination links indicate a series of related content exists across multiple pages. Typically these are used where a multi-page
	 * approach to long lists of content improves general performance,
	 * such as in search results or inboxes.
	 */
	Page_Link,
	;

	BSPaginationOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
