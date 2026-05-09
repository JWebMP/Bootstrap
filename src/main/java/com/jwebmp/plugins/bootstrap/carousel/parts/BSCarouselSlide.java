package com.jwebmp.plugins.bootstrap.carousel.parts;

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.carousel.*;

/**
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSCarouselSlide<J extends BSCarouselSlide<J>>
		extends DivSimple<J>
		implements BSCarouselChildren
{
	public BSCarouselSlide()
	{
		setTag("ng-template");
		addAttribute("ngbSlide", "");
	}

}
