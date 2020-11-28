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
package com.jwebmp.plugins.bootstrap4.navs;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.plugins.bootstrap4.options.BSAlignmentHorizontalOptions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class BSNavsTest
{

	BSNavs nav = new BSNavs();

	public BSNavsTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		BSNavs nav = new BSNavs();
		nav.setHorizontalAlignment(BSAlignmentHorizontalOptions.Align_Center);
		nav.addItem("new item");
		System.out.println(nav.toString(true));

	}

	@Test
	public void testNavTabs()
	{
		BSNavTabs tabs = new BSNavTabs();
		tabs.addTab("Tab Label", new Div(), true);
		tabs.addTab("Tab Label 2", new Div(), false);
		tabs.addTab("Tab Label 3", new Div(), false);
		tabs.addTab("Tab Label 4", new Div(), false);
		tabs.addTab("Tab Label 5", new Div(), false);

		System.out.println(tabs.toString(true));
	}

	@Test
	public void testSomeMethodFunctionality()
	{
		BSNavs nav = new BSNavs();
		nav.addDropDown()
		   .addDropDownMenu();
		nav.addItem("New Nav Item");
		nav.setAsTabs(true);

		nav.setHorizontalAlignment(BSAlignmentHorizontalOptions.Align_Center);
		System.out.println(nav.toString(true));
	}

	@Test
	public void testFill()
	{
		BSNavs nav = new BSNavs();
		nav.setFill(true);
		nav.setHorizontalAlignment(BSAlignmentHorizontalOptions.Align_Center);
		nav.addItem("new item");
		nav.addItem("new item2");
		nav.addItem("new item3");
		nav.addItem("new item4");
		nav.addItem("new item5");
		nav.addItem("new item6");
		System.out.println(nav.toString(true));
	}
}
