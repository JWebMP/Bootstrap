package com.jwebmp.plugins.bootstrap4.dropdown.interfaces;

import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDownAsListItem;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownButton;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownMenu;
import com.jwebmp.plugins.bootstrap4.toggle.BSDropDownToggle;

public interface IBSDropDownAsListItem<J extends BSDropDownAsListItem<J>>
{
	BSDropDownButton<?> addDropDownButton();

	BSDropDownToggle<?> addDropDownToggle(BSDropDownToggle toggle);

	BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions);

	BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions, BSButtonSizeOptions sizeOptions);

	BSDropDownMenu<?> addDropDownMenu();
}
