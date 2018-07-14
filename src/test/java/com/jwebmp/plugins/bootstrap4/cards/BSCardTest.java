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
package com.jwebmp.plugins.bootstrap4.cards;

import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardBody;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardHeader;
import com.jwebmp.plugins.bootstrap4.options.*;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSCardTest
{

	public BSCardTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BSCard card = new BSCard();
		card.add(new BSCardBody());
		card.add(new BSCardHeader("THis is a card header"));
		System.out.println(card.toString(true));
	}

	@Test
	public void testSetStyle()
	{
		BSCard card = new BSCard();
		card.addMargin(BSMarginOptions.MarginBottom_3);
		card.addPadding(BSPaddingOptions.PaddingTop_3);

		card.addBackground(BSBackgroundOptions.Bg_Primary);
		System.out.println(card.toString(true));
	}

	@Test
	public void testSetBorder()
	{
		BSCard card = new BSCard();
		card.addBorder(BSBorderOptions.Rounded_Bottom);
		card.addBorder(BSBorderOptions.Border_Success);
		card.addForeground(BSColoursOptions.Text_White);
		System.out.println(card.toString(true));
	}
}
