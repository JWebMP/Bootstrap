package com.jwebmp.plugins.bootstrap4.forms.groups.sets;

import com.jwebmp.plugins.bootstrap4.buttons.checkbox.BSCheckBoxGroup;
import com.jwebmp.plugins.bootstrap4.buttons.switches.BSCustomSwitchGroup;
import org.junit.jupiter.api.Test;

import static com.jwebmp.plugins.bootstrap4.options.BSColumnOptions.*;
import static com.jwebmp.plugins.bootstrap4.options.BSSpacingOptions.*;

class BSCheckBoxGroupTest
{

	@Test
	void setCustomControl()
	{
		BSCheckBoxGroup<?> themeSelection = new BSCheckBoxGroup<>().addClass(Col_Md_12);
		themeSelection.setCustomControl(false);
		themeSelection.getLabel()
		              .setText("Test Custom Checkbox");
		//BSCheckBox<?> checkbox = new BSCheckBox<>("Background Image");
		//themeSelection.add(checkbox);

		System.out.println(themeSelection.toString(0));


	}


	@Test
	void setSwitch()
	{
		BSCustomSwitchGroup<?> themeSelection = new BSCustomSwitchGroup<>().addClass(Col_Md_12)
		                                                                   .addClass(Margin_Left_1);

		themeSelection.getLabel()
		              .setText("Test Custom Switch");
		System.out.println(themeSelection.toString(0));

	}
}