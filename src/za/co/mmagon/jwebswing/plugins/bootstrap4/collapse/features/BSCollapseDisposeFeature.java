package za.co.mmagon.jwebswing.plugins.bootstrap4.collapse.features;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseDisposeFeature<J extends BSCollapseDisposeFeature<J>>
		extends Feature<JavaScriptPart, J>
{
	public BSCollapseDisposeFeature(ComponentHierarchyBase component)
	{
		super("BSCollapseDisposeFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "collapse('dispose');" + getNewLine());
	}


}
