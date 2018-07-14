package com.jwebmp.plugins.bootstrap4.cards.parts.styles;

import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardButton;

/**
 * Constructs a new card button (a link behaving as a button)
 *
 * @author GedMarc
 * @since 3 March 2018
 */
public class BSCardButtonSecondaryOutline<J extends BSCardButtonSecondaryOutline<J>>
		extends BSCardButton<J>
{
	/**
	 * @author GedMarc
	 * @since 16 Feb 2017
	 */
	public BSCardButtonSecondaryOutline()
	{
		this(null);
	}

	/**
	 * a new card button
	 *
	 * @param text
	 */
	public BSCardButtonSecondaryOutline(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Outline_Secondary);
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
