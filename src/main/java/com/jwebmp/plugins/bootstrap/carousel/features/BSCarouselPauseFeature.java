package com.jwebmp.plugins.bootstrap.carousel.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.bootstrap.carousel.BSCarousel;
import com.jwebmp.plugins.bootstrap.carousel.options.BSCarouselOptions;

/**
 * Stops the carousel from cycling through items.
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
@SuppressWarnings("unused")
public class BSCarouselPauseFeature<J extends BSCarouselPauseFeature<J>>
		extends Feature<GlobalFeatures, BSCarouselOptions, J>
{
	/**
	 * The method name to call
	 */
	private static final String methodName = "pause";

	/**
	 * Constructs a new Carousel Feature - Cycle
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSCarouselPauseFeature(BSCarousel<?> forComponent)
	{
		super("BSCarouselPauseFeature");
		setComponent(forComponent);
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

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().asBase().getJQueryID() + "carousel('";
		requiredString += BSCarouselPauseFeature.methodName;
		requiredString += "');" + getNewLine();
		addQuery(requiredString);
	}
}
