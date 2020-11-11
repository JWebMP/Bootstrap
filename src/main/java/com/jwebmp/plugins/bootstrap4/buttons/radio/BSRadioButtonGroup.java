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
package com.jwebmp.plugins.bootstrap4.buttons.radio;

import com.jwebmp.core.base.html.inputs.InputRadioType;
import com.jwebmp.plugins.bootstrap4.forms.BSFormLabel;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;

import jakarta.validation.constraints.NotNull;

import static com.jwebmp.plugins.bootstrap4.forms.groups.enumerations.BSFormCustomControls.*;
import static com.jwebmp.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupOptions.*;

/**
 * A bootstrap formatted radio button
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSRadioButtonGroup<J extends BSRadioButtonGroup<J>>
		extends BSFormGroup<J, InputRadioType<?>>
{


	/**
	 * Constructs a new instance of a group of items that denote a single radio button.
	 * <p>
	 * Place inside a BS Form Set
	 */
	public BSRadioButtonGroup()
	{
		removeClass(Form_Group);
		addClass(Form_Check);
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
		label.addClass(Form_Check_Label);
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
	public InputRadioType<?> setInput(InputRadioType<?> inputComponent)
	{
		InputRadioType<?> radioCheckBoxType = super.setInput(inputComponent);
		radioCheckBoxType.removeClass(Form_Control);
		radioCheckBoxType.addClass(Form_Check_Input);
		if (getLabel() != null)
		{
			remove(getLabel());
			add(getLabel());
		}
		return radioCheckBoxType;
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCustomControl(boolean inline)
	{
		removeClass(Form_Group);
		removeClass(Form_Check);
		removeClass(Form_Check_Inline);

		addClass(Custom_Control);
		addClass(Custom_Radio);

		if (inline)
		{
			addClass(Custom_Control_Inline);
		}

		if (getLabel() != null)
		{
			getLabel().addClass(Custom_Control_Label);
			getLabel().addClass(Form_Check_Label);
		}
		if (getInput() != null)
		{
			getInput().removeClass(Form_Control);
			getInput().removeClass(Form_Check_Input);
			getInput().addClass(Custom_Control_Input);
		}
		return (J) this;
	}

	/**
	 * Group checkboxes or radios on the same horizontal row by adding .form-check-inline to any .form-check.
	 *
	 * @param inline
	 *
	 * @return
	 */
	@SuppressWarnings("all")
	@NotNull
	public J setInline(boolean inline)
	{
		if (inline)
		{
			removeClass(Form_Check);
			addClass(Form_Check_Input);
		}
		else
		{
			addClass(Form_Check);
			removeClass(Form_Check_Input);
		}
		return (J) this;
	}
}
