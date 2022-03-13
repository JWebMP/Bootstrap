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
package com.jwebmp.plugins.bootstrap.breadcrumbs;

import com.guicedee.guicedinjection.json.StaticStrings;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;
import jakarta.validation.constraints.NotNull;

/**
 * A particular crumb
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public class BSBreadCrumbItem<J extends BSBreadCrumbItem<J>>
		extends ListItem<J>
		implements BSBreadcrumbsChildren, IBSBreadCrumbItem<J>
{
	/**
	 * The actual link for the crumb
	 */
	private Link<?> crumbLink;

	/**
	 * Construct with a link and text to show
	 *
	 * @param crumbLink
	 */
	@SuppressWarnings("")
	public BSBreadCrumbItem(Link<?> crumbLink)
	{
		this();
		setCrumbLink(crumbLink);
	}

	/**
	 * Constructs a particular crumb
	 */
	public BSBreadCrumbItem()
	{
		addClass(BSComponentBreadcrumbOptions.Breadcrumb_Item);
	}

	/**
	 * Adds a link to the Breadcrumb Link
	 *
	 * @param link
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addLink(BSBreadCrumbLink<?> link)
	{
		add(link);
		return (J) this;
	}

	/**
	 * Returns the crumb link, never null
	 *
	 * @return
	 */
	@Override
	public Link<?> getCrumbLink()
	{
		if (crumbLink == null)
		{
			setCrumbLink(new Link<>(StaticStrings.STRING_HASH));
		}
		return crumbLink;
	}

	/**
	 * Sets the given crumb link
	 *
	 * @param crumbLink
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCrumbLink(Link<?> crumbLink)
	{
		if (this.crumbLink != null)
		{
			remove(this.crumbLink);
			this.crumbLink = null;
		}
		this.crumbLink = crumbLink;
		if (this.crumbLink != null)
		{
			add(this.crumbLink);
		}
		return (J) this;
	}

	/**
	 * Sets this crumb to display as active
	 *
	 * @param active
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		if (active)
		{
			addClass(BSDefaultOptions.Active);
		}
		else
		{
			removeClass(BSDefaultOptions.Active);
		}
		return (J) this;
	}

	/**
	 * Neater display
	 *
	 * @return
	 */
	public IBSBreadCrumbItem<J> asMe()
	{
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}
}
