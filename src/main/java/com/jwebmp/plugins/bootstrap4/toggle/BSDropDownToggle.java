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
package com.jwebmp.plugins.bootstrap4.toggle;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.base.html.interfaces.children.ListChildren;
import com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * An implementation of the Bootstrap Toggle Feature
 * <p>
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@SuppressWarnings("unused")
public class BSDropDownToggle<J extends BSDropDownToggle<J>>
		extends Div<BSToggleChildren, BSToggleAttributes, BSToggleFeatures, BSToggleEvents, J>
		implements IBSDropDownToggle<J>
{

	public static final String ToggleString = "dropdown";
	private static final long serialVersionUID = 1L;
	/**
	 * The title component for this drop down
	 */
	private BSToggleChildren title;
	/**
	 * A list of the contents for this drop down
	 */
	private List<ListChildren, ?, ?, ?> contents;

	/**
	 * Construct a new toggle item with the given items
	 *
	 * @param titleItem
	 * 		Displays by default, clickable to show the contents
	 * @param contents
	 */
	@SuppressWarnings("unused")
	@NotNull
	public BSDropDownToggle(BSDropDownToggleTitleLink titleItem, List contents)
	{
		setTag(titleItem.getTag());
		setTitle(titleItem);
		setContents(contents);

	}

	/**
	 * Construct a new toggle item with the given items
	 *
	 * @param titleItem
	 * 		Displays by default, clickable to show the contents
	 * @param contents
	 */
	@SuppressWarnings("unused")
	@NotNull
	public BSDropDownToggle(BSDropDownToggleTitleButton titleItem, List contents)
	{
		setTag(titleItem.getTag());
		setTitle(titleItem);
		setContents(contents);

	}

	/**
	 * Sets the title
	 *
	 * @param title
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setTitle(BSDropDownToggleTitleButton title)
	{
		remove(this.title);
		this.title = title;
		if (title != null)
		{
			java.util.List tempList = new ArrayList<>(getChildren());
			tempList.add(0, this.title);
			setChildren(new LinkedHashSet<>(tempList));
			if (contents != null)
			{
				title.addAttribute(ButtonAttributes.Data_Target, contents.getID(true));
			}
		}
		return (J) this;
	}

	/**
	 * Returns the title component
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSToggleChildren getTitle()
	{
		return title;
	}

	/**
	 * Sets the title
	 *
	 * @param title
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setTitle(BSDropDownToggleTitleLink title)
	{
		remove(this.title);
		this.title = title;
		if (title != null)
		{
			java.util.List tempList = new ArrayList<>(getChildren());
			tempList.add(0, this.title);
			setChildren(new LinkedHashSet<>(tempList));
			if (contents != null)
			{
				title.addAttribute(LinkAttributes.Data_Target, contents.getID(true));
			}
		}
		return (J) this;
	}

	/**
	 * Returns the contents
	 *
	 * @return
	 */
	@Override
	@NotNull
	public List<ListChildren, ?, ?, ?> getContents()
	{
		return contents;
	}

	/**
	 * Sets the contents
	 *
	 * @param contents
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setContents(List contents)
	{
		this.contents = contents;

		if (contents != null)
		{
			contents.addClass(BSDropDownOptions.Dropdown_Menu);
			title.asAttributeBase()
			     .addAttribute(ButtonAttributes.Data_Target.toString(), contents.getID(true));
		}
		return (J) this;
	}

	/**
	 * As me
	 *
	 * @return
	 */
	public IBSDropDownToggle<J> asMe()
	{
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

}
