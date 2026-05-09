package com.jwebmp.plugins.bootstrap.dropdown.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.dropdown.options.BSDropDownOptions;

/**
 * @author GedMarc
 * @since 14 Jan 2017
 */
public class BSDropDownDivider<J extends BSDropDownDivider<J>>
		extends DivSimple<J>
{


	/**
	 * A divider on the bs drop down menu item
	 * <p>
	 */
	public BSDropDownDivider()
	{
		super();
		addClass(BSDropDownOptions.Dropdown_Divider);
	}
}
