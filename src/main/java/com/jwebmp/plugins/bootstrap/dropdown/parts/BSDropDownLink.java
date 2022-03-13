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
package com.jwebmp.plugins.bootstrap.dropdown.parts;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.plugins.bootstrap.dropdown.interfaces.BSDropDownChildren;
import com.jwebmp.plugins.bootstrap.dropdown.options.BSDropDownOptions;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;

import jakarta.validation.constraints.NotNull;

/**
 * The Link Button for a drop down
 * <p>
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included
 * Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 *
 * @author GedMarc
 * @since 13 Jan 2017
 */
public class BSDropDownLink<J extends BSDropDownLink<J>>
		extends Link<J>
		implements BSDropDownChildren
{
	/**
	 * Constructs a new bootstrap drop down link item
	 */
	public BSDropDownLink()
	{
		super("#");
		addClass(BSDropDownOptions.Dropdown_Item);
	}

	public BSDropDownLink(String text)
	{
		super(text);
	}

	/**
	 * Set the style to active using the "active" class
	 *
	 * @param active
	 *
	 * @return
	 */
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
	 * Set the style to active using the "active" class
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(boolean disabled)
	{
		if (disabled)
		{
			addClass(BSDefaultOptions.Disabled);
		}
		else
		{
			removeClass(BSDefaultOptions.Disabled);
		}
		return (J) this;
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
