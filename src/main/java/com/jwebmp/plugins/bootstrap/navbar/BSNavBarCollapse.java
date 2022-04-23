package com.jwebmp.plugins.bootstrap.navbar;

import com.google.common.base.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.containers.*;

public class BSNavBarCollapse<J extends BSNavBarCollapse<J>> extends DivSimple<J>
		implements BSContainerChildren
{
	private boolean animated = true;
	private String collapseFieldName;
	
	public BSNavBarCollapse(String collapseFieldName)
	{
		this.collapseFieldName = collapseFieldName;
		addClass("collapse");
		addClass("navbar-collapse");
	}
	
	public boolean isAnimated()
	{
		return animated;
	}
	
	public J setAnimated(boolean animated)
	{
		this.animated = animated;
		return (J) this;
	}
	
	public String getCollapseFieldName()
	{
		return collapseFieldName;
	}
	
	public J setCollapseFieldName(String collapseFieldName)
	{
		this.collapseFieldName = collapseFieldName;
		return (J) this;
	}
	
	public J addNavBar(BSNavBarNavs<?> navBarNavs)
	{
		add(navBarNavs);
		return (J)this;
	}
	
	@Override
	public void init()
	{
		if(!Strings.isNullOrEmpty(getCollapseFieldName()))
		{
			addAttribute("[ngbCollapse]", getCollapseFieldName());
			addOption("animation", animated + "");
		}
		super.init();
	}
}
