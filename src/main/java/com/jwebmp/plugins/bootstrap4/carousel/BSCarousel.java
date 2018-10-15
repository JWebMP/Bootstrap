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
package com.jwebmp.plugins.bootstrap4.carousel;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.carousel.features.*;
import com.jwebmp.plugins.bootstrap4.carousel.parts.BSCarouselControl;
import com.jwebmp.plugins.bootstrap4.carousel.parts.BSCarouselIndicators;
import com.jwebmp.plugins.bootstrap4.carousel.parts.BSCarouselItem;
import com.jwebmp.plugins.bootstrap4.carousel.parts.BSCarouselSlides;
import com.jwebmp.plugins.bootstrap4.options.BSColoursOptions;
import com.jwebmp.plugins.bootstrap4.options.BSDefaultOptions;
import com.jwebmp.plugins.bootstrap4.options.interfaces.IBSCarousel;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Carousel
 * <p>
 * A slideshow component for cycling through elements—images or slides of text—like a carousel.
 * <p>
 * In browsers where the Page Visibility API is supported, the carousel will avoid sliding when the webpage is not visible to the user (such
 * as when the browser tab is inactive, the browser window is
 * minimized, etc.). Nested carousels are not supported.
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 01 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Carousel",
		description = " slideshow component for cycling through elements—images or slides of text—like a carousel.",
		url = "https://v4-alpha.getbootstrap.com/components/carousel/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-Bootstrap4Plugin/wiki")
public class BSCarousel<J extends BSCarousel<J>>
		extends Div<BSCarouselChildren, BSCarouselAttributes, BSCarouselFeatures, BSCarouselEvents, J>
		implements com.jwebmp.plugins.bootstrap4.options.interfaces.IBSCarousel<J>
{

	private static final long serialVersionUID = 1L;
	private BSCarouselFeature feature;

	/**
	 * Determines the active slide
	 */
	private int activeSlide;
	/**
	 * The list of slides that gets rendered
	 */
	private List<BSCarouselItem<?>> slides;
	/**
	 * The actual carousel slides displaying div
	 */
	private BSCarouselSlides<?> carouselSlides;
	/**
	 * The previous link
	 */
	private BSCarouselControl<?> previousLink;
	/**
	 * The next link
	 */
	private BSCarouselControl<?> nextLink;
	/**
	 * Whether or not this carousel will show indicators
	 */
	private boolean indicators;

	/**
	 * Carousel
	 * <p>
	 * A slideshow component for cycling through elements—images or slides of text—like a carousel.
	 * <p>
	 * In browsers where the Page Visibility API is supported, the carousel will avoid sliding when the webpage is not visible to the user
	 * (such as when the browser tab is inactive, the browser window
	 * is minimized, etc.). Nested carousels are not supported.
	 */
	public BSCarousel()
	{
		addFeature(getFeature());

	}

	/**
	 * Returns the java script feature associated
	 *
	 * @return
	 */
	public final BSCarouselFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BSCarouselFeature(this);
		}
		return feature;
	}

	/**
	 * Returns any javascript options available
	 *
	 * @return
	 */
	@Override
	public com.jwebmp.plugins.bootstrap4.carousel.options.BSCarouselOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			BSCarouselIndicators indications = new BSCarouselIndicators(this);
			indications.init();
			add(indications);
			add(getCarouselSlides());

			BSCarouselItem activeItem;
			if (!getSlides().isEmpty())
			{
				activeItem = getSlides().get(getActiveSlide());
				activeItem.addClass(BSDefaultOptions.Active);
			}
			for (BSCarouselItem slide : getSlides())
			{
				getCarouselSlides().add(slide);
			}

			add(getPreviousLink());

			add(getNextLink());

		}
		super.init();
	}

	/**
	 * Returns the carousel slides
	 *
	 * @return
	 */

	@Override
	public BSCarouselSlides<?> getCarouselSlides()
	{
		if (carouselSlides == null)
		{
			setCarouselSlides(new BSCarouselSlides());
		}
		return carouselSlides;
	}

	/**
	 * Sets the carousel slides
	 *
	 * @param carouselSlides
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCarouselSlides(BSCarouselSlides<?> carouselSlides)
	{
		this.carouselSlides = carouselSlides;
		return (J) this;
	}

	/**
	 * Returns the list of slides currently associated
	 *
	 * @return
	 */

	@Override
	public List<BSCarouselItem<?>> getSlides()
	{
		if (slides == null)
		{
			setSlides(new ArrayList<>());
		}
		return slides;
	}

	/**
	 * The active slide
	 *
	 * @return
	 */

	@Override
	public int getActiveSlide()
	{
		return activeSlide;
	}

	/**
	 * Sets the active slide
	 *
	 * @param activeSlide
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActiveSlide(int activeSlide)
	{
		this.activeSlide = activeSlide;
		return (J) this;
	}

	/**
	 * Returns the previous link
	 *
	 * @return
	 */

	@Override
	public BSCarouselControl<?> getPreviousLink()
	{
		if (previousLink == null)
		{
			setPreviousLink(new BSCarouselControl(this, true));
		}
		return previousLink;
	}

	/**
	 * Returns the next link
	 *
	 * @return
	 */

	@Override
	public BSCarouselControl<?> getNextLink()
	{
		if (nextLink == null)
		{
			setNextLink(new BSCarouselControl(this, false));
		}
		return nextLink;
	}

	/**
	 * Sets the next link
	 *
	 * @param nextLink
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNextLink(BSCarouselControl<?> nextLink)
	{
		getChildren().remove(this.nextLink);
		this.nextLink = nextLink;
		if (this.nextLink != null)
		{
			nextLink.addClass(BSCarouselOptions.Carousel_Control_Next);

			nextLink.addAttribute("role", "button");
			nextLink.addAttribute("data-slide", "next");

			Span iconSpan = new Span();
			iconSpan.addAttribute(GlobalAttributes.Aria_Hidden, "true");
			iconSpan.addClass(BSCarouselOptions.Carousel_Control_Next_Icon);

			Span readerFriendly = new Span("Next");
			readerFriendly.addClass(BSColoursOptions.Sr_Only);
			nextLink.add(iconSpan);
			nextLink.add(readerFriendly);
		}
		return (J) this;
	}

	/**
	 * Set's the previous link
	 *
	 * @param previousLink
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPreviousLink(BSCarouselControl<?> previousLink)
	{
		getChildren().remove(this.previousLink);
		this.previousLink = previousLink;
		if (this.previousLink != null)
		{
			previousLink.addClass(BSCarouselOptions.Carousel_Control_Prev);
			previousLink.addAttribute("role", "button");
			previousLink.addAttribute("data-slide", "prev");

			Span iconSpan = new Span();
			iconSpan.addAttribute(GlobalAttributes.Aria_Hidden, "true");
			iconSpan.addClass(BSCarouselOptions.Carousel_Control_Prev_Icon);

			Span readerFriendly = new Span("Previous");
			readerFriendly.addClass(BSColoursOptions.Sr_Only);
			previousLink.add(iconSpan);
			previousLink.add(readerFriendly);
		}
		return (J) this;
	}

	/**
	 * Sets the list of slides currently associated
	 *
	 * @param slides
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlides(List<BSCarouselItem<?>> slides)
	{
		this.slides = slides;
		return (J) this;
	}

	/**
	 * The data-ride="carousel" attribute is used to mark a carousel as animating starting at page load. It cannot be used in combination
	 * with (redundant and unnecessary) explicit JavaScript
	 * initialization of the same carousel.
	 *
	 * @param startAnimationOnLoad
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAnimateOnLoad(boolean startAnimationOnLoad)
	{
		if (startAnimationOnLoad)
		{
			addAttribute("data-ride", "carousel");
		}
		else
		{
			getAttributes().remove("data-ride");
		}
		return (J) this;
	}

	/**
	 * Whether or not this carousel shows indicators
	 *
	 * @return
	 */
	@Override
	public boolean isIndicators()
	{
		return indicators;
	}

	/**
	 * Whether or not this carousel shows indicators
	 *
	 * @param indicators
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIndicators(boolean indicators)
	{
		this.indicators = indicators;
		return (J) this;
	}

	/**
	 * Sets the time in milli's
	 *
	 * @param interval
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInterval(int interval)
	{
		addAttribute("data-interval", Integer.toString(interval));
		return (J) this;
	}

	/**
	 * Whether or not to respond to keyboard actions
	 *
	 * @param keyboard
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setKeyboard(boolean keyboard)
	{
		addAttribute("data-keyboard", Boolean.toString(keyboard));
		return (J) this;
	}

	/**
	 * Whether the carousel should cycle continuously or have hard stops.
	 *
	 * @param wrap
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setWrap(boolean wrap)
	{
		addAttribute("data-wrap", Boolean.toString(wrap));
		return (J) this;
	}

	/**
	 * If set to "hover", pauses the cycling of the carousel on mouse-enter and resumes the cycling of the carousel on mouse-leave. If set
	 * to null, hovering over the carousel won't pause it.
	 *
	 * @param pause
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPause(boolean pause)
	{
		addAttribute("data-pause", pause ? "hover" : "" + "null");
		return (J) this;
	}

	/**
	 * Creates a feature with a cycle method
	 *
	 * @return
	 */
	@Override
	public BSCarouselCycleFeature<?> createCycleFeature()
	{
		return new BSCarouselCycleFeature(this);
	}

	/**
	 * Creates a feature that cycles to the next slide
	 *
	 * @return
	 */
	@Override
	public BSCarouselNextFeature<?> createNextFeature()
	{
		return new BSCarouselNextFeature(this);
	}

	/**
	 * Creates a feature that will pause the carousel
	 *
	 * @return
	 */
	@Override
	public BSCarouselPauseFeature<?> createPauseFeature()
	{
		return new BSCarouselPauseFeature(this);
	}

	/**
	 * Creates a feature that will move to the previous slide
	 *
	 * @return
	 */
	@Override
	public BSCarouselPreviousFeature<?> createPreviousFeature()
	{
		return new BSCarouselPreviousFeature(this);
	}

	/**
	 * Creates a feature that will slide to a specific slide number
	 *
	 * @return
	 */
	@Override
	public BSCarouselSlideToNumberFeature<?> createSlideToNumberFeature(String slideNumber)
	{
		return new BSCarouselSlideToNumberFeature<>(this).setSlideNumber(slideNumber);
	}

	@Override
	public void preConfigure()
	{
		addClass("carousel slide");

		super.preConfigure();
	}

	/**
	 * Returns a slimmed down version of this class
	 *
	 * @return
	 */
	public IBSCarousel<J> asMe()
	{
		return this;
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
