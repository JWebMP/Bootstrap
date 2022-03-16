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
package com.jwebmp.plugins.bootstrap.dropdown;

import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.*;
import com.jwebmp.plugins.bootstrap.buttons.*;
import com.jwebmp.plugins.bootstrap.dropdown.interfaces.*;
import com.jwebmp.plugins.bootstrap.dropdown.parts.*;
import com.jwebmp.plugins.bootstrap.navs.interfaces.*;
import jakarta.validation.constraints.*;

import static com.jwebmp.plugins.bootstrap.BSPlacements.*;
import static com.jwebmp.plugins.bootstrap.options.BSDisplayOptions.*;

/**
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included
 * Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 13 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Dropdown",
                      description = "Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive " +
                                    "with" +
                                    " the included Bootstrap dropdown JavaScript plugin. They’re toggled by clicking, not by hovering;" +
                                    "  this  is an intentional design  decision.",
                      url = "https://ng-bootstrap.github.io/#/components/dropdown/examples",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")

public class BSDropDown<J extends BSDropDown<J>>
		extends Div<GlobalChildren, NoAttributes, GlobalFeatures, BSDropDownEvents, J>
		implements IBSDropDown<J>, BSNavsChildren
{
	private Button<?,?,?,?,?> dropDownButton;
	private BSDropDownMenu<?> dropDownMenu;
	
	private BSPlacements placement;
	private boolean bodyContainer;
	private boolean dynamic;
	
	/**
	 * Construct a new bootstrap drop down
	 */
	public BSDropDown()
	{
		addAttribute("ngbDropdown", "");
		addClass(Inline_Block);
		dropDownButton = new BSButton<>();
		dropDownButton.addAttribute("ngbDropdownToggle","");
		dropDownMenu = new BSDropDownMenu<>();
		dropDownMenu.addAttribute("aria-labelledby", dropDownButton.getID());
	}
	
	@SuppressWarnings("unchecked")
	public J asLink()
	{
		if (this.dropDownButton != null)
		{
			dropDownButton.setTag("a");
			dropDownButton.addAttribute("role", "button");
			dropDownButton.addAttribute("tabindex", "0");
		}
		return (J) this;
	}
	
	@SuppressWarnings("unchecked")
	public J addItem(String text)
	{
		getDropDownMenu().addItem(text);
		return (J)this;
	}
	
	@SuppressWarnings("unchecked")
	public J addItem(IComponentHierarchyBase<?,?> component)
	{
		getDropDownMenu().add(component);
		return (J)this;
	}
	
	@Override
	public void init()
	{
		if (placement != null)
		{
			addAttribute("placement", placement.toString());
		}
		if (bodyContainer)
		{
			addAttribute("container", "body");
		}
		if (dynamic)
		{
			addAttribute("display", "dynamic");
		}
		add(dropDownButton);
		add(dropDownMenu);
		super.init();
	}
	
	@Override
	public @NotNull J setText(String text)
	{
		if (dropDownButton != null)
		{
			dropDownButton.setText(text);
		}
		return (J) this;
	}
	
	public Button<?, ?, ?, ?, ?> getDropDownButton()
	{
		return dropDownButton;
	}
	
	@SuppressWarnings("unchecked")
	public J setDropDownButton(Button<?, ?, ?, ?, ?> dropDownButton)
	{
		this.dropDownButton = dropDownButton;
		return (J)this;
	}
	
	public BSDropDownMenu<?> getDropDownMenu()
	{
		return dropDownMenu;
	}
	
	public J setDropDownMenu(BSDropDownMenu<?> dropDownMenu)
	{
		this.dropDownMenu = dropDownMenu;
		return (J)this;
	}
	
	public BSPlacements getPlacement()
	{
		return placement;
	}
	
	public J setPlacement(BSPlacements placement)
	{
		this.placement = placement;
		return (J)this;
	}
	
	public boolean isBodyContainer()
	{
		return bodyContainer;
	}
	
	public J setBodyContainer(boolean bodyContainer)
	{
		this.bodyContainer = bodyContainer;
		return (J)this;
	}
	
	public boolean isDynamic()
	{
		return dynamic;
	}
	
	public J setDynamic(boolean dynamic)
	{
		this.dynamic = dynamic;
		return (J)this;
	}
	
	/**
	 * A slimmer view of this class
	 *
	 * @return
	 */
	public IBSDropDown asMe()
	{
		return (IBSDropDown) this;
	}
}
