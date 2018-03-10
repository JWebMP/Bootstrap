package za.co.mmagon.jwebswing.plugins.bootstrap4.navs.interfaces;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.tabs.BSTabContainer;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.BSNavs;

import javax.validation.constraints.NotNull;
import java.util.Set;

public interface IBSNavTabs

{
	/**
	 * Adds a tab to the BSNavTabs
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	@NotNull
	BSTabContainer<?> addTab(String label, Div<?, ?, ?, ?, ?> content, boolean active);


	/**
	 * Returns the set of tabs currently registered
	 *
	 * @return
	 */
	@NotNull
	Set<BSTabContainer<?>> getTabs();

	/**
	 * Returns the BS Navs Portion of the Tab Display
	 *
	 * @return
	 */
	@NotNull
	BSNavs<?> getNavs();

	/**
	 * Gets the Tab Group List for the contents
	 *
	 * @return
	 */
	Div getTabContents();
}
