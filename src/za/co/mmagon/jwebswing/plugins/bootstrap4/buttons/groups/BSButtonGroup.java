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
package za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups.interfaces.BSButtonGroupChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups.interfaces.BSButtonGroupEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups.interfaces.IBSButtonGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups.options.BSButtonGroupSizeOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.toolbars.BSButtonToolbarChildren;

import javax.validation.constraints.NotNull;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups.BSButtonGroupAttributes.Data_Toggle;
import static za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups.BSButtonGroupAttributes.Role;
import static za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups.options.BSButtonGroupOptions.Btn_Group;

/**
 * Button group
 * <p>
 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style behavior
 * with our buttons plugin.
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 01 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Button Groups",
		description = "Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and " +
				              "checkbox style behavior with our buttons plugin.",
		url = "https://v4-alpha.getbootstrap.com/components/button-group/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSButtonGroup<J extends BSButtonGroup<J>>
		extends Div<BSButtonGroupChildren, BSButtonGroupAttributes, GlobalFeatures, BSButtonGroupEvents, J>
		implements BSButtonToolbarChildren, IBSButtonGroup
{

	private static final long serialVersionUID = 1L;

	/**
	 * Button group
	 * <p>
	 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style
	 * behavior with our buttons plugin.
	 */
	public BSButtonGroup()
	{
		this(null);
	}

	/**
	 * Button group
	 * <p>
	 * Group a series of buttons together on a single line with the button group. Add on optional JavaScript radio and checkbox style
	 * behavior with our buttons plugin.
	 */
	public BSButtonGroup(String optionalArialLabel)
	{
		if (optionalArialLabel != null)
		{
			setAriaLabel(optionalArialLabel);
		}
		addClass(Btn_Group);
		addAttribute(Data_Toggle, "buttons");
		addAttribute(Role, "group");
	}

	/**
	 * Sets the screen reader label for this group
	 *
	 * @param label
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setAriaLabel(String label)
	{
		addAttribute(GlobalAttributes.Aria_Label, label);
		return (J) this;
	}

	/**
	 * Sizes
	 * <p>
	 * Fancy larger or smaller buttons? Add .btn-lg or .btn-sm for additional sizes.
	 *
	 * @param size
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSize(BSButtonGroupSizeOptions size)
	{
		for (BSButtonGroupSizeOptions value : BSButtonGroupSizeOptions.values())
		{
			removeClass(value.toString());
		}
		addClass(size);
		return (J) this;
	}

	/**
	 * Neater view
	 *
	 * @return
	 */
	public IBSButtonGroup asMe()
	{
		return this;
	}
}
