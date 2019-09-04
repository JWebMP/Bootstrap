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

import com.fasterxml.jackson.annotation.JsonValue;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * @author GedMarc
 * @since 20 Apr 2016
 */
public enum BSDefaultOptions
		implements IBSComponentOptions
{

	/**
	 * Only do it when coming in (or hiding?)
	 */
	Show,
	/**
	 * Only do it when going out (or showing
	 */
	Hide,

	/**
	 * Place to the left
	 */
	Left,
	/**
	 * Place to the right
	 */
	Right,
	/**
	 * Indicates smaller text (set to 85% of the size of the parent): Smaller text
	 */
	Small,
	/**
	 * Makes a text stand out: Stand out text
	 */
	Lead,
	/**
	 * Highlights text: Highlighted text
	 */
	Mark,

	/**
	 * Indicates justified text
	 */
	Text_Justify,

	/**
	 * Displays the text inside the &lt;abbr&gt; element in a slightly smaller font size
	 */
	Initialise,
	/**
	 * The .invisible class can be used to toggle only the visibility of an element, meaning its display is not modified and the element
	 * can
	 * still affect the flow of the document. Displays the item as
	 */
	Invisible,

	/**
	 * Removes the default list_style and left margin on list items (works on both &lt;ul&gt; and &lt;ol&gt;) This class only applies to
	 * immediate children list items (to remove the default list_style
	 * from any nested lists, apply this class to any nested lists as well)
	 */
	List_Unstyled,
	/*
	 * Places all list items on a single line
	 */
	List_Inline,
	/**
	 * Remove a list’s bullets and apply some light margin with a combination of two classes, .list-inline and .list-inline-item.
	 */
	List_Inline_Item,

	/**
	 * Lines up the terms and descriptions in the &lt;dl&gt; element side_by_side Starts off like default &lt;dl&gt;s, but when the browser
	 * window expands, it will line up side_by_side
	 */
	Dl_Horizontal,
	/**
	 * Makes the button appear pressed
	 */
	Active,
	/**
	 * Makes the button disabled
	 */
	Disabled,
	/**
	 * Floats an element to the left
	 */
	Pull_Left,
	/**
	 * Floats an element to the right
	 */
	Pull_Right,
	/**
	 * Floats an element to the left
	 */
	Float_Left,
	/**
	 * Floats an element to the right
	 */
	Float_Right,
	/**
	 * Sets an element to display:block with margin_right:auto and margin_left:auto
	 */
	Center_Block,

	/**
	 * Forces an element to be hidden
	 */
	Hidden,
	/**
	 * If an item is collapsed
	 */
	Collapsed,
	/**
	 * Helps replace an element's text content with a background image
	 */
	Text_Hide,
	/**
	 * *
	 * Indicates dropdown functionality (will reverse automatically in dropup menus)
	 */
	Caret,

	/**
	 * *
	 * Provides simple pagination links (Previous/Next)
	 */
	Pager,
	/**
	 * Aligns the pager previous button to the left
	 */
	Previous,
	/**
	 * Aligns the pager next button to the right
	 */
	Next,
	/**
	 * *
	 * Indicates a default grey label
	 */
	Label$Label_Default,
	/**
	 * Indicates a blue label of type "primary"
	 */
	Label$Label_Primary,
	/**
	 * Indicates a green label of type "success"
	 */
	Label$Label_Success,
	/**
	 * Indicates a light blue label of type "info"
	 */
	Label$Label_Info,
	/**
	 * Indicates a yellow label of type "warning"
	 */
	Label$Label_Warning,
	/**
	 * Indicates a red label of type "danger"
	 */
	Label$Label_Danger,
	/**
	 * Huge Text
	 */
	Huge,
	/**
	 * Instructs to fade in
	 */
	Fade,
	;

	@JsonValue
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replaceAll("\\$", STRING_SPACE)
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}

}
