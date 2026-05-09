package com.jwebmp.plugins.bootstrap.breadcrumbs;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Breadcrumb
 * <p>
 * Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS through ::before and
 * content.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSComponentBreadcrumbOptions
		implements IBSComponentOptions
{
	/**
	 * Specifies the item as a breadcrumb group
	 */
	Breadcrumb,
	/**
	 * Specifies the list item object as a bread crumb item
	 */
	Breadcrumb_Item,
	/**
	 * Marks the item as active
	 */
	Active;

	BSComponentBreadcrumbOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
