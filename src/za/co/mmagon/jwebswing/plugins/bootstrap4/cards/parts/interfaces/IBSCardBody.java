package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.interfaces;

import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.*;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.*;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.interfaces.IBSLayout;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
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

	/**
	 * Sets the style with the given colours
	 *
	 * @param backgroundOptions
	 * 		background colour
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	J setStyle(BSBackgroundOptions backgroundOptions, BSColoursOptions coloursOptions);

	/**
	 * Sets the style with the given colours
	 *
	 * @param borderOptions
	 * 		background colour
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	J setStyle(BSBorderOptions borderOptions, BSColoursOptions coloursOptions);

	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	J setMargin(BSMarginOptions margin);

	/**
	 * Applies the padding to the card
	 *
	 * @param padding
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	J setPadding(BSPaddingOptions padding);

	/**
	 * Sets the border to the correct structure
	 *
	 * @param border
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	J setBorder(BSBorderOptions border);
}
