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

package com.jwebmp.plugins.bootstrap.listgroup.tabs;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap.options.BSColumnOptions;

import jakarta.validation.constraints.NotNull;
import java.util.Set;

public interface IBSListGroupTabs<J extends BSListGroupTabs<J>>
{
	/**
	 * Sets the columns to ocuppy for the list group
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@NotNull
	
	J setLeftSidePaneOptions(BSColumnOptions columnOptions);

	/**
	 * Sets the columns to ocuppy for the content
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@NotNull
	
	J setRightSidePaneOptions(BSColumnOptions columnOptions);

	/**
	 * Adds a tab the container, it gets built on configure.
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	BSTabContainer<?> addTab(String label, IComponentHierarchyBase<?,?> content, boolean active);

	/**
	 * Returns the set of tabs currently registered
	 *
	 * @return
	 */
	@NotNull
	Set<BSTabContainer<?>> getTabs();
}