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

package com.jwebmp.plugins.bootstrap4.listgroup.tabs;

import com.jwebmp.core.base.html.Div;
import org.junit.jupiter.api.Test;

class BSListGroupTabsTest

{

	@Test
	void getTabs()
	{
		BSListGroupTabs<?> tabs = new BSListGroupTabs<>();
		tabs.addTab("Tab 1", new Div(), true);
		tabs.addTab("Tab 2", new Div(), false)
		    .setFade(true);
		System.out.println(tabs.toString(0));
	}
}
