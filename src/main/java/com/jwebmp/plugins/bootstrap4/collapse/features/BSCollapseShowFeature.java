package com.jwebmp.plugins.bootstrap4.collapse.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseShowFeature<J extends BSCollapseShowFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart, J>
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
