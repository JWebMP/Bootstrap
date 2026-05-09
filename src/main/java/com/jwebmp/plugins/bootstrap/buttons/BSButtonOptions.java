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
public enum BSButtonOptions
		implements IBSComponentOptions
{
	/**
	 * Adds basic styling to any button
	 */
	Btn,
	/**
	 * Adds basic styling to any button
	 */
	Btn_Sm,
	/**
	 * Indicates a default/standard button
	 */
	Btn_Default,
	/**
	 * Provides extra visual weight and identifies the primary action in a set of buttons
	 */
	Btn_Primary,
	/**
	 * Provides extra visual weight and identifies the primary action in a set of buttons
	 */
	Btn_Secondary,
	/**
	 * Indicates a successful or positive action
	 */
	Btn_Success,
	/**
	 * Indicates a successful or positive action
	 */
	Btn_White,
	/**
	 * Contextual button for informational alert messages
	 */
	Btn_Info,
	/**
	 * Indicates caution should be taken with this action
	 */
	Btn_Warning,
	/**
	 * Indicates a dangerous or potentially negative action
	 */
	Btn_Danger,
	/**
	 * Indicates a dangerous or potentially negative action
	 */
	Btn_Dark,
	/**
	 * Indicates a dangerous or potentially negative action
	 */
	Btn_Light,
	/**
	 * Makes a button look like a link (will still have button behavior)
	 */
	Btn_Link,
	/**
	 * Makes a block_level button (spans the full width of the parent element)
	 */
	Btn_Block,
	/**
	 * Provides extra visual weight and identifies the primary action in a set of buttons with outline button mode
	 */
	Btn_Outline_Primary,
	/**
	 * Provides extra visual weight and identifies the primary action in a set of buttons with outline button mode
	 */
	Btn_Outline_Secondary,
	/**
	 * Indicates a successful or positive action with outline button mode
	 */
	Btn_Outline_Success,
	/**
	 * Contextual button for informational alert messages with outline button mode
	 */
	Btn_Outline_Info,
	/**
	 * Indicates caution should be taken with this action with outline button mode
	 */
	Btn_Outline_Warning,
	/**
	 * Indicates a dangerous or potentially negative action with outline button mode
	 */
	Btn_Outline_Danger,
	/**
	 * Indicates a dangerous or potentially negative action with outline button mode
	 */
	Btn_Outline_Dark,
	/**
	 * Indicates a dangerous or potentially negative action with outline button mode
	 */
	Btn_Outline_Light,

	Btn_Group,
	Btn_Group_Toggle,
	Btn_Rounded
	;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
