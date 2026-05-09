package com.jwebmp.plugins.bootstrap.cards.parts.interfaces;

import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap.cards.parts.*;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;

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
	BSCardBlockQuote<?> addBlockQuote(String text, BSCardBlockQuoteFooter<?> footer);

	/**
	 * Adds the block quote with the givne text (or component.toString(0)) and a nullable footer
	 *
	 * @param text
	 * @param footer
	 *
	 * @return
	 */
	BSCardBlockQuote<?> addBlockQuote(String text, String footer);

	J removePadding();
}
