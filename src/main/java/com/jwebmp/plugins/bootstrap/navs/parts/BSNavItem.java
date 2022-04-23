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

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.*;
import com.jwebmp.plugins.bootstrap.navs.BSNavsOptions;
import com.jwebmp.plugins.bootstrap.navs.interfaces.BSNavsChildren;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 23 Jan 2017
 */
public class BSNavItem<J extends BSNavItem<J>>
		extends ListItem<J>
		implements BSNavsChildren, BSNavBarChildren
{
	private String tabId;
	private BSNavLink<?> linkItem;
	private BSNavContent<?> content;
	
	/**
	 * Constructs a list item with a link item inside
	 */
	public BSNavItem(Integer tabId)
	{
		this.tabId = String.valueOf(tabId);
	}
	
	@Override
	public void init()
	{
		addAttribute("[ngbNavItem]", tabId);
		add(linkItem);
		add(content);
		super.init();
	}
	
	/**
	 * Sets the link item
	 * @param linkItem
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLinkItem(BSNavLink<?> linkItem)
	{
		this.linkItem = linkItem;
		return (J) this;
	}
	
	/**
	 * Returns the associated Link Item
	 *
	 * @return
	 */
	@NotNull
	public BSNavLink<?> getLinkItem()
	{
		return linkItem;
	}
	
	public String getTabId()
	{
		return tabId;
	}
	
	public J setTabId(String tabId)
	{
		this.tabId = tabId;
		return (J)this;
	}
	
	public BSNavContent<?> getContent()
	{
		return content;
	}
	
	public J setContent(BSNavContent<?> content)
	{
		this.content = content;
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
