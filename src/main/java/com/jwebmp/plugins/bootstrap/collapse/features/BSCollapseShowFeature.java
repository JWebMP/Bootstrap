package com.jwebmp.plugins.bootstrap.collapse.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseShowFeature<J extends BSCollapseShowFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart<?>, J>
{
	public BSCollapseShowFeature(IComponentHierarchyBase<?,?> component)
	{
		super("BSCollapseShowFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "collapse('show');" + getNewLine());
	}

}
