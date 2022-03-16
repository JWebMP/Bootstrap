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
package com.jwebmp.plugins.bootstrap.forms;

import com.jwebmp.core.base.angular.forms.AngularForm;
import com.jwebmp.core.base.angular.modules.services.angular.forms.*;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.inputs.*;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap.buttons.checkbox.BSCheckBoxGroup;
import com.jwebmp.plugins.bootstrap.buttons.radio.BSRadioButtonGroup;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupOptions;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.bootstrap.forms.interfaces.IBSForm;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap.options.BSAlignmentVerticalOptions;

import jakarta.validation.constraints.NotNull;

import static com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupOptions.Form_Horizontal;

/**
 * Forms
 * <p>
 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 14 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Forms",
                      description = "Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety " + "of forms.",
                      url = "https://v4-alpha.getbootstrap.com/components/forms/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSForm<J extends BSForm<J>>
		extends AngularForm<J>
		implements IBSForm<J>,
		           BSNavBarChildren
{
	private boolean styleInputs;
	
	public BSForm()
	{
		this(null);
	}
	
	public BSForm(FormDataService<?> formDataService)
	{
		super(formDataService);
		addAttribute("no-validation", "");
	}
	
	/**
	 * Returns the slimmer version
	 *
	 * @return
	 */
	public IBSForm<J> asMe()
	{
		return this;
	}
	
	@Override
	public BSFormGroup<?, InputTextType<?>> createTextInput(String binding, String label)
	{
		BSFormGroup<?, InputTextType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputTextType<?> inputTextType = new InputTextType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputTextType<?>> createTextInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTextType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputTextType<?> inputTextType = new InputTextType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	public BSFormInputGroup<?, InputTextType<?>> createTextInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTextType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputTextType<?> inputTextType = new InputTextType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	public BSFormGroup<?, InputTextType<?>> createTextInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputTextType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputTextType<?> inputTextType = new InputTextType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	@Override
	public BSFormInputGroup<?, InputColourType<?>> createColourInput(String binding, String label)
	{
		BSFormInputGroup<?, InputColourType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		InputColourType<?> inputTextType = new InputColourType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}


	@Override
	public BSFormGroup<?, InputSearchType<?>> createSearchInput(String binding, String label)
	{
		BSFormGroup<?, InputSearchType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputSearchType<?> inputTextType = new InputSearchType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputSearchType<?>> createSearchInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputSearchType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputSearchType<?> inputTextType = new InputSearchType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputPasswordType<?>> createPasswordInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputPasswordType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputPasswordType<?> inputTextType = new InputPasswordType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormGroup<?, InputTextAreaType<?>> createTextArea(String binding, String label)
	{
		BSFormGroup<?, InputTextAreaType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);
		
		InputTextAreaType<?> inputTextType = new InputTextAreaType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputTextAreaType<?>> createTextArea(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTextAreaType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputTextAreaType<?> inputTextType = new InputTextAreaType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormGroup<?, InputEmailType<?>> createEmailInput(String binding, String label)
	{
		BSFormGroup<?, InputEmailType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputEmailType<?> inputEmailType = new InputEmailType<>();
		group.setInput(inputEmailType);
		inputEmailType.bind(binding);
		
		return group;
	}

	public BSFormGroup<?, InputSelectType<?>> createSelectDropdown(String binding, BSFormLabel<?> label, boolean multiple, boolean styled, Boolean largeOrSmall)
	{
		BSFormGroup<?, InputSelectType<?>> group = createSelectDropdown(binding, label);
		group.setForm(this);
		group.getInput()
				.setMultiple(multiple);
		if (styled)
		{
			addClass("custom-select");
			if (largeOrSmall != null)
			{
				if (largeOrSmall)
				{
					addClass("custom-select-lg");
				}
				else
				{
					addClass("custom-select-sm");
				}
			}
		}
		return group;
	}

	public  BSFormInputGroup<?, InputEmailType<?>> createEmailInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputEmailType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputEmailType<?> inputEmailType = new InputEmailType<>();
		group.setInput(inputEmailType);
		inputEmailType.bind(binding);

		return group;
	}

	public BSFormGroup<?, InputEmailType<?>> createEmailInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputEmailType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputEmailType<?> inputEmailType = new InputEmailType<>();
		group.setInput(inputEmailType);
		inputEmailType.bind(binding);

		return group;
	}

	public BSFormInputGroup<?, InputTextAreaType<?>> createTextArea(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTextAreaType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputTextAreaType<?> inputTextType = new InputTextAreaType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	public BSFormGroup<?, InputTextAreaType<?>> createTextArea(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputTextAreaType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTextAreaType<?> inputTextType = new InputTextAreaType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	public  BSFormInputGroup<?, InputPasswordType<?>> createPasswordInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputPasswordType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputPasswordType<?> inputTextType = new InputPasswordType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	public  BSFormInputGroup<?, InputSearchType<?>> createSearchInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputSearchType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputSearchType<?> inputTextType = new InputSearchType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	public  BSFormGroup<?, InputSearchType<?>> createSearchInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputSearchType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputSearchType<?> inputTextType = new InputSearchType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	public  BSFormInputGroup<?, InputColourType<?>> createColourInput(String binding, BSFormLabel<?> label)
	{
		BSFormInputGroup<?, InputColourType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		InputColourType<?> inputTextType = new InputColourType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	@Override
	public BSFormInputGroup<?, InputEmailType<?>> createEmailInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputEmailType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputEmailType<?> inputEmailType = new InputEmailType<>();
		group.setInput(inputEmailType);
		inputEmailType.bind(binding);
		
		return group;
	}
	
	@Override
	public BSFormGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label, boolean multiple, boolean styled, Boolean largeOrSmall)
	{
		BSFormGroup<?, InputSelectType<?>> group = createSelectDropdown(binding, label);
		group.setForm(this);
		group.getInput()
		     .setMultiple(multiple);
		if (styled)
		{
			addClass("custom-select");
			if (largeOrSmall != null)
			{
				if (largeOrSmall)
				{
					addClass("custom-select-lg");
				}
				else
				{
					addClass("custom-select-sm");
				}
			}
		}
		return group;
	}

	@Override
	public BSFormGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label)
	{
		BSFormGroup<?, InputSelectType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputSelectType<?> inputSelectType = new InputSelectType<>();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormGroup<?, InputSelectType<?>> createSelectDropdown(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputSelectType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputSelectType<?> inputSelectType = new InputSelectType<>();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);

		return group;
	}
	
	@Override
	public BSFormInputGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputSelectType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputSelectType<?> inputSelectType = new InputSelectType<>();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputSelectType<?>> createSelectDropdown(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputSelectType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputSelectType<?> inputSelectType = new InputSelectType<>();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);

		return group;
	}
	
	@Override
	public BSCheckBoxGroup<?> createCheckboxInput(String binding, String label)
	{
		BSCheckBoxGroup<?> group = new BSCheckBoxGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputCheckBoxType<?> inputTextType = new InputCheckBoxType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSCheckBoxGroup<?> createCheckboxInput(String binding, BSFormLabel<?> label)
	{
		BSCheckBoxGroup<?> group = new BSCheckBoxGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputCheckBoxType<?> inputTextType = new InputCheckBoxType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}
	
	@Override
	public BSRadioButtonGroup<?> createRadioInput(String binding, String label, String groupName)
	{
		BSRadioButtonGroup<?> group = new BSRadioButtonGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputRadioType<?> inputTextType = new InputRadioType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		inputTextType.setGroup(groupName);
		add(group);
		
		return group;
	}


	@Override
	public BSRadioButtonGroup<?> createRadioInput(String binding, BSFormLabel<?> label, String groupName)
	{
		BSRadioButtonGroup<?> group = new BSRadioButtonGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputRadioType<?> inputTextType = new InputRadioType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		inputTextType.setGroup(groupName);
		add(group);

		return group;
	}
	
	@Override
	public BSFormGroup<?, InputFileType<?>> createFileInput(String binding, String label)
	{
		BSFormGroup<?, InputFileType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputFileType<?> inputSelectType = new InputFileType<>();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);
		inputSelectType.addClass(BSFormGroupOptions.Form_Control_File);
		
		return group;
	}

	@Override
	public BSFormGroup<?, InputFileType<?>> createFileInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputFileType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputFileType<?> inputSelectType = new InputFileType<>();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);
		inputSelectType.addClass(BSFormGroupOptions.Form_Control_File);

		return group;
	}
	
	@Override
	public BSFormInputGroup<?, InputFileType<?>> createFileInput(String binding, String label, boolean styled, boolean inputGroup)
	{
		BSFormInputGroup<?, InputFileType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputFileType<?> inputFileType = new InputFileType<>();
		group.setInput(inputFileType);
		inputFileType.bind(binding);
		
		if (styled)
		{
			group.removeClass(BSFormGroupOptions.Form_Group);
			group.addClass("custom-file");
			inputFileType.addClass("custom-file-input");
			group.getLabel()
			     .addClass("custom-file-label");
		}
		else
		{
			inputFileType.addClass(BSFormGroupOptions.Form_Control_File);
		}
		
		return group;
	}

	@Override
	@SuppressWarnings("")
	public BSFormInputGroup<?, InputFileType<?>> createFileInput(String binding, BSFormLabel<?> label, boolean styled, boolean inputGroup)
	{
		BSFormInputGroup<?, InputFileType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputFileType<?> inputFileType = new InputFileType<>();
		group.setInput(inputFileType);
		inputFileType.bind(binding);

		if (styled)
		{
			group.removeClass(BSFormGroupOptions.Form_Group);
			group.addClass("custom-file");
			inputFileType.addClass("custom-file-input");
			group.getLabel()
					.addClass("custom-file-label");
		}
		else
		{
			inputFileType.addClass(BSFormGroupOptions.Form_Control_File);
		}

		return group;
	}
	
	@Override
	public BSFormInputGroup<?, InputFileType<?>> createFileInput(String binding, String label, boolean styled)
	{
		return createFileInput(binding, label, styled, false);
	}

	@Override
	public BSFormInputGroup<?, InputFileType<?>> createFileInput(String binding, BSFormLabel<?> label, boolean styled)
	{
		return createFileInput(binding, label, styled, false);
	}
	
	@Override
	public BSFormInputGroup<?, InputTelephoneType<?>> createTelephoneInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTelephoneType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputTelephoneType<?> inputTextType = new InputTelephoneType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputTelephoneType<?>> createTelephoneInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTelephoneType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputTelephoneType<?> inputTextType = new InputTelephoneType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}


	@Override
	public BSFormGroup<?, InputTelephoneType<?>> createTelephoneInput(String binding, String label)
	{
		BSFormGroup<?, InputTelephoneType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputTelephoneType<?> inputTextType = new InputTelephoneType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormGroup<?, InputTelephoneType<?>> createTelephoneInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputTelephoneType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputTelephoneType<?> inputTextType = new InputTelephoneType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}
	
	@Override
	public BSFormInputGroup<?, InputDateType<?>> createDateInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputDateType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputDateType<?> inputTextType = new InputDateType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputDateType<?>> createDateInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputDateType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputDateType<?> inputTextType = new InputDateType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}
	
	@Override
	public BSFormInputGroup<?, InputDateTimeType<?>> createDateTimeInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputDateTimeType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputDateTimeType<?> inputTextType = new InputDateTimeType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputDateTimeType<?>> createDateTimeInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputDateTimeType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputDateTimeType<?> inputTextType = new InputDateTimeType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}
	
	@Override
	public BSFormGroup<?, InputNumberType<?>> createNumberInput(String binding, String label)
	{
		BSFormGroup<?, InputNumberType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputNumberType<?> inputTextType = new InputNumberType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}


	@Override
	public BSFormGroup<?, InputNumberType<?>> createNumberInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputNumberType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputNumberType<?> inputTextType = new InputNumberType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}
	
	@Override
	public BSFormInputGroup<?, InputNumberType<?>> createNumberInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputNumberType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputNumberType<?> inputTextType = new InputNumberType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}


	@Override
	public BSFormInputGroup<?, InputNumberType<?>> createNumberInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputNumberType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputNumberType<?> inputTextType = new InputNumberType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}
	
	@Override
	public BSFormGroup<?, InputTimeType<?>> createTimeInput(String binding, String label)
	{
		BSFormGroup<?, InputTimeType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputTimeType<?> inputTextType = new InputTimeType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormGroup<?, InputTimeType<?>> createTimeInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputTimeType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputTimeType<?> inputTextType = new InputTimeType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}
	
	@Override
	public BSFormInputGroup<?, InputTimeType<?>> createTimeInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTimeType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputTimeType<?> inputTextType = new InputTimeType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}


	@Override
	public BSFormInputGroup<?, InputTimeType<?>> createTimeInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTimeType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputTimeType<?> inputTextType = new InputTimeType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	@Override
	public BSFormInputGroup<?, InputUrlType<?>> createUrlInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputUrlType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputUrlType<?> inputTextType = new InputUrlType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputUrlType<?>> createUrlInput(String binding, BSFormLabel<?> label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputUrlType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputUrlType<?> inputTextType = new InputUrlType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}
	
	@Override
	public BSFormGroup<?, InputUrlType<?>> createUrlInput(String binding, String label)
	{
		BSFormGroup<?, InputUrlType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputUrlType<?> inputTextType = new InputUrlType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}


	@Override
	public BSFormGroup<?, InputUrlType<?>> createUrlInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputUrlType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputUrlType<?> inputTextType = new InputUrlType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	@Override
	public BSFormGroup<?, InputHiddenType<?>> createHiddenInput(String binding, String label)
	{
		BSFormGroup<?, InputHiddenType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}
		
		InputHiddenType<?> inputTextType = new InputHiddenType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		
		return group;
	}

	@Override
	public BSFormGroup<?, InputDateType<?>> createDateInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputDateType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputDateType inputTextType = new InputDateType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	@Override
	public BSFormGroup<?, InputDateTimeType<?>> createDateTimeInput(String binding, String label)
	{
		BSFormGroup<?, InputDateTimeType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputDateTimeType<?> inputTextType = new InputDateTimeType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}


	@Override
	public BSFormGroup<?, InputDateTimeType<?>> createDateTimeInput(String binding, BSFormLabel<?> label)
	{
		BSFormGroup<?, InputDateTimeType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputDateTimeType<?> inputTextType = new InputDateTimeType<>();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}

	public BSFormGroup<?, InputDateType<?>> createDateInput(String binding, String label)
	{
		BSFormGroup<?, InputDateType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		if (label != null)
		{
			group.addLabel(label);
		}

		InputDateType inputTextType = new InputDateType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		return group;
	}


	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInline(boolean inline)
	{
		if (inline)
		{
			addClass(BSFormGroupOptions.Form_Inline);
		}
		else
		{
			removeClass(BSFormGroupOptions.Form_Inline);
		}
		return (J) this;
	}
	
	/**
	 * Returns a new form row inside of this form
	 *
	 * @return
	 */
	@Override
	public BSForm<?> createFormRow()
	{
		BSForm<?> form = new BSForm<>();
		form.setTag("div");
		form.addClass("form-row");
		form.removeAttribute("role");
		form.removeAttribute("name");
		
		return form;
	}
	
	/**
	 * Returns a new form row inside of this form
	 * and adds an attribute to set all fields inside disabled when a call is being made
	 * <p>
	 * You can add a custom disable all with custom data set parameters using addAttribute(NgBind.getAttributeName(),"{!data.value}"
	 *
	 * @return
	 */
	@Override
	public BSFieldSet<?> createFieldSet(boolean disableOnOperation)
	{
		BSFieldSet<?> fieldSet = new BSFieldSet<>(this);
		if (disableOnOperation)
		{
		//	fieldSet.disableOnCall();
		}
		return fieldSet;
	}
	
	/**
	 * Auto-sizing
	 * The example below uses a flexbox utility to vertically center the contents and changes .col to .col-auto so that your columns only
	 * take up as much space as needed. Put another way, the column sizes itself based on the contents.
	 *
	 * @param horizontalLayout The horinzal layout although its the vertical collection
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAlignment(BSAlignmentVerticalOptions horizontalLayout)
	{
		addClass(horizontalLayout);
		return (J) this;
	}
	
	/**
	 * Configures a component as the submit button for this component
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSButton<?> createSubmitButton()
	{
		return createSubmitButton(null, null);
	}
	
	/**
	 * Configures a component as the submit button for this component
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSButton<?> createSubmitButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		BSButton<?> button = new BSButton<>();
		//button.addAttribute(AngularAttributes.ngDisabled.getAttributeName(), getFormID() + ".$invalid || jw.isLoading");
		button.addAttribute(GlobalAttributes.Type, "submit");
		
		if (options != null)
		{
			button.addClass(options);
		}
		if (sizes != null)
		{
			button.addClass(sizes);
		}
		
		return button;
	}
	
	/**
	 * Instructs to add the styling options to input fields
	 *
	 * @param styleInput
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStyleInput(boolean styleInput)
	{
		styleInputs = styleInput;
		return (J) this;
	}

	@Override
	public BSButton<?> createCancelButton()
	{
		return createCancelButton(null, null);
	}
	
	@Override
	public BSButton<?> createCancelButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		BSButton<?> button = new BSButton<>();
		//button.addAttribute(AngularAttributes.ngDisabled.getAttributeName(), "jw.isLoading");
		button.addAttribute(GlobalAttributes.Type, "cancel");
		
		if (options != null)
		{
			button.addClass(options);
		}
		if (sizes != null)
		{
			button.addClass(sizes);
		}
		
		return button;
	}
	
	@Override
	public BSButton<?> createResetButton()
	{
		return createResetButton(null, null);
	}
	
	@Override
	public BSButton<?> createResetButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		BSButton<?> button = new BSButton<>();
		//button.addAttribute(AngularAttributes.ngDisabled.getAttributeName(), "jw.isLoading");
		button.addAttribute(GlobalAttributes.Type, "reset");
		
		if (options != null)
		{
			button.addClass(options);
		}
		if (sizes != null)
		{
			button.addClass(sizes);
		}
		
		return button;
	}
	
	/**
	 * Pre configures the item with a name
	 */
	@Override
	public void preConfigure()
	{
		addAttribute(GlobalAttributes.Name, getID());
		if (styleInputs)
		{
			applyClassesToAngularMessages();
		}
		super.preConfigure();
	}
	
	/**
	 * Adds the form-horiztal class to the form
	 *
	 * @param horizontal if it must be added or removed
	 *
	 * @return Always this
	 */
	@SuppressWarnings("unchecked")
	@Override
	public J setHorizontal(boolean horizontal)
	{
		if (horizontal)
		{
			addClass(Form_Horizontal);
		}
		else
		{
			removeClass(Form_Horizontal);
		}
		return (J) this;
	}
	
	/**
	 * Protected method to call when all inputs are available to apply the classes
	 *
	 * @return Always this
	 */
//	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	protected J applyClassesToAngularMessages()
	{
		applyClassesToForm(this);
		return (J) this;
	}
	
	/**
	 * Protected method to call when all inputs are available to apply the classes
	 *
	 * @return Always this
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J applyClassesToForm(BSForm<?> form)
	{
		for (IComponentHierarchyBase<?, ?> a : form.getChildrenHierarchy(false))
		{
			if (BSForm.class.isAssignableFrom(a.getClass()))
			{
				applyClassesToForm((BSForm<?>) a);
			}
			else if (Input.class.isAssignableFrom(a.getClass()))
			{
				Input<?, ?> input = (Input<?, ?>) a;
			//	input.addAttribute(AngularAttributes.ngClass.getAttributeName(), buildValidationClass(input));
			}
			else if (Label.class.isAssignableFrom(a.getClass()))
			{
				Label<?> input = (Label<?>) a;
				input.addClass("form-control-feedback");
		//		input.addAttribute(AngularAttributes.ngClass.getAttributeName(), buildValidationClass(input));
			}
			else if (BSFormInputGroup.class.isAssignableFrom(a.getParent()
					.getClass()))
			{
				BSFormInputGroup<?, ?> inputGroup = (BSFormInputGroup<?, ?>) a.getParent();
				inputGroup.getPrependDiv()
						.getChildren()
						.forEach(b -> b.asHierarchyBase()
								.addClass("form-control"));
				inputGroup.getAppendDiv()
						.getChildren()
						.forEach(b -> b.asHierarchyBase()
								.addClass("form-control"));
			}

		}
		return (J) this;
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
