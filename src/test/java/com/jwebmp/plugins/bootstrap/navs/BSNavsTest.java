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
package com.jwebmp.plugins.bootstrap.navs;

import com.jwebmp.plugins.bootstrap.navs.parts.*;
import com.jwebmp.plugins.bootstrap.options.*;
import org.junit.jupiter.api.*;

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
		nav.setActiveId("active");
		nav.setHorizontalAlignment(BSAlignmentHorizontalOptions.Align_Center);
		nav.addTab(new BSNavItem<>(1)
				.setLinkItem(new BSNavLink<>("One"))
				.setContent(new BSNavContent<>().add("Stuff that goes into a tab"))
		);
		nav.addTab(new BSNavItem<>(2)
				.setLinkItem(new BSNavLink<>("Two"))
				.setContent(new BSNavContent<>().add("Stuff that goes into a tab 2"))
		);
		System.out.println(nav.toString(true));
		
	}
	
}
