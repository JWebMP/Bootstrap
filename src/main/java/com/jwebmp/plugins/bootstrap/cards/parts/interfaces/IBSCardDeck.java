package com.jwebmp.plugins.bootstrap.cards.parts.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.cards.BSCard;
import com.jwebmp.plugins.bootstrap.cards.layout.BSCardColumns;
import com.jwebmp.plugins.bootstrap.cards.layout.BSCardDeck;

import java.util.Comparator;

public interface IBSCardDeck<J extends BSCardDeck<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Returns the neater version
	 *
	 * @return
	 */
	BSCard<?> addCard();

	BSCardColumns<?> addColumnLayout();
}
