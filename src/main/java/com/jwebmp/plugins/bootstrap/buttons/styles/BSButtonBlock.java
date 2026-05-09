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
public class BSButtonBlock<J extends BSButtonBlock<J>>
		extends BSButton<J>
{
	/**
	 * Indicates a successful or positive action
	 */
	public BSButtonBlock()
	{
		this(null);
	}
	
	/**
	 * Indicates a successful or positive action
	 */
	public BSButtonBlock(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Block);
	}
}
