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
package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups;

import za.co.mmagon.jwebswing.base.angular.forms.AngularInputMessages;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.SmallText;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSForm;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSFormChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSFormLabel;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSTypographyOptions;
import za.co.mmagon.logger.LogFactory;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.logging.Logger;

/**
 * An implementation of
 * <p>
 *
 * @param <J>
 * 		Always this class
 * @param <I>
 * 		The input type control
 *
 * @author Marc Magon
 * @version 1.0
 * @since 17 Jan 2017
 */
public class BSFormGroup<J extends BSFormGroup<J, I>, I extends Input<?, ?>>
		extends Div<GlobalChildren, BSFormGroupAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSFormChildren
{

	private static final Logger log = LogFactory.getLog("BSFormGroup");
	private static final String BootstrapValidationIconClass = "glyphicon form-control-feedback form-control-feedback-lg";

	private static final long serialVersionUID = 1L;

	/**
	 * The label
	 */
	private BSFormLabel label;

	private BSForm<?> form;

	/**
	 * The label help text
	 */
	private String helpText;
	/**
	 * The input component for the form group
	 */
	private I input;
	/**
	 * If this group is shown as a row
	 */
	private boolean asRow;
	/**
	 * If this group is shown as inline
	 */
	private boolean inline;
	/**
	 * The actual required message
	 */
	private String requiredMessage;
	/**
	 * The actual pattern message
	 */
	private String patternMessage;
	/**
	 * The minimum error message
	 */
	private String minMessage;
	/**
	 * The maximum error message
	 */
	private String maxMessage;
	/**
	 * The minimum length for a text field
	 */
	private String minLengthMessage;
	/**
	 * The maximum length for a message
	 */
	private String maxLengthMessage;
	/**
	 * The general global error for a message
	 */
	private String errorMessage;
	/**
	 * The front icon string for the final input group
	 */
	private String frontIcon;
	/**
	 * Shows a ticket, warning or cross from bootstrap 4
	 */
	private Boolean showControlFeedback;
	/**
	 * The help block displayed when errors are found
	 */
	private Div helpBlockWithErrors;

	private AngularInputMessages<?> messages;

	/**
	 * Constructs a new BS Form Group
	 */
	public BSFormGroup()
	{
		//Nothing Needed
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public BSFormLabel<?> addLabel(String text)
	{
		if (label != null)
		{
			remove(label);
		}
		if (label == null)
		{
			label = new BSFormLabel();
		}
		label.setText(text);
		add(label);
		return label;
	}


	@NotNull
	@SuppressWarnings("unchecked")
	public I addInput(@NotNull I inputComponent)
	{
		if (input != null)
		{
			remove(input);
		}
		add(inputComponent);
		input = inputComponent;
		inputComponent.addClass(BSFormGroupOptions.Form_Control);
		if (label != null)
		{
			inputComponent.addAttribute(GlobalAttributes.Aria_Describedby, label.getID());
			label.setForInputComponent(inputComponent);
		}
		return inputComponent;
	}

	@NotNull
	@SuppressWarnings("unchecked")
	public SmallText<?> addHelpText(String text)
	{
		SmallText<?> smallText = new SmallText<>();
		smallText.addClass(BSFormGroupOptions.Form_Text);
		smallText.addClass(BSTypographyOptions.Text_Muted);
		helpText = text;
		add(smallText);
		return smallText;
	}

	/**
	 * Returns the input component associated
	 *
	 * @return
	 */
	@Nullable
	public I getInput()
	{
		return input;
	}

	/**
	 * Returns the label associated
	 *
	 * @return
	 */
	@Nullable
	public BSFormLabel getLabel()
	{
		return label;
	}

	/**
	 * Returns the applied messages
	 *
	 * @return
	 */
	@NotNull
	public AngularInputMessages<?> getMessages()
	{
		if (input == null)
		{
			throw new UnsupportedOperationException(
					"Input has not be set on the group yet... Make sure to set input before applying " + " feedback messages");
		}
		if (messages == null)
		{
			messages = new AngularInputMessages(form, input);
		}

		return messages;
	}

	public void setMessages(AngularInputMessages<?> messages)
	{
		this.messages = messages;
	}

	public BSForm<?> getForm()
	{
		return form;
	}

	public J setForm(BSForm<?> form)
	{
		this.form = form;
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
