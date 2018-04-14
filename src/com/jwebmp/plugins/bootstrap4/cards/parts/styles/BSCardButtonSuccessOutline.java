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

package com.jwebmp.plugins.bootstrap4.cards.parts.styles;

import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardButton;

/**
 * Constructs a new card button (a link behaving as a button)
 *
 * @author GedMarc
 * @since 3 March 2018
 */
public class BSCardButtonSuccessOutline<J extends BSCardButtonSuccessOutline<J>>
		extends BSCardButton<J>
{
	/**
	 * @author GedMarc
	 * @since 16 Feb 2017
	 */
	public BSCardButtonSuccessOutline()
	{
		this(null);
	}

	/**
	 * a new card button
	 *
	 * @param text
	 */
	public BSCardButtonSuccessOutline(String text)
	{
		super(text);
		addClass(BSButtonOptions.Btn_Outline_Success);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}
}
