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
package com.jwebmp.plugins.bootstrap.listgroup;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap.listgroup.parts.BSListGroupButtonItem;
import com.jwebmp.plugins.bootstrap.listgroup.parts.BSListGroupLinkItem;
import com.jwebmp.plugins.bootstrap.listgroup.parts.BSListGroupListItem;

import jakarta.validation.constraints.NotNull;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * List group
 * <p>
 * List groups are a flexible and powerful component for displaying a series of content. List group items can be modified and extended to
 * support just about any content within. They can also be used
 * as navigation with the right modifier class.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap ListGroup",
		description = "List groups are a flexible and powerful component for displaying a series of content. List group items can be " +
		              "modified and extended to support just about any content within. They can also be used as navigation with " +
		              "the right modifier class.",
		url = "https://v4-alpha.getbootstrap.com/components/list-group/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSListGroup<J extends BSListGroup<J>>
		extends Div<BSListGroupChildren, BSListGroupAttributes, GlobalFeatures, BSListGroupEvents, J>
		implements BSCardChildren, IBSListGroup<J>
{


	/**
	 * List group
	 * <p>
	 * List groups are a flexible and powerful component for displaying a series of content. List group items can be modified and extended
	 * to support just about any content within. They can also be
	 * used as navigation with the right modifier class.
	 */
	public BSListGroup()
	{
		setTag("ul");
		addClass(BSListGroupOptions.List_Group);
	}

	/**
	 * The slimmer version
	 *
	 * @return
	 */
	public IBSListGroup<J> asMe()
	{
		return this;
	}

	/**
	 * Adds a new button item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSListGroupButtonItem<?> addButtonItem(String text)
	{
		BSListGroupButtonItem<?> item = new BSListGroupButtonItem<>();
		if (text != null)
		{
			item.setText(text);
		}
		add(item);
		return item;
	}

	/**
	 * Adds a new button item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSListGroupButtonItem<?> addButtonItem(ListItemChildren icon, String text)
	{
		BSListGroupButtonItem<?> item = new BSListGroupButtonItem<>();
		item.add(icon);
		item.setRenderTextBeforeChildren(false);
		if (text != null)
		{
			item.setText(HTML_TAB + text);
		}
		add(item);
		return item;
	}

	/**
	 * Adds a new link item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSListGroupLinkItem<?> addLinkItem(String text)
	{
		BSListGroupLinkItem<?> item = new BSListGroupLinkItem<>(text);
		if (text != null)
		{
			item.setText(text);
		}
		add(item);
		return item;
	}

	/**
	 * Adds a new listem item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSListGroupListItem<?> addListItem(String text)
	{
		BSListGroupListItem<?> item = new BSListGroupListItem<>();
		if (text != null)
		{
			item.setText(text);
		}
		add(item);
		return item;
	}

	/**
	 * Flush
	 * Add .list-group-flush to remove some borders and rounded corners to render list group items edge-to-edge in a parent container (e
	 * .g.,
	 * cards).
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFlush()
	{
		addClass(BSListGroupOptions.List_Group_Flush);
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
