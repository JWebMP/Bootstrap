package com.jwebmp.plugins.bootstrap4.media.parts;

import com.jwebmp.core.base.html.HeaderText;
import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.media.BSComponentMediaOptions;
import com.jwebmp.plugins.bootstrap4.media.BSMediaChildren;
import com.jwebmp.plugins.bootstrap4.options.BSSpacingOptions;

public class BSMediaHeaderText<J extends BSMediaHeaderText<J>>
		extends HeaderText<J>
		implements BSMediaChildren<IComponentHierarchyBase, J>
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
