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

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.jwebmp.core.base.html.inputs.*;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.buttons.*;
import com.jwebmp.plugins.bootstrap.buttons.checkbox.BSCheckBoxGroup;
import com.jwebmp.plugins.bootstrap.buttons.radio.BSRadioButtonGroup;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.bootstrap.options.BSAlignmentVerticalOptions;
import jakarta.validation.constraints.NotNull;

import static com.guicedee.guicedinjection.json.StaticStrings.*;
import static com.jwebmp.core.base.html.attributes.GlobalAttributes.*;
import static com.jwebmp.core.base.servlets.enumarations.ComponentTypes.*;

import java.lang.Object;

/**
 * Forms
 * <p>
 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 14 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Forms FieldSets",
		description = "Groups fields into a manageable set.",
		url = "https://v4-alpha.getbootstrap.com/components/forms/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSFieldSet<J extends BSFieldSet<J>>
		extends BSForm<J>
{
	@JsonIdentityReference(alwaysAsId = true)
	private BSForm<?> formOwner;
	
	protected BSFieldSet()
	{
		setTag(FieldSet.getComponentTag());
		setComponentType(FieldSet);
		removeAttribute("role");
		removeAttribute(Name);
	}
	
	public BSFieldSet( BSForm<?> formOwner)
	{
		this.formOwner = formOwner;
	}
	

	public BSForm<?> getFormOwner()
	{
		return formOwner;
	}
	
	@SuppressWarnings("unchecked")
	public J setFormOwner(BSForm<?> formOwner)
	{
		this.formOwner = formOwner;
		return (J) this;
	}
	
	
	@Override
	public String getFormID()
	{
		return formOwner.getID() + STRING_DOT + getID();
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
	
	@Override
	public BSFormGroup<?, InputTextType<?>> createTextInput(String binding, String label)
	{
		return getFormOwner().createTextInput(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputTextType<?>> createTextInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createTextInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormGroup<?, InputSearchType<?>> createSearchInput(String binding, String label)
	{
		return getFormOwner().createSearchInput(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputSearchType<?>> createSearchInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createSearchInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormInputGroup<?, InputPasswordType<?>> createPasswordInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createPasswordInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormGroup<?, InputTextAreaType<?>> createTextArea(String binding, String label)
	{
		return getFormOwner().createTextArea(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputTextAreaType<?>> createTextArea(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createTextArea(binding, label, inputGroup);
	}
	
	@Override
	public BSFormGroup<?, InputEmailType<?>> createEmailInput(String binding, String label)
	{
		return getFormOwner().createEmailInput(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputEmailType<?>> createEmailInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createEmailInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label, boolean multiple, boolean styled, Boolean largeOrSmall)
	{
		return getFormOwner().createSelectDropdown(binding, label, multiple, styled, largeOrSmall);
	}
	
	@Override
	public BSFormGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label)
	{
		return getFormOwner().createSelectDropdown(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputSelectType<?>> createSelectDropdown(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createSelectDropdown(binding, label, inputGroup);
	}
	
	@Override
	public BSCheckBoxGroup<?> createCheckboxInput(String binding, String label)
	{
		return getFormOwner().createCheckboxInput(binding, label);
	}
	
	@Override
	public BSRadioButtonGroup<?> createRadioInput(String binding, String label, String groupName)
	{
		return getFormOwner().createRadioInput(binding, label, groupName);
	}
	
	@Override
	public BSFormGroup<?, InputFileType<?>> createFileInput(String binding, String label)
	{
		return getFormOwner().createFileInput(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputFileType<?>> createFileInput(String binding, String label, boolean styled, boolean inputGroup)
	{
		return getFormOwner().createFileInput(binding, label, styled, inputGroup);
	}
	
	@Override
	public BSFormInputGroup<?, InputFileType<?>> createFileInput(String binding, String label, boolean styled)
	{
		return getFormOwner().createFileInput(binding, label, styled);
	}
	
	@Override
	public BSFormInputGroup<?, InputTelephoneType<?>> createTelephoneInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createTelephoneInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormGroup<?, InputTelephoneType<?>> createTelephoneInput(String binding, String label)
	{
		return getFormOwner().createTelephoneInput(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputDateType<?>> createDateInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createDateInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormInputGroup<?, InputDateTimeType<?>> createDateTimeInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createDateTimeInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormGroup<?, InputNumberType<?>> createNumberInput(String binding, String label)
	{
		return getFormOwner().createNumberInput(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputNumberType<?>> createNumberInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createNumberInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormGroup<?, InputTimeType<?>> createTimeInput(String binding, String label)
	{
		return getFormOwner().createTimeInput(binding, label);
	}
	
	@Override
	public BSFormInputGroup<?, InputTimeType<?>> createTimeInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createTimeInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormInputGroup<?, InputUrlType<?>> createUrlInput(String binding, String label, boolean inputGroup)
	{
		return getFormOwner().createUrlInput(binding, label, inputGroup);
	}
	
	@Override
	public BSFormGroup<?, InputUrlType<?>> createUrlInput(String binding, String label)
	{
		return getFormOwner().createUrlInput(binding, label);
	}
	
	@Override
	public BSFormGroup<?, InputHiddenType<?>> createHiddenInput(String binding, String label)
	{
		return getFormOwner().createHiddenInput(binding, label);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public J setInline(boolean inline)
	{
		getFormOwner().setInline(inline);
		return (J) this;
	}
	
	@Override
	public BSForm<?> createFormRow()
	{
		return getFormOwner().createFormRow();
	}
	
	@Override
	public BSFieldSet<?> createFieldSet(boolean disableOnOperation)
	{
		return getFormOwner().createFieldSet(disableOnOperation);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public J setAlignment(BSAlignmentVerticalOptions horizontalLayout)
	{
		getFormOwner().setAlignment(horizontalLayout);
		return (J) this;
	}
	
	@Override
	public @NotNull BSButton<?> createSubmitButton()
	{
		return getFormOwner().createSubmitButton();
	}
	
	@Override
	public @NotNull BSButton<?> createSubmitButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		return getFormOwner().createSubmitButton(options, sizes);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public J setStyleInput(boolean styleInput)
	{
		getFormOwner().setStyleInput(styleInput);
		return (J) this;
	}
	
	@Override
	public BSFormGroup<?, InputDateType<?>> createDateInput(String binding, String label)
	{
		return getFormOwner().createDateInput(binding, label);
	}
	
	@Override
	public BSFormGroup<?, InputDateTimeType<?>> createDateTimeInput(String binding, String label)
	{
		return getFormOwner().createDateTimeInput(binding, label);
	}
	
	@Override
	public BSButton<?> createCancelButton()
	{
		return getFormOwner().createCancelButton();
	}
	
	@Override
	public BSButton<?> createCancelButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		return getFormOwner().createCancelButton(options, sizes);
	}
	
	@Override
	public BSButton<?> createResetButton()
	{
		return getFormOwner().createResetButton();
	}
	
	@Override
	public BSButton<?> createResetButton(BSButtonOptions options, BSButtonSizeOptions sizes)
	{
		return getFormOwner().createResetButton(options, sizes);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public J setHorizontal(boolean horizontal)
	{
		getFormOwner().setHorizontal(horizontal);
		return (J) this;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public J add(String textToAdd)
	{
		return (J) getFormOwner().add(textToAdd);
	}
}
