package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

public class BSFormGroupTest
		extends BaseTestClass
{
	@Test
	public void getLabel()
	{
		BSFormGroup group = new BSFormGroup();
		group.addLabel("THis is the label");
		System.out.println(group.toString(0));
	}


}
