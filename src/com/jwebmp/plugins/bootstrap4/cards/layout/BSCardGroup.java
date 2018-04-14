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
package com.jwebmp.plugins.bootstrap4.cards.layout;

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.attributes.NoAttributes;
import com.jwebmp.base.html.interfaces.GlobalFeatures;
import com.jwebmp.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap4.cards.BSCard;
import com.jwebmp.plugins.bootstrap4.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap4.cards.parts.interfaces.IBSCardGroup;

/**
 * Groups
 * <p>
 * Use card groups to render cards as a single, attached element with equal width and height columns. Card groups use display: flex; to
 * achieve their uniform sizing.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardGroup<J extends BSCardGroup<J>>
		extends Div<BSCard, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements com.jwebmp.plugins.bootstrap4.cards.parts.interfaces.IBSCardGroup<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Groups
	 * <p>
	 * Use card groups to render cards as a single, attached element with equal width and height columns.
	 * <p>
	 * By default, card groups use display: table; and table-layout: fixed; to achieve their uniform sizing. However, enabling flexbox mode
	 * can switch that to use display: flex; and provide the same
	 * effect.
	 * <p>
	 * Only applies to small devices and above.
	 */
	public BSCardGroup()
	{
		addClass(BSCardOptions.Card_Group);
	}

	@Override
	public BSCard<?> addCard()
	{
		BSCard<?> card = new BSCard<>();
		add(card);
		return card;
	}

	/**
	 * Returns the neater version
	 *
	 * @return
	 */
	public IBSCardGroup<J> asMe()
	{
		return this;
	}
}
