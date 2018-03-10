package za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.tabs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSColumnOptions;

import javax.validation.constraints.NotNull;
import java.util.Set;

public interface IBSListGroupTabs<J extends BSListGroupTabs<J>>
{
	/**
	 * Sets the columns to ocuppy for the list group
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setLeftSidePaneOptions(BSColumnOptions columnOptions);

	/**
	 * Sets the columns to ocuppy for the content
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setRightSidePaneOptions(BSColumnOptions columnOptions);

	/**
	 * Adds a tab the container, it gets built on configure.
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	BSTabContainer<?> addTab(String label, Div<?, ?, ?, ?, ?> content, boolean active);

	/**
	 * Returns the set of tabs currently registered
	 *
	 * @return
	 */
	@NotNull
	Set<BSTabContainer<?>> getTabs();
}
