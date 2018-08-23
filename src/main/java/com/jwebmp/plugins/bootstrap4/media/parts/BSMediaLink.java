package com.jwebmp.plugins.bootstrap4.media.parts;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.media.BSComponentMediaOptions;
import com.jwebmp.plugins.bootstrap4.media.BSMediaChildren;

public class BSMediaLink<J extends BSMediaLink<J>>
		extends Link<J>
		implements BSMediaChildren<IComponentHierarchyBase, J>
{
	/**
	 * The media image logo
	 */
	public BSMediaLink()
	{
		this(null);
	}

	/**
	 * Construct a new Image
	 *
	 * @param image
	 */
	public BSMediaLink(String image)
	{
		super(image);
		addClass(BSComponentMediaOptions.Media_Left);
	}

	/**
	 * Sets if this link must display on the left or right
	 *
	 * @param left
	 * 		if left or right
	 *
	 * @return This object
	 */
	public J setLeft(boolean left)
	{
		if (left)
		{
			addClass(BSComponentMediaOptions.Media_Left);
			removeClass(BSComponentMediaOptions.Media_Right);
		}
		else
		{
			addClass(BSComponentMediaOptions.Media_Right);
			removeClass(BSComponentMediaOptions.Media_Left);
		}
		return (J) this;
	}
}
