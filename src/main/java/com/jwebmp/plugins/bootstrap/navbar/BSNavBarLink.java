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
package com.jwebmp.plugins.bootstrap.navbar;

import com.google.common.base.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.children.*;
import com.jwebmp.plugins.bootstrap.navs.interfaces.*;

/**
 * A navigation link item
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSNavBarLink<J extends BSNavBarLink<J>>
		extends Link<J>
		implements BSNavsChildren, ListItemChildren
{
	private String routerLink;
	
	/**
	 * A navigation link item
	 *
	 */
	public BSNavBarLink(String routerLink)
	{
		this.routerLink = routerLink;
		setTag("a");
		addClass("nav-link");
	}
	
	@Override
	public void init()
	{
		if(!Strings.isNullOrEmpty(routerLink))
		{
			addAttribute("routerLink", routerLink);
		}
		removeAttribute("href");
		super.init();
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
}
