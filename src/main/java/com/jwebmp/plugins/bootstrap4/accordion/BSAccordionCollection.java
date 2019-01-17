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

package com.jwebmp.plugins.bootstrap4.accordion;

import com.jwebmp.core.base.html.HeaderText;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.plugins.bootstrap4.buttons.BSButton;
import com.jwebmp.plugins.bootstrap4.cards.BSCard;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardBody;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardHeader;

import javax.validation.constraints.NotNull;

/**
 * A returnable collection of items when adding according items
 *
 * @param <J>
 */
public class BSAccordionCollection<J extends BSAccordionCollection<J>>

{


	private BSCard<?> card;
	private BSCardBody<?> body;
	private BSCardHeader<?> header;
	private HeaderText<?> heading;
	private BSButton<?> headingButton;
	private Link<?> headingLink;

	/**
	 * A returnable collection of items when adding according items
	 */
	public BSAccordionCollection()
	{
		//No config required
	}

	/**
	 * Returns the card
	 *
	 * @return
	 */
	public BSCard<?> getCard()
	{
		return card;
	}

	/**
	 * Sets the card
	 *
	 * @param card
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCard(BSCard<?> card)
	{
		this.card = card;
		return (J) this;
	}

	/**
	 * Gets tje bpdy
	 *
	 * @return
	 */
	public BSCardBody<?> getBody()
	{
		return body;
	}

	/**
	 * Sets the body of the collection
	 *
	 * @param body
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBody(BSCardBody<?> body)
	{
		this.body = body;
		return (J) this;
	}

	/**
	 * Returns the header of the collection
	 *
	 * @return
	 */

	public BSCardHeader<?> getHeader()
	{
		return header;
	}

	/**
	 * Sets the header of the accordion
	 *
	 * @param header
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeader(BSCardHeader<?> header)
	{
		this.header = header;
		return (J) this;
	}

	/**
	 * Returns the header of the accordion
	 *
	 * @return
	 */
	@NotNull
	public HeaderText<?> getHeading()
	{
		return heading;
	}

	/**
	 * Sets the heading to the given H tag
	 *
	 * @param heading
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeading(HeaderText<?> heading)
	{
		this.heading = heading;
		return (J) this;
	}

	/**
	 * Returns the button for the accordion
	 *
	 * @return
	 */

	public BSButton<?> getHeadingButton()
	{
		return headingButton;
	}

	/**
	 * Sets the button
	 *
	 * @param headingButton
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeadingButton(BSButton<?> headingButton)
	{
		this.headingButton = headingButton;
		return (J) this;
	}

	/**
	 * Gets the assigned link for the accordion
	 * @return
	 */
	public Link<?> getHeadingLink()
	{
		return headingLink;
	}

	/**
	 * Sets the link for the accordion
	 * @param headingLink
	 * @return
	 */
	public BSAccordionCollection<J> setHeadingLink(Link<?> headingLink)
	{
		this.headingLink = headingLink;
		return this;
	}
}
