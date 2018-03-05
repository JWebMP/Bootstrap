package za.co.mmagon.jwebswing.plugins.bootstrap4.collapse.features;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.Div;

class BSCollapseToggleFeatureTest
		extends BaseTestClass
{

	@Test
	void assignFunctionsToComponent()
	{
		BSCollapseToggleFeature feature = new BSCollapseToggleFeature(new Div());
		System.out.println(feature.renderJavascript());
	}
}
