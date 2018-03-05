package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.layout;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

class BSCardDeckTest
		extends BaseTestClass
{

	@Test
	void asMe()
	{
		BSCardDeck<?> deck = new BSCardDeck<>();
		deck.addCard();
		System.out.println(deck.toString(0));
	}
}
