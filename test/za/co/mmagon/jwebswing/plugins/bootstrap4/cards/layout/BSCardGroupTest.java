package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.layout;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

class BSCardGroupTest
		extends BaseTestClass
{

	@Test
	void addCard()
	{
		BSCardGroup group = new BSCardGroup();
		group.addCard();
		System.out.println(group.toString(0));
	}
}
