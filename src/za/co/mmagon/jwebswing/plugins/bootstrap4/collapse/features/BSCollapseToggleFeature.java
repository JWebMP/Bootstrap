package za.co.mmagon.jwebswing.plugins.bootstrap4.collapse.features;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseToggleFeature<J extends BSCollapseToggleFeature<J>>
		extends Feature<JavaScriptPart, J>
{
	public BSCollapseToggleFeature(ComponentHierarchyBase component)
	{
		super("BSCollapseToggleFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "collapse('toggle');" + getNewLine());
	}

}
