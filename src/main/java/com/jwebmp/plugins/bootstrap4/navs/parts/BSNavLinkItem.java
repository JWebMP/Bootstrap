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
package com.jwebmp.plugins.bootstrap4.navs.parts;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.utilities.StaticStrings;
import com.jwebmp.plugins.bootstrap4.navs.BSNavsOptions;
import com.jwebmp.plugins.bootstrap4.navs.interfaces.BSNavsChildren;

/**
 * A navigation link item
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSNavLinkItem<J extends BSNavLinkItem<J>>
		extends Link<J>
		implements BSNavsChildren<IComponentHierarchyBase, J>
{


	/**
	 * A navigation link item
	 *
	 * @param name
	 */
	public BSNavLinkItem(String name)
	{
		setTag("a");
		addAttribute(LinkAttributes.HRef, StaticStrings.STRING_HASH);
		setText(name);
		addClass(BSNavsOptions.Nav_Link);
	}

	/**
	 * Sets this link item active
	 *
	 * @return
	 */
	public BSNavLinkItem setActive()
	{
		addClass(BSNavsOptions.Active);
		return this;
	}

	/**
	 * Sets this link item disabled
	 *
	 * @return
	 */
	public BSNavLinkItem setDisabled()
	{
		addClass(BSNavsOptions.Disabled);
		return this;
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
