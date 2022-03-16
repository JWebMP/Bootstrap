package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.*;

public class BSAccordionPanelContent<J extends BSAccordionPanelContent<J>> extends DivSimple<J>
{
	public BSAccordionPanelContent()
	{
		setTag("ng-template");
		addAttribute("ngbPanelContent", "");
	}
	
}
