package com.jwebmp.plugins.bootstrap.listgroup.parts;

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.plugins.bootstrap.badge.BSBadge;
import com.jwebmp.plugins.bootstrap.badge.BSBadgeOptions;
import com.jwebmp.plugins.bootstrap.listgroup.BSListGroupChildren;
import com.jwebmp.plugins.bootstrap.listgroup.BSListGroupOptions;
import com.jwebmp.plugins.bootstrap.listgroup.IBSListGroupListItem;

import jakarta.validation.constraints.NotNull;

/**
 * Basic example The most basic list group is an unordered list with list items and the proper classes. Build upon it with the options that
 * follow, or with your own CSS as needed.
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSListGroupListItem<J extends BSListGroupListItem<J>>
		extends ListItem<J>
		implements BSListGroupChildren, IBSListGroupListItem<J>
{


	/**
	 * Basic example The most basic list group is an unordered list with list items and the proper classes. Build upon it with the options
	 * that follow, or with your own CSS as needed.
	 */
	public BSListGroupListItem()
	{
		addClass(BSListGroupOptions.List_Group_Item);
	}

	/**
	 * Basic example The most basic list group is an unordered list with list items and the proper classes. Build upon it with the options
	 * that follow, or with your own CSS as needed.
	 *
	 * @param text
	 */
	public BSListGroupListItem(String text)
	{
		super(text);
		addClass(BSListGroupOptions.List_Group_Item);
	}

	/**
	 * Adds a badge to the list item
	 *
	 * @param text
	 *
	 * @return
	 */
	@NotNull
	public BSBadge<?> addBadge(String text, boolean asPills, BSBadgeOptions... options)
	{
		BSBadge<?> badge = new BSBadge<>(text, asPills, options);
		badge.setText(text);
		add(badge);
		addClass("d-flex");
		addClass("justify-content-between");
		addClass("align-items-center");
		return badge;
	}

	/**
	 * Active items Add .active to a .list-group-item to indicate the current active selection.
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive()
	{
		addClass(BSListGroupOptions.Active);
		return (J) this;
	}

	/**
	 * Contextual classes Use contextual classes to style list items with a stateful background and color.
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDanger()
	{
		addClass(BSListGroupOptions.List_Group_Item_Danger);
		return (J) this;
	}

	/**
	 * Disabled items Add .disabled to a .list-group-item to make it appear disabled. Note that some elements with .disabled will also
	 * require custom JavaScript to fully disable their click events
	 * (e.g., links).
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled()
	{
		addClass(BSListGroupOptions.Disabled);
		return (J) this;
	}

	/**
	 * Contextual classes Use contextual classes to style list items with a stateful background and color.
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInfo()
	{
		addClass(BSListGroupOptions.List_Group_Item_Info);
		return (J) this;
	}

	/**
	 * Contextual classes Use contextual classes to style list items with a stateful background and color.
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSuccess()
	{
		addClass(BSListGroupOptions.List_Group_Item_Success);
		return (J) this;
	}

	/**
	 * Contextual classes Use contextual classes to style list items with a stateful background and color.
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setWarning()
	{
		addClass(BSListGroupOptions.List_Group_Item_Warning);
		return (J) this;
	}

}
