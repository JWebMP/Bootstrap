package com.jwebmp.plugins.bootstrap.carousel.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.bootstrap.carousel.BSCarousel;
import com.jwebmp.plugins.bootstrap.carousel.options.BSCarouselOptions;

/**
 * Cycles to the next item.
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class BSCarouselNextFeature<J extends BSCarouselNextFeature<J>>
		extends Feature<GlobalFeatures, BSCarouselOptions, J>
{
	/**
	 * The method name to call
	 */
	private static final String methodName = "next";

	/**
	 * Cycles to the next item.
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSCarouselNextFeature(BSCarousel forComponent)
	{
		super("BSCarouselNextFeature");
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
		requiredString += BSCarouselNextFeature.methodName;
		requiredString += "');" + getNewLine();
		addQuery(requiredString);
	}
}
