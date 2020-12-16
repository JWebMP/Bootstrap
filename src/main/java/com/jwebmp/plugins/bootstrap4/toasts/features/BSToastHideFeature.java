package com.jwebmp.plugins.bootstrap4.toasts.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class BSToastHideFeature
		extends Feature<GlobalFeatures, JavaScriptPart<?>,BSToastHideFeature>
{

	public BSToastHideFeature(ComponentHierarchyBase component)
	{
		super("BSToastHideFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "toast('hide');");
	}

}
