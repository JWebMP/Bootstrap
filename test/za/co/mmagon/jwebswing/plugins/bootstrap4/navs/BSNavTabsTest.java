package za.co.mmagon.jwebswing.plugins.bootstrap4.navs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

class BSNavTabsTest
		extends BaseTestClass
{

	@Test
	void getNavs()
	{
		BSNavTabs tabs = new BSNavTabs();

		System.out.println(tabs.toString(0));
	}
}
