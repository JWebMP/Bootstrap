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
package za.co.mmagon.jwebswing.plugins.bootstrap.options;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_DASH;
import static za.co.mmagon.jwebswing.utilities.StaticStrings.CHAR_UNDERSCORE;

/**
 * Clearfix
 * <p>
 * Easily clear floats by adding .clearfix to the parent element. Utilizes the micro clearfix as popularized by Nicolas Gallagher. Can also be used as a mixin.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSMarginOptions implements IBSComponentOptions
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
	MarginRight_Xl_Auto("mr-xl-auto");

	private String className;

	BSMarginOptions(String className)
	{
		this.className = className;
	}

	@Override
	public String toString()
	{
		return className.toLowerCase().replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
