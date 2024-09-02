package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

import static com.jwebmp.plugins.bootstrap.BSColourTypes.AlertsType;

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
