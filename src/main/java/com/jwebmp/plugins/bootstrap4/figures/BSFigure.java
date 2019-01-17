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

package com.jwebmp.plugins.bootstrap4.figures;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.TableCaption;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.plugins.bootstrap4.options.BSFigureOptions;
import com.jwebmp.plugins.bootstrap4.options.BSTypographyOptions;

import javax.validation.constraints.NotNull;

/**
 * Anytime you need to display a piece of content—like an image with an optional caption, consider using a figure.
 * <p>
 * Use the included .figure , .figure-img and .figure-caption classes to provide some baseline styles for the HTML5 figure and figcaption
 * elements.
 * <p>
 * Images in figures have no explicit size, so be sure to add the .img-fluid class to your img to make it responsive.
 *
 * @param <J>
 */
public class BSFigure<J extends BSFigure<J>>
		extends DivSimple<J>
{
	private ComponentHierarchyBase header;
	private TableCaption caption;

	/**
	 * Anytime you need to display a piece of content—like an image with an optional caption, consider using a figure.
	 * <p>
	 * Use the included .figure , .figure-img and .figure-caption classes to provide some baseline styles for the HTML5 figure and
	 * figcaption elements.
	 * <p>
	 * Images in figures have no explicit size, so be sure to add the .img-fluid class to your img to make it responsive.
	 *
	 * @param header
	 * @param caption
	 */
	public BSFigure(ComponentHierarchyBase header, TableCaption caption)
	{
		this();
		this.header = header;
		this.caption = caption;
	}

	/**
	 * Anytime you need to display a piece of content—like an image with an optional caption, consider using a figure.
	 * <p>
	 * Use the included .figure , .figure-img and .figure-caption classes to provide some baseline styles for the HTML5 figure and
	 * figcaption elements.
	 * <p>
	 * Images in figures have no explicit size, so be sure to add the .img-fluid class to your img to make it responsive.
	 */
	public BSFigure()
	{
		setTag(ComponentTypes.Figure.getComponentTag());
		addClass(ComponentTypes.Figure.getComponentTag());
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			add(getHeader());
			add(getCaption());
		}
		super.init();
	}

	/**
	 * Returns the header
	 *
	 * @return
	 */

	public ComponentHierarchyBase getHeader()
	{
		return header;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeader(ComponentHierarchyBase header)
	{
		this.header = header;
		if (this.header != null)
		{
			addClass(BSFigureOptions.Figure_Img);
		}
		return (J) this;
	}

	public TableCaption getCaption()
	{
		return caption;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setCaption(TableCaption caption, boolean right)
	{
		this.caption = caption;
		if (caption != null)
		{
			caption.addClass(BSFigureOptions.Figure_Caption);
			if (right)
			{
				caption.addClass(BSTypographyOptions.Text_Right);
			}
		}
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
