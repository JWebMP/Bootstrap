package com.jwebmp.plugins.bootstrap.cards.layout;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap.cards.BSCard;
import com.jwebmp.plugins.bootstrap.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap.cards.parts.interfaces.IBSCardGroup;

/**
 * Groups
 * <p>
 * Use card groups to render cards as a single, attached element with equal width and height columns. Card groups use display: flex; to
 * achieve their uniform sizing.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardGroup<J extends BSCardGroup<J>>
		extends Div<BSCard<?>, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements com.jwebmp.plugins.bootstrap.cards.parts.interfaces.IBSCardGroup<J>
{


	/**
	 * Groups
	 * <p>
	 * Use card groups to render cards as a single, attached element with equal width and height columns.
	 * <p>
	 * By default, card groups use display: table; and table-layout: fixed; to achieve their uniform sizing. However, enabling flexbox mode
	 * can switch that to use display: flex; and provide the same
	 * effect.
	 * <p>
	 * Only applies to small devices and above.
	 */
	public BSCardGroup()
	{
		addClass(BSCardOptions.Card_Group);
	}

	@Override
	public BSCard<?> addCard()
	{
		BSCard<?> card = new BSCard<>();
		add(card);
		return card;
	}

	/**
	 * Returns the neater version
	 *
	 * @return
	 */
	public IBSCardGroup<J> asMe()
	{
		return this;
	}
}
