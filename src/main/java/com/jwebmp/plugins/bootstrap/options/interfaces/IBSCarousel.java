package com.jwebmp.plugins.bootstrap.options.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.carousel.BSCarousel;
import com.jwebmp.plugins.bootstrap.carousel.features.*;
import com.jwebmp.plugins.bootstrap.carousel.parts.BSCarouselControl;
import com.jwebmp.plugins.bootstrap.carousel.parts.BSCarouselItem;
import com.jwebmp.plugins.bootstrap.carousel.parts.BSCarouselSlides;

import jakarta.validation.constraints.NotNull;
import java.util.Comparator;
import java.util.List;

public interface IBSCarousel<J extends BSCarousel<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Returns the carousel slides
	 *
	 * @return
	 */

	BSCarouselSlides<?> getCarouselSlides();

	/**
	 * Sets the carousel slides
	 *
	 * @param carouselSlides
	 *
	 * @return
	 */
	
	@NotNull
	J setCarouselSlides(BSCarouselSlides<?> carouselSlides);

	/**
	 * Returns the list of slides currently associated
	 *
	 * @return
	 */

	List<BSCarouselItem<?>> getSlides();

	/**
	 * The active slide
	 *
	 * @return
	 */

	int getActiveSlide();

	/**
	 * Sets the active slide
	 *
	 * @param activeSlide
	 *
	 * @return
	 */
	
	@NotNull
	J setActiveSlide(int activeSlide);

	/**
	 * Returns the previous link
	 *
	 * @return
	 */

	BSCarouselControl<?> getPreviousLink();

	/**
	 * Returns the next link
	 *
	 * @return
	 */

	BSCarouselControl<?> getNextLink();

	/**
	 * Sets the next link
	 *
	 * @param nextLink
	 *
	 * @return
	 */
	
	@NotNull
	J setNextLink(BSCarouselControl<?> nextLink);

	/**
	 * Set's the previous link
	 *
	 * @param previousLink
	 *
	 * @return
	 */
	
	@NotNull
	J setPreviousLink(BSCarouselControl<?> previousLink);

	/**
	 * Sets the list of slides currently associated
	 *
	 * @param slides
	 *
	 * @return
	 */
	
	@NotNull
	J setSlides(List<BSCarouselItem<?>> slides);

	/**
	 * The data-ride="carousel" attribute is used to mark a carousel as animating starting at page load. It cannot be used in combination
	 * with (redundant and unnecessary) explicit JavaScript
	 * initialization of the same carousel.
	 *
	 * @param startAnimationOnLoad
	 *
	 * @return
	 */
	
	@NotNull
	J setAnimateOnLoad(boolean startAnimationOnLoad);

	/**
	 * Whether or not this carousel shows indicators
	 *
	 * @return
	 */
	boolean isIndicators();

	/**
	 * Whether or not this carousel shows indicators
	 *
	 * @param indicators
	 *
	 * @return
	 */
	
	@NotNull
	J setIndicators(boolean indicators);

	/**
	 * Sets the time in milli's
	 *
	 * @param interval
	 *
	 * @return
	 */
	
	@NotNull
	J setInterval(int interval);

	/**
	 * Whether or not to respond to keyboard actions
	 *
	 * @param keyboard
	 *
	 * @return
	 */
	
	@NotNull
	J setKeyboard(boolean keyboard);

	/**
	 * Whether the carousel should cycle continuously or have hard stops.
	 *
	 * @param wrap
	 *
	 * @return
	 */
	
	@NotNull
	J setWrap(boolean wrap);

	/**
	 * If set to "hover", pauses the cycling of the carousel on mouse-enter and resumes the cycling of the carousel on mouse-leave. If set
	 * to null, hovering over the carousel won't pause it.
	 *
	 * @param pause
	 *
	 * @return
	 */
	
	@NotNull
	J setPause(boolean pause);

	/**
	 * Creates a feature with a cycle method
	 *
	 * @return
	 */
	BSCarouselCycleFeature<?> createCycleFeature();

	/**
	 * Creates a feature that cycles to the next slide
	 *
	 * @return
	 */
	BSCarouselNextFeature<?> createNextFeature();

	/**
	 * Creates a feature that will pause the carousel
	 *
	 * @return
	 */
	BSCarouselPauseFeature<?> createPauseFeature();

	/**
	 * Creates a feature that will move to the previous slide
	 *
	 * @return
	 */
	BSCarouselPreviousFeature<?> createPreviousFeature();

	/**
	 * Creates a feature that will slide to a specific slide number
	 *
	 * @return
	 */
	BSCarouselSlideToNumberFeature<?> createSlideToNumberFeature(String slideNumber);
}
