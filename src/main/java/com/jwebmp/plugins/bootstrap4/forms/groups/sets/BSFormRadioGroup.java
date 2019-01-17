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
package com.jwebmp.plugins.bootstrap4.forms.groups.sets;

import com.jwebmp.core.base.html.inputs.InputRadioType;
import com.jwebmp.plugins.bootstrap4.forms.BSFormLabel;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupOptions;

import javax.validation.constraints.NotNull;

/**
 * A bootstrap formatted radio button
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSFormRadioGroup<J extends BSFormRadioGroup<J>>
		extends BSFormGroup<J, InputRadioType<?>>
{


	/**
	 * Constructs a new instance of a group of items that denote a single radio button.
	 * <p>
	 * Place inside a BS Form Set
	 */
	public BSFormRadioGroup()
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
	public InputRadioType<?> setInput(InputRadioType<?> inputComponent)
	{
		InputRadioType<?> radioCheckBoxType = super.setInput(inputComponent);
		radioCheckBoxType.removeClass(BSFormGroupOptions.Form_Control);
		radioCheckBoxType.addClass(BSFormGroupOptions.Form_Check_Input);
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
		removeClass(BSFormGroupOptions.Form_Group);
		removeClass(BSFormGroupOptions.Form_Check);
		removeClass(BSFormGroupOptions.Form_Check_Inline);

		addClass("custom-control");
		addClass("custom-radio");

		if (inline)
		{
			addClass("custom-control-inline");
		}

		if (getLabel() != null)
		{
			getLabel().addClass("custom-control-label");
			getLabel().addClass(BSFormGroupOptions.Form_Check_Label);
		}
		if (getInput() != null)
		{
			getInput().removeClass(BSFormGroupOptions.Form_Control);
			getInput().removeClass(BSFormGroupOptions.Form_Check_Input);
			getInput().addClass("custom-control-input");
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
			removeClass(BSFormGroupOptions.Form_Check);
			addClass(BSFormGroupOptions.Form_Check_Input);
		}
		else
		{
			addClass(BSFormGroupOptions.Form_Check);
			removeClass(BSFormGroupOptions.Form_Check_Input);
		}
		return (J) this;
	}
}
