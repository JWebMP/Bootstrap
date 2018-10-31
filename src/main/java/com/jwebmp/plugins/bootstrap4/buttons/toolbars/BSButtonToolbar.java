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
package com.jwebmp.plugins.bootstrap4.buttons.toolbars;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Button toolbar
 * <p>
 * Combine sets of button groups into button toolbars for more complex components.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Toolbar",
		description = "Combine sets of button groups into button toolbars for more complex components. Use utility classes as needed to " + "space out groups, buttons, and more.",
		url = "https://v4-alpha.getbootstrap.com/components/button-group/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSButtonToolbar<J extends BSButtonToolbar<J>>
		extends Div<BSButtonToolbarChildren, BSButtonToolbarAttributes, GlobalFeatures, BSButtonToolbarEvents, J>
		implements IBSButtonToolbar
{


	/**
	 * Button toolbar
	 * <p>
	 * Combine sets of button groups into button toolbar for more complex components.
	 */
	public BSButtonToolbar()
	{
		addAttribute(BSButtonToolbarAttributes.Role, "toolbar");
		addClass(BSButtonToolbarAttributes.Btn_Toolbar.toString());

	}

	/**
	 * Sets the screen reader label for this group
	 *
	 * @param label
	 *
	 * @return
	 */
	@Override
	public final BSButtonToolbar setAriaLabel(String label)
	{
		addAttribute(GlobalAttributes.Aria_Label, label);
		return this;
	}

	/**
	 * Neater representation
	 *
	 * @return
	 */
	public IBSButtonToolbar asMe()
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
