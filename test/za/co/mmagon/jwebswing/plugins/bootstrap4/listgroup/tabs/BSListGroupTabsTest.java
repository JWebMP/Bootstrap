package za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.tabs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.Div;

class BSListGroupTabsTest
		extends BaseTestClass
{

	@Test
	void getTabs()
	{
		BSListGroupTabs<?> tabs = new BSListGroupTabs<>();
		tabs.addTab("Tab 1", new Div(), true);
		tabs.addTab("Tab 2", new Div(), false)
		    .setFade(true);
		System.out.println(tabs.toString(0));
	}
}
