package za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.tabs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.Div;

class BSTabContainerTest
		extends BaseTestClass
{

	@Test
	void configure()
	{
		BSTabContainer tabs = new BSTabContainer(true, new Div(), "title1");
		tabs.configure();

		System.out.println(tabs.getListItem()
		                       .toString(0));
	}
}
