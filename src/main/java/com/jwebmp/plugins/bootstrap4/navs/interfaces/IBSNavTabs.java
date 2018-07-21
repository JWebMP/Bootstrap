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

package com.jwebmp.plugins.bootstrap4.navs.interfaces;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.plugins.bootstrap4.listgroup.tabs.BSTabContainer;
import com.jwebmp.plugins.bootstrap4.navs.BSNavs;

import javax.validation.constraints.NotNull;
import java.util.Set;

public interface IBSNavTabs

{
	/**
	 * Adds a tab to the BSNavTabs
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	@NotNull
	BSTabContainer<?> addTab(String label, Div<?, ?, ?, ?, ?> content, boolean active);

	/**
	 * Returns the set of tabs currently registered
	 *
	 * @return
	 */
	@NotNull
	Set<BSTabContainer<?>> getTabs();

	/**
	 * Returns the BS Navs Portion of the Tab Display
	 *
	 * @return
	 */
	@NotNull
	BSNavs<?> getNavs();

	/**
	 * Gets the Tab Group List for the contents
	 *
	 * @return
	 */
	Div getTabContents();
}
