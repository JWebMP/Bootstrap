package com.jwebmp.plugins.bootstrap4.toasts.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;

public class BSToastDisposeFeature
		extends Feature
{

	public BSToastDisposeFeature(ComponentHierarchyBase component)
	{
		super("BSToastDisposeFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "toast('dispose');");
	}

}
