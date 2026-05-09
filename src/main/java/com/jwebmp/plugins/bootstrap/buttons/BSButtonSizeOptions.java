package com.jwebmp.plugins.bootstrap.buttons;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Buttons
 * <p>
 * Use Bootstrap’s custom button styles for actions in forms, dialogs, and more. Includes support for a handful of contextual variations,
 * sizes, states, and more.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public enum BSButtonSizeOptions
		implements IBSComponentOptions
{
	Btn,
	Btn_Xs,
	/**
	 * Makes a large button
	 */
	Btn_Lg,
	/**
	 * Makes a small button
	 */
	Btn_Sm,
	/**
	 * Makes a block_level button (spans the full width of the parent element)
	 */
	Btn_Block;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
