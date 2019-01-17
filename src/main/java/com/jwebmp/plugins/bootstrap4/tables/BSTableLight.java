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

package com.jwebmp.plugins.bootstrap4.tables;

import com.jwebmp.plugins.bootstrap4.options.BSTableOptions;

/**
 * A dark themed table
 *
 * @param <J>
 */
public class BSTableLight<J extends BSTableLight<J>>
		extends BSTable<J>
{
	/**
	 * A dark themed table
	 */
	public BSTableLight()
	{
		addClass(BSTableOptions.Table_Light);
	}
}
