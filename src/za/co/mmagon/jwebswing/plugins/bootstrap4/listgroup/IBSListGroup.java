package za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup;

import za.co.mmagon.jwebswing.base.html.interfaces.children.ListItemChildren;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.parts.BSListGroupButtonItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.parts.BSListGroupLinkItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.parts.BSListGroupListItem;

import javax.validation.constraints.NotNull;

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
	@SuppressWarnings("unchecked")
	@NotNull
	J setFlush();
}
