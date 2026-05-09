package com.jwebmp.plugins.bootstrap.options;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Borders
 * <p>
 * Use border utilities to quickly style the border and border-radius of an element. Great for images, buttons, or any other element.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSBorderOptions
		implements IBSComponentOptions
{
	/**
	 * makes all 4 corners rounded
	 */
	Rounded,
	Rounded_0,
	Rounded_1,
	Rounded_2,
	/**
	 * Only round the top
	 */
	Rounded_Top,
	/**
	 * Only rounds the bottom
	 */
	Rounded_Bottom,
	/**
	 * Rounds the left
	 */
	Rounded_Left,
	/**
	 * Rounds the right
	 */
	Rounded_Right,
	/**
	 * Makes the display in circular format
	 */
	Rounded_Circle,
	/**
	 * Defines a border
	 */
	Border,
	/**
	 * Sets primary
	 */
	Border_Primary,
	/**
	 * Sets secondary
	 */
	Border_Secondary,
	/**
	 * Sets danger
	 */
	Border_Danger,
	/**
	 * Sets to dark theme
	 */
	Border_Dark,
	/**
	 * Sets to light theme
	 */
	Border_Light,
	/**
	 * Sets to success theme
	 */
	Border_Success,
	/**
	 * Sets to warning theme
	 */
	Border_Warning,
	Border_Info;
	
	@Override
	public String toString()
	{
		return "border " + name().toLowerCase()
		                         .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
