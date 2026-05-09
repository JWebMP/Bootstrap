package com.jwebmp.plugins.bootstrap.listgroup;

import com.jwebmp.plugins.bootstrap.listgroup.parts.BSListGroupListItem;

/**
 * @param <J>
 *
 * @author GedMarc
 * @since 21 Feb 2017
 */
public interface IBSListGroupListItem<J extends BSListGroupListItem>
{

	/**
	 * Active items Add .active to a .list-group-item to indicate the current active selection.
	 *
	 * @return
	 */
	J setActive();

	/**
	 * Contextual classes Use contextual classes to style list items with a stateful background and color.
	 *
	 * @return
	 */
	J setDanger();

	/**
	 * Disabled items Add .disabled to a .list-group-item to make it appear disabled. Note that some elements with .disabled will also
	 * require custom JavaScript to fully disable their click events
	 * (e.g., links).
	 *
	 * @return
	 */
	J setDisabled();

	/**
	 * Contextual classes Use contextual classes to style list items with a stateful background and color.
	 *
	 * @return
	 */
	J setInfo();

	/**
	 * Contextual classes Use contextual classes to style list items with a stateful background and color.
	 *
	 * @return
	 */
	J setSuccess();

	/**
	 * Contextual classes Use contextual classes to style list items with a stateful background and color.
	 *
	 * @return
	 */
	J setWarning();

}
