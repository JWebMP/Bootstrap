package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.prebuilt.DefaultCardTest;

public class BSCardImageOverlayTest
		extends BaseTestClass
{

	@Test
	public void testImageOverlay()
	{
		DefaultCardTest.DefaultCardImpl impl = new DefaultCardTest.DefaultCardImpl();
		impl.setCardImage("image");
		impl.setCardImageOverlay(new BSCardImageOverlay("Here"));
		System.out.println(impl.toString(0));
	}
}
