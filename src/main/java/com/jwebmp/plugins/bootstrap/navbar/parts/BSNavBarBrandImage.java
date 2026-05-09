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
