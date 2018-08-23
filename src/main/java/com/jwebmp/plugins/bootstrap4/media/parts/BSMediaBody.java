package com.jwebmp.plugins.bootstrap4.media.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.media.BSComponentMediaOptions;
import com.jwebmp.plugins.bootstrap4.media.BSMediaChildren;

public class BSMediaBody<J extends BSMediaBody<J>>
		extends DivSimple<J>
		implements BSMediaChildren<IComponentHierarchyBase, J>
{
	/**
	 * The media image logo
	 */
	public BSMediaBody()
	{
		this(null);
	}

	/**
	 * Construct a new Image
	 *
	 * @param image
	 */
	public BSMediaBody(String image)
	{
		super(image);
		addClass(BSComponentMediaOptions.Media_Body);
	}

}
