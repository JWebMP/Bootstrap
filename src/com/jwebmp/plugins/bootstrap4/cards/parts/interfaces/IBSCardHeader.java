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

package com.jwebmp.plugins.bootstrap4.cards.parts.interfaces;

import com.jwebmp.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardHeader;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardHeaderNav;
import com.jwebmp.plugins.bootstrap4.options.interfaces.IBSLayout;

import javax.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSCardHeader<J extends BSCardHeader<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>, IBSLayout<J>
{
	/**
	 * Adds a new tabbed header navigation item
	 *
	 * @return
	 */
	BSCardHeaderNav<?> addTabHeader();

	/**
	 * Adds a new tab header with a non null list of string headers
	 *
	 * @param headers
	 *
	 * @return
	 */
	BSCardHeaderNav<?> addTabHeader(@NotNull String[] headers);
}
