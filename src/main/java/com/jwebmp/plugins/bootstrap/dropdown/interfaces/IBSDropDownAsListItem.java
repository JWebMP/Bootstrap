package com.jwebmp.plugins.bootstrap.dropdown.interfaces;

import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap.dropdown.BSNavDropDown;
import com.jwebmp.plugins.bootstrap.dropdown.parts.BSDropDownItem;
import com.jwebmp.plugins.bootstrap.dropdown.parts.BSDropDownMenu;
import com.jwebmp.plugins.bootstrap.toggle.BSDropDownToggle;

public interface IBSDropDownAsListItem<J extends BSNavDropDown<J>>
{
	BSDropDownItem<?> addDropDownButton();

	BSDropDownToggle<?> addDropDownToggle(BSDropDownToggle<?> toggle);

	BSDropDownItem<?> addDropDownButton(BSButtonOptions buttonOptions);

	BSDropDownItem<?> addDropDownButton(BSButtonOptions buttonOptions, BSButtonSizeOptions sizeOptions);

	BSDropDownMenu<?> addDropDownMenu();
}
