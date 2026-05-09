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
public class BSAlertWarning<J extends BSAlertWarning<J>>
		extends BSAlert<J>
{
	/**
	 * Alerts
	 * <p>
	 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
	 */
	public BSAlertWarning()
	{
		setType(BSColourTypes.Warning);
	}
	
	public BSAlertWarning(String paragraph)
	{
		super(paragraph);
		setType(BSColourTypes.Warning);
	}
	
	public BSAlertWarning(IComponentHierarchyBase<?, ?> component)
	{
		super(component);
		setType(BSColourTypes.Warning);
	}
	
}
