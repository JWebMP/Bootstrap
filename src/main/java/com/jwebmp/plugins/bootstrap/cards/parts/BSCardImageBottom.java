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
package com.jwebmp.plugins.bootstrap.cards.parts;

import com.jwebmp.core.base.html.Image;
import com.jwebmp.core.base.html.attributes.ImageAttributes;
import com.jwebmp.plugins.bootstrap.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap.cards.BSCardOptions;

import jakarta.validation.constraints.NotNull;

/**
 * Image overlays
 * <p>
 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse (see
 * below).
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardImageBottom<J extends BSCardImageBottom<J>>
		extends Image<J>
		implements BSCardChildren
{


	/**
	 * Image overlays
	 * <p>
	 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse
	 * (see
	 * below).
	 */
	public BSCardImageBottom()
	{
		this(null);
	}

	/**
	 * Image overlays
	 * <p>
	 * Turn an image into a card background and overlay your card’s text. Depending on the image, you may or may not need .card-inverse
	 * (see
	 * below).
	 *
	 * @param imageUrl
	 */
	public BSCardImageBottom(String imageUrl)
	{
		super(imageUrl);
		addAttribute(ImageAttributes.Src, imageUrl);
		addClass(BSCardOptions.Card_Img_Bottom);
	}

	/**
	 * Centers this image
	 *
	 * @return this object
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCentered()
	{
		addClass("d-block mx-auto");
		return (J) this;
	}
}
