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

package com.jwebmp.plugins.bootstrap4.navs.interfaces;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.plugins.bootstrap4.listgroup.tabs.BSTabContainer;
import com.jwebmp.plugins.bootstrap4.navs.BSNavTabs;
import com.jwebmp.plugins.bootstrap4.navs.BSNavs;

import com.jwebmp.plugins.bootstrap4.navs.parts.BSNavLinkItem;
import com.jwebmp.plugins.bootstrap4.navs.parts.BSNavListItem;
import jakarta.validation.constraints.NotNull;
import java.util.Set;

public interface IBSNavTabs

{
	@NotNull
	BSTabContainer<?> addTab(String label, Component  content, boolean active);

    @NotNull BSTabContainer<?> addTab(IIcon<?,?> label, Component content, boolean active);
	
	@NotNull BSTabContainer<?> addTab(BSNavLinkItem<?> tabLink, Component  content, boolean active);
	
	@NotNull BSTabContainer<?> addTab(IIcon<?,?> label, Component  content);

	@NotNull
	Set<BSTabContainer<?>> getTabs();

	@NotNull
	BSNavs<?> getNavs();

	ComponentHierarchyBase getTabContents();

	@NotNull
	@SuppressWarnings("unchecked")
	BSTabContainer<?> addDropDownTab(String label, Div<?, ?, ?, ?, ?> content, boolean active);

	@SuppressWarnings("unchecked")
	BSNavTabs setBordered(boolean bordered);

	@SuppressWarnings("unchecked")
	BSNavTabs setJustified(boolean justified);

	@SuppressWarnings("unchecked")
	BSNavTabs setVerticalLeftTabs(boolean verticalLeftTabs);

	@SuppressWarnings("unchecked")
	BSNavTabs setVerticalRightTabs(boolean verticalLeftTabs);

	@SuppressWarnings("unchecked")
	BSNavTabs removeSpacingTop();
}
