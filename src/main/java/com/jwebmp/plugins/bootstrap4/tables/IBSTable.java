package com.jwebmp.plugins.bootstrap4.tables;

import com.jwebmp.plugins.bootstrap4.options.BSTableOptions;

import javax.validation.constraints.NotNull;

public interface IBSTable<J extends BSTable<J>>
{
	@SuppressWarnings("unchecked")
	@NotNull
	J addTheme(BSTableOptions options);

	/**
	 * Sets this table as striped or not
	 *
	 * @param striped
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setStriped(boolean striped);

	/**
	 * Sets this table as bordered or not
	 *
	 * @param bordered
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setBordered(boolean bordered);

	@SuppressWarnings("unchecked")
	J fitInContainer();

	/**
	 * Add .table-hover to enable a hover state on table rows within a tbody.
	 *
	 * @param hovered
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setHover(boolean hovered);

	/**
	 * Sets the table as small
	 *
	 * @param small
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setSmall(boolean small);

	/**
	 * Sets the table as responsive
	 *
	 * @param responsive
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setResponsive(boolean responsive);

	/**
	 * Sets the table as responsive
	 *
	 * @param responsive
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setResponsive(BSTableOptions responsive);
}
