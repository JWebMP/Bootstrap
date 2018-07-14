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

package com.jwebmp.plugins.bootstrap4.cards.prebuilt;

import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardImageTop;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardLink;
import org.junit.jupiter.api.Test;

public class DefaultCardTest

{

	@Test
	public void testHeader()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setHeaderText("This is a header");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testFooter()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setFooterText("This is a footer");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardTitle()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardTitle("title");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardSubTitle()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardSubTitle("title");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardAndSubTitle()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardTitle("title");
		impl.setCardSubTitle("sub title");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardImageTop()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardImageTop(new BSCardImageTop("imageUrl"));
		impl.setCardTitle("title");
		impl.setCardSubTitle("sub title");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testCardLinks()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.getCardLinks()
		    .add(new BSCardLink("toAddress"));
		System.out.println(impl.toString(0));
	}

	@Test
	public void testToCardLinks()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.setCardImageTop(new BSCardImageTop("imageUrl"));
		impl.setCardTitle("title");
		impl.setCardSubTitle("sub title");
		impl.getCardLinks()
		    .add(new BSCardLink("toAddress"));
		impl.setHeaderText("This is a header");
		impl.setFooterText("This is a footer");
		System.out.println(impl.toString(0));
	}

	@Test
	public void testToCardBody()
	{
		DefaultCardImpl impl = new DefaultCardImpl();
		impl.getCardBody()
		    .add("TestBody");
		System.out.println(impl.toString(0));
	}

	public static class DefaultCardImpl
			extends DefaultCard<DefaultCardImpl>
	{

	}
}
