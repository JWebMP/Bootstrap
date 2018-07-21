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
package com.jwebmp.plugins.bootstrap4.cards;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.accordion.BSAccordionChildren;
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
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Card",
		description = "A card is a flexible and extensible content container. It includes options for headers and footers," +
		              " a wide " +
		              "variety of content,  contextual background colors, and powerful display options.",
		url = "https://v4-alpha.getbootstrap.com/components/card/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSCard<J extends BSCard<J>>
		extends Div<BSCardChildren, BSCardAttributes, GlobalFeatures, BSCardEvents, J>
		implements IBSLayout<J>, BSAccordionChildren
{

	private static final long serialVersionUID = 1L;

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
	 * Adds the text to the card with the card text
	 *
	 * @param textToAdd
	 *
	 * @return
	 */
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
	 *
	 * @return
	 */
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
	 * @return
	 */
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
	 *
	 * @return
	 */
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
	 * @param text
	 *
	 * @return
	 */
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
	 *
	 * @return
	 */
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
	 * Sets align right
	 *
	 * @param right
	 *
	 * @return
	 */
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
	 * Adds the tabs to the card with the given contents
	 *
	 * @param tabNames
	 * @param contents
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J addTabs(String[] tabNames, List<BSCardBody<?>> contents)
	{
		addTabHeaders(tabNames);
		for (BSCardBody<?> content : contents)
		{
			add(content);
		}
		return (J) this;
	}

	/**
	 * Tabs
	 *
	 * @param tabNames
	 *
	 * @return
	 */
	public BSCardHeader<?> addTabHeaders(@NotNull String[] tabNames)
	{
		BSCardHeader<?> header = addHeader(null);
		header.addTabHeader(tabNames);
		add(header);
		return header;
	}

	/**
	 * Adds a header
	 *
	 * @param text
	 *
	 * @return
	 */
	@NotNull
	public BSCardHeader<?> addHeader(String text)
	{
		BSCardHeader<?> header = new BSCardHeader<>();
		header.setText(text);
		add(header);
		return header;
	}

	/**
	 * Adds to the card image bottom
	 *
	 * @param url
	 *
	 * @return
	 */
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
	 * @param subTitle
	 * @param parargaphs
	 *
	 * @return
	 */
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
	 * @return
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
	 * @return
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
	 *
	 * @return
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
	 *
	 * @return
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
	 *
	 * @return
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
