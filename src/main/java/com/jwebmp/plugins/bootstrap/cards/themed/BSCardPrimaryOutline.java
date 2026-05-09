package com.jwebmp.plugins.bootstrap.cards.themed;

import com.jwebmp.plugins.bootstrap.cards.BSCard;
import com.jwebmp.plugins.bootstrap.options.BSBorderOptions;

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
public class BSCardPrimaryOutline
		extends BSCard<BSCardPrimaryOutline>
{


	/**
	 * Background variants
	 * <p>
	 * Cards include their own variant classes for quickly changing the background-color and border-color of a card. Darker colors require
	 * the use of .card-inverse.
	 */
	public BSCardPrimaryOutline()
	{
		addClass(BSBorderOptions.Border_Primary);
	}

}
