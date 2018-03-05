package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.inputs.InputCheckBoxType;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.checkbox.BSCheckBox;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.BSDropDown;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSForm;

class BSFormInputGroupTest
		extends BaseTestClass
{

	@Test
	void getInputGroupAddons()
	{
		BSForm<?> form = new BSForm<>();
		form.addTextInput("Binding", "Label", true)
		    .append("Appending")
		    .prepend("Prepending");

		System.out.println(form.toString(0));


		form.addTextInput("checkbox", "label", true)
		    .append(new BSCheckBox<>().setInput(new InputCheckBoxType<>()));

		form.addTextInput("dropdowns?", "dropdowns", true)
		    .prepend(new BSDropDown<>().addDropDownButton());

		System.out.println(form.toString(0));

	}
}
