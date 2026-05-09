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
public class BSButtonLight<J extends BSButtonLight<J>>
		extends BSButton<J>
{
	/**
	 * Provides extra visual weight and identifies the primary action in a set of buttons
	 */
	public BSButtonLight()
	{
		this(null);
	}
	/**
	 * Provides extra visual weight and identifies the primary action in a set of buttons
	 */
	public BSButtonLight(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Light);
	}
}
