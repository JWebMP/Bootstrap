package com.jwebmp.plugins.bootstrap4.navs.interfaces;

import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap4.navs.BSNavs;
import com.jwebmp.plugins.bootstrap4.navs.parts.BSNavListItem;
import com.jwebmp.plugins.bootstrap4.options.BSAlignmentHorizontalOptions;

import jakarta.validation.constraints.NotNull;

public interface IBSNavs<J extends BSNavs<J>>
		extends ICssStructure<J>
{
	/**
	 * Sets the actual alignment for the links, centered and right are good ones
	 *
	 * @param options
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setHorizontalAlignment(BSAlignmentHorizontalOptions options);

	/**
	 * Stack your navigation by changing the flex item direction with the .flex-column utility. Need to stack them on some viewports but
	 * not
	 * others? Use the responsive versions (e.g., .flex-sm-column).
	 *
	 * @param vertical
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setVertical(boolean vertical);

	/**
	 * Tabs
	 * Takes the basic nav from above and adds the .nav-tabs class to generate a tabbed interface. Use them to create tabbable regions with
	 * our tab JavaScript plugin.
	 *
	 * @param asTabs
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setAsTabs(boolean asTabs);

	/**
	 * Adds a new item to the collection
	 *
	 * @param name
	 * @param active
	 *
	 * @return
	 */
	@NotNull
	BSNavListItem<?> addItem(String name, boolean active);

	/**
	 * Adds a new item to the collection
	 *
	 * @param name
	 * @param active
	 * @param disabled
	 *
	 * @return
	 */

	@NotNull
	BSNavListItem<?> addItem(String name, boolean active, boolean disabled);

	@NotNull BSNavListItem<?> addItem(ListItemChildren<?, ?> name, boolean active);

	@NotNull BSNavListItem<?> addItem(ListItemChildren<?, ?> name, boolean active, boolean disabled);

    /**
	 * If the tabls should render as pills
	 *
	 * @param asPills
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setAsPills(boolean asPills);

	/**
	 * Fill and justify
	 * Force your .nav’s contents to extend the full available width one of two modifier classes. To proportionately fill all available
	 * space with your .nav-items, use .nav-fill. Notice that all horizontal space is occupied, but not every nav item has the same width.
	 *
	 * @param fill
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setFill(boolean fill);

	/**
	 * Adds a new item to the collection
	 *
	 * @param name
	 *
	 * @return
	 */
	@NotNull
	BSNavListItem<?> addItem(String name);

	/**
	 * Sets the buttons to equal width layout
	 *
	 * @param equalWidth
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setEqualWidth(boolean equalWidth);

	/**
	 * Adds a drop down to the dav items
	 *
	 * @return
	 */
	@NotNull
	BSDropDown<?> addDropDown();
}
