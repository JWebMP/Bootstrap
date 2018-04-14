/*
 * Copyright (C) 2017 Marc Magon
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

package com.jwebmp.plugins.bootstrap4.cards.parts;

import com.jwebmp.base.html.Link;
import com.jwebmp.base.html.List;
import com.jwebmp.base.html.ListItem;
import com.jwebmp.base.html.attributes.NoAttributes;
import com.jwebmp.base.html.interfaces.children.ListChildren;
import com.jwebmp.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap4.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap4.navs.BSNavsOptions;
import com.jwebmp.utilities.StaticStrings;

import javax.validation.constraints.NotNull;

/**
 * Constructs a card header with nav properties
 *
 * @param <J>
 */
public class BSCardHeaderNav<J extends BSCardHeaderNav<J>>
		extends List<ListChildren, NoAttributes, GlobalEvents, J>
{

	/**
	 * Constructs a card header with nav properties
	 */
	public BSCardHeaderNav()
	{
		super();
		addClass(BSNavsOptions.Nav);
		addClass(BSNavsOptions.Nav_Tabs);
		addClass(BSCardOptions.Card_Header_Tabs);
	}

	/**
	 * Adds a new list item that is not active
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public ListItem<?> addItem(String text)
	{
		return addItem(text, false);
	}

	/**
	 * Adds a new list item (tab header that matches the right card-body) to the header with the given active property
	 *
	 * @param text
	 * @param active
	 *
	 * @return
	 */
	@NotNull
	public ListItem<?> addItem(String text, boolean active)
	{
		ListItem<?> item = new ListItem<>();
		item.addClass(BSNavsOptions.Nav_Item);
		Link<?> link = new Link<>(StaticStrings.STRING_HASH);
		link.addClass(BSNavsOptions.Nav_Link);
		if (active)
		{
			link.addClass(BSNavsOptions.Active);
		}
		link.setText(text);

		item.add(link);
		add(item);
		return item;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J asPills()
	{
		removeClass(BSNavsOptions.Nav_Tabs);
		addClass(BSNavsOptions.Nav_Pills);

		removeClass(BSCardOptions.Card_Header_Tabs);
		addClass(BSCardOptions.Card_Header_Pills);
		return (J) this;
	}

}
