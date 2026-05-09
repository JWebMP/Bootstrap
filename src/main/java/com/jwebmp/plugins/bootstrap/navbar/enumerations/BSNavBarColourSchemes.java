package com.jwebmp.plugins.bootstrap.navbar.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Color schemes
 * <p>
 * Theming the navbar has never been easier thanks to the combination of theming classes and background-color utilities. Choose from
 * .navbar-light for use with light background colors, or
 * .navbar-inverse for dark background colors. Then, customize with .bg-* utilities.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public enum BSNavBarColourSchemes
		implements IBSComponentOptions
{
	/**
	 * Color schemes
	 * <p>
	 * Theming the navbar has never been easier thanks to the combination of theming classes and background-color utilities. Choose from
	 * .navbar-light for use with light background colors, or
	 * .navbar-inverse for dark background colors. Then, customize with .bg-* utilities.
	 */
	Navbar_Light,
	/**
	 * Color schemes
	 * <p>
	 * Theming the navbar has never been easier thanks to the combination of theming classes and background-color utilities. Choose from
	 * .navbar-light for use with light background colors, or
	 * .navbar-inverse for dark background colors. Then, customize with .bg-* utilities.
	 */
	Navbar_Dark;

	BSNavBarColourSchemes()
	{
		//Nothing Needed
	}

	@JsonValue
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_DOLLAR, CHAR_SPACE)
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
