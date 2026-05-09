package com.jwebmp.plugins.bootstrap.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Width and height
 * <p>
 * Easily make an element as wide or as tall as its parent using the .w-100 and .h-100 utility classes.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSContainerOptions
		implements IBSComponentOptions
{
	/**
	 * A default container
	 */
	Container,
	/**
	 * Container with the width at 100%
	 */
	Container_Fluid,
	/**
	 * A bs row
	 */
	Row,
	/**
	 * Removes all gutters from a component
	 */
	No_Gutters;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
