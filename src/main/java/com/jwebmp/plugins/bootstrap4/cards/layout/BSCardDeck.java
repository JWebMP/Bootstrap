/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap4.cards.layout;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap4.cards.BSCard;
import com.jwebmp.plugins.bootstrap4.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap4.cards.parts.interfaces.IBSCardDeck;

/**
 * Need a set of equal width and height cards that aren’t attached to one another? Use card decks.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardDeck<J extends BSCardDeck<J>>
		extends Div<BSCard, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements GlobalChildren, IBSCardDeck<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Need a set of equal width and height cards that aren’t attached to one another? Use card decks. By default, card decks require two
	 * wrapping elements: .card-deck-wrapper and a .card-deck. We use
	 * table styles for the sizing and the gutters on .card-deck. The .card-deck-wrapper is used to negative margin out the border-spacing
	 * on the .card-deck.
	 */
	public BSCardDeck()
	{
		addClass(BSCardOptions.Card_Deck);
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
	public IBSCardDeck<J> asMe()
	{
		return this;
	}
}
