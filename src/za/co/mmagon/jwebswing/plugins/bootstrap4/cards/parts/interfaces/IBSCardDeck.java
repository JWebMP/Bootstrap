package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.interfaces;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.BSCard;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.layout.BSCardDeck;

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
}
