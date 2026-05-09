package com.jwebmp.plugins.bootstrap.carousel.parts;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.children.generics.ParagraphChildren;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;

/**
 * Optional captions
 * <p>
 * Add captions to your slides easily with the .carousel-caption element within any .carousel-item. Place just about any optional HTML
 * within there and it will be automatically aligned and formatted.
 *
 * @author GedMarc
 * @since 4th Jan 2017
 */
public class BSCarouselCaption<J extends BSCarouselCaption<J>>
		extends Div<ParagraphChildren, NoAttributes, GlobalFeatures, GlobalEvents, J>
{

	/**
	 * Optional captions
	 * <p>
	 * Add captions to your slides easily with the .carousel-caption element within any .carousel-item. Place just about any optional HTML
	 * within there and it will be automatically aligned and
	 * formatted.
	 */
	public BSCarouselCaption()
	{
		this(null);
	}

	/**
	 * Optional captions
	 * <p>
	 * Add captions to your slides easily with the .carousel-caption element within any .carousel-item. Place just about any optional HTML
	 * within there and it will be automatically aligned and
	 * formatted.
	 *
	 * @param text
	 */
	public BSCarouselCaption(String text)
	{
		super(text);
		addClass("carousel-caption");
	}

}
