package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.*;

public class BSAccordionPanelHeader<J extends BSAccordionPanelHeader<J>> extends DivSimple<J>
{
	public BSAccordionPanelHeader()
	{
		setTag("ng-template");
		addAttribute("ngbPanelHeader", "");
		addAttribute("let-opened", "opened");
	}
	
}
