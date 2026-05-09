package com.jwebmp.plugins.bootstrap.carousel;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap.carousel.options.BSCarouselOptions;

/**
 * Adds on a Carousel Feature, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class BSCarouselFeature<J extends BSCarouselFeature<J>>
		extends Feature<GlobalFeatures, BSCarouselOptions, J>
{


	/**
	 * Any Carousel options provided by JavaSript
	 */
	private com.jwebmp.plugins.bootstrap.carousel.options.BSCarouselOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSCarouselFeature(IComponentHierarchyBase<?,?> forComponent)
	{
		super("BSCarouselFeature");
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

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public com.jwebmp.plugins.bootstrap.carousel.options.BSCarouselOptions getOptions()
	{
		if (options == null)
		{
			options = new com.jwebmp.plugins.bootstrap.carousel.options.BSCarouselOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().asBase().getJQueryID() + "carousel(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
	}
}
