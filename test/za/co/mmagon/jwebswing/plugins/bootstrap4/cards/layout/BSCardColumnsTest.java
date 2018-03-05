package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.layout;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.BSSizes;

class BSCardColumnsTest
		extends BaseTestClass
{

	@Test
	void render()
	{
		BSCardColumns<?> columns = new BSCardColumns();
		columns.getBreakpointColumnCount()
		       .put(BSSizes.ExtraLarge, 5);
		columns.getBreakpointColumnCount()
		       .put(BSSizes.Medium, 4);
		System.out.println(columns.toString(0));
		System.out.println(columns.renderCss(0, true, true, false));
	}
}
