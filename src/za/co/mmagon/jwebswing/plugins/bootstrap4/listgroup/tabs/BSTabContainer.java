package za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.tabs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.BSDropDown;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.BSListGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.parts.BSListGroupButtonItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.parts.BSNavListItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSDefaultOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.toggle.BSDropDownToggle;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.navs.BSNavsOptions.Nav_Link;

/**
 * A list group tab to add (Container)
 */
public class BSTabContainer<J extends BSTabContainer<J>>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	private boolean active;
	private boolean fade;

	private Div<?, ?, ?, ?, ?> tabPane;

	private BSListGroupButtonItem<?> buttonItem;
	private BSNavListItem<?> listItem;
	private BSDropDown<?> dropDownItem;


	public BSTabContainer(boolean active, @NotNull Div<?, ?, ?, ?, ?> tabContent, @Nullable String text)
	{
		this(tabContent, text);
		this.active = active;
	}

	@SuppressWarnings("unchecked")
	public BSTabContainer(Div<?, ?, ?, ?, ?> tabContent, String text)
	{
		tabPane = tabContent;
		buttonItem = new BSListGroupButtonItem<>();
		buttonItem.setText(text);
		listItem = new BSNavListItem<>(text);
		dropDownItem = new BSDropDown<>();
	}

	/**
	 * Configures the group tab
	 */
	@SuppressWarnings("unchecked")
	public void configure()
	{
		tabPane.addClass("tab-pane");
		if (fade)
		{
			tabPane.addClass(BSDefaultOptions.Fade);
		}
		if (active)
		{
			tabPane.addClass(BSDefaultOptions.Show);
			tabPane.addClass(BSListGroupOptions.Active);
			buttonItem.addClass(BSListGroupOptions.Active);
		}

		tabPane.addAttribute("role", "tabpanel");
		tabPane.addAttribute(GlobalAttributes.Aria_LabelledBy, getButtonItem().getID());

		buttonItem.addAttribute("role", "tab");
		buttonItem.addAttribute(BSButtonAttributes.Data_Toggle.toString(), "list");
		buttonItem.addAttribute("href", tabPane.getID(true));

		if (dropDownItem.getChildren()
		                .size() == 2)
		{
			Iterator iterator = dropDownItem.getChildren()
			                                .iterator();
			BSDropDownToggle menu = (BSDropDownToggle) iterator.next();
			List<String> newOrder = new ArrayList<>(menu.getClasses());
			newOrder.add(0, Nav_Link.toString());
			menu.setClasses(new LinkedHashSet<>(newOrder));


		}
	}

	/**
	 * Sets the button group item
	 *
	 * @return
	 */
	public BSListGroupButtonItem<?> getButtonItem()
	{
		return buttonItem;
	}

	/**
	 * Sets the button group item
	 *
	 * @param buttonItem
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setButtonItem(BSListGroupButtonItem<?> buttonItem)
	{
		this.buttonItem = buttonItem;
		return (J) this;
	}

	/**
	 * Set active or not
	 *
	 * @return
	 */
	public boolean isActive()
	{
		return active;
	}

	/**
	 * Sets active or not
	 *
	 * @param active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		this.active = active;
		return (J) this;
	}

	/**
	 * If fade is enabled
	 *
	 * @return
	 */
	public boolean isFade()
	{
		return fade;
	}

	/**
	 * If fade is enabled
	 *
	 * @param fade
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFade(boolean fade)
	{
		this.fade = fade;
		return (J) this;
	}

	/**
	 * Returns the tab pane
	 *
	 * @return
	 */
	public Div<?, ?, ?, ?, ?> getTabPane()
	{
		return tabPane;
	}

	/**
	 * Sets the tab pane
	 *
	 * @param tabPane
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTabPane(Div<?, ?, ?, ?, ?> tabPane)
	{
		this.tabPane = tabPane;
		return (J) this;
	}

	/**
	 * Returns the list item
	 *
	 * @return
	 */
	@NotNull
	public BSNavListItem<?> getListItem()
	{
		return listItem;
	}

	/**
	 * Sets the given list item
	 *
	 * @param listItem
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setListItem(@NotNull BSNavListItem<?> listItem)
	{
		this.listItem = listItem;
		return (J) this;
	}

	/**
	 * Returns a configure Drop Down Item
	 *
	 * @return
	 */
	public BSDropDown<?> getDropDownItem()
	{
		return dropDownItem;
	}

	/**
	 * Sets the drop down items
	 *
	 * @param dropDownItem
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDropDownItem(BSDropDown<?> dropDownItem)
	{
		this.dropDownItem = dropDownItem;
		return (J) this;
	}
}
