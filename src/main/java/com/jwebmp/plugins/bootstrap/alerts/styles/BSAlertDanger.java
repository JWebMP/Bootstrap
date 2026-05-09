package com.jwebmp.plugins.bootstrap.alerts.styles;

import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.plugins.bootstrap.*;
import com.jwebmp.plugins.bootstrap.alerts.*;

/**
 * Alerts
 * <p>
 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public class BSAlertDanger<J extends BSAlertDanger<J>>
		extends BSAlert<J>
{
	
	/**
	 * Alerts
	 * <p>
	 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
	 */
	public BSAlertDanger()
	{
		setType(BSColourTypes.Danger);
	}
	
	public BSAlertDanger(String paragraph)
	{
		super(paragraph);
		setType(BSColourTypes.Danger);
	}
	
	public BSAlertDanger(IComponentHierarchyBase<?, ?> component)
	{
		super(component);
		setType(BSColourTypes.Danger);
	}
}
