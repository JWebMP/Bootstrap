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
package com.jwebmp.plugins.bootstrap4.cards;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.cards.layout.IBSCardDeckChildren;
import com.jwebmp.plugins.bootstrap4.cards.parts.*;
import com.jwebmp.plugins.bootstrap4.listgroup.BSListGroup;
import com.jwebmp.plugins.bootstrap4.listgroup.parts.BSListGroupListItem;
import com.jwebmp.plugins.bootstrap4.options.*;
import com.jwebmp.plugins.bootstrap4.options.interfaces.IBSLayout;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Cards
 * <p>
 * A card is a flexible and extensible content container. It includes options for headers and footers, a wide variety of content, contextual
 * background colors, and powerful display options.
 * <p>
 * If you’re familiar with Bootstrap 3, cards replace our old panels, wells, and thumbnails. Similar functionality to those components is
 * available as modifier classes for cards.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@SuppressWarnings({"WeakerAccess", "unused"})
@ComponentInformation(name = "Bootstrap Card",
		description = "A card is a flexible and extensible content container. It includes options for headers and footers," +
		              " a wide " +
		              "variety of content,  contextual background colors, and powerful display options.",
		url = "https://v4-alpha.getbootstrap.com/components/card/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSCard<J extends BSCard<J>>
		extends Div<BSCardChildren, BSCardAttributes, GlobalFeatures, BSCardEvents, J>
		implements IBSLayout<J>, IBSCard<BSCardChildren, J>, IBSCardDeckChildren<BSCardChildren,J>
{


	/**
	 * Cards
	 * <p>
	 * A card is a flexible and extensible content container. It includes options for headers and footers, a wide variety of content,
	 * contextual background colors, and powerful display options.
	 * <p>
	 * If you’re familiar with Bootstrap 3, cards replace our old panels, wells, and thumbnails. Similar functionality to those components
	 * is available as modifier classes for cards.
	 */
	public BSCard()
	{
		this(null);
	}

	/**
	 * Cards
	 * <p>
	 * A card is a flexible and extensible content container. It includes options for headers and footers, a wide variety of content,
	 * contextual background colors, and powerful display options.
	 * <p>
	 * If you’re familiar with Bootstrap 3, cards replace our old panels, wells, and thumbnails. Similar functionality to those components
	 * is available as modifier classes for cards.
	 *
	 * @param text
	 * 		The text to add
	 */
	public BSCard(String text)
	{
		super(text);
		addClass(BSCardOptions.Card);
	}

	/**
	 * Cards
	 * <p>
	 * A card is a flexible and extensible content container. It includes options for headers and footers, a wide variety of content,
	 * contextual background colors, and powerful display options.
	 * <p>
	 * If you’re familiar with Bootstrap 3, cards replace our old panels, wells, and thumbnails. Similar functionality to those components
	 * is available as modifier classes for cards.
	 * <p>
	 * This card is inversed
	 *
	 * @param inverse
	 * 		If this card is displayed as inverse
	 */
	public BSCard(boolean inverse)
	{
		this(null);
		if (inverse)
		{
			addClass("card-inverse");
		}
	}

	/**
	 * Returns the slimmer version of this object
	 *
	 * @return THe interface for this object
	 */
	public IBSCard<BSCardChildren, J> asMe()
	{
		return this;
	}

	/**
	 * Adds the text to the card with the card text
	 *
	 * @param textToAdd
	 * 		The text to add to the card
	 *
	 * @return The given card text added
	 */
	@Override
	@NotNull
	public BSCardText addCardText(String textToAdd)
	{
		BSCardText p = new BSCardText(textToAdd);
		super.add(p);
		return p;
	}

	/**
	 * Creates and adds a new card image top with the given URL
	 *
	 * @param url
	 * 		The URL of the image to use
	 *
	 * @return The card top image object
	 */
	@Override
	@NotNull
	public BSCardImageTop<?> addCardImageTop(String url)
	{
		BSCardImageTop cardImageTop = new BSCardImageTop(url);
		add(cardImageTop);
		return cardImageTop;
	}

	/**
	 * Creates and adds a new card body
	 *
	 * @return The BS Card Body Object
	 */
	@Override
	@NotNull
	public BSCardBody<?> addCardBody()
	{
		BSCardBody cardBody = new BSCardBody();
		add(cardBody);
		return cardBody;
	}

	/**
	 * Adds a list group to the card
	 *
	 * @param items
	 * 		A list of items to add
	 *
	 * @return The newly created group with the items added on
	 */
	@Override
	@NotNull
	public BSListGroup<?> addListGroup(List<BSListGroupListItem<?>> items)
	{
		BSListGroup<?> listGroup = new BSListGroup<>();
		items.forEach(listGroup::add);
		add(listGroup);
		return listGroup;
	}

	/**
	 * Adds a footer to the bs cards
	 *
	 * @return The new card footer
	 */
	@Override
	@NotNull
	public BSCardFooter<?> addFooter()
	{
		BSCardFooter<?> footer = new BSCardFooter<>();
		add(footer);
		return footer;
	}

	/**
	 * Adds a footer to the bs cards
	 *
	 * @param text
	 * 		The tetx to use on the footer
	 *
	 * @return The new card footer
	 */
	@Override
	@NotNull
	public BSCardFooter<?> addFooter(String text)
	{
		BSCardFooter<?> footer = new BSCardFooter<>();
		footer.setText(text);
		add(footer);
		return footer;
	}

	/**
	 * Sets text center
	 *
	 * @param center
	 * 		The center to add to the center of this card?
	 *
	 * @return Always this object
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTextCenter(boolean center)
	{
		if (center)
		{
			addClass(BSTypographyOptions.Text_Center);
		}
		else
		{
			removeClass(BSTypographyOptions.Text_Center);
		}
		return (J) this;

	}

	/**
	 * e
	 * Sets align right
	 *
	 * @param right
	 * 		Sets the text to display right
	 *
	 * @return Always this object
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTextRight(boolean right)
	{
		if (right)
		{
			addClass(BSTypographyOptions.Text_Right);
		}
		else
		{
			removeClass(BSTypographyOptions.Text_Right);
		}
		return (J) this;

	}

	/**
	 * Adds a header
	 *
	 * @param text
	 * 		The text to add to the header
	 *
	 * @return The newly created BSCardHeader
	 */
	@Override
	@NotNull
	public BSCardHeader<?> addCardHeader(String text)
	{
		BSCardHeader<?> header = new BSCardHeader<>();
		header.setText(text);
		add(header);
		return header;
	}

	/**
	 * Adds a header
	 *
	 * @param component
	 * 		Any component to add
	 *
	 * @return The newly created BSCardHeader
	 */
	@Override
	@NotNull
	public BSCardHeader<?> addCardHeader(ComponentHierarchyBase component)
	{
		BSCardHeader<?> header = new BSCardHeader<>();
		header.add(component);
		add(header);
		return header;
	}


	/**
	 * Adds a header
	 *
	 * @param text
	 * 		The text to add to the header
	 *
	 * @return The newly created BSCardHeader
	 */
	@Override
	@NotNull
	public BSCardFooter<?> addCardFooter(String text)
	{
		BSCardFooter<?> header = new BSCardFooter<>();
		header.setText(text);
		add(header);
		return header;
	}


	/**
	 * Adds a header
	 *
	 * @param componentHierarchyBase
	 * 		The text to add to the header
	 *
	 * @return The newly created BSCardHeader
	 */
	@Override
	@NotNull
	public BSCardFooter<?> addCardFooter(ComponentHierarchyBase componentHierarchyBase)
	{
		BSCardFooter<?> header = new BSCardFooter<>();
		header.add(componentHierarchyBase);
		add(header);
		return header;
	}

	/**
	 * Adds to the card image bottom
	 *
	 * @param url
	 * 		The URL of the image to add to the bottom
	 *
	 * @return The card image bottom object
	 */
	@Override
	public BSCardImageBottom<?> addCardImageBottom(String url)
	{
		BSCardImageBottom<?> bottom = new BSCardImageBottom<>(url);
		add(bottom);
		return bottom;
	}

	/**
	 * Adds a card image overlay to the previously added card image (top or bottom)
	 *
	 * @param title
	 * 		The title of the image
	 * @param subTitle
	 * 		The subtitle of the image
	 * @param parargaphs
	 * 		The paragraph to apply
	 *
	 * @return The new BSCardImageOverlay that has been configured
	 */
	@Override
	public BSCardImageOverlay<?> addCardImageOverlay(String title, String subTitle, String... parargaphs)
	{
		BSCardImageOverlay<?> overlay = new BSCardImageOverlay<>();
		overlay.addTitle(HeaderTypes.H5, title);
		overlay.addSubtitle(HeaderTypes.H4, subTitle);
		if (parargaphs != null && parargaphs.length > 0)
		{
			for (String parargaph : parargaphs)
			{
				overlay.addText(parargaph);
			}
		}

		add(overlay);
		return overlay;
	}

	/**
	 * Sets the style with the given colours
	 *
	 * @param backgroundOptions
	 * 		background colour
	 *
	 * @return Always this
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBackground(BSBackgroundOptions backgroundOptions)
	{
		addClass(backgroundOptions);
		return (J) this;
	}

	/**
	 * Sets the style with the given colours
	 *
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return Always this
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addForeground(BSColoursOptions coloursOptions)
	{
		addClass(coloursOptions);
		return (J) this;
	}

	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin
	 * 		The margin to apply
	 *
	 * @return Always this
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addMargin(BSMarginOptions margin)
	{
		addClass(margin);
		return (J) this;
	}

	/**
	 * Applies the padding to the card
	 *
	 * @param padding
	 * 		The padding to apply
	 *
	 * @return Always this
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addPadding(BSPaddingOptions padding)
	{
		addClass(padding);
		return (J) this;
	}

	/**
	 * Sets the border to the correct structure
	 *
	 * @param border
	 * 		The border to apply
	 *
	 * @return Always This
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBorder(BSBorderOptions border)
	{
		addClass(border);
		return (J) this;
	}
}
