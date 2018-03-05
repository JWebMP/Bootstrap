package za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

class BSDropUpTest
		extends BaseTestClass
{

	@Test
	void init()
	{
		BSDropUp<?> up = new BSDropUp();
		System.out.println(up.toString(0));

		BSDropRight<?> right = new BSDropRight();
		System.out.println(right.toString(0));

		BSDropLeft<?> left = new BSDropLeft();
		System.out.println(left.toString(0));
	}
}
