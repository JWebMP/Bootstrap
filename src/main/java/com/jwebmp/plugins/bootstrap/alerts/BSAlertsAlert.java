package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.interfaces.*;

import static com.jwebmp.plugins.bootstrap.BSColourTypes.*;

public class BSAlertsAlert extends BSAlert<BSAlertsAlert>
{
	public BSAlertsAlert()
	{
		setType(AlertsType);
	}
	
	public BSAlertsAlert(String paragraph)
	{
		super(paragraph);
		setType(AlertsType);
	}
	
	public BSAlertsAlert(IComponentHierarchyBase<?, ?> component)
	{
		super(component);
		setType(AlertsType);
	}
}
