package com.jwebmp.plugins.bootstrap.collapse.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseToggleFeature<J extends BSCollapseToggleFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart<?>, J>
{
	public BSCollapseToggleFeature(IComponentHierarchyBase<?,?> component)
	{
		super("BSCollapseToggleFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "collapse('toggle');" + getNewLine());
	}

}
