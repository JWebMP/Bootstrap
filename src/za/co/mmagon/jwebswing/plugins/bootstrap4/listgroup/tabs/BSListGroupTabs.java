package za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.tabs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.bootstrap4.containers.BSRow;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.BSListGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSColumnOptions;

import javax.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.Set;

public class BSListGroupTabs<J extends BSListGroupTabs<J>>
		extends BSRow<J>
		implements IBSListGroupTabs<J>
{
	private final Set<BSTabContainer<?>> tabs;


	private BSListGroup<?> listGroup;

	private DivSimple<?> leftSidePane;
	private DivSimple<?> rightSidePane;

	private DivSimple<?> tabContentHolder;

	/**
	 * A vertical list group controlling the display of content on the left
	 */
	public BSListGroupTabs()
	{
		listGroup = new BSListGroup<>();
		listGroup.setTag("div");
		listGroup.addAttribute("role", "tablist");

		leftSidePane = new DivSimple<>();
		leftSidePane.addClass(BSColumnOptions.Col_4);

		rightSidePane = new DivSimple<>();
		rightSidePane.addClass(BSColumnOptions.Col_8);

		tabContentHolder = new DivSimple<>();
		tabContentHolder.addClass("tab-content");

		tabs = new LinkedHashSet<>();
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			add(leftSidePane);
			leftSidePane.add(listGroup);
			add(rightSidePane);
			rightSidePane.add(tabContentHolder);
			tabs.forEach(a ->
			             {
				             a.configure();
				             listGroup.add(a.getButtonItem());
				             tabContentHolder.add(a.getTabPane());
			             });
		}
		super.preConfigure();
	}

	/**
	 * A better smaller neater view
	 *
	 * @return
	 */
	public IBSListGroupTabs<J> asMe()
	{
		return this;
	}


	/**
	 * Sets the columns to ocuppy for the list group
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setLeftSidePaneOptions(BSColumnOptions columnOptions)
	{
		leftSidePane.addClass(columnOptions);
		return (J) this;
	}

	/**
	 * Sets the columns to ocuppy for the content
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setRightSidePaneOptions(BSColumnOptions columnOptions)
	{
		rightSidePane.addClass(columnOptions);
		return (J) this;
	}

	/**
	 * Adds a tab the container, it gets built on configure.
	 *
	 * @param label
	 * @param content
	 * @param active
	 *
	 * @return
	 */
	@Override
	public BSTabContainer<?> addTab(String label, Div<?, ?, ?, ?, ?> content, boolean active)
	{
		BSTabContainer<?> tab = new BSTabContainer<>(active, content, label);
		getTabs().add(tab);
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
