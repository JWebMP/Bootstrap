package com.jwebmp.plugins.bootstrap4.toggle;

import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.buttons.BSButton;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonChildren;
import com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions;

public class BSDropDownToggleTitleButton<J extends BSDropDownToggleTitleButton<J>>
		extends BSButton<J>
		implements BSToggleChildren<IComponentHierarchyBase, J>
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
