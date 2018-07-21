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
package com.jwebmp.plugins.bootstrap4.forms;

import com.jwebmp.core.base.angular.AngularAttributes;
import com.jwebmp.core.base.angular.forms.AngularForm;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.inputs.*;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.utilities.StaticStrings;
import com.jwebmp.plugins.bootstrap4.buttons.BSButton;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupOptions;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormCheckGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormRadioGroup;
import com.jwebmp.plugins.bootstrap4.forms.interfaces.IBSForm;
import com.jwebmp.plugins.bootstrap4.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap4.options.BSAlignmentVerticalOptions;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Forms
 * <p>
 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 14 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Forms",
		description = "Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety " + "of forms.",
		url = "https://v4-alpha.getbootstrap.com/components/forms/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSForm<J extends BSForm<J>>
		extends AngularForm<J>
		implements IBSForm<J>, BSNavBarChildren
{

	private static final long serialVersionUID = 1L;

	private boolean styleInputs;

	/**
	 * Forms
	 * <p>
	 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
	 */
	public BSForm(boolean noValidate)
	{
		this();
		setNoValidate(noValidate);
	}

	/**
	 * Forms
	 * <p>
	 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
	 */
	public BSForm()
	{
		addAttribute("role", "form");
		setSuccessClass("is-valid");
		setErrorClass("is-invalid");
		setErrorFeedbackClass("invalid-feedback");
		setSuccessFeedbackClass("valid-feedback");
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
	public BSFormGroup<?, InputTextType<?>> addTextInput(String binding, String label)
	{
		BSFormGroup<?, InputTextType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTextType inputTextType = new InputTextType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputTextType<?>> addTextInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTextType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTextType inputTextType = new InputTextType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputSearchType<?>> addSearchInput(String binding, String label)
	{
		BSFormGroup<?, InputSearchType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputSearchType inputTextType = new InputSearchType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputSearchType<?>> addSearchInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputSearchType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputSearchType inputTextType = new InputSearchType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputPasswordType<?>> addPasswordInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputPasswordType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputPasswordType inputTextType = new InputPasswordType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputTextAreaType<?>> addTextArea(String binding, String label)
	{
		BSFormGroup<?, InputTextAreaType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTextAreaType inputTextType = new InputTextAreaType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputTextAreaType<?>> addTextArea(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTextAreaType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTextAreaType inputTextType = new InputTextAreaType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputEmailType<?>> addEmailInput(String binding, String label)
	{
		BSFormGroup<?, InputEmailType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputEmailType inputEmailType = new InputEmailType();
		group.setInput(inputEmailType);
		inputEmailType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputEmailType<?>> addEmailInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputEmailType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputEmailType inputEmailType = new InputEmailType();
		group.setInput(inputEmailType);
		inputEmailType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label, boolean multiple, boolean styled, Boolean largeOrSmall)
	{
		BSFormGroup<?, InputSelectType<?>> group = addSelectDropdown(binding, label);
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
	public BSFormGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label)
	{
		BSFormGroup<?, InputSelectType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputSelectType inputSelectType = new InputSelectType();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputSelectType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputSelectType inputSelectType = new InputSelectType();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormCheckGroup<?> addCheckboxInput(String binding, String label)
	{
		BSFormCheckGroup<?> group = new BSFormCheckGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputCheckBoxType<?> inputTextType = new InputCheckBoxType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormRadioGroup<?> addRadioInput(String binding, String label, String groupName)
	{
		BSFormRadioGroup<?> group = new BSFormRadioGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputRadioType<?> inputTextType = new InputRadioType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);
		inputTextType.setGroup(groupName);
		add(group);

		return group;
	}

	@Override
	public BSFormGroup<?, InputFileType<?>> addFileInput(String binding, String label)
	{
		BSFormGroup<?, InputFileType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputFileType inputSelectType = new InputFileType();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);
		inputSelectType.addClass(BSFormGroupOptions.Form_Control_File);
		add(group);

		return group;
	}

	@Override
	@SuppressWarnings("")
	public BSFormInputGroup<?, InputFileType<?>> addFileInput(String binding, String label, boolean styled, boolean inputGroup)
	{
		BSFormInputGroup<?, InputFileType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputFileType inputFileType = new InputFileType();
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

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputFileType<?>> addFileInput(String binding, String label, boolean styled)
	{
		BSFormInputGroup<?, InputFileType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputFileType inputSelectType = new InputFileType();
		group.setInput(inputSelectType);
		inputSelectType.bind(binding);

		if (styled)
		{
			group.removeClass(BSFormGroupOptions.Form_Group);
			group.addClass("custom-file");
			inputSelectType.addClass("custom-file-input");
			group.getLabel()
			     .addClass("custom-file-label");
		}
		else
		{
			inputSelectType.addClass(BSFormGroupOptions.Form_Control_File);
		}

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputTelephoneType<?>> addTelephoneInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTelephoneType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTelephoneType inputTextType = new InputTelephoneType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputTelephoneType<?>> addTelephoneInput(String binding, String label)
	{
		BSFormGroup<?, InputTelephoneType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTelephoneType inputTextType = new InputTelephoneType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputDateType<?>> addDateInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputDateType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputDateType inputTextType = new InputDateType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputDateTimeType<?>> addDateTimeInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputDateTimeType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputDateTimeType inputTextType = new InputDateTimeType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputNumberType<?>> addNumberInput(String binding, String label)
	{
		BSFormGroup<?, InputNumberType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputNumberType inputTextType = new InputNumberType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputNumberType<?>> addNumberInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputNumberType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputNumberType inputTextType = new InputNumberType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputTimeType<?>> addTimeInput(String binding, String label)
	{
		BSFormGroup<?, InputTimeType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTimeType inputTextType = new InputTimeType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputTimeType<?>> addTimeInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputTimeType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputTimeType inputTextType = new InputTimeType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormInputGroup<?, InputUrlType<?>> addUrlInput(String binding, String label, boolean inputGroup)
	{
		BSFormInputGroup<?, InputUrlType<?>> group = new BSFormInputGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputUrlType inputTextType = new InputUrlType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputUrlType<?>> addUrlInput(String binding, String label)
	{
		BSFormGroup<?, InputUrlType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputUrlType inputTextType = new InputUrlType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputHiddenType<?>> addHiddenInput(String binding, String label)
	{
		BSFormGroup<?, InputHiddenType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputHiddenType inputTextType = new InputHiddenType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
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
	public BSForm<?> addFormRow()
	{
		BSForm<?> form = new BSForm<>();

		form.setTag("div");
		form.addClass("form-row");
		form.removeAttribute("role");
		form.removeAttribute("name");

		add(form);
		return form;
	}

	/**
	 * Returns a new form row inside of this form
	 * and adds an attribute setting disabled if true
	 *
	 * @return
	 */
	@Override
	public BSForm<?> addFieldSet(boolean disabled)
	{
		BSForm<?> form = new BSForm<>();

		form.setTag("fieldset");
		form.removeAttribute("role");
		form.removeAttribute("name");
		if (disabled)
		{
			form.addAttribute("disabled", StaticStrings.STRING_EMPTY);
		}
		add(form);
		return form;
	}

	/**
	 * Auto-sizing
	 * The example below uses a flexbox utility to vertically center the contents and changes .col to .col-auto so that your columns only
	 * take up as much space as needed. Put another way, the column sizes itself based on the contents.
	 *
	 * @param horizontalLayout
	 * 		The horinzal layout although its the vertical collection
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
	public BSButton<?> addSubmitButton()
	{
		return addSubmitButton(null, null);
	}

	/**
	 * Configures a component as the submit button for this component
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSButton<?> addSubmitButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		BSButton<?> button = new BSButton<>();
		button.addAttribute(AngularAttributes.ngDisabled, getID() + ".$invalid || jw.isLoading");
		button.addAttribute(GlobalAttributes.Type, "submit");

		if (options != null)
		{
			button.addClass(options);
		}
		if (sizes != null)
		{
			button.addClass(sizes);
		}

		add(button);
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
	public BSFormGroup<?, InputDateType<?>> addDateInput(String binding, String label)
	{
		BSFormGroup<?, InputDateType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputDateType inputTextType = new InputDateType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputDateTimeType<?>> addDateTimeInput(String binding, String label)
	{
		BSFormGroup<?, InputDateTimeType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputDateTimeType inputTextType = new InputDateTimeType();
		group.setInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSButton<?> addCancelButton()
	{
		return addCancelButton(null, null);
	}

	@Override
	public BSButton<?> addCancelButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		BSButton<?> button = new BSButton<>();
		button.addAttribute(AngularAttributes.ngDisabled, "jw.isLoading");
		button.addAttribute(GlobalAttributes.Type, "cancel");

		if (options != null)
		{
			button.addClass(options);
		}
		if (sizes != null)
		{
			button.addClass(sizes);
		}

		add(button);
		return button;
	}

	@Override
	public BSButton<?> addResetButton()
	{
		return addResetButton(null, null);
	}

	@Override
	public BSButton<?> addResetButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		BSButton<?> button = new BSButton<>();
		button.addAttribute(AngularAttributes.ngDisabled, "jw.isLoading");
		button.addAttribute(GlobalAttributes.Type, "reset");

		if (options != null)
		{
			button.addClass(options);
		}
		if (sizes != null)
		{
			button.addClass(sizes);
		}

		add(button);
		return button;
	}

	/**
	 * Pre configures the item with a name
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured() && Objects.isNull(getAttribute(GlobalAttributes.Name)))
		{
			addAttribute(GlobalAttributes.Name, getID());
		}

		super.preConfigure();

		if (styleInputs)
		{
			applyClassesToAngularMessages();
		}
	}

	/**
	 * Protected method to call when all inputs are available to apply the classes
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	protected J applyClassesToAngularMessages()
	{
		getChildrenHierarchy(true).forEach(a ->
		                                   {

			                                   if (Input.class.isAssignableFrom(a.getClass()))
			                                   {
				                                   Input input = (Input) a;
				                                   input.addAttribute(AngularAttributes.ngClass, buildValidationClass(input));
				                                   if (BSFormInputGroup.class.isAssignableFrom(a.getParent()
				                                                                                .getClass()))
				                                   {
					                                   BSFormInputGroup<?, ?> inputGroup = (BSFormInputGroup) a.getParent();
					                                   inputGroup.getPrependDiv()
					                                             .getChildren()
					                                             .forEach(b ->
					                                                      {
						                                                      b.addClass("form-control");
						                                                      b.addAttribute(AngularAttributes.ngClass, buildValidationClass(input));
					                                                      });
					                                   inputGroup.getAppendDiv()
					                                             .getChildren()
					                                             .forEach(b ->
					                                                      {
						                                                      b.addClass("form-control");
						                                                      b.addAttribute(AngularAttributes.ngClass, buildValidationClass(input));
					                                                      });
				                                   }
			                                   }
		                                   });
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
