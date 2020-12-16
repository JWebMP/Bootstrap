package com.jwebmp.plugins.bootstrap4.accordion;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.cards.BSCardChildren;

class BSAccordionBodyWrapper<J extends BSAccordionBodyWrapper<J>>
		extends DivSimple<J>
	implements BSCardChildren
{
	public BSAccordionBodyWrapper()
	{
		//NO config required
	}
}
