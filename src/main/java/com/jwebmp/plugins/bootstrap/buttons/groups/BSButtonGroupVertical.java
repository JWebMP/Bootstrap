package com.jwebmp.plugins.bootstrap.buttons.groups;

import com.jwebmp.plugins.bootstrap.buttons.groups.options.BSButtonGroupOptions;

/**
 * Vertical variation
 * <p>
 * Make a set of buttons appear vertically stacked rather than horizontally. Split button dropdowns are not supported here.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSButtonGroupVertical<J extends BSButtonGroupVertical<J>>
		extends BSButtonGroup<J>
{


	/**
	 * Vertical variation
	 * <p>
	 * Make a set of buttons appear vertically stacked rather than horizontally. Split button dropdowns are not supported here.
	 */
	public BSButtonGroupVertical()
	{
		addClass(BSButtonGroupOptions.Btn_Group_Vertical);
		removeClass(BSButtonGroupOptions.Btn_Group);
	}
}
