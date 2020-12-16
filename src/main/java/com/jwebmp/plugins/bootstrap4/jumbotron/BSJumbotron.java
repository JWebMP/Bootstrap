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
package com.jwebmp.plugins.bootstrap4.jumbotron;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.H1;
import com.jwebmp.core.base.html.HorizontalRule;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.jumbotron.interfaces.IBSJumbotron;
import com.jwebmp.plugins.bootstrap4.options.BSMarginOptions;
import jakarta.validation.constraints.NotNull;

/**
 * Jumbotron
 * <p>
 * A lightweight, flexible component that can optionally extend the entire viewport to showcase key marketing messages on your site.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 18 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Jumbotron",
		description = "A lightweight, flexible component that can optionally extend the entire viewport to showcase key marketing " + "messages" + " on your site.",
		url = "https://v4-alpha.getbootstrap.com/components/jumbotron/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSJumbotron<J extends BSJumbotron<J>>
		extends Div<GlobalChildren, BSJumbotronAttributes, GlobalFeatures, GlobalEvents, J>
		implements IBSJumbotron<J>
{
	/**
	 * Constructs a new instance
	 * <p>
	 */
	public BSJumbotron()
	{
		this((String) null);
	}

	/**
	 * Constructs a new instance
	 *
	 * @param text
	 */
	public BSJumbotron(String text)
	{
		super(text);
		addClass(BSJumbotronOptions.Jumbotron);
	}

	/**
	 * Constructs a new instance
	 *
	 * @param jumbotronType
	 */
	public BSJumbotron(BSJumbotronOptions... jumbotronType)
	{
		this((String) null);
		for (BSJumbotronOptions bSJumbotronOptions : jumbotronType)
		{
			addClass(bSJumbotronOptions);
		}
	}

	/**
	 * Simpler view of the jumbotron
	 *
	 * @return
	 */
	public IBSJumbotron<J> asMe()
	{
		return this;
	}

	/**
	 * Adds a large highlighted text to the jumbotron
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	public H1<?> addJumboText(String text)
	{
		H1<?> header = new H1<>(text);
		header.addClass(BSJumbotronOptions.Display_4);
		add(header);
		return header;
	}

	/**
	 * Adds a nicely indented container to place other items such as buttons
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	public Paragraph<?> addLead(String text)
	{
		Paragraph<?> p = new Paragraph<>(text);
		p.addClass(BSJumbotronOptions.Lead);
		add(p);
		return p;
	}

	/**
	 * Adds a divider with MarginBottom_3
	 *
	 * @return
	 */
	@Override
	public HorizontalRule<?> addHorizontalRule()
	{
		HorizontalRule<?> hr = HorizontalRule.getInstance()
		                                  .addClass(BSMarginOptions.MarginBottom_3);
		add(hr);
		return hr;
	}

	/**
	 * Sets if this jumbotron must take up the entire container space
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFluid()
	{
		addClass(BSJumbotronOptions.Jumbotron_fluid);
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
