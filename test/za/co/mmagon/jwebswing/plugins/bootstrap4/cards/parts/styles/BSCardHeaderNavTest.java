package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.styles;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardHeaderNav;

class BSCardHeaderNavTest
		extends BaseTestClass
{
	@Test
	public void testMe()
	{
		BSCardHeaderNav nav = new BSCardHeaderNav();
		nav.addItem("Text", true);
		System.out.println(nav.toString(0));

		super.soutDivider();
		nav.asPills();
		System.out.println(nav.toString(0));

		super.soutDivider();
		nav.addItem("Another Item");
		System.out.println(nav.toString(0));
	}
}
