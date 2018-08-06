package com.jwebmp.plugins.bootstrap4.cards;

import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.children.AreaChildren;
import com.jwebmp.core.base.html.interfaces.children.BodyChildren;
import com.jwebmp.core.base.html.interfaces.children.ImageMapChildren;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.plugins.bootstrap4.accordion.BSAccordionChildren;
import com.jwebmp.plugins.bootstrap4.cards.parts.*;
import com.jwebmp.plugins.bootstrap4.listgroup.BSListGroup;
import com.jwebmp.plugins.bootstrap4.listgroup.parts.BSListGroupListItem;
import com.jwebmp.plugins.bootstrap4.options.*;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface IBSCard<J extends BSCard<J>>
		extends GlobalChildren, BodyChildren, ImageMapChildren, AreaChildren, ListItemChildren, BSAccordionChildren
{
	/**
	 * Adds the text to the card with the card text
	 *
	 * @param textToAdd
	 * 		The text to add to the card
	 *
	 * @return The given card text added
	 */
	@NotNull BSCardText addCardText(String textToAdd);

	/**
	 * Creates and adds a new card image top with the given URL
	 *
	 * @param url
	 * 		The URL of the image to use
	 *
	 * @return The card top image object
	 */
	@NotNull BSCardImageTop<?> addCardImageTop(String url);

	/**
	 * Creates and adds a new card body
	 *
	 * @return The BS Card Body Object
	 */
	@NotNull BSCardBody<?> addCardBody();

	/**
	 * Adds a list group to the card
	 *
	 * @param items
	 * 		A list of items to add
	 *
	 * @return The newly created group with the items added on
	 */
	@NotNull BSListGroup<?> addListGroup(List<BSListGroupListItem<?>> items);

	/**
	 * Adds a footer to the bs cards
	 *
	 * @return The new card footer
	 */
	@NotNull BSCardFooter<?> addFooter();

	/**
	 * Adds a footer to the bs cards
	 *
	 * @param text
	 * 		The tetx to use on the footer
	 *
	 * @return The new card footer
	 */
	@NotNull BSCardFooter<?> addFooter(String text);

	/**
	 * Sets text center
	 *
	 * @param center
	 * 		The center to add to the center of this card?
	 *
	 * @return Always this object
	 */
	@SuppressWarnings("unchecked")
	J setTextCenter(boolean center);

	/**
	 * e
	 * Sets align right
	 *
	 * @param right
	 * 		Sets the text to display right
	 *
	 * @return Always this object
	 */
	@SuppressWarnings("unchecked")
	J setTextRight(boolean right);

	/**
	 * Adds a header
	 *
	 * @param text The text to add to the header
	 *
	 * @return The newly created BSCardHeader
	 */
	@NotNull BSCardHeader<?> addCardHeader(String text);

	/**
	 * Adds to the card image bottom
	 *
	 * @param url The URL of the image to add to the bottom
	 *
	 * @return The card image bottom object
	 */
	BSCardImageBottom<?> addCardImageBottom(String url);

	/**
	 * Adds a card image overlay to the previously added card image (top or bottom)
	 *
	 * @param title The title of the image
	 * @param subTitle The subtitle of the image
	 * @param parargaphs The paragraph to apply
	 *
	 * @return The new BSCardImageOverlay that has been configured
	 */
	BSCardImageOverlay<?> addCardImageOverlay(String title, String subTitle, String... parargaphs);

	/**
	 * Sets the style with the given colours
	 *
	 * @param backgroundOptions
	 * 		background colour
	 *
	 * @return Always this
	 */
	@SuppressWarnings("unchecked")
	J addBackground(BSBackgroundOptions backgroundOptions);

	/**
	 * Sets the style with the given colours
	 *
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return Always this
	 */
	@SuppressWarnings("unchecked")
	J addForeground(BSColoursOptions coloursOptions);

	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin The margin to apply
	 *
	 * @return Always this
	 */
	@SuppressWarnings("unchecked")
	J addMargin(BSMarginOptions margin);

	/**
	 * Applies the padding to the card
	 *
	 * @param padding The padding to apply
	 *
	 * @return Always this
	 */
	@SuppressWarnings("unchecked")
	J addPadding(BSPaddingOptions padding);

	/**
	 * Sets the border to the correct structure
	 *
	 * @param border The border to apply
	 *
	 * @return Always This
	 */
	@SuppressWarnings("unchecked")
	J addBorder(BSBorderOptions border);
}
