package com.jwebmp.plugins.bootstrap4.toasts.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;

public class BSToastHideFeature
		extends Feature
{

	public BSToastHideFeature(ComponentHierarchyBase component)
	{
		super("BSToastHideFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "toast('hide');");
	}

}
