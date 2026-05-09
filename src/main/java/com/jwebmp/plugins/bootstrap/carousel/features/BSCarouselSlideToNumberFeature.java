package com.jwebmp.plugins.bootstrap.carousel.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.bootstrap.carousel.BSCarousel;
import com.jwebmp.plugins.bootstrap.carousel.options.BSCarouselOptions;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Cycles the carousel to a particular frame (0 based, similar to an array).
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class BSCarouselSlideToNumberFeature<J extends BSCarouselSlideToNumberFeature<J>>
		extends Feature<GlobalFeatures, BSCarouselOptions, J>
{


	/**
	 * The method name to call
	 */
	private String methodName = "0";

	/**
	 * Cycles the carousel to a particular frame (0 based, similar to an array).
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSCarouselSlideToNumberFeature(BSCarousel<?> forComponent)
	{
		super("BSCarouselPauseFeature");
		setComponent(forComponent);
	}

	/**
	 * Sets the slide number
	 *
	 * @return
	 */
	public String getSlideNumber()
	{
		return methodName;
	}

	/**
	 * Sets the slide number
	 *
	 * @param methodName
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSlideNumber(String methodName)
	{
		this.methodName = methodName;
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), methodName);
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().asBase().getJQueryID() + "carousel(";
		requiredString += methodName;
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}
}
