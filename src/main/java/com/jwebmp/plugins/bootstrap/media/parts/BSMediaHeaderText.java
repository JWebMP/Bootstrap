package com.jwebmp.plugins.bootstrap.media.parts;

import com.jwebmp.core.base.html.HeaderText;
import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.plugins.bootstrap.media.BSComponentMediaOptions;
import com.jwebmp.plugins.bootstrap.media.BSMediaChildren;
import com.jwebmp.plugins.bootstrap.options.BSSpacingOptions;

public class BSMediaHeaderText<J extends BSMediaHeaderText<J>>
		extends HeaderText<J>
		implements BSMediaChildren
{
	/**
	 * The media image logo
	 */
	public BSMediaHeaderText()
	{
		setHeaderType(HeaderTypes.H4);
		addClass(BSComponentMediaOptions.Media_Heading);
		addClass(BSSpacingOptions.Margin_Top_1);
	}
}
