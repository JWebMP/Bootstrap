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
package com.jwebmp.plugins.bootstrap4.accordion;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.HeaderText;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.buttons.BSButton;
import com.jwebmp.plugins.bootstrap4.cards.BSCard;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardBody;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardHeader;
import com.jwebmp.plugins.bootstrap4.collapse.BSCollapse;
import com.jwebmp.plugins.bootstrap4.options.BSMarginOptions;

/**
 * Extend the default collapse behavior to create an accordion.
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Accordion",
		description = "Extend the default collapse behavior to create an accordion.",
		url = "https://v4-alpha.getbootstrap.com/components/collapse/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSAccordion<J extends BSAccordion<J>>
		extends Div<BSAccordionChildren, BSAccordionAttributes, GlobalFeatures, BSAccordionEvents, J>
		implements com.jwebmp.plugins.bootstrap4.options.interfaces.IBSAccordion<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Extend the default collapse behavior to create an accordion.
	 */
	public BSAccordion()
	{
		//no config required
	}

	/**
	 * Adds a new accordion card formatted with the settings applied with the content hidden
	 *
	 * @param headerText
	 *
	 * @return
	 */
	@Override
	public BSAccordionCollection<?> addCard(String headerText)
	{
		return addCard(headerText, null, false);
	}

	/**
	 * Adds a new accordion card formatted with the settings applied
	 *
	 * @return
	 */
	@Override
	public BSAccordionCollection<?> addCard(String headerText, BSCardBody<?> bodyContent, boolean hideOnStart)
	{
		BSCard<?> card = new BSCard<>();

		BSCardHeader<?> header = card.addCardHeader(null);
		BSCardBody<?> body = bodyContent == null ? new BSCardBody<>() : bodyContent;

		BSButton<?> collapseButton = new BSButton<>().setText(headerText);

		HeaderText<?> h5 = (HeaderText<?>) header.getChildren()
		                                         .iterator()
		                                         .next();

		h5.addClass(BSMarginOptions.MarginBottom_0);
		h5.add(collapseButton);
		header.add(h5);

		BSCollapse.link(collapseButton, body, hideOnStart);

		body.addAttribute(GlobalAttributes.Aria_LabelledBy, header.getID());
		body.addAttribute(LinkAttributes.Data_Parent.toString(), getID(true));

		card.add(body);
		add(card);

		BSAccordionCollection<?> collection = new BSAccordionCollection<>();
		collection.setBody(body);
		collection.setCard(card);
		collection.setHeader(header);
		collection.setHeading(h5);
		collection.setHeadingButton(collapseButton);

		return collection;
	}

	/**
	 * Adds a new accordion card formatted with the settings applied with the content hidden
	 *
	 * @param headerText
	 * @param bodyContent
	 *
	 * @return
	 */
	@Override
	public BSAccordionCollection<?> addCard(String headerText, BSCardBody<?> bodyContent)
	{
		return addCard(headerText, bodyContent, false);
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
