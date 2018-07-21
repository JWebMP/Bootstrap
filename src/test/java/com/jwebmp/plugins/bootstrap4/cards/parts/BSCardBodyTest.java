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

import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import org.junit.jupiter.api.Test;

class BSCardBodyTest

{

	@Test
	void addTitle()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addTitle(HeaderTypes.H5, "Test Body Title");

		System.out.println(body.toString(0));
	}

	@Test
	void addSubtitleTitle()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addSubtitle(HeaderTypes.H3, "Test Body Sub Title");
		System.out.println(body.toString(0));

		BSCardBody<?> body2 = new BSCardBody<>();
		body2.addSubtitle("Test Body Sub Title 2");
		System.out.println(body2.toString(0));
	}

	@Test
	void addText()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addText("Test Body Text");
		System.out.println(body.toString(0));
	}

	@Test
	void addButtonLink()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addButtonLink("Test Button Link");
		System.out.println(body.toString(0));
	}

	@Test
	void addButtonLink1()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addButtonLink("Test Button Link", BSButtonOptions.Btn_Danger, BSButtonSizeOptions.Btn_Block);
		System.out.println(body.toString(0));
	}

	@Test
	void addBlockQuote()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addBlockQuote("Test Button Link", (String) null);
		System.out.println(body.toString(0));

		BSCardBody<?> body2 = new BSCardBody<>();
		body2.addBlockQuote("Test Button Link", new BSCardBlockQuoteFooter<>().setText("Footer"));
		System.out.println(body2.toString(0));
	}
}

