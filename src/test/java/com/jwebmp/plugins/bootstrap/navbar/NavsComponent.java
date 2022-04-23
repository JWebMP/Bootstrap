package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.plugins.bootstrap.navs.*;
import com.jwebmp.plugins.bootstrap.navs.parts.*;

public class NavsComponent extends BSNavs<NavsComponent>
{
	public NavsComponent()
	{
		add(new BSNavItem<>(1)
				.setContent(new BSNavContent<>().add("First"))
				.setLinkItem(new BSNavLink<>("One"))
		);
		add(new BSNavItem<>(2)
				.setContent(new BSNavContent<>().add("Second"))
				.setLinkItem(new BSNavLink<>("Two"))
		);
		setDestroyOnHide(true);
		setAnimation(true);
	}
}
