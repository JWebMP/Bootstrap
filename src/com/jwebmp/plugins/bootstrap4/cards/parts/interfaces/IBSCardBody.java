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

package com.jwebmp.plugins.bootstrap4.cards.parts.interfaces;

import com.jwebmp.base.html.attributes.HeaderTypes;
import com.jwebmp.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.cards.parts.*;
import com.jwebmp.plugins.bootstrap4.options.interfaces.IBSLayout;

import javax.annotation.Nullable;
import java.util.Comparator;

public interface IBSCardBody<J extends BSCardBody<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>, IBSLayout<J>
{
	/**
	 * Adds the given title to the card body
	 *
	 * @param type
	 * @param title
	 *
	 * @return
	 */
	BSCardTitle<?> addTitle(HeaderTypes type, String title);

	/**
	 * Adds a subtitle to the card body with h3 as the type
	 *
	 * @param title
	 *
	 * @return
	 */
	BSCardSubtitle<?> addSubtitle(String title);

	/**
	 * Adds a subtitle to the card body with the given header type
	 *
	 * @param type
	 * @param title
	 *
	 * @return
	 */
	BSCardSubtitle<?> addSubtitle(HeaderTypes type, String title);

	/**
	 * Adds the given text as raw text to the bs card
	 *
	 * @param text
	 *
	 * @return
	 */
	BSCardText<?> addText(String text);

	/**
	 * Adds a button link to the card body
	 *
	 * @param text
	 *
	 * @return
	 */
	BSCardLink<?> addButtonLink(String text);

	/**
	 * Adds a button link to the card body with the given options
	 *
	 * @param text
	 * @param buttonOptions
	 * @param size
	 *
	 * @return
	 */
	BSCardLink<?> addButtonLink(String text, BSButtonOptions buttonOptions, BSButtonSizeOptions size);

	/**
	 * Adds the block quote with the given text and a nullable footer
	 *
	 * @param text
	 * @param footer
	 *
	 * @return
	 */
	BSCardBlockQuote<?> addBlockQuote(String text, @Nullable BSCardBlockQuoteFooter footer);

	/**
	 * Adds the block quote with the givne text (or component.toString(0)) and a nullable footer
	 *
	 * @param text
	 * @param footer
	 *
	 * @return
	 */
	BSCardBlockQuote<?> addBlockQuote(String text, @Nullable String footer);
}
