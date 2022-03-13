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
package com.jwebmp.plugins.bootstrap.navbar.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Image;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarOptions;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;

import jakarta.validation.constraints.NotNull;

/**
 * Brand
 * <p>
 * The .navbar-brand can be applied to most elements, but an anchor works best as some elements might require utility classes or custom
 * styles.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSNavBarBrand<J extends BSNavBarBrand<J>>
		extends DivSimple<J>
		implements BSNavBarChildren
{


	/**
	 * Brand
	 * <p>
	 * The .navbar-brand can be applied to most elements, but an anchor works best as some elements might require utility classes or custom
	 * styles.
	 */
	public BSNavBarBrand()
	{
		addClass(BSNavBarOptions.Brand);
		setTag("a");
		addAttribute("href", "#");
	}

	/**
	 * Adds a BS Image with the image properties all set
	 *
	 * @param imageUrl
	 *
	 * @return
	 */
	public BSNavBarBrandImage<?> addImage(String imageUrl)
	{
		return addImage(imageUrl, null);
	}

	/**
	 * Adds a BS Image with the image properties all set
	 *
	 * @param imageUrl
	 *
	 * @return
	 */
	@NotNull
	public BSNavBarBrandImage<?> addImage(String imageUrl, String textAfter)
	{
		Image<?> image = new Image<>(imageUrl);
		BSNavBarBrandImage<?> brandImage = new BSNavBarBrandImage<>(image);

		image.addStyle("width", "30px");
		image.addStyle("height", "30px");
		image.addClass("d-inline-block align-top");

		add(image);

		addText(textAfter);
		return brandImage;
	}

	@SuppressWarnings("unchecked")
	public J addText(String text)
	{
		if (text != null)
		{
			setText(text);
		}
		return (J) this;
	}

	/**
	 * Shortcut method to set render text before children
	 *
	 * @param before
	 *
	 * @return
	 */
	public DivSimple<J> setTextBefore(boolean before)
	{
		return super.setRenderTextBeforeChildren(before);
	}

}
