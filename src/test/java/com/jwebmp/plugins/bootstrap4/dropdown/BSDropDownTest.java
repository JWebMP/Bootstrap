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
package com.jwebmp.plugins.bootstrap4.dropdown;

import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownMenu;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSDropDownTest

{

	public BSDropDownTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BSDropDown drop = new BSDropDown();
		drop.addDropDownButton();
		BSDropDownMenu<?> menu = drop.addDropDownMenu();
		menu.addItem("new Item");
		menu.addDivider();
		menu.addHeader("Header");
		menu.addItem("new item 2");
		System.out.println(drop.toString(true));
	}

	@Test
	public void testSingleDropdown()
	{
		BSDropDown drop = new BSDropDown();
		System.out.println(drop.toString(true));
	}

	@Test
	public void testSplitButton()
	{
		BSDropDownSplitButton splitButton = new BSDropDownSplitButton();

		splitButton.addDropDownButton();
		splitButton.addSplitButton();
		splitButton.addDropDownMenu();

		System.out.println(splitButton.toString(true));
	}

	@Test
	public void testDropupButton()
	{
		BSDropUp up = new BSDropUp();
		System.out.println(up.toString(true));
	}
}
