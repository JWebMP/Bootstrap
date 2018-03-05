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
import za.co.mmagon.jwebswing.base.html.inputs.InputCheckBoxType;
import za.co.mmagon.jwebswing.base.html.inputs.InputEmailType;
import za.co.mmagon.jwebswing.base.html.inputs.InputTextType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormCheckGroup;

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
{

	private static final long serialVersionUID = 1L;

	/**
	 * Forms
	 * <p>
	 * Bootstrap provides several form control styles, layout options, and custom components for creating a wide variety of forms.
	 */
	public BSForm()
	{
		addAttribute("role", "form");
	}


	public BSFormGroup<?, InputTextType<?>> addTextInput(String binding, String label)
	{
		BSFormGroup<?, InputTextType<?>> group = new BSFormGroup<>();
		group.addLabel(label);

		InputTextType inputTextType = new InputTextType();
		group.addInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}

	public BSFormGroup<?, InputEmailType<?>> addEmailInput(String binding, String label)
	{
		BSFormGroup<?, InputEmailType<?>> group = new BSFormGroup<>();
		group.addLabel(label);

		InputEmailType inputEmailType = new InputEmailType();
		group.addInput(inputEmailType);
		inputEmailType.bind(binding);

		add(group);
		return group;
	}

	public BSFormCheckGroup<?> addCheckboxInput(String binding, String label)
	{
		BSFormCheckGroup<?> group = new BSFormCheckGroup<>();
		group.addLabel(label);

		InputCheckBoxType<?> inputTextType = new InputCheckBoxType();
		group.addInput(inputTextType);
		inputTextType.bind(binding);

		add(group);
		return group;
	}


	/**
	 * Pre configures the item with a name
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addAttribute(GlobalAttributes.Name, getID());
		}

		super.preConfigure();
	}

	public BSButton<?> addSubmitButton()
	{
		return addSubmitButton(null, null);
	}

	/**
	 * Configures a component as the submit button for this component
	 *
	 * @param component
	 *
	 * @return
	 */
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


}
