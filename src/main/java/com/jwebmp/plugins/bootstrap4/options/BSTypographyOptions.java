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
public enum BSTypographyOptions
		implements IBSComponentOptions
{
	/**
	 * .h1 through .h6 classes are also available, for when you want to match the font styling of a heading but cannot use the associated
	 * HTML element.
	 */
	H1,
	/**
	 * .h1 through .h6 classes are also available, for when you want to match the font styling of a heading but cannot use the associated
	 * HTML element.
	 */
	H2,
	/**
	 * .h1 through .h6 classes are also available, for when you want to match the font styling of a heading but cannot use the associated
	 * HTML element.
	 */
	H3,
	/**
	 * .h1 through .h6 classes are also available, for when you want to match the font styling of a heading but cannot use the associated
	 * HTML element.
	 */
	H4,
	/**
	 * .h1 through .h6 classes are also available, for when you want to match the font styling of a heading but cannot use the associated
	 * HTML element.
	 */
	H5,
	/**
	 * .h1 through .h6 classes are also available, for when you want to match the font styling of a heading but cannot use the associated
	 * HTML element.
	 */
	H6,

	/**
	 * Indicates text that is muted
	 */
	Text_Muted,
	/**
	 * Indicates no wrap text
	 */
	Text_NoWrap,

	/**
	 * For longer content, you can add a .text-truncate class to truncate the text with an ellipsis. Requires display: inline-block or
	 * display: block.
	 */
	Text_Truncate,

	/**
	 * Indicates left_aligned text
	 */
	Text_Left,
	/**
	 * Indicates left_aligned text
	 */
	Text_Sm_Left,
	/**
	 * Indicates left_aligned text
	 */
	Text_Md_Left,
	/**
	 * Indicates left_aligned text
	 */
	Text_Lg_Left,
	/**
	 * Indicates left_aligned text
	 */
	Text_Xl_Left,

	/**
	 * Indicates center_aligned text
	 */
	Text_Center,
	/**
	 * Indicates center_aligned text
	 */
	Text_Sm_Center,
	/**
	 * Indicates center_aligned text
	 */
	Text_Md_Center,
	/**
	 * Indicates center_aligned text
	 */
	Text_Lg_Center,
	/**
	 * Indicates center_aligned text
	 */
	Text_Xl_Center,

	/**
	 * Indicates right_aligned text
	 */
	Text_Right,

	/**
	 * Indicates right_aligned text
	 */
	Text_Sm_Right,
	/**
	 * Indicates right_aligned text
	 */
	Text_Md_Right,
	/**
	 * Indicates right_aligned text
	 */
	Text_Lg_Right,
	/**
	 * Indicates right_aligned text
	 */
	Text_Xl_Right,

	/**
	 * Display headings
	 * Traditional heading elements are designed to work best in the meat of your page content. When you need a heading to stand out,
	 * consider using a display heading—a larger, slightly more opinionated heading style.
	 */
	Display_1,
	/**
	 * Display headings
	 * Traditional heading elements are designed to work best in the meat of your page content. When you need a heading to stand out,
	 * consider using a display heading—a larger, slightly more opinionated heading style.
	 */
	Display_2,
	/**
	 * Display headings
	 * Traditional heading elements are designed to work best in the meat of your page content. When you need a heading to stand out,
	 * consider using a display heading—a larger, slightly more opinionated heading style.
	 */
	Display_3,
	/**
	 * Display headings
	 * Traditional heading elements are designed to work best in the meat of your page content. When you need a heading to stand out,
	 * consider using a display heading—a larger, slightly more opinionated heading style.
	 */
	Display_4,

	/**
	 * Make a paragraph stand out by adding .lead.
	 */
	Lead,
	/**
	 * Add .initialism to an abbreviation for a slightly smaller font-size.
	 */
	Initialism,

	/**
	 * Indicates lowercased text: LOWERCASED TEXT
	 */
	Text_Lowercase,
	/**
	 * Indicates uppercased text: uppercased text
	 */
	Text_Uppercase,
	/**
	 * Indicates capitalized text: capitalized text
	 */
	Text_Capitalize,
	/**
	 * Sets font bold
	 */
	Font_Weight_Bold,
	/**
	 * Sets font normal
	 */
	Font_Weight_Normal,
	/**
	 * Sets font weight light
	 */
	Font_Weight_Light,
	/**
	 * Forces italic
	 */
	Font_Italic,

	/**
	 * Indicates a blockquote with right_aligned content
	 */
	Blockquote_reverse,
	Blockquote,
	Blockquote_Footer;

	@Override
	public String toString()
	{
		return name().replace('_', '-')
		             .toLowerCase();
	}
}
