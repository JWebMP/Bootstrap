package com.jwebmp.plugins.bootstrap.buttons;

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
public class BSButtonLink<J extends BSButtonLink<J>>
		extends BSButton<J>
{
	/**
	 * Deemphasize a button by making it look like a link while maintaining button behavior
	 */
	public BSButtonLink()
	{
		addClass(BSButtonOptions.Btn_Link);
	}

}
