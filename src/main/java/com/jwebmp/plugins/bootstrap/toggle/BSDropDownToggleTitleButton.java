package com.jwebmp.plugins.bootstrap.toggle;

import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.dropdown.options.BSDropDownOptions;

public class BSDropDownToggleTitleButton<J extends BSDropDownToggleTitleButton<J>>
		extends BSButton<J>
		implements BSToggleChildren
{
	public BSDropDownToggleTitleButton(String text)
	{
		super(text);
		addClass(BSDropDownOptions.Dropdown_Toggle);
		addAttribute(ButtonAttributes.Data_Toggle.toString(), BSDropDownToggle.ToggleString);
	}

	public BSDropDownToggleTitleButton()
	{
		addClass(BSDropDownOptions.Dropdown_Toggle);
		addAttribute(ButtonAttributes.Data_Toggle.toString(), BSDropDownToggle.ToggleString);
	}
}
