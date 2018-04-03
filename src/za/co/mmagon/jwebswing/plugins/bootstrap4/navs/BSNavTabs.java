package za.co.mmagon.jwebswing.plugins.bootstrap4.navs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.BSDropDown;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.tabs.BSTabContainer;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.interfaces.IBSNavTabs;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.parts.BSNavListItem;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.navs.BSNavsOptions.Nav_Item;

/**
 * Constructs the container for NS Nav Tabs
 *
 * @param <J>
 */
public class BSNavTabs<J extends BSNavTabs<J>>
		extends DivSimple<J>
		implements za.co.mmagon.jwebswing.plugins.bootstrap4.navs.interfaces.IBSNavTabs
{

	private final Set<BSTabContainer<?>> tabs;


	private final BSNavs<?> navs;
	private final Div tabContents;

	/**
	 * Constructs the container for NS Nav Tabs
	 */
	public BSNavTabs()
	{
		tabs = new LinkedHashSet<>();
		navs = new BSNavs<>();
		navs.setAsTabs(true);
		tabContents = new DivSimple();
		tabContents.addClass("tab-content");
	}

	public IBSNavTabs asMe()
	{
		return this;
	}

	/**
	 * Adds a tab to the BSNavTabs
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSTabContainer<?> addTab(String label, Div<?, ?, ?, ?, ?> content, boolean active)
	{
		BSTabContainer<?> tab = new BSTabContainer<>(active, content, label);
		BSNavListItem<?> listItem = navs.addItem(label, active);
		tab.setListItem(listItem);
		navs.remove(listItem);
		tabs.add(tab);
		return tab;
	}

	/**
	 * Returns the set of tabs currently registered
	 *
	 * @return
	 */
	@Override
	@NotNull
	public Set<BSTabContainer<?>> getTabs()
	{
		return tabs;
	}

	/**
	 * Returns the BS Navs Portion of the Tab Display
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSNavs<?> getNavs()
	{
		return navs;
	}

	/**
	 * Gets the Tab Group List for the contents
	 *
	 * @return
	 */
	@Override
	public Div getTabContents()
	{
		return tabContents;
	}

	/**
	 * Adds a drop down to the dav items.
	 * <p>
	 * Remember to add the drop down menu and select to the drop down! xD
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public BSTabContainer<?> addDropDownTab(String label, Div<?, ?, ?, ?, ?> content, boolean active)
	{
		BSTabContainer output = new BSTabContainer(active, tabContents, label);

		BSDropDown<?> dropDown = new BSDropDown<>();
		dropDown.setTag("li");
		List<String> newOrder = new ArrayList<>(dropDown.getClasses());
		newOrder.add(0, Nav_Item.toString());
		dropDown.setClasses(new LinkedHashSet<>(newOrder));

		output.setDropDownItem(dropDown);
		tabs.add(output);

		return output;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void preConfigure()
	{
		if (!isConfigured())
		{

			add(navs);
			add(tabContents);

			tabs.forEach(a ->
			             {
				             a.configure();
				             navs.add(a.getListItem());
				             tabContents.add(a.getTabPane());
			             });
		}
		super.preConfigure();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
