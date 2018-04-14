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

import com.jwebmp.utilities.StaticStrings;

import static com.jwebmp.utilities.StaticStrings.CHAR_DASH;

/**
 * A list of all the column width settings from bootstrap
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 10, 2016
 */
public enum BSColumnOptions
		implements IBSComponentOptions
{
	/**
	 * Width of 100%
	 */
	W_100,
	/**
	 * Width of 100%
	 */
	W_75,
	/**
	 * Width of 100%
	 */
	W_50,
	/**
	 * Width of 100%
	 */
	W_25,
	/**
	 * Height of 100%
	 */
	H_100,
	/**
	 * Generic Column Definition
	 */
	Col,
	/**
	 * Variable width content on the given size
	 */
	Col_Auto,
	/**
	 * Variable width content on the given size
	 */
	Col_Sm_Auto,
	/**
	 * Variable width content on the given size
	 */
	Col_Md_Auto,
	/**
	 * Variable width content on the given size
	 */
	Col_Lg_Auto,
	/**
	 * Variable width content on the given size
	 */
	Col_Xl_Auto,
	/**
	 * From size XS the size should be 1
	 */
	Col_1,
	/**
	 * From size XS the size should be 1
	 */
	Col_2,
	/**
	 * From size XS the size should be 1
	 */
	Col_3,
	/**
	 * From size XS the size should be 1
	 */
	Col_4,
	/**
	 * From size XS the size should be 1
	 */
	Col_5,
	/**
	 * From size XS the size should be 1
	 */
	Col_6,
	/**
	 * From size XS the size should be 1
	 */
	Col_7,
	/**
	 * From size XS the size should be 1
	 */
	Col_8,
	/**
	 * From size XS the size should be 1
	 */
	Col_9,
	/**
	 * From size XS the size should be 1
	 */
	Col_10,
	/**
	 * From size XS the size should be 1
	 */
	Col_11,
	/**
	 * From size XS the size should be 1
	 */
	Col_12,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_1,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_2,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_3,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_4,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_5,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_6,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_7,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_8,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_9,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_10,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_11,
	/**
	 * From size SM (small) the size should be 1
	 */
	Col_Sm_12,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_1,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_2,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_3,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_4,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_5,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_6,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_7,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_8,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_9,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_10,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_11,
	/**
	 * From size MD (medium) the size should be 1
	 */
	Col_Md_12,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_1,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_2,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_3,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_4,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_5,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_6,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_7,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_8,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_9,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_10,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_11,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Lg_12,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_1,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_2,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_3,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_4,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_5,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_6,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_7,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_8,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_9,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_10,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_11,
	/**
	 * For large LG only the size should be 1
	 */
	Col_Xl_12,;


	BSColumnOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
