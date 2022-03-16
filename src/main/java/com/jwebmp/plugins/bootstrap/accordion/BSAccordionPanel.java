package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.*;

public class BSAccordionPanel<J extends BSAccordionPanel<J>> extends DivSimple<J> implements BSAccordionChildren
{
	private boolean active;

	public BSAccordionPanel(String id)
	{
		setTag("ngb-panel");
		setID(id);
	}
	
	public boolean isActive()
	{
		return active;
	}
	
	public J setActive(boolean active)
	{
		this.active = active;
		return (J) this;
	}
}
