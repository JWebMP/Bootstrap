package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.*;

public class BSAccordionPanelTitle<J extends BSAccordionPanelTitle<J>> extends DivSimple<J>
{
	public BSAccordionPanelTitle()
	{
		setTag("ng-template");
		addAttribute("ngbPanelTitle", "");
	}
	
}
