package com.jwebmp.plugins.bootstrap.navbar.toggler;

import com.google.common.base.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.html.interfaces.events.*;
import com.jwebmp.plugins.bootstrap.containers.*;

public class BSNavBarToggleButton<J extends BSNavBarToggleButton<J>> extends Button<GlobalChildren, NoAttributes,GlobalFeatures, GlobalEvents,J>
		implements BSContainerChildren
{
	private String collapseFieldName;
	public BSNavBarToggleButton()
	{
		addClass("navbar-toggler");
	}
	
	public String getCollapseFieldName()
	{
		return collapseFieldName;
	}
	
	public J setCollapseFieldName(String collapseFieldName)
	{
		this.collapseFieldName = collapseFieldName;
		return (J)this;
	}
	
	@Override
	public void init()
	{
		if (!Strings.isNullOrEmpty(getCollapseFieldName()))
		{
			addAttribute("(click)", getCollapseFieldName() + " = !" + getCollapseFieldName());
		}
	}
	
}
