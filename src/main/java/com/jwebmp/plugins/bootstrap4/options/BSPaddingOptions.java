/*
 * Copyright (C) 2017 GedMarc
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

import static com.jwebmp.core.utilities.StaticStrings.*;

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
public enum BSPaddingOptions
		implements IBSComponentOptions
{
	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_Auto("pl-auto"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_Auto("pr-auto"),
	/**
	 * Separates from the right automatically
	 */
	PaddingTop_Auto("pt-auto"),
	/**
	 * Separates from the right automatically
	 */
	PaddingBottom_Auto("pb-auto"),
	/**
	 * Separates from the left automatically
	 */
	PaddingX_Auto("px-auto"),

	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_Xs_Auto("pl-xs-auto"),
	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_Sm_Auto("pl-sm-auto"),
	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_Md_Auto("pl-md-auto"),
	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_Lg_Auto("pl-lg-auto"),
	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_Xl_Auto("pl-xl-auto"),

	/**
	 * Separates from the right automatically
	 */
	PaddingRight_Xs_Auto("pr-xs-auto"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_Sm_Auto("pr-sm-auto"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_Md_Auto("pr-md-auto"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_Lg_Auto("pr-lg-auto"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_Xl_Auto("pr-xl-auto"),

	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_Xs_Auto("pb-xs-auto"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_Sm_Auto("pb-sm-auto"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_Md_Auto("pb-md-auto"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_Lg_Auto("pb-lg-auto"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_Xl_Auto("pb-xl-auto"),

	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_Xs_Auto("pt-xs-auto"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_Sm_Auto("pt-sm-auto"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_Md_Auto("pt-md-auto"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_Lg_Auto("pt-lg-auto"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_Xl_Auto("pt-xl-auto"),

	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_1("pl-1"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_1("pr-1"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_1("pb-1"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_1("pt-1"),

	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_2("pl-2"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_2("pr-2"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_2("pb-2"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_2("pt-2"),

	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_3("pl-3"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_3("pr-3"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_3("pb-3"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_3("pt-3"),

	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_4("pl-4"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_4("pr-4"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_4("pb-4"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_4("pt-4"),

	/**
	 * Separates from the left automatically
	 */
	PaddingLeft_5("pl-5"),
	/**
	 * Separates from the right automatically
	 */
	PaddingRight_5("pr-5"),
	/**
	 * Separates from the Bottom automatically
	 */
	PaddingBottom_5("pb-5"),
	/**
	 * Separates from the Top automatically
	 */
	PaddingTop_5("pt-5"),

	/**
	 * Separates from the left 1matically
	 */
	PaddingLeft_Xs_1("pl-xs-1"),
	/**
	 * Separates from the left 1matically
	 */
	PaddingLeft_Sm_1("pl-sm-1"),
	/**
	 * Separates from the left 1matically
	 */
	PaddingLeft_Md_1("pl-md-1"),
	/**
	 * Separates from the left 1matically
	 */
	PaddingLeft_Lg_1("pl-lg-1"),
	/**
	 * Separates from the left 1matically
	 */
	PaddingLeft_Xl_1("pl-xl-1"),

	/**
	 * Separates from the right 1matically
	 */
	PaddingRight_Xs_1("pr-xs-1"),
	/**
	 * Separates from the right 1matically
	 */
	PaddingRight_Sm_1("pr-sm-1"),
	/**
	 * Separates from the right 1matically
	 */
	PaddingRight_Md_1("pr-md-1"),
	/**
	 * Separates from the right 1matically
	 */
	PaddingRight_Lg_1("pr-lg-1"),
	/**
	 * Separates from the right 1matically
	 */
	PaddingRight_Xl_1("pr-xl-1"),

	/**
	 * Separates from the Bottom 1matically
	 */
	PaddingBottom_Xs_1("pb-xs-1"),
	/**
	 * Separates from the Bottom 1matically
	 */
	PaddingBottom_Sm_1("pb-sm-1"),
	/**
	 * Separates from the Bottom 1matically
	 */
	PaddingBottom_Md_1("pb-md-1"),
	/**
	 * Separates from the Bottom 1matically
	 */
	PaddingBottom_Lg_1("pb-lg-1"),
	/**
	 * Separates from the Bottom 1matically
	 */
	PaddingBottom_Xl_1("pb-xl-1"),

	/**
	 * Separates from the left 2matically
	 */
	PaddingLeft_Xs_2("pl-xs-2"),
	/**
	 * Separates from the left 2matically
	 */
	PaddingLeft_Sm_2("pl-sm-2"),
	/**
	 * Separates from the left 2matically
	 */
	PaddingLeft_Md_2("pl-md-2"),
	/**
	 * Separates from the left 2matically
	 */
	PaddingLeft_Lg_2("pl-lg-2"),
	/**
	 * Separates from the left 2matically
	 */
	PaddingLeft_Xl_2("pl-xl-2"),

	/**
	 * Separates from the right 2matically
	 */
	PaddingRight_Xs_2("pr-xs-2"),
	/**
	 * Separates from the right 2matically
	 */
	PaddingRight_Sm_2("pr-sm-2"),
	/**
	 * Separates from the right 2matically
	 */
	PaddingRight_Md_2("pr-md-2"),
	/**
	 * Separates from the right 2matically
	 */
	PaddingRight_Lg_2("pr-lg-2"),
	/**
	 * Separates from the right 2matically
	 */
	PaddingRight_Xl_2("pr-xl-2"),

	/**
	 * Separates from the Bottom 2matically
	 */
	PaddingBottom_Xs_2("pb-xs-2"),
	/**
	 * Separates from the Bottom 2matically
	 */
	PaddingBottom_Sm_2("pb-sm-2"),
	/**
	 * Separates from the Bottom 2matically
	 */
	PaddingBottom_Md_2("pb-md-2"),
	/**
	 * Separates from the Bottom 2matically
	 */
	PaddingBottom_Lg_2("pb-lg-2"),
	/**
	 * Separates from the Bottom 2matically
	 */
	PaddingBottom_Xl_2("pb-xl-2"),

	/**
	 * Separates from the left 3matically
	 */
	PaddingLeft_Xs_3("pl-xs-3"),
	/**
	 * Separates from the left 3matically
	 */
	PaddingLeft_Sm_3("pl-sm-3"),
	/**
	 * Separates from the left 3matically
	 */
	PaddingLeft_Md_3("pl-md-3"),
	/**
	 * Separates from the left 3matically
	 */
	PaddingLeft_Lg_3("pl-lg-3"),
	/**
	 * Separates from the left 3matically
	 */
	PaddingLeft_Xl_3("pl-xl-3"),

	/**
	 * Separates from the right 3matically
	 */
	PaddingRight_Xs_3("pr-xs-3"),
	/**
	 * Separates from the right 3matically
	 */
	PaddingRight_Sm_3("pr-sm-3"),
	/**
	 * Separates from the right 3matically
	 */
	PaddingRight_Md_3("pr-md-3"),
	/**
	 * Separates from the right 3matically
	 */
	PaddingRight_Lg_3("pr-lg-3"),
	/**
	 * Separates from the right 3matically
	 */
	PaddingRight_Xl_3("pr-xl-3"),

	/**
	 * Separates from the Bottom 3matically
	 */
	PaddingBottom_Xs_3("pb-xs-3"),
	/**
	 * Separates from the Bottom 3matically
	 */
	PaddingBottom_Sm_3("pb-sm-3"),
	/**
	 * Separates from the Bottom 3matically
	 */
	PaddingBottom_Md_3("pb-md-3"),
	/**
	 * Separates from the Bottom 3matically
	 */
	PaddingBottom_Lg_3("pb-lg-3"),
	/**
	 * Separates from the Bottom 3matically
	 */
	PaddingBottom_Xl_3("pb-xl-3"),

	/**
	 * Separates from the left 4matically
	 */
	PaddingLeft_Xs_4("pl-xs-4"),
	/**
	 * Separates from the left 4matically
	 */
	PaddingLeft_Sm_4("pl-sm-4"),
	/**
	 * Separates from the left 4matically
	 */
	PaddingLeft_Md_4("pl-md-4"),
	/**
	 * Separates from the left 4matically
	 */
	PaddingLeft_Lg_4("pl-lg-4"),
	/**
	 * Separates from the left 4matically
	 */
	PaddingLeft_Xl_4("pl-xl-4"),

	/**
	 * Separates from the right 4matically
	 */
	PaddingRight_Xs_4("pr-xs-4"),
	/**
	 * Separates from the right 4matically
	 */
	PaddingRight_Sm_4("pr-sm-4"),
	/**
	 * Separates from the right 4matically
	 */
	PaddingRight_Md_4("pr-md-4"),
	/**
	 * Separates from the right 4matically
	 */
	PaddingRight_Lg_4("pr-lg-4"),
	/**
	 * Separates from the right 4matically
	 */
	PaddingRight_Xl_4("pr-xl-4"),

	/**
	 * Separates from the Bottom 4matically
	 */
	PaddingBottom_Xs_4("pb-xs-4"),
	/**
	 * Separates from the Bottom 4matically
	 */
	PaddingBottom_Sm_4("pb-sm-4"),
	/**
	 * Separates from the Bottom 4matically
	 */
	PaddingBottom_Md_4("pb-md-4"),
	/**
	 * Separates from the Bottom 4matically
	 */
	PaddingBottom_Lg_4("pb-lg-4"),
	/**
	 * Separates from the Bottom 4matically
	 */
	PaddingBottom_Xl_4("pb-xl-4"),

	/**
	 * Separates from the left 5matically
	 */
	PaddingLeft_Xs_5("pl-xs-5"),
	/**
	 * Separates from the left 5matically
	 */
	PaddingLeft_Sm_5("pl-sm-5"),
	/**
	 * Separates from the left 5matically
	 */
	PaddingLeft_Md_5("pl-md-5"),
	/**
	 * Separates from the left 5matically
	 */
	PaddingLeft_Lg_5("pl-lg-5"),
	/**
	 * Separates from the left 5matically
	 */
	PaddingLeft_Xl_5("pl-xl-5"),

	/**
	 * Separates from the right 5matically
	 */
	PaddingRight_Xs_5("pr-xs-5"),
	/**
	 * Separates from the right 5matically
	 */
	PaddingRight_Sm_5("pr-sm-5"),
	/**
	 * Separates from the right 5matically
	 */
	PaddingRight_Md_5("pr-md-5"),
	/**
	 * Separates from the right 5matically
	 */
	PaddingRight_Lg_5("pr-lg-5"),
	/**
	 * Separates from the right 5matically
	 */
	PaddingRight_Xl_5("pr-xl-5"),

	/**
	 * Separates from the Bottom 5matically
	 */
	PaddingBottom_Xs_5("pb-xs-5"),
	/**
	 * Separates from the Bottom 5matically
	 */
	PaddingBottom_Sm_5("pb-sm-5"),
	/**
	 * Separates from the Bottom 5matically
	 */
	PaddingBottom_Md_5("pb-md-5"),
	/**
	 * Separates from the Bottom 5matically
	 */
	PaddingBottom_Lg_5("pb-lg-5"),
	/**
	 * Separates from the Bottom 5matically
	 */
	PaddingBottom_Xl_5("pb-xl-5"),

	/**
	 * Separates from the Top 1matically
	 */
	PaddingTop_Xs_1("pt-xs-1"),
	/**
	 * Separates from the Top 1matically
	 */
	PaddingTop_Sm_1("pt-sm-1"),
	/**
	 * Separates from the Top 1matically
	 */
	PaddingTop_Md_1("pt-md-1"),
	/**
	 * Separates from the Top 1matically
	 */
	PaddingTop_Lg_1("pt-lg-1"),
	/**
	 * Separates from the Top 1matically
	 */
	PaddingTop_Xl_1("pt-xl-1"),

	/**
	 * Separates from the Top 2matically
	 */
	PaddingTop_Xs_2("pt-xs-2"),
	/**
	 * Separates from the Top 2matically
	 */
	PaddingTop_Sm_2("pt-sm-2"),
	/**
	 * Separates from the Top 2matically
	 */
	PaddingTop_Md_2("pt-md-2"),
	/**
	 * Separates from the Top 2matically
	 */
	PaddingTop_Lg_2("pt-lg-2"),
	/**
	 * Separates from the Top 2matically
	 */
	PaddingTop_Xl_2("pt-xl-2"),

	/**
	 * Separates from the Top 3matically
	 */
	PaddingTop_Xs_3("pt-xs-3"),
	/**
	 * Separates from the Top 3matically
	 */
	PaddingTop_Sm_3("pt-sm-3"),
	/**
	 * Separates from the Top 3matically
	 */
	PaddingTop_Md_3("pt-md-3"),
	/**
	 * Separates from the Top 3matically
	 */
	PaddingTop_Lg_3("pt-lg-3"),
	/**
	 * Separates from the Top 3matically
	 */
	PaddingTop_Xl_3("pt-xl-3"),

	/**
	 * Separates from the Top 4matically
	 */
	PaddingTop_Xs_4("pt-xs-4"),
	/**
	 * Separates from the Top 4matically
	 */
	PaddingTop_Sm_4("pt-sm-4"),
	/**
	 * Separates from the Top 4matically
	 */
	PaddingTop_Md_4("pt-md-4"),
	/**
	 * Separates from the Top 4matically
	 */
	PaddingTop_Lg_4("pt-lg-4"),
	/**
	 * Separates from the Top 4matically
	 */
	PaddingTop_Xl_4("pt-xl-4"),

	/**
	 * Separates from the Top 5matically
	 */
	PaddingTop_Xs_5("pt-xs-5"),
	/**
	 * Separates from the Top 5matically
	 */
	PaddingTop_Sm_5("pt-sm-5"),
	/**
	 * Separates from the Top 5matically
	 */
	PaddingTop_Md_5("pt-md-5"),
	/**
	 * Separates from the Top 5matically
	 */
	PaddingTop_Lg_5("pt-lg-5"),
	/**
	 * Separates from the Top 5matically
	 */
	PaddingTop_Xl_5("pt-xl-5"),
	;

	private String className;

	BSPaddingOptions(String className)
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
