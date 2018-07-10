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
import com.jwebmp.base.html.attributes.GlobalAttributes;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonAttributes;
import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap4.listgroup.BSListGroupOptions;
import com.jwebmp.plugins.bootstrap4.listgroup.parts.BSListGroupButtonItem;
import com.jwebmp.plugins.bootstrap4.navs.parts.BSNavListItem;
import com.jwebmp.plugins.bootstrap4.options.BSDefaultOptions;
import com.jwebmp.plugins.bootstrap4.toggle.BSDropDownToggle;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import static com.jwebmp.plugins.bootstrap4.navs.BSNavsOptions.*;

/**
 * A list group tab to add (Container)
 */
public class BSTabContainer<J extends BSTabContainer<J>>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	private boolean active;
	private boolean fade;

	private Div<?, ?, ?, ?, ?> tabPane;

	private BSListGroupButtonItem<?> buttonItem;
	private BSNavListItem<?> listItem;
	private BSDropDown<?> dropDownItem;

	public BSTabContainer(boolean active, @NotNull Div<?, ?, ?, ?, ?> tabContent, String text)
	{
		this(tabContent, text);
		this.active = active;
		if (active)
		{
			buttonItem.setActive();
		}
	}

	@SuppressWarnings("unchecked")
	public BSTabContainer(Div<?, ?, ?, ?, ?> tabContent, String text)
	{
		tabPane = tabContent;
		buttonItem = new BSListGroupButtonItem<>();
		buttonItem.setText(text);
		listItem = new BSNavListItem<>(text);
		dropDownItem = new BSDropDown<>();
	}

	/**
	 * Configures the group tab
	 */
	@SuppressWarnings("unchecked")
	public void configure()
	{
		tabPane.addClass("tab-pane");
		if (fade)
		{
			tabPane.addClass(BSDefaultOptions.Fade);
		}
		if (active)
		{
			tabPane.addClass(BSDefaultOptions.Show);
			tabPane.addClass(BSListGroupOptions.Active);
			buttonItem.addClass(BSListGroupOptions.Active);
		}

		tabPane.addAttribute("role", "tabpanel");
		tabPane.addAttribute(GlobalAttributes.Aria_LabelledBy, getButtonItem().getID());

		if (active)
		{
			tabPane.addClass(BSDefaultOptions.Active);
			tabPane.addClass(BSDefaultOptions.Show);
		}

		buttonItem.addAttribute("role", "tab");
		buttonItem.addAttribute(BSButtonAttributes.Data_Toggle.toString(), "list");
		buttonItem.addAttribute("href", tabPane.getID(true));

		if (dropDownItem.getChildren()
		                .size() == 2)
		{
			Iterator iterator = dropDownItem.getChildren()
			                                .iterator();
			BSDropDownToggle menu = (BSDropDownToggle) iterator.next();
			List<String> newOrder = new ArrayList<>(menu.getClasses());
			newOrder.add(0, Nav_Link.toString());
			newOrder.add(0, "data-toggle-tag");
			menu.setClasses(new LinkedHashSet<>(newOrder));
		}

		listItem.setActive(active);
		if (active)
		{
			listItem.getLinkItem()
			        .addClass("active");

			listItem.getLinkItem()
			        .addClass("show");
		}
		listItem.getLinkItem()
		        .addAttribute("data-toggle", "tab");
		listItem.getLinkItem()
		        .addAttribute("href", tabPane.getID(true));
	}

	/**
	 * Sets the button group item
	 *
	 * @return
	 */
	public BSListGroupButtonItem<?> getButtonItem()
	{
		return buttonItem;
	}

	/**
	 * Sets the button group item
	 *
	 * @param buttonItem
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setButtonItem(BSListGroupButtonItem<?> buttonItem)
	{
		this.buttonItem = buttonItem;
		return (J) this;
	}

	/**
	 * Set active or not
	 *
	 * @return
	 */
	public boolean isActive()
	{
		return active;
	}

	/**
	 * Sets active or not
	 *
	 * @param active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		this.active = active;
		return (J) this;
	}

	/**
	 * If fade is enabled
	 *
	 * @return
	 */
	public boolean isFade()
	{
		return fade;
	}

	/**
	 * If fade is enabled
	 *
	 * @param fade
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFade(boolean fade)
	{
		this.fade = fade;
		return (J) this;
	}

	/**
	 * Returns the tab pane
	 *
	 * @return
	 */
	public Div<?, ?, ?, ?, ?> getTabPane()
	{
		return tabPane;
	}

	/**
	 * Sets the tab pane
	 *
	 * @param tabPane
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTabPane(Div<?, ?, ?, ?, ?> tabPane)
	{
		this.tabPane = tabPane;
		return (J) this;
	}

	/**
	 * Returns the list item
	 *
	 * @return
	 */
	@NotNull
	public BSNavListItem<?> getListItem()
	{
		return listItem;
	}

	/**
	 * Sets the given list item
	 *
	 * @param listItem
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setListItem(@NotNull BSNavListItem<?> listItem)
	{
		this.listItem = listItem;
		return (J) this;
	}

	/**
	 * Returns a configure Drop Down Item
	 *
	 * @return
	 */
	public BSDropDown<?> getDropDownItem()
	{
		return dropDownItem;
	}

	/**
	 * Sets the drop down items
	 *
	 * @param dropDownItem
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDropDownItem(BSDropDown<?> dropDownItem)
	{
		this.dropDownItem = dropDownItem;
		return (J) this;
	}
}
