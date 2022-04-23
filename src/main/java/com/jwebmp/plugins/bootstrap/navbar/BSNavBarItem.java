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

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.*;
import com.jwebmp.plugins.bootstrap.navs.interfaces.*;
import jakarta.validation.constraints.*;

/**
 * @author GedMarc
 * @since 23 Jan 2017
 */
public class BSNavBarItem<J extends BSNavBarItem<J>>
		extends ListItem<J>
		implements BSNavsChildren, BSNavBarChildren
{
	private BSNavBarLink<?> linkItem;
	private String collapsedMenuFieldName;
	
	/**
	 * Constructs a list item with a link item inside
	 */
	public BSNavBarItem(BSNavBarLink<?> linkItem,String collapsedMenuFieldName)
	{
		this(linkItem, collapsedMenuFieldName, false);
	}
	/**
	 * Constructs a list item with a link item inside
	 */
	public BSNavBarItem(BSNavBarLink<?> linkItem,String collapsedMenuFieldName,boolean active)
	{
		this.collapsedMenuFieldName = collapsedMenuFieldName;
		setLinkItem(linkItem);
		addClass("nav-item");
		if(active)
		{
			addClass("active");
		}
	}

	/**
	 * Sets the link item
	 * @param linkItem
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLinkItem(BSNavBarLink<?> linkItem)
	{
		this.linkItem = linkItem;
		getChildren().clear();
		add(linkItem);
		linkItem.addAttribute("(click)", collapsedMenuFieldName + " = true");
		return (J) this;
	}
	
	/**
	 * Returns the associated Link Item
	 *
	 * @return
	 */
	@NotNull
	public BSNavBarLink<?> getLinkItem()
	{
		return linkItem;
	}
}
