package com.jwebmp.plugins.bootstrap.media.parts;

import com.jwebmp.core.base.html.Image;
import com.jwebmp.plugins.bootstrap.media.BSMediaChildren;

public class BSMediaImage<J extends BSMediaImage<J>>
		extends Image<J>
		implements BSMediaChildren
{
	/**
	 * The media image logo
	 */
	public BSMediaImage()
	{
		this(null);
	}

	/**
	 * Construct a new Image
	 *
	 * @param image
	 */
	public BSMediaImage(String image)
	{
		super(image);
	}

}
