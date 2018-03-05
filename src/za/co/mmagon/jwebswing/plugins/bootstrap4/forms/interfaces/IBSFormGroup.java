package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.interfaces;

import za.co.mmagon.jwebswing.base.angular.forms.enumerations.InputErrorValidations;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.SmallText;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.generics.TopOrBottom;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSForm;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSFormLabel;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupSizes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSColumnOptions;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

public interface IBSFormGroup<J extends BSFormGroup<J, I>, I extends Input<?, ?>>
		extends ICssStructure<J>
{
	@NotNull
	@SuppressWarnings("unchecked")
	BSFormLabel<?> addLabel(String text);

	@NotNull
	@SuppressWarnings("unchecked")
	I addInput(@NotNull I inputComponent);

	/**
	 * Adds a success feedback configured with styled if it is set before it
	 * <p>
	 * make sure to style before this method
	 *
	 * @param feedback
	 * @param inline
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J addSuccessFeedback(String feedback, boolean inline);

	/**
	 * Returns the associated form
	 *
	 * @return
	 */
	BSForm<?> getForm();

	/**
	 * Sets the form
	 *
	 * @param form
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setForm(BSForm<?> form);

	/**
	 * Returns the input component associated
	 *
	 * @return
	 */
	@Nullable
	I getInput();

	@NotNull
	@SuppressWarnings("unchecked")
	SmallText<?> addHelpText(String text);

	@SuppressWarnings("unchecked")
	@NotNull
	J addMessage(@NotNull InputErrorValidations forError, String message, boolean inline);

	@SuppressWarnings("unchecked")
	@NotNull
	J addMessage(@NotNull InputErrorValidations forError, String message);

	/**
	 * Gets the position to place the angular messages in the component
	 *
	 * @return
	 */
	TopOrBottom getMessagePlacement();

	/**
	 * Sets the message placement
	 *
	 * @param messagePlacement
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setMessagePlacement(@NotNull TopOrBottom messagePlacement);

	/**
	 * Sets the size of the input controller
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setSize(BSFormGroupSizes size);

	/**
	 * Add the readonly boolean attribute on an input to prevent modification of the input’s value. Read-only inputs appear lighter (just
	 * like disabled inputs), but retain the standard cursor.
	 *
	 * @param readOnly
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setReadOnly(boolean readOnly);

	/**
	 * Readonly plain text
	 * If you want to have <input readonly> elements in your form styled as plain text, use the .form-control-plaintext class to remove the
	 * default form field styling and preserve the correct margin and padding.
	 *
	 * @param asPlainText
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setPlainText(boolean asPlainText);

	/**
	 * Horizontal form
	 * Create horizontal forms with the grid by adding the .row class to form groups and using the .col-*-* classes to specify the width of
	 * your labels and controls. Be sure to add .col-form-label to your labels as well so they’re vertically centered with their
	 * associated form controls.
	 * <p>
	 * At times, you maybe need to use margin or padding utilities to create that perfect alignment you need. For example, we’ve removed
	 * the
	 * padding-top on our stacked radio inputs label to better align the text baseline.
	 *
	 * @param labelSpan
	 * @param inputSpan
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J asHorizontalLayout(BSColumnOptions labelSpan, BSColumnOptions inputSpan);

	/**
	 * Returns the label associated
	 *
	 * @return
	 */
	@Nullable
	BSFormLabel<?> getLabel();

	/**
	 * Sets if the input update binding should occur and validate when the field is left
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J updateOnBlur();

	/**
	 * Sets to display if the field must display styled before action has occured
	 *
	 * @param validity
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setDisplayValidity(boolean validity);
}
