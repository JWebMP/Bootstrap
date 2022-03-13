package com.jwebmp.plugins.bootstrap.dropdown.interfaces;

import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap.dropdown.BSDropDownAsListItem;
import com.jwebmp.plugins.bootstrap.dropdown.parts.BSDropDownButton;
import com.jwebmp.plugins.bootstrap.dropdown.parts.BSDropDownMenu;
import com.jwebmp.plugins.bootstrap.toggle.BSDropDownToggle;

public interface IBSDropDownAsListItem<J extends BSDropDownAsListItem<J>>
{
	BSDropDownButton<?> addDropDownButton();

	BSDropDownToggle<?> addDropDownToggle(BSDropDownToggle<?> toggle);

	BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions);

	BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions, BSButtonSizeOptions sizeOptions);

	BSDropDownMenu<?> addDropDownMenu();
}
