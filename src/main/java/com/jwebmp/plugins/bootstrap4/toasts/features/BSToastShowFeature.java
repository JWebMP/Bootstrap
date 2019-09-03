package com.jwebmp.plugins.bootstrap4.toasts.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;

public class BSToastShowFeature
		extends Feature
{

	public BSToastShowFeature(ComponentHierarchyBase component)
	{
		super("BSToastShowFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "toast('show');");
	}

}
