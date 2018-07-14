package com.jwebmp.plugins.bootstrap4.buttons.checkbox;

import com.jwebmp.plugins.bootstrap4.buttons.checkbox.styles.BSCheckBoxDanger;
import com.jwebmp.plugins.bootstrap4.buttons.checkbox.styles.BSCheckBoxDark;
import com.jwebmp.plugins.bootstrap4.buttons.checkbox.styles.BSCheckBoxInfo;
import org.junit.jupiter.api.Test;

class BSCheckBoxTest

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
