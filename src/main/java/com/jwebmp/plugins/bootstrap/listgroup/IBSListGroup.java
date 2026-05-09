package com.jwebmp.plugins.bootstrap.listgroup;

import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.listgroup.parts.BSListGroupButtonItem;
import com.jwebmp.plugins.bootstrap.listgroup.parts.BSListGroupLinkItem;
import com.jwebmp.plugins.bootstrap.listgroup.parts.BSListGroupListItem;

import jakarta.validation.constraints.NotNull;

public interface IBSListGroup<J extends BSListGroup<J>>
		extends ICssStructure<J>
{
	/**
	 * Adds a new button item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@NotNull
	BSListGroupButtonItem<?> addButtonItem(String text);

	@NotNull
	BSListGroupButtonItem<?> addButtonItem(ListItemChildren icon, String text);

	/**
	 * Adds a new link item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@NotNull
	BSListGroupLinkItem<?> addLinkItem(String text);

	/**
	 * Adds a new listem item to the list group
	 *
	 * @param text
	 *
	 * @return
	 */
	@NotNull
	BSListGroupListItem<?> addListItem(String text);

	/**
	 * Flush
	 * Add .list-group-flush to remove some borders and rounded corners to render list group items edge-to-edge in a parent container (e
	 * .g.,
	 * cards).
	 *
	 * @return
	 */
	@NotNull
	J setFlush();
}
