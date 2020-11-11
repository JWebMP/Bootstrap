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

import com.jwebmp.core.base.html.Table;
import com.jwebmp.plugins.bootstrap4.options.BSTableOptions;

import jakarta.validation.constraints.NotNull;

public class BSTable<J extends BSTable<J>>
		extends Table<J>
		implements IBSTable<J>
{
	/**
	 * Creates a new BS Table
	 */
	public BSTable()
	{
		addClass(BSTableOptions.Table);
	}

	/**
	 * The smaller neater version of this class
	 *
	 * @return
	 */
	public IBSTable<J> asMe()
	{
		return this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addTheme(BSTableOptions options)
	{
		addClass(options);
		return (J) this;
	}

	/**
	 * Sets this table as striped or not
	 *
	 * @param striped
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStriped(boolean striped)
	{
		if (striped)
		{
			addClass(BSTableOptions.Table_Striped);
		}
		else
		{
			removeClass(BSTableOptions.Table_Striped);
		}
		return (J) this;
	}

	/**
	 * Sets this table as bordered or not
	 *
	 * @param bordered
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBordered(boolean bordered)
	{
		if (bordered)
		{
			addClass(BSTableOptions.Table_Bordered);
		}
		else
		{
			removeClass(BSTableOptions.Table_Bordered);
		}
		return (J) this;
	}

	/**
	 * Forces the cells to fit on the screen
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J fitInContainerBreakAll()
	{
		addStyle("word-wrap:break-all;");
		return (J) this;
	}

	/**
	 * Forces the cells to fit on the screen
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J fitInContainerBreakWord()
	{
		addStyle("word-wrap:break-word;");
		return (J) this;
	}

	/**
	 * Add .table-hover to enable a hover state on table rows within a tbody.
	 *
	 * @param hovered
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHover(boolean hovered)
	{
		if (hovered)
		{
			addClass(BSTableOptions.Table_Hover);
		}
		else
		{
			removeClass(BSTableOptions.Table_Hover);
		}
		return (J) this;
	}

	/**
	 * Sets the table as small
	 *
	 * @param small
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSmall(boolean small)
	{
		if (small)
		{
			addClass(BSTableOptions.Table_Sm);
		}
		else
		{
			removeClass(BSTableOptions.Table_Sm);
		}
		return (J) this;
	}

	/**
	 * Sets the table as responsive
	 *
	 * @param responsive
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setResponsive(boolean responsive)
	{
		if (responsive)
		{
			addClass(BSTableOptions.Table_Responsive);
		}
		else
		{
			removeClass(BSTableOptions.Table_Responsive);
		}
		return (J) this;
	}

	/**
	 * Sets the table as responsive
	 *
	 * @param responsive
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setResponsive(BSTableOptions responsive)
	{
		addClass(responsive);
		return (J) this;
	}

	/**
	 * Forces the cells to fit on the screen, evenly spaced between
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEvenWidthCells()
	{
		addStyle("table-layout:fixed;");
		return (J) this;
	}
}
