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
package com.jwebmp.plugins.bootstrap.buttons.switches;

import com.jwebmp.core.base.html.inputs.InputCheckBoxType;
import com.jwebmp.plugins.bootstrap.forms.BSFormLabel;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroup;

import jakarta.validation.constraints.NotNull;

import static com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormCustomControls.*;
import static com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupOptions.*;
import static com.jwebmp.plugins.bootstrap.options.BSDefaultOptions.*;

/**
 * A bootstrap formatted radio button
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSCustomSwitchGroup<J extends BSCustomSwitchGroup<J>>
		extends BSFormGroup<J, InputCheckBoxType<?>>
{

	/**
	 * Constructs a new instance of a group of items that denote a single radio button.
	 * <p>
	 * Place inside a BS Form Set
	 */
	public BSCustomSwitchGroup()
	{
		super();
		removeClass(Form_Group);
		addClass(Custom_Control);
		addClass(Custom_Switch);
		setCustomControl(false);
	}

	/**
	 * Constructs a new instance of a group of items that denote a single radio button.
	 * <p>
	 * Place inside a BS Form Set
	 */
	public BSCustomSwitchGroup(String label)
	{
		this();
		getLabel().setText(label);
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
		label.addClass(Custom_Control_Label);
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
	public InputCheckBoxType<?> setInput(InputCheckBoxType<?> inputComponent)
	{
		InputCheckBoxType<?> checkBoxType = super.setInput(inputComponent);
		checkBoxType.removeClass(Form_Control);
		checkBoxType.addClass(Custom_Control_Input);
		if (getLabel() != null)
		{
			remove(getLabel());
			add(getLabel());
		}
		return checkBoxType;
	}

	@Override
	public void init()
	{
		if(!isInitialized())
		{
			add(getInput());
			if(getLabel() != null)
			{
				add(getLabel());
			}
		}
		super.init();
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
		addClass(Custom_Switch);

		if (inline)
		{
			addClass(Custom_Control_Inline);
		}

		if (getLabel() != null)
		{
			getLabel().addClass(Custom_Control_Label);
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
			addClass(Custom_Control_Inline);
		}
		else
		{
			removeClass(Custom_Control_Inline);
		}
		return (J) this;
	}

	/**
	 * Sets the item as disabled
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("all")
	@NotNull
	public J setDisabled(boolean disabled)
	{
		if (disabled)
		{
			getInput().addClass(Disabled);
		}
		else
		{
			getInput().removeClass(Disabled);
		}
		return (J) this;
	}

}
