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
package za.co.mmagon.jwebswing.plugins.bootstrap4.options;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;
import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_UNDERSCORE;

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
public enum BSMarginOptions
		implements IBSComponentOptions
{
	/**
	 * Separates from the left automatically
	 */
	MarginLeft_Auto("ml-auto"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_Auto("mr-auto"),
	/**
	 * Separates from the right automatically
	 */
	MarginTop_Auto("mt-auto"),
	/**
	 * Separates from the right automatically
	 */
	MarginBottom_Auto("mb-auto"),
	/**
	 * Separates from the left automatically
	 */
	MarginX_Auto("mx-auto"),


	/**
	 * Separates from the left automatically
	 */
	MarginLeft_Xs_Auto("ml-xs-auto"),
	/**
	 * Separates from the left automatically
	 */
	MarginLeft_Sm_Auto("ml-sm-auto"),
	/**
	 * Separates from the left automatically
	 */
	MarginLeft_Md_Auto("ml-md-auto"),
	/**
	 * Separates from the left automatically
	 */
	MarginLeft_Lg_Auto("ml-lg-auto"),
	/**
	 * Separates from the left automatically
	 */
	MarginLeft_Xl_Auto("ml-xl-auto"),

	/**
	 * Separates from the right automatically
	 */
	MarginRight_Xs_Auto("mr-xs-auto"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_Sm_Auto("mr-sm-auto"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_Md_Auto("mr-md-auto"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_Lg_Auto("mr-lg-auto"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_Xl_Auto("mr-xl-auto"),

	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_Xs_Auto("mb-xs-auto"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_Sm_Auto("mb-sm-auto"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_Md_Auto("mb-md-auto"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_Lg_Auto("mb-lg-auto"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_Xl_Auto("mb-xl-auto"),


	/**
	 * Separates from the Top automatically
	 */
	MarginTop_Xs_Auto("mt-xs-auto"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_Sm_Auto("mt-sm-auto"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_Md_Auto("mt-md-auto"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_Lg_Auto("mt-lg-auto"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_Xl_Auto("mt-xl-auto"),


	/**
	 * Separates from the left automatically
	 */
	MarginLeft_0("ml-0"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_0("mr-0"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_0("mb-0"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_0("mt-0"),

	/**
	 * Separates from the left automatically
	 */
	MarginLeft_1("ml-1"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_1("mr-1"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_1("mb-1"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_1("mt-1"),


	/**
	 * Separates from the left automatically
	 */
	MarginLeft_2("ml-2"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_2("mr-2"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_2("mb-2"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_2("mt-2"),


	/**
	 * Separates from the left automatically
	 */
	MarginLeft_3("ml-3"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_3("mr-3"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_3("mb-3"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_3("mt-3"),


	/**
	 * Separates from the left automatically
	 */
	MarginLeft_4("ml-4"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_4("mr-4"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_4("mb-4"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_4("mt-4"),


	/**
	 * Separates from the left automatically
	 */
	MarginLeft_5("ml-5"),
	/**
	 * Separates from the right automatically
	 */
	MarginRight_5("mr-5"),
	/**
	 * Separates from the Bottom automatically
	 */
	MarginBottom_5("mb-5"),
	/**
	 * Separates from the Top automatically
	 */
	MarginTop_5("mt-5"),


	/**
	 * Separates from the left 1matically
	 */
	MarginLeft_Xs_1("ml-xs-1"),
	/**
	 * Separates from the left 1matically
	 */
	MarginLeft_Sm_1("ml-sm-1"),
	/**
	 * Separates from the left 1matically
	 */
	MarginLeft_Md_1("ml-md-1"),
	/**
	 * Separates from the left 1matically
	 */
	MarginLeft_Lg_1("ml-lg-1"),
	/**
	 * Separates from the left 1matically
	 */
	MarginLeft_Xl_1("ml-xl-1"),

	/**
	 * Separates from the right 1matically
	 */
	MarginRight_Xs_1("mr-xs-1"),
	/**
	 * Separates from the right 1matically
	 */
	MarginRight_Sm_1("mr-sm-1"),
	/**
	 * Separates from the right 1matically
	 */
	MarginRight_Md_1("mr-md-1"),
	/**
	 * Separates from the right 1matically
	 */
	MarginRight_Lg_1("mr-lg-1"),
	/**
	 * Separates from the right 1matically
	 */
	MarginRight_Xl_1("mr-xl-1"),

	/**
	 * Separates from the Bottom 1matically
	 */
	MarginBottom_Xs_1("mb-xs-1"),
	/**
	 * Separates from the Bottom 1matically
	 */
	MarginBottom_Sm_1("mb-sm-1"),
	/**
	 * Separates from the Bottom 1matically
	 */
	MarginBottom_Md_1("mb-md-1"),
	/**
	 * Separates from the Bottom 1matically
	 */
	MarginBottom_Lg_1("mb-lg-1"),
	/**
	 * Separates from the Bottom 1matically
	 */
	MarginBottom_Xl_1("mb-xl-1"),


	/**
	 * Separates from the left 2matically
	 */
	MarginLeft_Xs_2("ml-xs-2"),
	/**
	 * Separates from the left 2matically
	 */
	MarginLeft_Sm_2("ml-sm-2"),
	/**
	 * Separates from the left 2matically
	 */
	MarginLeft_Md_2("ml-md-2"),
	/**
	 * Separates from the left 2matically
	 */
	MarginLeft_Lg_2("ml-lg-2"),
	/**
	 * Separates from the left 2matically
	 */
	MarginLeft_Xl_2("ml-xl-2"),

	/**
	 * Separates from the right 2matically
	 */
	MarginRight_Xs_2("mr-xs-2"),
	/**
	 * Separates from the right 2matically
	 */
	MarginRight_Sm_2("mr-sm-2"),
	/**
	 * Separates from the right 2matically
	 */
	MarginRight_Md_2("mr-md-2"),
	/**
	 * Separates from the right 2matically
	 */
	MarginRight_Lg_2("mr-lg-2"),
	/**
	 * Separates from the right 2matically
	 */
	MarginRight_Xl_2("mr-xl-2"),

	/**
	 * Separates from the Bottom 2matically
	 */
	MarginBottom_Xs_2("mb-xs-2"),
	/**
	 * Separates from the Bottom 2matically
	 */
	MarginBottom_Sm_2("mb-sm-2"),
	/**
	 * Separates from the Bottom 2matically
	 */
	MarginBottom_Md_2("mb-md-2"),
	/**
	 * Separates from the Bottom 2matically
	 */
	MarginBottom_Lg_2("mb-lg-2"),
	/**
	 * Separates from the Bottom 2matically
	 */
	MarginBottom_Xl_2("mb-xl-2"),


	/**
	 * Separates from the left 3matically
	 */
	MarginLeft_Xs_3("ml-xs-3"),
	/**
	 * Separates from the left 3matically
	 */
	MarginLeft_Sm_3("ml-sm-3"),
	/**
	 * Separates from the left 3matically
	 */
	MarginLeft_Md_3("ml-md-3"),
	/**
	 * Separates from the left 3matically
	 */
	MarginLeft_Lg_3("ml-lg-3"),
	/**
	 * Separates from the left 3matically
	 */
	MarginLeft_Xl_3("ml-xl-3"),

	/**
	 * Separates from the right 3matically
	 */
	MarginRight_Xs_3("mr-xs-3"),
	/**
	 * Separates from the right 3matically
	 */
	MarginRight_Sm_3("mr-sm-3"),
	/**
	 * Separates from the right 3matically
	 */
	MarginRight_Md_3("mr-md-3"),
	/**
	 * Separates from the right 3matically
	 */
	MarginRight_Lg_3("mr-lg-3"),
	/**
	 * Separates from the right 3matically
	 */
	MarginRight_Xl_3("mr-xl-3"),

	/**
	 * Separates from the Bottom 3matically
	 */
	MarginBottom_Xs_3("mb-xs-3"),
	/**
	 * Separates from the Bottom 3matically
	 */
	MarginBottom_Sm_3("mb-sm-3"),
	/**
	 * Separates from the Bottom 3matically
	 */
	MarginBottom_Md_3("mb-md-3"),
	/**
	 * Separates from the Bottom 3matically
	 */
	MarginBottom_Lg_3("mb-lg-3"),
	/**
	 * Separates from the Bottom 3matically
	 */
	MarginBottom_Xl_3("mb-xl-3"),


	/**
	 * Separates from the left 4matically
	 */
	MarginLeft_Xs_4("ml-xs-4"),
	/**
	 * Separates from the left 4matically
	 */
	MarginLeft_Sm_4("ml-sm-4"),
	/**
	 * Separates from the left 4matically
	 */
	MarginLeft_Md_4("ml-md-4"),
	/**
	 * Separates from the left 4matically
	 */
	MarginLeft_Lg_4("ml-lg-4"),
	/**
	 * Separates from the left 4matically
	 */
	MarginLeft_Xl_4("ml-xl-4"),

	/**
	 * Separates from the right 4matically
	 */
	MarginRight_Xs_4("mr-xs-4"),
	/**
	 * Separates from the right 4matically
	 */
	MarginRight_Sm_4("mr-sm-4"),
	/**
	 * Separates from the right 4matically
	 */
	MarginRight_Md_4("mr-md-4"),
	/**
	 * Separates from the right 4matically
	 */
	MarginRight_Lg_4("mr-lg-4"),
	/**
	 * Separates from the right 4matically
	 */
	MarginRight_Xl_4("mr-xl-4"),

	/**
	 * Separates from the Bottom 4matically
	 */
	MarginBottom_Xs_4("mb-xs-4"),
	/**
	 * Separates from the Bottom 4matically
	 */
	MarginBottom_Sm_4("mb-sm-4"),
	/**
	 * Separates from the Bottom 4matically
	 */
	MarginBottom_Md_4("mb-md-4"),
	/**
	 * Separates from the Bottom 4matically
	 */
	MarginBottom_Lg_4("mb-lg-4"),
	/**
	 * Separates from the Bottom 4matically
	 */
	MarginBottom_Xl_4("mb-xl-4"),


	/**
	 * Separates from the left 5matically
	 */
	MarginLeft_Xs_5("ml-xs-5"),
	/**
	 * Separates from the left 5matically
	 */
	MarginLeft_Sm_5("ml-sm-5"),
	/**
	 * Separates from the left 5matically
	 */
	MarginLeft_Md_5("ml-md-5"),
	/**
	 * Separates from the left 5matically
	 */
	MarginLeft_Lg_5("ml-lg-5"),
	/**
	 * Separates from the left 5matically
	 */
	MarginLeft_Xl_5("ml-xl-5"),

	/**
	 * Separates from the right 5matically
	 */
	MarginRight_Xs_5("mr-xs-5"),
	/**
	 * Separates from the right 5matically
	 */
	MarginRight_Sm_5("mr-sm-5"),
	/**
	 * Separates from the right 5matically
	 */
	MarginRight_Md_5("mr-md-5"),
	/**
	 * Separates from the right 5matically
	 */
	MarginRight_Lg_5("mr-lg-5"),
	/**
	 * Separates from the right 5matically
	 */
	MarginRight_Xl_5("mr-xl-5"),

	/**
	 * Separates from the Bottom 5matically
	 */
	MarginBottom_Xs_5("mb-xs-5"),
	/**
	 * Separates from the Bottom 5matically
	 */
	MarginBottom_Sm_5("mb-sm-5"),
	/**
	 * Separates from the Bottom 5matically
	 */
	MarginBottom_Md_5("mb-md-5"),
	/**
	 * Separates from the Bottom 5matically
	 */
	MarginBottom_Lg_5("mb-lg-5"),
	/**
	 * Separates from the Bottom 5matically
	 */
	MarginBottom_Xl_5("mb-xl-5"),

	/**
	 * Separates from the Top 1matically
	 */
	MarginTop_Xs_1("mt-xs-1"),
	/**
	 * Separates from the Top 1matically
	 */
	MarginTop_Sm_1("mt-sm-1"),
	/**
	 * Separates from the Top 1matically
	 */
	MarginTop_Md_1("mt-md-1"),
	/**
	 * Separates from the Top 1matically
	 */
	MarginTop_Lg_1("mt-lg-1"),
	/**
	 * Separates from the Top 1matically
	 */
	MarginTop_Xl_1("mt-xl-1"),


	/**
	 * Separates from the Top 2matically
	 */
	MarginTop_Xs_2("mt-xs-2"),
	/**
	 * Separates from the Top 2matically
	 */
	MarginTop_Sm_2("mt-sm-2"),
	/**
	 * Separates from the Top 2matically
	 */
	MarginTop_Md_2("mt-md-2"),
	/**
	 * Separates from the Top 2matically
	 */
	MarginTop_Lg_2("mt-lg-2"),
	/**
	 * Separates from the Top 2matically
	 */
	MarginTop_Xl_2("mt-xl-2"),


	/**
	 * Separates from the Top 3matically
	 */
	MarginTop_Xs_3("mt-xs-3"),
	/**
	 * Separates from the Top 3matically
	 */
	MarginTop_Sm_3("mt-sm-3"),
	/**
	 * Separates from the Top 3matically
	 */
	MarginTop_Md_3("mt-md-3"),
	/**
	 * Separates from the Top 3matically
	 */
	MarginTop_Lg_3("mt-lg-3"),
	/**
	 * Separates from the Top 3matically
	 */
	MarginTop_Xl_3("mt-xl-3"),


	/**
	 * Separates from the Top 4matically
	 */
	MarginTop_Xs_4("mt-xs-4"),
	/**
	 * Separates from the Top 4matically
	 */
	MarginTop_Sm_4("mt-sm-4"),
	/**
	 * Separates from the Top 4matically
	 */
	MarginTop_Md_4("mt-md-4"),
	/**
	 * Separates from the Top 4matically
	 */
	MarginTop_Lg_4("mt-lg-4"),
	/**
	 * Separates from the Top 4matically
	 */
	MarginTop_Xl_4("mt-xl-4"),


	/**
	 * Separates from the Top 5matically
	 */
	MarginTop_Xs_5("mt-xs-5"),
	/**
	 * Separates from the Top 5matically
	 */
	MarginTop_Sm_5("mt-sm-5"),
	/**
	 * Separates from the Top 5matically
	 */
	MarginTop_Md_5("mt-md-5"),
	/**
	 * Separates from the Top 5matically
	 */
	MarginTop_Lg_5("mt-lg-5"),
	/**
	 * Separates from the Top 5matically
	 */
	MarginTop_Xl_5("mt-xl-5"),
	Margin_1("m-1");

	private String className;


	BSMarginOptions(String className)
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
