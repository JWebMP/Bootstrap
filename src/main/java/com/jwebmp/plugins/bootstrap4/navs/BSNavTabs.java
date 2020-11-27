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

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap4.listgroup.tabs.BSTabContainer;
import com.jwebmp.plugins.bootstrap4.navs.interfaces.IBSNavTabs;
import com.jwebmp.plugins.bootstrap4.navs.parts.BSNavListItem;

import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.jwebmp.plugins.bootstrap4.navs.BSNavsOptions.*;

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
	private final ComponentHierarchyBase tabContents;

	private boolean tabsFirst = true;

	/**
	 * Constructs the container for NS Nav Tabs
	 */
	public BSNavTabs()
	{
		tabs = new LinkedHashSet<>();
		navs = new BSNavs<>();
		navs.setAsTabs(true);
		tabContents = new DivSimple();
		tabContents.addClass(Tab_Content);
	}

	public IBSNavTabs asMe()
	{
		return this;
	}

	/**
	 * Adds a tab to the BSNavTabs
	 *
	 * @param label The label to apply
	 * @param content A type safe div
	 * @param active if the tab must be active - restrict to one active at a time
	 *
	 * @return The generated tab container object
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
	 * Adds a tab to the BSNavTabs
	 *
	 * @param label The label to apply
	 * @param content A type safe div
	 * @param active if the tab must be active - restrict to one active at a time
	 *
	 * @return The generated tab container object
	 */
	@Override
	@NotNull
	public BSTabContainer<?> addTab(IIcon<?> label, Div<?, ?, ?, ?, ?> content, boolean active)
	{
		BSTabContainer<?> tab = new BSTabContainer<>(active, content, label);
		BSNavListItem<?> listItem = navs.addItem(label, active);
		tab.setListItem(listItem);
		navs.remove(listItem);
		tabs.add(tab);
		return tab;
	}


	/**
	 * Adds a tab to the BSNavTabs
	 *
	 * @param label The label to apply
	 * @param content A type safe div
	 *
	 * @return The generated tab container object
	 */
	@Override
	@NotNull
	public BSTabContainer<?> addTab(IIcon<?> label, Div<?, ?, ?, ?, ?> content)
	{
		return addTab(label, content, false);
	}


	/**
	 * Returns the set of tabs currently registered
	 *
	 * @return The set of Tab Containers that will be rendered
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
	 * @return The navs object (tag UL class NAV)
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
	 * @return The actual div for the tab contents which has all the tab panes inside
	 */
	@Override
	public ComponentHierarchyBase getTabContents()
	{
		return tabContents;
	}

	/**
	 * Adds a drop down to the dav items.
	 * <p>
	 * Remember to add the drop down menu and select to the drop down! xD
	 *
	 * @return The tab container for the drop down tab item
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	@Override
	public BSTabContainer<?> addDropDownTab(String label, Div<?, ?, ?, ?, ?> content, boolean active)
	{
		BSTabContainer output = new BSTabContainer(active, content, label);

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
			if (tabsFirst)
			{
				add(navs);
				add(tabContents);
			}
			else
			{
				add(tabContents);
				add(navs);
			}

			tabs.forEach(a ->
			             {
				             a.configure();
				             navs.add(a.getListItem());
				             tabContents.add(a.getTabPane());
			             });
		}
		super.preConfigure();
	}

	/**
	 * Sets the tab display to bordered
	 *
	 * @param bordered
	 * 		If must be bordered
	 *
	 * @return This object
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J setBordered(boolean bordered)
	{
		if (bordered)
		{
			addClass(BSNavsOptions.Tabs_Bordered);
		}
		else
		{
			removeClass(BSNavsOptions.Tabs_Bordered);
		}
		return (J) this;
	}

	/**
	 * Sets the tab display to justified
	 *
	 * @param justified
	 * 		If must be justified
	 *
	 * @return always this object
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J setJustified(boolean justified)
	{
		if (justified)
		{
			addClass(BSNavsOptions.Nav_Justified);
		}
		else
		{
			removeClass(BSNavsOptions.Nav_Justified);
		}
		return (J) this;
	}

	/**
	 * Sets the tab display to justified
	 *
	 * @param verticalLeftTabs
	 * 		If must be vertical and left
	 *
	 * @return always this object
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J setVerticalLeftTabs(boolean verticalLeftTabs)
	{
		if (verticalLeftTabs)
		{
			addClass(BSNavsOptions.Tabs_Vertical_Env);
			getNavs().addClass(Tabs_Vertical);
		}
		else
		{
			removeClass(BSNavsOptions.Tabs_Vertical_Env);
			getNavs().removeClass(Tabs_Vertical);
		}
		return (J) this;
	}

	/**
	 * Sets the tab display to justified
	 *
	 * @param verticalLeftTabs
	 * 		If must be vertical and left
	 *
	 * @return always this object
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J setVerticalRightTabs(boolean verticalLeftTabs)
	{
		if (verticalLeftTabs)
		{
			addClass(BSNavsOptions.Tabs_Vertical_Env);
			addClass(BSNavsOptions.Tabs_Vertical_Env_Right);
			getNavs().addClass(Tabs_Vertical);
			tabsFirst = false;
		}
		else
		{
			removeClass(BSNavsOptions.Tabs_Vertical_Env);
			removeClass(BSNavsOptions.Tabs_Vertical_Env_Right);
			getNavs().removeClass(Tabs_Vertical);
			tabsFirst = true;
		}
		return (J) this;
	}

	/**
	 * Removes the padding top from the tab-contents to align exactly to the tab
	 * @return Always this
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J removeSpacingTop()
	{
		getTabContents().addStyle("padding-top:0px;");
		return (J)this;
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
