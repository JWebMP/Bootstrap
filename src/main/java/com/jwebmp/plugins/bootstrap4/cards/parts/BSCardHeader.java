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
package com.jwebmp.plugins.bootstrap4.cards.parts;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.HeaderText;
import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap4.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap4.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap4.cards.parts.interfaces.IBSCardHeader;
import com.jwebmp.plugins.bootstrap4.navs.BSNavsOptions;
import com.jwebmp.plugins.bootstrap4.options.*;
import com.jwebmp.plugins.bootstrap4.options.interfaces.IBSLayout;
import jakarta.validation.constraints.NotNull;

/**
 * Header and footer
 * <p>
 * Add an optional header and/or footer within a card.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardHeader<J extends BSCardHeader<J>>
		extends Div<GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSCardChildren,
		           IBSCardHeader<J>
{
	
	
	/**
	 * Header and footer
	 * <p>
	 * Add an optional header and/or footer within a card.
	 */
	public BSCardHeader()
	{
		this(null);
	}
	
	/**
	 * Header and footer
	 * <p>
	 * Add an optional header and/or footer within a card.
	 *
	 * @param text
	 */
	public BSCardHeader(String text)
	{
		this(HeaderTypes.H5, text);
	}
	
	/**
	 * Header and footer
	 * <p>
	 * Add an optional header and/or footer within a card.
	 *
	 * @param text
	 */
	public BSCardHeader(HeaderTypes headerType, String text)
	{
		super();
		if (!Strings.isNullOrEmpty(text))
		{
			add(new HeaderText<>(headerType, text));
		}
		addClass(BSCardOptions.Card_Header);
	}
	
	/**
	 * Returns a neater structure
	 *
	 * @return
	 */
	public IBSCardHeader<J> asMe()
	{
		return this;
	}
	
	/**
	 * Adds a new tabbed header navigation item
	 *
	 * @return
	 */
	@Override
	public BSCardHeaderNav<?> addTabHeader()
	{
		BSCardHeaderNav<?> headerNav = new BSCardHeaderNav<>();
		add(headerNav);
		return headerNav;
	}
	
	/**
	 * Adds a new tab header with a non null list of string headers
	 *
	 * @param headers
	 *
	 * @return
	 */
	@Override
	public BSCardHeaderNav<?> addTabHeader(@NotNull String[] headers)
	{
		BSCardHeaderNav<?> headerNav = new BSCardHeaderNav<>();
		for (String header : headers)
		{
			headerNav.addItem(header, false);
		}
		
		headerNav.getChildren()
		         .iterator()
		         .next()
		         .asHierarchyBase()
		         .addClass(BSNavsOptions.Active);
		
		return headerNav;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBackground(BSBackgroundOptions backgroundOptions)
	{
		addClass(backgroundOptions);
		return (J) this;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addForeground(BSColoursOptions coloursOptions)
	{
		addClass(coloursOptions);
		return (J) this;
	}
	
	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addMargin(BSMarginOptions margin)
	{
		addClass(margin);
		return (J) this;
	}
	
	/**
	 * Applies the padding to the card
	 *
	 * @param padding
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addPadding(BSPaddingOptions padding)
	{
		addClass(padding);
		return (J) this;
	}
	
	/**
	 * Sets the border to the correct structure
	 *
	 * @param border
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBorder(BSBorderOptions border)
	{
		addClass(border);
		return (J) this;
	}
	
	/**
	 * Returns the Bootstrap layout options
	 *
	 * @return
	 */
	@Override
	public IBSLayout<J> asLayout()
	{
		return this;
	}
}
