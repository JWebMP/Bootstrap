package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.navs.*;

public class BSNavOutlet<J extends BSNavOutlet<J>> extends DivSimple<J>
{
	private BSNavs<?> forNav;
	public BSNavOutlet(BSNavs<?> forNav)
	{
		this.forNav = forNav;
	}
	
	@Override
	public void init()
	{
		addAttribute("[ngbNavOutlet]", forNav.getID());
		super.init();
	}
}
