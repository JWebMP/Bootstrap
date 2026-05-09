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
public class BSButtonDanger<J extends BSButtonDanger<J>>
		extends BSButton<J>
{
	/**
	 * Indicates a dangerous or potentially negative action
	 */
	public BSButtonDanger()
	{
		this(null);
	}
	/**
	 * Indicates a dangerous or potentially negative action
	 */
	public BSButtonDanger(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Danger);
	}
}
