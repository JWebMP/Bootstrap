package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.cards.BSCardChildren;

class BSAccordionBodyWrapper<J extends BSAccordionBodyWrapper<J>>
		extends DivSimple<J>
	implements BSCardChildren
{
	public BSAccordionBodyWrapper()
	{
		//NO config required
	}
}
