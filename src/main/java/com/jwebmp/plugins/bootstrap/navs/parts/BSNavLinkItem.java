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
public class BSNavLinkItem<J extends BSNavLinkItem<J>>
		extends Link<J>
		implements BSNavsChildren, ListItemChildren
{
	
	public BSNavLinkItem()
	{
		this(null);
	}
	
	/**
	 * A navigation link item
	 *
	 * @param name
	 */
	public BSNavLinkItem(String name)
	{
		setTag("a");
		addAttribute(LinkAttributes.HRef, StaticStrings.STRING_HASH);
		if (name != null)
		{
			setText(name);
		}
		addAttribute(BSNavsAttributes.Role.toString(), "tab");
		addClass(BSNavsOptions.Nav_Link);
	}
	
	/**
	 * Sets this link item active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setActive()
	{
		addClass(BSNavsOptions.Active);
		return (J) this;
	}
	
	/**
	 * Sets this link item disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setDisabled()
	{
		addClass(BSNavsOptions.Disabled);
		return (J) this;
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
