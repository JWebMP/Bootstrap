package com.jwebmp.plugins.bootstrap.badge;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @since 18 Jan 2017
 */
public enum BSBadgeOptions
		implements IBSComponentOptions
{
	/**
	 * Base badge class
	 */
	Badge,
	/**
	 * Default styling
	 */
	Badge_Default,
	/**
	 * Primary colour styling
	 */
	Badge_Primary,
	/**
	 * Secondary styling
	 */
	Badge_Secondary,
	/**
	 * Info styling
	 */
	Badge_Info,
	/**
	 * Warning styling
	 */
	Badge_Warning,
	/**
	 * Success styling
	 */
	Badge_Success,
	/**
	 * Danger styling
	 */
	Badge_Danger,
	/**
	 * Danger styling
	 */
	Badge_Light,
	/**
	 * Danger styling
	 */
	Badge_Dark,
	/**
	 * Pill styling (placed before colouring)
	 */
	Badge_Pill;

	BSBadgeOptions()
	{
		//Nothing Needed
	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
