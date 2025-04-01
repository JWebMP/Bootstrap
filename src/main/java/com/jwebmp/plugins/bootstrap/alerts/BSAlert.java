/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.BSColourTypes;
import com.jwebmp.plugins.bootstrap.alerts.events.BSAlertEvents;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

/**
 * Alerts
 * <p>
 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
@ComponentInformation(name = "Bootstrap Alert",
        description = "Provide contextual feedback messages for typical user actions with the handful of available and flexible alert " + "messages.",
        url = "https://v4-alpha.getbootstrap.com/components/alerts/",
        wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")

@NgImportReference(value = "NgbAlert", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportModule("NgbAlert")
public class BSAlert<J extends BSAlert<J>>
        extends Div<GlobalChildren, NoAttributes, GlobalFeatures, BSAlertEvents, J> implements INgComponent<J>
{
    private boolean dismissible;
    private BSColourTypes type;

    @Override
    public @NotNull J bind(@NotNull String variableName)
    {
        setText("{{" + variableName + "}}");
        return (J) this;
    }

    /**
     * Alerts
     * <p>
     * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
     */
    public BSAlert()
    {
        setTag("ngb-alert");
    }

    /**
     * Alerts
     * <p>
     * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
     */
    public BSAlert(String paragraph)
    {
        this();
        setText(paragraph);
    }

    /**
     * Alerts
     * <p>
     * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
     */
    public BSAlert(IComponentHierarchyBase<?, ?> component)
    {
        this();
        add(component);
    }


    public boolean isDismissible()
    {
        return dismissible;
    }

    @SuppressWarnings("unchecked")

    public J setDismissible(boolean dismissible)
    {
        this.dismissible = dismissible;
        return (J) this;
    }


    public BSColourTypes getType()
    {
        return type;
    }


    @SuppressWarnings("unchecked")
    public J setType(BSColourTypes type)
    {
        this.type = type;
        return (J) this;
    }


    protected void init()
    {
        if (!isInitialized())
        {
            if (type == null)
            {
                type = BSColourTypes.Info;
            }

            if (type == BSColourTypes.AlertsType)
            {
                addAttribute("[type]", "" + type.toString() + "");
            }
            else
            {
                addAttribute("[type]", "'" + type.toString() + "'");
            }
            addAttribute("[dismissible]", "" + dismissible + "");
        }
    }

}
