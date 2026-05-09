package com.jwebmp.plugins.bootstrap.toggle;

import com.jwebmp.core.base.html.List;

import jakarta.validation.constraints.NotNull;

public interface IBSDropDownToggle<J extends BSDropDownToggle<J>>
{
	/**
	 * Sets the title
	 *
	 * @param title
	 */
	
	@NotNull
	J setTitle(BSDropDownToggleTitleButton<?> title);

	/**
	 * Returns the title component
	 *
	 * @return
	 */
	@NotNull
	BSToggleChildren getTitle();

	/**
	 * Sets the title
	 *
	 * @param title
	 */
	
	@NotNull
	J setTitle(BSDropDownToggleTitleLink<?> title);

	/**
	 * Returns the contents
	 *
	 * @return
	 */
	@NotNull
	List<?, ?, ?, ?> getContents();

	/**
	 * Sets the contents
	 *
	 * @param contents
	 */
	
	@NotNull
	J setContents(List<?,?,?,?> contents);
}
