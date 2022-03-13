package com.jwebmp.plugins.bootstrap.tables;

import com.jwebmp.plugins.bootstrap.options.BSTableOptions;

import jakarta.validation.constraints.NotNull;

public interface IBSTable<J extends BSTable<J>>
{
	
	@NotNull
	J addTheme(BSTableOptions options);

	/**
	 * Sets this table as striped or not
	 *
	 * @param striped
	 *
	 * @return
	 */
	
	@NotNull
	J setStriped(boolean striped);

	/**
	 * Sets this table as bordered or not
	 *
	 * @param bordered
	 *
	 * @return
	 */
	
	@NotNull
	J setBordered(boolean bordered);

	
	J fitInContainerBreakAll();

	
	J fitInContainerBreakWord();

	/**
	 * Add .table-hover to enable a hover state on table rows within a tbody.
	 *
	 * @param hovered
	 *
	 * @return
	 */
	
	@NotNull
	J setHover(boolean hovered);

	/**
	 * Sets the table as small
	 *
	 * @param small
	 *
	 * @return
	 */
	
	@NotNull
	J setSmall(boolean small);

	/**
	 * Sets the table as responsive
	 *
	 * @param responsive
	 *
	 * @return
	 */
	
	@NotNull
	J setResponsive(boolean responsive);

	/**
	 * Sets the table as responsive
	 *
	 * @param responsive
	 *
	 * @return
	 */
	
	@NotNull
	J setResponsive(BSTableOptions responsive);

	
	J setEvenWidthCells();
}
