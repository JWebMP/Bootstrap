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
package za.co.mmagon.jwebswing.plugins.bootstrap4.forms;

import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.angular.forms.AngularForm;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.inputs.*;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormCheckGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormRadioGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.interfaces.IBSForm;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSAlignmentVerticalOptions;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.Objects;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupOptions.Form_Group;

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
		description = "Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety "
				              + "of forms.",
		url = "https://v4-alpha.getbootstrap.com/components/forms/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSForm<J extends BSForm<J>>
		extends AngularForm<J>
		implements za.co.mmagon.jwebswing.plugins.bootstrap4.forms.interfaces.IBSForm<J>
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
		group.addInput(inputTextType);
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
		group.addInput(inputTextType);
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
		group.addInput(inputTextType);
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
		group.addInput(inputTextType);
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
		group.addInput(inputEmailType);
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
		group.addInput(inputEmailType);
		inputEmailType.bind(binding);

		add(group);
		return group;
	}

	@Override
	public BSFormGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label, boolean multiple, boolean styled,
	                                                            @Nullable Boolean largeOrSmall)
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
		group.addInput(inputSelectType);
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
		group.addInput(inputSelectType);
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
		group.addInput(inputTextType);
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
		group.addInput(inputTextType);
		inputTextType.bind(binding);
		inputTextType.setGroup(groupName);
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

		InputFileType inputSelectType = new InputFileType();
		group.addInput(inputSelectType);
		inputSelectType.bind(binding);

		if (styled)
		{
			group.removeClass(Form_Group);
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
	public BSFormGroup<?, InputFileType<?>> addFileInput(String binding, String label, boolean styled)
	{
		BSFormGroup<?, InputFileType<?>> group = new BSFormGroup<>();
		group.setForm(this);
		group.addLabel(label);

		InputFileType inputSelectType = new InputFileType();
		group.addInput(inputSelectType);
		inputSelectType.bind(binding);

		if (styled)
		{
			group.removeClass(Form_Group);
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

	/**
	 * Pre configures the item with a name
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			if (Objects.isNull(getAttribute(GlobalAttributes.Name)))
			{
				addAttribute(GlobalAttributes.Name, getID());
			}
			if (styleInputs)
			{
				applyClassesToAngularMessages();
			}
		}

		super.preConfigure();
	}

}
