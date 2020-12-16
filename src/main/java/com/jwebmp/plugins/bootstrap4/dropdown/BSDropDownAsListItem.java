/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.bootstrap4.dropdown;

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.dropdown.interfaces.IBSDropDownAsListItem;
import com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownButton;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownMenu;
import com.jwebmp.plugins.bootstrap4.toggle.BSDropDownToggle;

/**
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included
 * Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 13 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Dropdown",
		description = "Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive " +
		              "with" +
		              " the included Bootstrap dropdown JavaScript plugin. They’re toggled by clicking, not by hovering;" +
		              "  this  is an intentional design  decision.",
		url = "https://v4-alpha.getbootstrap.com/components/dropdowns/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSDropDownAsListItem<J extends BSDropDownAsListItem<J>>
		extends ListItem<J>
		implements IBSDropDownAsListItem<J>
{
	private final BSDropDownMenu<?> menu = new BSDropDownMenu<>();

	/**
	 * Construct a new bootstrap drop down
	 */
	public BSDropDownAsListItem()
	{
		addClass(BSDropDownOptions.Dropdown);
	}

	/**
	 * A slimmer view of this class
	 *
	 * @return
	 */
	public BSDropDownAsListItem<J> asMe()
	{
		return this;
	}

	/**
	 * adds a default drop down button
	 *
	 * @return
	 */
	@Override
	public BSDropDownButton<?> addDropDownButton()
	{
		BSDropDownButton<?> button = new BSDropDownButton<>();
		add(button);
		return button;
	}

	/**
	 * adds a default drop down button
	 *
	 * @return
	 */
	@Override
	public BSDropDownToggle<?> addDropDownToggle(BSDropDownToggle<?> toggle)
	{
		add(toggle);
		return toggle;
	}

	@Override
	public BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions)
	{
		return addDropDownButton(buttonOptions, null);
	}

	/**
	 * Adds the drop down button to the drop down (add before menu)
	 *
	 * @param buttonOptions
	 *
	 * @return
	 */
	@Override
	public BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions, BSButtonSizeOptions sizeOptions)
	{
		BSDropDownButton<?> button = new BSDropDownButton<>();
		button.addClass(buttonOptions);
		if (sizeOptions != null)
		{
			button.addClass(sizeOptions);
			removeClass(BSDropDownOptions.Dropdown);
			addClass(BSButtonOptions.Btn_Group);
		}
		add(button);
		return button;
	}

	/**
	 * Adds the menu to the drop down (call after button)
	 *
	 * @return
	 */
	@Override
	public BSDropDownMenu<?> addDropDownMenu()
	{
		if (!getChildren().contains(menu))
		{
			add(menu);
		}
		return menu;
	}

	public BSDropDownMenu<?> getMenu()
	{
		if (!getChildren().contains(menu))
		{
			add(menu);
		}
		return menu;
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
