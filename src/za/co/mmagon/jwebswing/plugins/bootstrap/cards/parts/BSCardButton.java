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
package za.co.mmagon.jwebswing.plugins.bootstrap.cards.parts;

import za.co.mmagon.jwebswing.base.html.attributes.LinkAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap.cards.BSCardChildren;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_HASH;

/**
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSCardButton extends BSButton implements BSCardChildren
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new card button (a link behaving as a button)
	 */
	public BSCardButton()
	{
		setTag("a");
		addAttribute(LinkAttributes.HRef.toString(), STRING_HASH);
	}

	/**
	 * Constructs a new card button (a link behaving as a button)
	 *
	 * @param text
	 */
	public BSCardButton(String text)
	{
		super(text);
		setTag("a");
		addAttribute(LinkAttributes.HRef.toString(), StaticStrings.STRING_HASH);
	}

}
