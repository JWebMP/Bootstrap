package com.jwebmp.plugins.bootstrap4.toasts.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class BSToastDisposeFeature
		extends Feature<GlobalFeatures, JavaScriptPart<?>,BSToastDisposeFeature>
{

	public BSToastDisposeFeature(IComponentHierarchyBase<?,?> component)
	{
		super("BSToastDisposeFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "toast('dispose');");
	}

}
