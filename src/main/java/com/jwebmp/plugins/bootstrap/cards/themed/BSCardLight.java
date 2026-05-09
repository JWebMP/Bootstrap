package com.jwebmp.plugins.bootstrap.cards.themed;

import com.jwebmp.plugins.bootstrap.cards.BSCard;
import com.jwebmp.plugins.bootstrap.options.BSBackgroundOptions;

/**
 * Background variants
 * <p>
 * Cards include their own variant classes for quickly changing the background-color and border-color of a card. Darker colors require the
 * use of .card-inverse.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardLight
		extends BSCard<BSCardLight>
{


	/**
	 * Background variants
	 * <p>
	 * Cards include their own variant classes for quickly changing the background-color and border-color of a card. Darker colors require
	 * the use of .card-inverse.
	 */
	public BSCardLight()
	{
		addClass(BSBackgroundOptions.Bg_Light);
	}

}
