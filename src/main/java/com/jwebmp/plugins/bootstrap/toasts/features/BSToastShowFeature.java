package com.jwebmp.plugins.bootstrap.toasts.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class BSToastShowFeature
		extends Feature<GlobalFeatures, JavaScriptPart<?>,BSToastShowFeature>
{

	public BSToastShowFeature(IComponentHierarchyBase<?,?> component)
	{
		super("BSToastShowFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "toast('show');");
	}

}
