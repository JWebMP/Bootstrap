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
package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets;

import za.co.mmagon.jwebswing.base.html.inputs.InputCheckBoxType;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSFormLabel;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroupOptions;

/**
 * A bootstrap formatted radio button
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSFormCheckGroup<J extends BSFormCheckGroup<J>>
		extends BSFormGroup<J, InputCheckBoxType<?>>
		implements BSFormSetChildren
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new instance of a group of items that denote a single radio button.
	 * <p>
	 * Place inside a BS Form Set
	 *
	 * @param label
	 * @param inputComponent
	 * @param helpText
	 * @param value
	 *
	 * @see BSFormSet
	 */
	public BSFormCheckGroup()
	{
		removeClass(BSFormGroupOptions.Form_Group);
		addClass(BSFormGroupOptions.Form_Check);
	}

	/**
	 * Adds the label and replaces the classses with the checkbox specific classes
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	public BSFormLabel<?> addLabel(String text)
	{
		BSFormLabel<?> label = super.addLabel(text);
		label.addClass(BSFormGroupOptions.Form_Check_Label);
		return label;
	}

	/**
	 * Adds the input with the additional settings for checkboxes
	 *
	 * @param inputComponent
	 *
	 * @return
	 */
	@Override
	public InputCheckBoxType<?> addInput(InputCheckBoxType<?> inputComponent)
	{
		InputCheckBoxType<?> checkBoxType = super.addInput(inputComponent);
		checkBoxType.removeClass(BSFormGroupOptions.Form_Control);
		checkBoxType.addClass(BSFormGroupOptions.Form_Check_Input);
		if (getLabel() != null)
		{
			remove(getLabel());
			add(getLabel());
		}
		return checkBoxType;
	}
}
