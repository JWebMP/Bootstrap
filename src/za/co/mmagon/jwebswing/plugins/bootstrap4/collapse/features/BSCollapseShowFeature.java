package za.co.mmagon.jwebswing.plugins.bootstrap4.collapse.features;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseShowFeature<J extends BSCollapseShowFeature<J>>
		extends Feature<JavaScriptPart, J>
{
	public BSCollapseShowFeature(ComponentHierarchyBase component)
	{
		super("BSCollapseShowFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "collapse('show');" + getNewLine());
	}

}
