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

import za.co.mmagon.jwebswing.base.html.attributes.LinkAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.BSCardChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.*;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.interfaces.IBSLayout;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import javax.validation.constraints.NotNull;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_HASH;

/**
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSCardButton<J extends BSCardButton<J>>
		extends BSButton<J>
		implements BSCardChildren, za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.interfaces.IBSCardButton<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new card button (a link behaving as a button)
	 */
	public BSCardButton()
	{
		setTag("a");
		addAttribute(LinkAttributes.HRef.toString(), STRING_HASH);
	}

	/**
	 * Constructs a new card button (a link behaving as a button)
	 *
	 * @param text
	 */
	public BSCardButton(String text)
	{
		super(text);
		setTag("a");
		addAttribute(LinkAttributes.HRef.toString(), StaticStrings.STRING_HASH);
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
	 * Sets the style with button options
	 *
	 * @param buttonOptions
	 *
	 * @return
	 */
	@Override
	public J setStyle(BSButtonOptions buttonOptions)
	{
		addClass(buttonOptions);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBackground(BSBackgroundOptions backgroundOptions)
	{
		addClass(backgroundOptions);
		return (J) this;
	}

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
