package com.jwebmp.plugins.bootstrap.buttons.styles;

import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;

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
public class BSButtonInfo<J extends BSButtonInfo<J>>
		extends BSButton<J>
{
	/**
	 * Contextual button for informational alert messages
	 */
	public BSButtonInfo()
	{
		this(null);
	}
	/**
	 * Contextual button for informational alert messages
	 */
	public BSButtonInfo(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Info);
	}
}
