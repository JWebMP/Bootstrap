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
package com.jwebmp.plugins.bootstrap.containers;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.children.FieldSetChildren;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap.forms.BSFormChildren;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroupChildren;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSAlignmentCapable;

import jakarta.validation.constraints.NotNull;

import static com.jwebmp.plugins.bootstrap.options.BSContainerOptions.*;

/**
 * Rows are horizontal groups of columns that ensure your columns are lined up properly.
 * <p>
 * Content should be placed within columns, and only columns may be immediate children of rows.
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 7, 2016
 */
public class BSRow<J extends BSRow<J>>
		extends Div<com.jwebmp.core.base.html.interfaces.GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSFormChildren, BSFormGroupChildren, FieldSetChildren,
				           IBSAlignmentCapable<J>,BSContainerChildren
{
	/**
	 * Rows are horizontal groups of columns that ensure your columns are lined up properly.
	 * <p>
	 * Content should be placed within columns, and only columns may be immediate children of rows.
	 */
	public BSRow()
	{
		addClass(Row);
	}

	/**
	 * Static creator for a new BSRow
	 *
	 * @return
	 */
	public static BSRow<?> newInstance()
	{
		return new BSRow<>();
	}

	/**
	 * Sets padding and margin left nad right to 0 on the element
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J resetHorizontalSinks()
	{
		addStyle("margin-left:0px;margin-right:0px;padding-left:0px;padding-right:0px;");
		return (J) this;
	}
}
