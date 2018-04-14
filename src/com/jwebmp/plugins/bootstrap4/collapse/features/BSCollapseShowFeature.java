package com.jwebmp.plugins.bootstrap4.collapse.features;

import com.jwebmp.Feature;
import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

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
