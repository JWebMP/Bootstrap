package za.co.mmagon.jwebswing.plugins.bootstrap4.collapse.features;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseHideFeature<J extends BSCollapseHideFeature<J>>
		extends Feature<JavaScriptPart, J>
{
	public BSCollapseHideFeature(ComponentHierarchyBase component)
	{
		super("BSCollapseHideFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "collapse('hide');" + getNewLine());
	}

}
