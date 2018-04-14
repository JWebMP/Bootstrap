/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap4.options;

import static com.jwebmp.utilities.StaticStrings.CHAR_DASH;
import static com.jwebmp.utilities.StaticStrings.CHAR_UNDERSCORE;

/**
 * Clearfix
 * <p>
 * Easily clear floats by adding .clearfix to the parent element. Utilizes the micro clearfix as popularized by Nicolas Gallagher. Can also
 * be used as a mixin.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSSpacingOptions
		implements IBSComponentOptions
{
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Top_1("mt-1"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Top_2("mt-2"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Top_3("mt-3"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Top_4("mt-4"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Top_5("mt-5"),

	/**
	 * Sets the margin to the spacer
	 */
	Margin_Bottom_1("mb-1"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Bottom_2("mb-2"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Bottom_3("mb-3"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Bottom_4("mb-4"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Bottom_5("mb-5"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Left_1("ml-1"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Left_2("ml-2"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Left_3("ml-3"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Left_4("ml-4"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Left_5("ml-5"),

	/**
	 * Sets the margin to the spacer
	 */
	Margin_Right_1("mr-1"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Right_2("mr-2"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Right_3("mr-3"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Right_4("mr-4"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Right_5("mr-5"),

	/**
	 * Sets the margin to the spacer
	 */
	Margin_X_1("mr-x-1"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_X_2("mr-x-2"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_X_3("mr-x-3"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_X_4("mr-x-4"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_X_5("mr-x-5"),

	/**
	 * Sets the margin to the spacer
	 */
	Margin_Y_1("mr-x-1"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Y_2("mr-x-2"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Y_3("mr-x-3"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Y_4("mr-x-4"),
	/**
	 * Sets the margin to the spacer
	 */
	Margin_Y_5("mr-x-5"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Top_1("pt-1"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Top_2("pt-2"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Top_3("pt-3"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Top_4("pt-4"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Top_5("pt-5"),

	/**
	 * Sets the padding to the spacer
	 */
	Padding_Bottom_1("pb-1"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Bottom_2("pb-2"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Bottom_3("pb-3"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Bottom_4("pb-4"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Bottom_5("pb-5"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Left_1("pl-1"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Left_2("pl-2"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Left_3("pl-3"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Left_4("pl-4"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Left_5("pl-5"),

	/**
	 * Sets the padding to the spacer
	 */
	Padding_Right_1("pr-1"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Right_2("pr-2"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Right_3("pr-3"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Right_4("pr-4"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Right_5("pr-5"),

	/**
	 * Sets the padding to the spacer
	 */
	Padding_X_1("pr-x-1"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_X_2("pr-x-2"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_X_3("pr-x-3"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_X_4("pr-x-4"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_X_5("pr-x-5"),

	/**
	 * Sets the padding to the spacer
	 */
	Padding_Y_1("pr-x-1"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Y_2("pr-x-2"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Y_3("pr-x-3"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Y_4("pr-x-4"),
	/**
	 * Sets the padding to the spacer
	 */
	Padding_Y_5("pr-x-5");


	private String className;

	BSSpacingOptions(String className)
	{
		this.className = className;
	}


	@Override
	public String toString()
	{
		return className.toLowerCase()
		                .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
