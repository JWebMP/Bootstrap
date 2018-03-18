package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.interfaces;

import za.co.mmagon.jwebswing.base.html.inputs.*;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSForm;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormCheckGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormRadioGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSAlignmentVerticalOptions;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

public interface IBSForm<J extends BSForm<J>>
		extends ICssStructure<J>
{
	BSFormGroup<?, InputTextType<?>> addTextInput(String binding, String label);

	BSFormInputGroup<?, InputTextType<?>> addTextInput(String binding, String label, boolean inputGroup);

	BSFormInputGroup<?, InputPasswordType<?>> addPasswordInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputTextAreaType<?>> addTextArea(String binding, String label);

	BSFormInputGroup<?, InputTextAreaType<?>> addTextArea(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputEmailType<?>> addEmailInput(String binding, String label);

	BSFormInputGroup<?, InputEmailType<?>> addEmailInput(String binding, String label, boolean inputGroup);

	BSFormGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label, boolean multiple, boolean styled, @Nullable Boolean largeOrSmall);

	BSFormGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label);

	BSFormInputGroup<?, InputSelectType<?>> addSelectDropdown(String binding, String label, boolean inputGroup);

	BSFormCheckGroup<?> addCheckboxInput(String binding, String label);

	BSFormRadioGroup<?> addRadioInput(String binding, String label, String groupName);

	@SuppressWarnings("")
	BSFormInputGroup<?, InputFileType<?>> addFileInput(String binding, String label, boolean styled, boolean inputGroup);

	BSFormGroup<?, InputFileType<?>> addFileInput(String binding, String label, boolean styled);

	@SuppressWarnings("unchecked")
	@NotNull
	J setInline(boolean inline);

	/**
	 * Returns a new form row inside of this form
	 *
	 * @return
	 */
	BSForm<?> addFormRow();

	/**
	 * Returns a new form row inside of this form
	 * and adds an attribute setting disabled if true
	 *
	 * @return
	 */
	BSForm<?> addFieldSet(boolean disabled);

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
	BSButton<?> addSubmitButton();

	/**
	 * Configures a component as the submit button for this component
	 *
	 * @return
	 */
	@NotNull
	BSButton<?> addSubmitButton(BSButtonOptions options, BSButtonSizeOptions sizes);

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
}
