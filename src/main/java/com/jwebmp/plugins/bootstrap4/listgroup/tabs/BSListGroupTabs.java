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

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap4.containers.BSRow;
import com.jwebmp.plugins.bootstrap4.listgroup.BSListGroup;
import com.jwebmp.plugins.bootstrap4.options.BSColumnOptions;

import javax.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.Set;

public class BSListGroupTabs<J extends BSListGroupTabs<J>>
		extends BSRow<J>
		implements IBSListGroupTabs<J>
{
	private final Set<BSTabContainer<?>> tabs;

	private BSListGroup<?> listGroup;

	private DivSimple<?> leftSidePane;
	private DivSimple<?> rightSidePane;

	private DivSimple<?> tabContentHolder;

	/**
	 * A vertical list group controlling the display of content on the left
	 */
	public BSListGroupTabs()
	{
		listGroup = new BSListGroup<>();
		listGroup.setTag("div");
		listGroup.addAttribute("role", "tablist");

		leftSidePane = new DivSimple<>();
		leftSidePane.addClass(BSColumnOptions.Col_4);

		rightSidePane = new DivSimple<>();
		rightSidePane.addClass(BSColumnOptions.Col_8);

		tabContentHolder = new DivSimple<>();
		tabContentHolder.addClass("tab-content");

		tabs = new LinkedHashSet<>();
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			add(leftSidePane);
			leftSidePane.add(listGroup);
			add(rightSidePane);
			rightSidePane.add(tabContentHolder);
			tabs.forEach(a ->
			             {
				             a.configure();
				             listGroup.add(a.getButtonItem());
				             tabContentHolder.add(a.getTabPane());
			             });
		}
		super.preConfigure();
	}

	/**
	 * A better smaller neater view
	 *
	 * @return
	 */
	public IBSListGroupTabs<J> asMe()
	{
		return this;
	}

	/**
	 * Sets the columns to ocuppy for the list group
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setLeftSidePaneOptions(BSColumnOptions columnOptions)
	{
		leftSidePane.addClass(columnOptions);
		return (J) this;
	}

	/**
	 * Sets the columns to ocuppy for the content
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setRightSidePaneOptions(BSColumnOptions columnOptions)
	{
		rightSidePane.addClass(columnOptions);
		return (J) this;
	}

	/**
	 * Adds a tab the container, it gets built on configure.
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	@Override
	public BSTabContainer<?> addTab(String label, Div<?, ?, ?, ?, ?> content, boolean active)
	{
		BSTabContainer<?> tab = new BSTabContainer<>(active, content, label);
		getTabs().add(tab);
		return tab;
	}

	/**
	 * Returns the set of tabs currently registered
	 *
	 * @return
	 */
	@Override
	@NotNull
	public Set<BSTabContainer<?>> getTabs()
	{
		return tabs;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
