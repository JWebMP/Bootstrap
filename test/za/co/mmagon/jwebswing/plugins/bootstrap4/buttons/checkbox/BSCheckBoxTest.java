package za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.checkbox;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.checkbox.styles.BSCheckBoxDanger;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.checkbox.styles.BSCheckBoxDark;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.checkbox.styles.BSCheckBoxInfo;

class BSCheckBoxTest
		extends BaseTestClass
{

	@Test
	void preConfigure()
	{
		BSCheckBox box = new BSCheckBox();
		System.out.println(box.toString(0));
	}

	@Test
	void testDanger()
	{
		BSCheckBox box = new BSCheckBoxDanger();
		System.out.println(box.toString(0));
	}

	@Test
	void testDark()
	{
		BSCheckBox box = new BSCheckBoxDark();
		System.out.println(box.toString(0));
	}

	@Test
	void testInfo()
	{
		BSCheckBox box = new BSCheckBoxInfo();
		System.out.println(box.toString(0));
	}

}
