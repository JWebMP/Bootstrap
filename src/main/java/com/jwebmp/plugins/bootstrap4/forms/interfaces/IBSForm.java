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

package com.jwebmp.plugins.bootstrap4.forms.interfaces;

import com.jwebmp.core.base.html.inputs.*;
import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.buttons.BSButton;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.forms.BSForm;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormCheckGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormRadioGroup;
import com.jwebmp.plugins.bootstrap4.options.BSAlignmentVerticalOptions;

import javax.validation.constraints.NotNull;

public interface IBSForm<J extends BSForm<J>>
		extends ICssStructure<J>
{
	BSFormGroup<?, InputTextType<?>> createTextInput(String binding, String label);

	BSFormInputGroup<?, InputTextType<?>> createTextInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputSearchType<?>> createSearchInput(String binding, String label);

	BSFormGroup<?, InputSearchType<?>> createSearchInput(String binding, String label, boolean inputGroup);

	BSFormInputGroup<?, InputPasswordType<?>> createPasswordInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputTextAreaType<?>> createTextArea(String binding, String label);

	BSFormInputGroup<?, InputTextAreaType<?>> createTextArea(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputEmailType<?>> createEmailInput(String binding, String label);

	BSFormInputGroup<?, InputEmailType<?>> createEmailInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label, boolean multiple, boolean styled, Boolean largeOrSmall);

	BSFormGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label);

	BSFormInputGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label, boolean inputGroup);

	BSFormCheckGroup<?> createCheckboxInput(String binding, String label);

	BSFormRadioGroup<?> createRadioInput(String binding, String label, String groupName);

	BSFormGroup<?, InputFileType<?>> createFileInput(String binding, String label);

	BSFormInputGroup<?, InputFileType<?>> createFileInput(String binding, String label, boolean styled, boolean inputGroup);

	BSFormGroup<?, InputFileType<?>> createFileInput(String binding, String label, boolean styled);

	BSFormInputGroup<?, InputTelephoneType<?>> createTelephoneInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputTelephoneType<?>> createTelephoneInput(String binding, String label);

	BSFormInputGroup<?, InputDateType<?>> createDateInput(String binding, String label, boolean inputGroup);

	BSFormInputGroup<?, InputDateTimeType<?>> createDateTimeInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputNumberType<?>> createNumberInput(String binding, String label);

	BSFormInputGroup<?, InputNumberType<?>> createNumberInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputTimeType<?>> createTimeInput(String binding, String label);

	BSFormInputGroup<?, InputTimeType<?>> createTimeInput(String binding, String label, boolean inputGroup);

	BSFormInputGroup<?, InputUrlType<?>> createUrlInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputUrlType<?>> createUrlInput(String binding, String label);

	BSFormGroup<?, InputHiddenType<?>> createHiddenInput(String binding, String label);

	@SuppressWarnings("unchecked")
	@NotNull
	J setInline(boolean inline);

	/**
	 * Returns a new form row inside of this form
	 *
	 * @return
	 */
	BSForm<?> createFormRow();

	/**
	 * Returns a new form row inside of this form
	 * and adds an attribute setting disabled if true
	 *
	 * @return
	 */
	BSForm<?> createFieldSet(boolean disabled);

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
	@SuppressWarnings("unchecked")
	@NotNull
	J setAlignment(BSAlignmentVerticalOptions horizontalLayout);

	/**
	 * Configures a component as the submit button for this component
	 *
	 * @return
	 */
	@NotNull
	BSButton<?> createSubmitButton();

	/**
	 * Configures a component as the submit button for this component
	 *
	 * @return
	 */
	@NotNull
	BSButton<?> createSubmitButton(BSButtonOptions options, BSButtonSizeOptions sizes);

	/**
	 * Instructs to add the styling options to input fields
	 *
	 * @param styleInput
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setStyleInput(boolean styleInput);

	BSFormGroup<?, InputDateType<?>> createDateInput(String binding, String label);

	BSFormGroup<?, InputDateTimeType<?>> createDateTimeInput(String binding, String label);

	BSButton<?> createCancelButton();

	BSButton<?> createCancelButton(BSButtonOptions options, BSButtonSizeOptions sizes);

	BSButton<?> createResetButton();

	BSButton<?> createResetButton(BSButtonOptions options, BSButtonSizeOptions sizes);
}
