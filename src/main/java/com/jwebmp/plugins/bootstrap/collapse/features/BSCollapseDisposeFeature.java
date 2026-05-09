package com.jwebmp.plugins.bootstrap.collapse.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseDisposeFeature<J extends BSCollapseDisposeFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart<?>, J>
{
	public BSCollapseDisposeFeature(IComponentHierarchyBase<?,?> component)
	{
		super("BSCollapseDisposeFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "collapse('dispose');" + getNewLine());
	}

}
