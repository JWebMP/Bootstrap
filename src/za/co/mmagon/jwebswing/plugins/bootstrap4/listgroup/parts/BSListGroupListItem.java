/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.parts;

import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.badge.BSBadge;
import za.co.mmagon.jwebswing.plugins.bootstrap4.badge.BSBadgeOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.BSListGroupChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.BSListGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.listgroup.IBSListGroupListItem;

import javax.validation.constraints.NotNull;

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

	private static final long serialVersionUID = 1L;

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
