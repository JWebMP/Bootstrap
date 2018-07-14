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

package com.jwebmp.plugins.bootstrap4.tables;

import com.jwebmp.base.html.TableRow;
import com.jwebmp.plugins.bootstrap4.options.BSBackgroundOptions;
import com.jwebmp.plugins.bootstrap4.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public class BSTableRow<J extends BSTableRow<J>>
		extends TableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 *
	 * @param tableRowClass
	 */
	public BSTableRow(BSTableOptions tableRowClass)
	{
		addClass(tableRowClass);
	}

	/**
	 * Creates a table row class with the given context
	 *
	 * @param tableRowClass
	 */
	public BSTableRow(BSBackgroundOptions tableRowClass)
	{
		addClass(tableRowClass);
	}
}
