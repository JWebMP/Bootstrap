package com.jwebmp.plugins.bootstrap4.toggle;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.dropdown.options.BSDropDownOptions;

public class BSDropDownToggleTitleLink<J extends BSDropDownToggleTitleLink<J>>
		extends Link<J>
		implements BSToggleChildren<IComponentHierarchyBase, J>
{
	public BSDropDownToggleTitleLink()
	{
		addClass(BSDropDownOptions.Dropdown_Toggle);
		addAttribute(LinkAttributes.Data_Toggle, BSDropDownToggle.ToggleString);
	}

	public BSDropDownToggleTitleLink(String directToAddress)
	{
		super(directToAddress);
		addClass(BSDropDownOptions.Dropdown_Toggle);
		addAttribute(LinkAttributes.Data_Toggle, BSDropDownToggle.ToggleString);
	}

	public BSDropDownToggleTitleLink(String directToAddress, String targetFrameName)
	{
		super(directToAddress, targetFrameName);
		addClass(BSDropDownOptions.Dropdown_Toggle);
		addAttribute(LinkAttributes.Data_Toggle, BSDropDownToggle.ToggleString);
	}

	public BSDropDownToggleTitleLink(String directToAddress, String targetFrameName, String text)
	{
		super(directToAddress, targetFrameName, text);
		addClass(BSDropDownOptions.Dropdown_Toggle);
		addAttribute(LinkAttributes.Data_Toggle, BSDropDownToggle.ToggleString);
	}

	public BSDropDownToggleTitleLink(String directToAddress, String targetFrameName, ComponentHierarchyBase component)
	{
		super(directToAddress, targetFrameName, component);
		addClass(BSDropDownOptions.Dropdown_Toggle);
		addAttribute(LinkAttributes.Data_Toggle, BSDropDownToggle.ToggleString);
	}
}
