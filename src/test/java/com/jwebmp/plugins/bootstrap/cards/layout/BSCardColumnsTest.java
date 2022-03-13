package com.jwebmp.plugins.bootstrap.cards.layout;

import com.jwebmp.plugins.bootstrap.BSSizes;
import org.junit.jupiter.api.Test;

class BSCardColumnsTest

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
