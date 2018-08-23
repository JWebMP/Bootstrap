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
package com.jwebmp.plugins.bootstrap4.navbar.toggler;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap4.navbar.interfaces.IBSNavBarToggler;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSNavBarToggler<C extends IComponentHierarchyBase, A extends Enum & AttributeDefinitions, F extends GlobalFeatures, E extends GlobalEvents, J extends Button<C, A, F, E, J>>
		extends Button<C, A, F, E, J>
		implements BSNavBarChildren<C, J>, IBSNavBarToggler<C, A, F, E, J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * The specified screen reader aria label to apply when creating the div
	 */
	private String ariaLabel = "Toggle Navigation";

	private String iconClass = "navbar-toggler-icon";
	private Span<?, ?, ?> iconSpan;

	/**
	 * Creates 2 new accessible objects for the nav bar
	 */
	public BSNavBarToggler()
	{
		addClass("navbar-toggler");
	}

	public IBSNavBarToggler asMe()
	{
		return this;
	}

	/**
	 * Gets the screen reader aria label
	 *
	 * @return
	 */
	@Override
	public String getAriaLabel()
	{
		return ariaLabel;
	}

	/**
	 * sets the screen reader aria label
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAriaLabel(String ariaLabel)
	{
		this.ariaLabel = ariaLabel;
		return (J) this;
	}

	/**
	 * Gets the span for the navbar icon
	 *
	 * @return
	 */
	@Override
	public Span<?, ?, ?> getIconSpan()
	{
		if (iconSpan == null)
		{
			iconSpan = new Span();
			if (iconClass != null)
			{
				iconSpan.addClass(iconClass);
			}
		}
		return iconSpan;
	}

	/**
	 * Gets the Icon Class
	 *
	 * @return
	 */
	@Override
	public String getIconClass()
	{
		return iconClass;
	}

	/**
	 * Sets the Icon Class
	 *
	 * @param iconClass
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setIconClass(String iconClass)
	{
		this.iconClass = iconClass;
		return (J) this;
	}

	/**
	 * Sets the icon for the span
	 *
	 * @param iconSpan
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setIconSpan(Span<?, ?, ?> iconSpan)
	{
		this.iconSpan = iconSpan;
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void preConfigure()
	{
		if (!isConfigured())
		{
			add((C) getIconSpan());
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
