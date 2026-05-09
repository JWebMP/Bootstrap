package com.jwebmp.plugins.bootstrap.pagination.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Justify content
 * <p>
 * Use justify-content utilities on flexbox containers to change the alignment of flex items on the main axis (the x-axis to start, y-axis
 * if flex-direction: column). Choose from start (browser
 * default), end, center, between, or around.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSPaginationAlignmentOptions
		implements IBSComponentOptions
{
	/**
	 * Justify content
	 * <p>
	 * Use justify-content utilities on flexbox containers to change the alignment of flex items on the main axis (the x-axis to start,
	 * y-axis if flex-direction: column). Choose from start (browser
	 * default), end, center, between, or around.
	 */
	Justify_Content_Center,
	/**
	 * Justify content
	 * <p>
	 * Use justify-content utilities on flexbox containers to change the alignment of flex items on the main axis (the x-axis to start,
	 * y-axis if flex-direction: column). Choose from start (browser
	 * default), end, center, between, or around.
	 */
	Justify_Content_End;

	BSPaginationAlignmentOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
