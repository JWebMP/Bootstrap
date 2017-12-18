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
package za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.InputTypes;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSComponentFormGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroupChildren;

/**
 * Denotes a bootstrap input type
 *
 * @author GedMarc
 * @since 17 Jan 2017
 */
public class BSInput<J extends BSInput<J>>
		extends Input<NoAttributes, J>
		implements BSFormGroupChildren
{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Allows construction of a bootstrap input component
	 */
	public BSInput()
	{
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
	/**
	 * Allows construction of a bootstrap input component
	 *
	 * @param inputType
	 */
	public BSInput(InputTypes inputType)
	{
		super(inputType);
		BootstrapPageConfigurator.setRequired(this, true);
	}
	
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addAttribute(GlobalAttributes.Name, getID());
			addClass(BSComponentFormGroupOptions.Form_Control);
		}
		super.preConfigure();
	}
}
