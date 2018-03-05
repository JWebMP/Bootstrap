package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.controls;

import org.junit.jupiter.api.Test;

class BSFormCheckboxInputTest
{

	@Test
	public void testCheckbox()
	{
		BSFormCheckboxInput checkboxInput = new BSFormCheckboxInput("CheckboxGroup");
		System.out.println(checkboxInput.toString(0));
	}
}
