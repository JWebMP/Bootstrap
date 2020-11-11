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
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap4.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap4.navs.interfaces.BSNavsChildren;
import com.jwebmp.plugins.bootstrap4.navs.interfaces.IBSNavs;
import com.jwebmp.plugins.bootstrap4.navs.parts.BSNavListItem;
import com.jwebmp.plugins.bootstrap4.options.BSAlignmentHorizontalOptions;

import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import static com.jwebmp.plugins.bootstrap4.navs.BSNavsOptions.*;

/**
 * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states. Swap
 * modifier classes to switch between each style.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Navs",
		description = "Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and " +
		              "disabled states. Swap modifier classes to switch between each style.",
		url = "https://v4-alpha.getbootstrap.com/components/navs/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSNavs<J extends BSNavs<J>>
		extends Div<BSNavsChildren, BSNavsAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSNavBarChildren<BSNavsChildren, J>, IBSNavs<J>
{


	/**
	 * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states.
	 * Swap modifier classes to switch between each style.
	 */
	public BSNavs()
	{
		setTag("ul");
		addClass(BSNavsOptions.Nav);
		addAttribute(BSNavsAttributes.Role, "tablist");
	}

	/**
	 * Returns a slimmer version of me
	 *
	 * @return
	 */
	public IBSNavs<J> asMe()
	{
		return this;
	}

	/**
	 * Sets the actual alignment for the links, centered and right are good ones
	 *
	 * @param options
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHorizontalAlignment(BSAlignmentHorizontalOptions options)
	{
		addClass(options);
		return (J) this;
	}

	/**
	 * Stack your navigation by changing the flex item direction with the .flex-column utility. Need to stack them on some viewports but
	 * not
	 * others? Use the responsive versions (e.g., .flex-sm-column).
	 *
	 * @param vertical
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setVertical(boolean vertical)
	{
		if (vertical)
		{
			addClass("flex-column");
		}
		else
		{
			removeClass("flex-column");
		}
		return (J) this;
	}

	/**
	 * Tabs
	 * Takes the basic nav from above and adds the .nav-tabs class to generate a tabbed interface. Use them to create tabbable regions with
	 * our tab JavaScript plugin.
	 *
	 * @param asTabs
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAsTabs(boolean asTabs)
	{
		if (asTabs)
		{
			addClass(BSNavsOptions.Nav_Tabs);
			addAttribute("role", "tablist");
		}
		else
		{
			removeClass(BSNavsOptions.Nav_Tabs);
		}
		return (J) this;
	}

	/**
	 * Adds a new item to the collection
	 *
	 * @param name
	 * @param active
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSNavListItem<?> addItem(String name, boolean active)
	{
		return addItem(name, active, false);
	}

	/**
	 * Adds a new item to the collection
	 *
	 * @param name
	 * @param active
	 * @param disabled
	 *
	 * @return
	 */

	@Override
	@NotNull
	public BSNavListItem<?> addItem(String name, boolean active, boolean disabled)
	{
		BSNavListItem<?> newLinkItem = new BSNavListItem<>(name);
		newLinkItem.setActive(active);
		newLinkItem.setDisabled(disabled);
		add(newLinkItem);
		return newLinkItem;
	}

	/**
	 * If the tabls should render as pills
	 *
	 * @param asPills
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAsPills(boolean asPills)
	{
		if (asPills)
		{
			addClass(BSNavsOptions.Nav_Pills);
		}
		else
		{
			removeClass(BSNavsOptions.Nav_Pills);
		}
		return (J) this;
	}

	/**
	 * Fill and justify
	 * Force your .nav’s contents to extend the full available width one of two modifier classes. To proportionately fill all available
	 * space with your .nav-items, use .nav-fill. Notice that all horizontal space is occupied, but not every nav item has the same width.
	 *
	 * @param fill
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFill(boolean fill)
	{
		if (fill)
		{
			addClass(BSNavsOptions.Nav_Fill);
		}
		else
		{
			removeClass(BSNavsOptions.Nav_Fill);
		}
		return (J) this;
	}

	/**
	 * Adds a new item to the collection
	 *
	 * @param name
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSNavListItem<?> addItem(String name)
	{
		return addItem(name, true, false);
	}

	/**
	 * Sets the buttons to equal width layout
	 *
	 * @param equalWidth
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEqualWidth(boolean equalWidth)
	{
		if (equalWidth)
		{
			addClass(Nav_Justified);
		}
		else
		{
			removeClass(Nav_Justified);
		}
		return (J) this;
	}

	/**
	 * Adds a drop down to the dav items
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSDropDown<?> addDropDown()
	{
		BSDropDown<?> dropDown = new BSDropDown<>();
		List<String> newOrder = new ArrayList<>(dropDown.getClasses());
		newOrder.add(0, BSNavsOptions.Nav_Item.toString());
		dropDown.setClasses(new LinkedHashSet<>(newOrder));
		add(dropDown);
		return dropDown;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void preConfigure()
	{
		if (!isConfigured() && (getClasses().contains(BSNavsOptions.Nav_Fill.toString()) || getClasses().contains(Nav_Justified.toString())))
		{

			getChildren().forEach(a ->
			                      {
				                      List<String> newOrder = new ArrayList<>(a.getClasses());
				                      newOrder.add(0, BSNavsOptions.Nav_Item.toString());
				                      a.setClasses(new LinkedHashSet<>(newOrder));
			                      });
		}

		super.preConfigure();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

}
