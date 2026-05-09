package com.jwebmp.plugins.bootstrap.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Colors
 * <p>
 * Convey meaning through color with a handful of emphasis utility classes. These may also be applied to links and will darken on hover just
 * like our default link styles.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSColoursOptions
		implements IBSComponentOptions
{
	/**
	 * Text styled with class "text_primary"
	 */
	Text_Primary,
	/**
	 * Text styled with class "text_success"
	 */
	Text_Success,
	/**
	 * Text styled with class "text_info"
	 */
	Text_Info,
	/**
	 * Text styled with class "text_warning"
	 */
	Text_Warning,
	/**
	 * Text styled with class "text_danger"
	 */
	Text_Danger,
	/**
	 * Text styled with class "text_danger"
	 */
	Text_Purple,
	/**
	 * Text marked as white
	 */
	Text_White,
	Text_Dark,
	Text_Light,
	Text_Secondary,
	/**
	 * Hides colours on screen readers Using color to add meaning only provides a visual indication, which will not be conveyed to users of
	 * assistive technologies – such as screen readers. Ensure that
	 * information denoted by the color is either obvious from the content itself (e.g. the visible text), or is included through
	 * alternative means, such as additional text hidden with the .sr-only
	 * class.
	 */
	Sr_Only,
	/**
	 * Combine with sr_only to show the element again when it is focused (eg by a keyboard_only user)
	 */
	Sr_Only_Focusable,
	;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
