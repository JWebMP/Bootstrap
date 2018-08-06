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

package com.jwebmp.plugins.bootstrap4.breadcrumbs;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.navs.BSNavsAttributes;

import javax.validation.constraints.NotNull;

/**
 * Indicate the current page’s location within a navigational hierarchy that automatically adds separators via CSS.
 *
 * @param <J>
 */
@ComponentInformation(name = "Bootstrap Breadcrumbs",
		description = "Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS " + "through ::before and content.",
		url = "https://v4-alpha.getbootstrap.com/components/breadcrumb/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSBreadCrumb<J extends BSBreadCrumb<J>>
		extends Div<BSBreadcrumbContainer, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements IBSBreadCrumb<J>
{
	private static final String NavigationString = "navigation";
	private static final String BreadCrumbsString = "breadcrumbs";

	private final BSBreadcrumbContainer crumbs;

	/**
	 * Indicate the current page’s location within a navigational hierarchy that automatically adds separators via CSS.
	 *
	 * @param optionalAriaLabel
	 */
	public BSBreadCrumb(String... optionalAriaLabel)
	{
		super(ComponentTypes.Navigation);
		if (optionalAriaLabel != null)
		{
			addAttribute(GlobalAttributes.Aria_Label, optionalAriaLabel.length > 0 ? optionalAriaLabel[0] : BreadCrumbsString);
		}
		else
		{
			addAttribute(GlobalAttributes.Aria_Label, BreadCrumbsString);
		}
		addAttribute(BSNavsAttributes.Role.toString(), NavigationString);
		crumbs = new BSBreadcrumbContainer();
		add(crumbs);
	}

	/**
	 * Adds a new breadcrumb item to the colletion
	 *
	 * @param item
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBreadCrumb(BSBreadCrumbItem item)
	{
		crumbs.add(item);
		return (J) this;
	}

	public BSBreadCrumbItem addBreadCrumbItem(String text, boolean active)
	{
		return addBreadCrumbItem(text, active, null);
	}

	public BSBreadCrumbItem addBreadCrumbItem(String text, boolean active, String url)
	{
		return addBreadCrumbItem(text, active,url, null);
	}

	public BSBreadCrumbItem addBreadCrumbItem(String text, boolean active, String url, String tooltip)
	{
		BSBreadCrumbItem item = new BSBreadCrumbItem<>().setText(text);
		item.setActive(active);
		item.setCrumbLink(new Link(url));
		crumbs.add(item);
		return item;
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
