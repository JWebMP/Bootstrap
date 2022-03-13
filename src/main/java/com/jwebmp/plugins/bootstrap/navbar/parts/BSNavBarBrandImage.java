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
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap.options.BSAlignmentVerticalOptions;
import com.jwebmp.plugins.bootstrap.options.BSDisplayOptions;

/**
 * Adding images to the .navbar-brand will likely always require custom styles or utilities to properly size. Here are some examples to
 * demonstrate.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSNavBarBrandImage<J extends BSNavBarBrandImage<J>>
		extends DivSimple<J>
		implements BSNavBarChildren
{


	/**
	 * Adding images to the .navbar-brand will likely always require custom styles or utilities to properly size. Here are some examples to
	 * demonstrate.
	 *
	 * @param image
	 */
	public BSNavBarBrandImage(Image<?> image)
	{
		addClass(BSDisplayOptions.Inline_Block);
		addClass(BSAlignmentVerticalOptions.Align_Top);
		addAttribute("alt", "...");
		add(image);
	}

}
