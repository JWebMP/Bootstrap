package com.jwebmp.plugins.bootstrap4.toasts.features;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.bootstrap4.toasts.BSToastOptions;

public class BSToastFeature<J extends BSToastFeature<J>>
		extends Feature<GlobalFeatures, BSToastOptions<?>, J>
{
	public BSToastFeature(ComponentHierarchyBase component)
	{
		super("BSToastFeature", component);
		setOptions(new BSToastOptions<>());
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "toast(" + getOptions() + ");");
	}
}
