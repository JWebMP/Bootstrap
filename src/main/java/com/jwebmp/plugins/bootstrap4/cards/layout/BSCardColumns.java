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
package com.jwebmp.plugins.bootstrap4.cards.layout;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap4.BSSizes;
import com.jwebmp.plugins.bootstrap4.cards.BSCard;
import com.jwebmp.plugins.bootstrap4.cards.BSCardOptions;

import javax.validation.constraints.NotNull;
import java.util.EnumMap;
import java.util.Map;

/**
 * Columns
 * <p>
 * Cards can be organized into Masonry-like columns with just CSS by wrapping them in .card-columns. Cards are ordered from top to bottom
 * and left to right when wrapped in .card-columns.
 * <p>
 * Only applies to small devices and above.
 * <p>
 * Heads up! This is not available in IE9 and below as they have no support for the column-* CSS properties.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardColumns<J extends BSCardColumns<J>>
		extends Div<BSCard, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements GlobalChildren
{


	private Map<BSSizes, Integer> breakpointColumnCount;

	/**
	 * Columns
	 * <p>
	 * Cards can be organized into Masonry-like columns with just CSS by wrapping them in .card-columns. Cards are ordered from top to
	 * bottom and left to right when wrapped in .card-columns.
	 * <p>
	 * Only applies to small devices and above.
	 * <p>
	 * Heads up! This is not available in IE9 and below as they have no support for the column-* CSS properties.
	 */
	public BSCardColumns()
	{
		addClass(BSCardOptions.Card_Columns);
	}

	@Override
	@NotNull
	public StringBuilder renderCss(int tabCount, boolean renderOpening, boolean renderInQuotations, boolean isAjaxCall)
	{
		StringBuilder sb = super.renderCss(tabCount, renderOpening, renderInQuotations, isAjaxCall);

		sb.append(getID(true) + "{");
		getBreakpointColumnCount().forEach((key, value) -> sb.append(renderBreakpoint(key, value)));
		sb.append("}");
		return sb;
	}

	/**
	 * Returns the column break points to render in the css that this object generate for itself
	 *
	 * @return
	 */
	@NotNull
	public Map<BSSizes, Integer> getBreakpointColumnCount()
	{
		if (breakpointColumnCount == null)
		{
			breakpointColumnCount = new EnumMap<>(BSSizes.class);
		}
		return breakpointColumnCount;
	}

	private StringBuilder renderBreakpoint(BSSizes size, Integer columnCount)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("@include media-breakpoint-only(" + size + ") {" + "column-count: " + columnCount + ";" + "}");
		return sb;
	}

	/*
	Sets the breakpoint columnc ount for the given objects
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBreakpointColumnCount(Map<BSSizes, Integer> breakpointColumnCount)
	{
		this.breakpointColumnCount = breakpointColumnCount;
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
