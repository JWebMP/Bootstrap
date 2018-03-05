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
package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.BSCardChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.BSCardOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.interfaces.IBSCardBody;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.*;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.interfaces.IBSLayout;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

/**
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardBody<J extends BSCardBody<J>>
		extends Div<BSCardChildren, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSCardChildren, za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.interfaces.IBSCardBody<J>
{

	private static final long serialVersionUID = 1L;

	public BSCardBody()
	{
		addClass(BSCardOptions.Card_Body);
	}

	/**
	 * Returns the neater options
	 *
	 * @return
	 */
	public IBSCardBody asMe()
	{
		return this;
	}

	/**
	 * Returns the Bootstrap layout options
	 *
	 * @return
	 */
	public IBSLayout<J> asLayout()
	{
		return this;
	}

	/**
	 * Adds the given title to the card body
	 *
	 * @param type
	 * @param title
	 *
	 * @return
	 */
	@Override
	public BSCardTitle<?> addTitle(HeaderTypes type, String title)
	{
		BSCardTitle<?> cardTitle = new BSCardTitle<>();
		cardTitle.setText(title);
		cardTitle.setTag(type.toString());
		add(cardTitle);
		return cardTitle;
	}

	/**
	 * Adds a subtitle to the card body with h3 as the type
	 *
	 * @param title
	 *
	 * @return
	 */
	@Override
	public BSCardSubtitle<?> addSubtitle(String title)
	{
		return addSubtitle(HeaderTypes.H3, title);
	}

	/**
	 * Adds a subtitle to the card body with the given header type
	 *
	 * @param type
	 * @param title
	 *
	 * @return
	 */
	@Override
	public BSCardSubtitle<?> addSubtitle(HeaderTypes type, String title)
	{
		return new BSCardSubtitle<>(type, title);
	}

	/**
	 * Adds the given text as raw text to the bs card
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSCardText<?> addText(String text)
	{
		BSCardText<?> cardText = new BSCardText<>();
		cardText.setText(text);
		add(cardText);
		return cardText;
	}

	/**
	 * Adds a button link to the card body
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSCardLink<?> addButtonLink(String text)
	{
		BSCardLink<?> cardLink = new BSCardLink<>();
		cardLink.setText(text);
		add(cardLink);
		return cardLink;
	}

	/**
	 * Adds a button link to the card body with the given options
	 *
	 * @param text
	 * @param buttonOptions
	 * @param size
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSCardLink<?> addButtonLink(String text, BSButtonOptions buttonOptions, BSButtonSizeOptions size)
	{
		BSCardLink<?> cardLink = new BSCardLink<>();
		cardLink.setText(text);
		cardLink.addClass(buttonOptions);
		cardLink.addClass(size);
		add(cardLink);
		return cardLink;
	}

	/**
	 * Adds the block quote with the given text and a nullable footer
	 *
	 * @param text
	 * @param footer
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSCardBlockQuote<?> addBlockQuote(String text, @Nullable BSCardBlockQuoteFooter footer)
	{
		BSCardBlockQuote<?> quote = new BSCardBlockQuote<>();
		quote.add(text);
		if (footer != null)
		{
			quote.add(footer);
		}
		add(quote);
		return quote;
	}

	/**
	 * Adds the block quote with the givne text (or component.toString(0)) and a nullable footer
	 *
	 * @param text
	 * @param footer
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSCardBlockQuote<?> addBlockQuote(String text, @Nullable String footer)
	{
		BSCardBlockQuote<?> quote = new BSCardBlockQuote<>();
		quote.add(text);
		if (footer != null)
		{
			quote.addFooter(footer);
		}
		add(quote);
		return quote;
	}


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
	public J setStyle(BSBackgroundOptions backgroundOptions, BSColoursOptions coloursOptions)
	{
		addClass(backgroundOptions);
		addClass(coloursOptions);
		return (J) this;
	}

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
	public J setStyle(BSBorderOptions borderOptions, BSColoursOptions coloursOptions)
	{
		addClass(borderOptions);
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
	public J setMargin(BSMarginOptions margin)
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
	public J setPadding(BSPaddingOptions padding)
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
	public J setBorder(BSBorderOptions border)
	{
		addClass(border);
		return (J) this;
	}


}
