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
package com.jwebmp.plugins.bootstrap.options;

import com.guicedee.guicedinjection.json.StaticStrings;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

/**
 * Use .d-block, .d-inline, or .d-inline-block to simply set an element’s display property to block, inline, or inline-block (respectively).
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSDisplayOptions
		implements IBSComponentOptions
{
	/**
	 * Sets the display property to block
	 */
	Block,
	/**
	 * Sets the display property to block
	 */
	Lg_Block,
	/**
	 * Sets the display property to block
	 */
	Md_Block,
	/**
	 * Sets the display property to block
	 */
	Sm_Block,
	/**
	 * Sets the display property to block
	 */
	Xl_Block,
	/**
	 * Sets the display property to inline
	 */
	Inline,
	/**
	 * Sets the display property to block
	 */
	Lg_Inline,
	/**
	 * Sets the display property to block
	 */
	Md_Inline,
	/**
	 * Sets the display property to block
	 */
	Sm_Inline,
	/**
	 * Sets the display property to block
	 */
	Xl_Inline,
	/**
	 * Sets the display property to block
	 */
	Inline_Block,
	/**
	 * Sets the display property to block
	 */
	Lg_Inline_Block,
	/**
	 * Sets the display property to block
	 */
	Md_Inline_Block,
	/**
	 * Sets the display property to block
	 */
	Sm_Inline_Block,
	/**
	 * Sets the display property to block
	 */
	Xl_Inline_Block,
	/**
	 * Displays as flex
	 */
	Flex,
	/**
	 * Sets the display property to block
	 */
	Lg_Flex,
	/**
	 * Sets the display property to block
	 */
	Md_Flex,
	/**
	 * Sets the display property to block
	 */
	Sm_Flex,
	/**
	 * Sets the display property to block
	 */
	Xl_Flex,
	/**
	 * d-none
	 */
	None,
	/**
	 * Sets the display property to block
	 */
	Lg_None,
	/**
	 * Sets the display property to block
	 */
	Md_None,
	/**
	 * Sets the display property to block
	 */
	Sm_None,
	/**
	 * Sets the display property to block
	 */
	Xl_None,
	
	
	
	;
	
	@Override
	public String toString()
	{
		return "d-" + name().toLowerCase()
		                    .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
