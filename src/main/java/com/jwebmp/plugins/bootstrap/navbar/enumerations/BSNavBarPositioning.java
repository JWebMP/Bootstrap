package com.jwebmp.plugins.bootstrap.navbar.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Placement
 * <p>
 * Use our position utilities to place navbars in non-static positions. Choose from fixed to the top, fixed to the bottom, or stickied to
 * the top. Note that position: sticky, used for .sticky-top,
 * isn’t fully supported in every browser.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public enum BSNavBarPositioning
		implements IBSComponentOptions
{

	/**
	 * Choose from fixed to the top, fixed to the bottom, or stickied to the top. Note that position: sticky, used for .sticky-top, isn’t
	 * fully supported in every browser.
	 */
	Fixed_Top,
	/**
	 * Choose from fixed to the top, fixed to the bottom, or stickied to the top. Note that position: sticky, used for .sticky-top, isn’t
	 * fully supported in every browser.
	 */
	Fixed_Bottom,
	/**
	 * Choose from fixed to the top, fixed to the bottom, or stickied to the top. Note that position: sticky, used for .sticky-top, isn’t
	 * fully supported in every browser.
	 */
	Sticky_Top,
	;

	BSNavBarPositioning()
	{
		//Nothing Needed
	}

	@JsonValue
	@Override
	public String toString()
	{
		return "navbar-" + name().toLowerCase()
		                         .replace(STRING_DOLLAR, STRING_SPACE)
		                         .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
