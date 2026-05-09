package com.jwebmp.plugins.bootstrap.cards.parts;

import com.jwebmp.plugins.bootstrap.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap.cards.BSCardOptions;

/**
 * Image overlays
 * <p>
 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse (see
 * below).
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardImageOverlay<J extends BSCardImageOverlay<J>>
		extends BSCardBody<J>
		implements BSCardChildren
{


	/**
	 * Image overlays
	 * <p>
	 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse
	 * (see
	 * below).
	 */
	public BSCardImageOverlay()
	{
		this(null);
	}

	/**
	 * Image overlays
	 * <p>
	 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse
	 * (see
	 * below).
	 *
	 * @param text
	 */
	public BSCardImageOverlay(String text)
	{
		add(text, true);
		removeClass(BSCardOptions.Card_Body);
		addClass(BSCardOptions.Card_Img_Overlay);
	}

}
