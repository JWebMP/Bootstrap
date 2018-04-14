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
package com.jwebmp.plugins.bootstrap4.tooltips;

import com.jwebmp.Component;
import com.jwebmp.Feature;
import com.jwebmp.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.bootstrap4.popovers.BSPopOverOptions;
import com.jwebmp.plugins.bootstrap4.popovers.interfaces.BSPopOverFeatures;

import static com.jwebmp.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class BSTooltipFeature
		extends Feature<BSPopOverOptions, BSTooltipFeature>
		implements BSPopOverFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public BSTooltipFeature(Component forComponent)
	{
		super("BootstrapPopoverFeature");
		setComponent(forComponent);
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

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public BSPopOverOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new BSPopOverOptions());
		}
		return super.getOptions();
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "tooltip(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine();
		addQuery(requiredString);
	}
}
