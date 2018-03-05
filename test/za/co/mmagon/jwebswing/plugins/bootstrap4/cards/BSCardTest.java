/*
 * The MIT License
 *
 * Copyright 2017 GedMarc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap4.cards;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardBody;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardHeader;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.*;

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
		card.setMargin(BSMarginOptions.MarginBottom_3);
		card.setPadding(BSPaddingOptions.PaddingTop_3);

		card.setStyle(BSBackgroundOptions.Bg_Primary, BSColoursOptions.Text_White);
		System.out.println(card.toString(true));
	}


	@Test
	public void testSetBorder()
	{
		BSCard card = new BSCard();
		card.setBorder(BSBorderOptions.Rounded_Bottom);
		card.setBorder(BSBorderOptions.Border_Success);
		card.setStyle(BSBackgroundOptions.Bg_Primary, BSColoursOptions.Text_White);
		System.out.println(card.toString(true));
	}
}
