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

import com.jwebmp.angular.forms.enumerations.InputErrorValidations;
import com.jwebmp.core.base.angular.implementations.AngularTSPostStartup;
import com.jwebmp.core.base.html.inputs.InputEmailType;
import com.jwebmp.core.base.html.inputs.InputSelectType;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupSizes;
import org.junit.jupiter.api.Test;

import static com.jwebmp.plugins.bootstrap.options.BSColumnOptions.Col_Sm_10;
import static com.jwebmp.plugins.bootstrap.options.BSColumnOptions.Col_Sm_2;

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
        AngularTSPostStartup.loadTSOnStartup = false;

        BSForm<?> form = new BSForm<>();

        BSFormGroup<?, InputEmailType<?>> input = form.createEmailInput("binded", "This is the label");
        input.getInput()
             .setPlaceholder("Input Placeholder");
        input.getInput()
             .setRequired();

        form.createCheckboxInput("checkBound", "Checkbox Label");

        form.createSubmitButton();

        BSFormGroup<?, InputSelectType<?>> selectGroup = form.createSelectDropdown("selectBound", "Select");
        selectGroup.getInput()
                   .addOption("Option 1", "Value 1");
        selectGroup.getInput()
                   .addOption("Option 2", "Value 2");
        selectGroup.getInput()
                   .addOption("Option 3", "Value 3");

        BSFormGroup<?, InputSelectType<?>> selectGroupMultiple = form.createSelectDropdown("selectBoundMulti", "Select Multi", true);
        selectGroupMultiple.getInput()
                           .addOption("Option 1", "Value 1");
        selectGroupMultiple.getInput()
                           .addOption("Option 2", "Value 2");
        selectGroupMultiple.getInput()
                           .addOption("Option 3", "Value 3");

        form.createFileInput("filebinding", "File Input Default", false);
        form.createFileInput("filebinding2", "File Input Styled", true);

        form.createTextInput("textBinding", "Texzt Input")
            .setReadOnly(true)
            .setSize(BSFormGroupSizes.Form_Control_Lg);

        form.createTextInput("textBinding", "Texzt Input")
            .setPlainText(true);

        form.createRadioInput("radioBound1", "Radio Button Label", "Radio Group");
        form.createRadioInput("radioBound2", "Radio Button Label2", "Radio Group");
        form.createRadioInput("radioBound3", "Radio Button Label3", "Radio Group")
            .setInline(true);

        form.createFormRow()
            .createTextInput("innerformrow", "Inner form row");

        form.createFormRow()
            .createTextInput("innerformrow", "Inner form row");

        form.createTextInput("textInput", "Text Input for horizontal")
            .asHorizontalLayout(Col_Sm_2, Col_Sm_10);

        form.createTextInput("helptext", "help text")
            .addHelpText("Help Text Example in small and muted hopefully");

        form.createFieldSet(true)
            .createTextInput("fieldsSetTextInput", "Fieldset");

        form.createTextInput("textWithmessages", "textwithmessage")
            .addMessage(InputErrorValidations.maxLength, "You have reached the maximum length for input", false);

        form.createTextInput("textWithmessages", "textwithmessage")
            .addMessage(InputErrorValidations.maxLength, "You have reached the maximum length for input", false);

        form.createCheckboxInput("checkboxCustom", "custom checkbox")
            .setCustomControl(false);

        form.createCheckboxInput("checkboxCustominline", "custom checkbox inline")
            .setCustomControl(true);

        System.out.println(form.toString(0));

        form.setStyleInput(true);
        form.setConfigured(false);
        form.setInitialized(false);

        form.createTextInput("testvalidatoin", "successvalidation")
            .addSuccessFeedback("This is the feedback", true);
        System.out.println(form.toString(0));

        form.createSelectDropdown("boundddd,", "select drop down large", true, true, true)
            .getInput()
            .addOption("Optionable", "value");


        form.createTextInput("testvalidatoin", "successvalidation")
        //    .setDisplayValidity(true)
        ;

        form.createFileInput("filebinding", "File Input Default", true);

        form.setStyleInput(true);
        form.setConfigured(false);
        form.setInitialized(false);

        System.out.println(form.toString(0));
    }

}
