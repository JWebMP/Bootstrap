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

package com.jwebmp.plugins.bootstrap4.navs;

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap4.listgroup.tabs.BSTabContainer;
import com.jwebmp.plugins.bootstrap4.navs.interfaces.IBSNavTabs;
import com.jwebmp.plugins.bootstrap4.navs.parts.BSNavListItem;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Constructs the container for NS Nav Tabs
 *
 * @param <J>
 */
public class BSNavTabs<J extends BSNavTabs<J>>
		extends DivSimple<J>
		implements IBSNavTabs
{

	private final Set<BSTabContainer<?>> tabs;


	private final BSNavs<?> navs;
	private final Div tabContents;

	/**
	 * Constructs the container for NS Nav Tabs
	 */
	public BSNavTabs()
	{
		tabs = new LinkedHashSet<>();
		navs = new BSNavs<>();
		navs.setAsTabs(true);
		tabContents = new DivSimple();
		tabContents.addClass("tab-content");
	}

	public IBSNavTabs asMe()
	{
		return this;
	}

	/**
	 * Adds a tab to the BSNavTabs
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSTabContainer<?> addTab(String label, Div<?, ?, ?, ?, ?> content, boolean active)
	{
		BSTabContainer<?> tab = new BSTabContainer<>(active, content, label);
		BSNavListItem<?> listItem = navs.addItem(label, active);
		tab.setListItem(listItem);
		navs.remove(listItem);
		tabs.add(tab);
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

	/**
	 * Returns the BS Navs Portion of the Tab Display
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSNavs<?> getNavs()
	{
		return navs;
	}

	/**
	 * Gets the Tab Group List for the contents
	 *
	 * @return
	 */
	@Override
	public Div getTabContents()
	{
		return tabContents;
	}

	/**
	 * Adds a drop down to the dav items.
	 * <p>
	 * Remember to add the drop down menu and select to the drop down! xD
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public BSTabContainer<?> addDropDownTab(String label, Div<?, ?, ?, ?, ?> content, boolean active)
	{
		BSTabContainer output = new BSTabContainer(active, tabContents, label);

		BSDropDown<?> dropDown = new BSDropDown<>();
		dropDown.setTag("li");
		List<String> newOrder = new ArrayList<>(dropDown.getClasses());
		newOrder.add(0, BSNavsOptions.Nav_Item.toString());
		dropDown.setClasses(new LinkedHashSet<>(newOrder));

		output.setDropDownItem(dropDown);
		tabs.add(output);

		return output;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void preConfigure()
	{
		if (!isConfigured())
		{

			add(navs);
			add(tabContents);

			tabs.forEach(a ->
			             {
				             a.configure();
				             navs.add(a.getListItem());
				             tabContents.add(a.getTabPane());
			             });
		}
		super.preConfigure();
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
