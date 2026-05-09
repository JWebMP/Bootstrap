package com.jwebmp.plugins.bootstrap.pagination.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Sizing
 * <p>
 * Fancy larger or smaller pagination? Add .pagination-lg or .pagination-sm for additional sizes.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSPaginationSizingOptions
		implements IBSComponentOptions
{
	/**
	 * Sizing
	 * <p>
	 * Fancy larger or smaller pagination? Add .pagination-lg or .pagination-sm for additional sizes.
	 */
	Pagination_Lg,
	/**
	 * Sizing
	 * <p>
	 * Fancy larger or smaller pagination? Add .pagination-lg or .pagination-sm for additional sizes.
	 */
	Pagination_Sm,
	;

	BSPaginationSizingOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
