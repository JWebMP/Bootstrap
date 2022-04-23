/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.navs.parts;

import com.google.common.base.*;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.guicedee.guicedinjection.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.navs.BSNavsAttributes;
import com.jwebmp.plugins.bootstrap.navs.BSNavsOptions;
import com.jwebmp.plugins.bootstrap.navs.interfaces.BSNavsChildren;

/**
 * A navigation link item
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSNavLink<J extends BSNavLink<J>>
		extends Link<J>
		implements BSNavsChildren, ListItemChildren
{
	
	public BSNavLink()
	{
		this(null);
	}
	
	private String name;
	private String routerLink;
	
	/**
	 * A navigation link item
	 *
	 * @param name
	 */
	public BSNavLink(String name)
	{
		this.name = name;
		setTag("a");
		addAttribute("ngbNavLink", "");
	}
	
	@Override
	public void init()
	{
		if (name != null)
		{
			setText(name);
		}
		if(!Strings.isNullOrEmpty(routerLink))
		{
			addAttribute("routerLink", routerLink);
		}
		super.init();
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public J setName(String name)
	{
		this.name = name;
		return (J)this;
	}
	
	public String getRouterLink()
	{
		return routerLink;
	}
	
	public J setRouterLink(String routerLink)
	{
		this.routerLink = routerLink;
		return (J)this;
	}
	
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
