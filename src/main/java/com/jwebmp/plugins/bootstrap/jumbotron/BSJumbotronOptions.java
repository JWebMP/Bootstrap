package com.jwebmp.plugins.bootstrap.jumbotron;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Jumbotron
 * <p>
 * A lightweight, flexible component that can optionally extend the entire viewport to showcase key marketing messages on your site.
 *
 * @author GedMarc
 */
public enum BSJumbotronOptions
		implements IBSComponentOptions
{
	/**
	 * Jumbotron
	 * <p>
	 * A lightweight, flexible component that can optionally extend the entire viewport to showcase key marketing messages on your site.
	 */
	Jumbotron,
	/**
	 * To make the jumbotron full width, and without rounded corners, add the .jumbotron-fluid modifier class and add a .container or
	 * .container-fluid within.
	 */
	Jumbotron_fluid,
	/**
	 * Large display format 1
	 */
	Display_1,
	/**
	 * Large display format 2
	 */
	Display_2,
	/**
	 * Large display format 3
	 */
	Display_3,
	/**
	 * Large display format 4
	 */
	Display_4,
	/**
	 * applies a lead if necessary
	 */
	Lead,
	/**
	 * Horizontal rule
	 */
	My_1,
	/**
	 * Horizontal rule
	 */
	My_2,
	/**
	 * Horizontal rule
	 */
	My_3,
	/**
	 * Horizontal rule
	 */
	My_4;

	BSJumbotronOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
