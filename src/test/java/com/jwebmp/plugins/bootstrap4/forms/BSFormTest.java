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

import com.jwebmp.base.angular.forms.enumerations.InputErrorValidations;
import com.jwebmp.base.html.inputs.InputEmailType;
import com.jwebmp.base.html.inputs.InputSelectType;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupSizes;
import org.junit.jupiter.api.Test;

import static com.jwebmp.plugins.bootstrap4.options.BSColumnOptions.*;

/**
 * @author GedMarc
 */
public class BSFormTest

{
	public BSFormTest()
	{
	}

	@org.junit.jupiter.api.Test
	void addSubmitButton()
	{
	}

	@Test
	public void testBasic()
	{
		BSForm<?> form = new BSForm<>();

		BSFormGroup<?, InputEmailType<?>> input = form.addEmailInput("binded", "This is the label");
		input.getInput()
		     .setPlaceholder("Input Placeholder");
		input.getInput()
		     .setRequired();

		form.addCheckboxInput("checkBound", "Checkbox Label");

		form.addSubmitButton();

		BSFormGroup<?, InputSelectType<?>> selectGroup = form.addSelectDropdown("selectBound", "Select");
		selectGroup.getInput()
		           .addOption("Option 1", "Value 1");
		selectGroup.getInput()
		           .addOption("Option 2", "Value 2");
		selectGroup.getInput()
		           .addOption("Option 3", "Value 3");

		BSFormGroup<?, InputSelectType<?>> selectGroupMultiple = form.addSelectDropdown("selectBoundMulti", "Select Multi", true);
		selectGroupMultiple.getInput()
		                   .addOption("Option 1", "Value 1");
		selectGroupMultiple.getInput()
		                   .addOption("Option 2", "Value 2");
		selectGroupMultiple.getInput()
		                   .addOption("Option 3", "Value 3");

		form.addFileInput("filebinding", "File Input Default", false);

		form.addTextInput("textBinding", "Texzt Input")
		    .setReadOnly(true)
		    .setSize(BSFormGroupSizes.Form_Control_Lg);

		form.addTextInput("textBinding", "Texzt Input")
		    .setPlainText(true);

		form.addRadioInput("radioBound1", "Radio Button Label", "Radio Group");
		form.addRadioInput("radioBound2", "Radio Button Label2", "Radio Group");
		form.addRadioInput("radioBound3", "Radio Button Label3", "Radio Group")
		    .setInline(true);

		form.addFormRow()
		    .addTextInput("innerformrow", "Inner form row");

		form.addFormRow()
		    .addTextInput("innerformrow", "Inner form row");

		form.addTextInput("textInput", "Text Input for horizontal")
		    .asHorizontalLayout(Col_Sm_2, Col_Sm_10);

		form.addTextInput("helptext", "help text")
		    .addHelpText("Help Text Example in small and muted hopefully");

		form.addFieldSet(true)
		    .addTextInput("fieldsSetTextInput", "Fieldset");

		form.addTextInput("textWithmessages", "textwithmessage")
		    .addMessage(InputErrorValidations.maxlength, "You have reached the maximum length for input", false);

		form.addTextInput("textWithmessages", "textwithmessage")
		    .addMessage(InputErrorValidations.maxlength, "You have reached the maximum length for input", false);

		form.addCheckboxInput("checkboxCustom", "custom checkbox")
		    .setCustomControl(false);

		form.addCheckboxInput("checkboxCustominline", "custom checkbox inline")
		    .setCustomControl(true);

		System.out.println(form.toString(0));

		form.setStyleInput(true);
		form.setConfigured(false);
		form.setInitialized(false);

		form.addTextInput("testvalidatoin", "successvalidation")
		    .addSuccessFeedback("This is the feedback", true);
		System.out.println(form.toString(0));

		form.addSelectDropdown("boundddd,", "select drop down large", true, true, true)
		    .getInput()
		    .addOption("Optionable", "value");

		form.addTextInput("testvalidatoin", "successvalidation")
		    .setDisplayValidity(true);

		form.addFileInput("filebinding", "File Input Default", true);

		form.setStyleInput(true);
		form.setConfigured(false);
		form.setInitialized(false);

		System.out.println(form.toString(0));
	}

}
