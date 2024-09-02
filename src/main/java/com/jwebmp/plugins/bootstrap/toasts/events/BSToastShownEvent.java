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
package com.jwebmp.plugins.bootstrap.toasts.events;


import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.plugins.bootstrap.alerts.events.BSAlertEvents;
import lombok.extern.java.Log;

import java.util.logging.Level;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;
import static com.jwebmp.interception.services.StaticStrings.STRING_ANGULAR_EVENT_START;

/**
 * Handles all events. Over-ride methods.
 *
 * @author GedMarc
 */
@Log
public abstract class BSToastShownEvent<J extends BSToastShownEvent<J>>
        extends Event<GlobalFeatures, J>
        implements BSAlertEvents<J>
{

    /**
     * Logger for the Component
     */


    /**
     * Performs a click
     *
     * @param component The component this click is going to be acting on
     */
    public BSToastShownEvent(IComponentHierarchyBase<?, ?> component)
    {
        super(EventTypes.undefined, component);
        setComponent(component);
    }

    @Override
    public void fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
    {
        try
        {
            onShown(call, response);
        }
        catch (Exception e)
        {
            BSToastShownEvent.log.log(Level.SEVERE, "Error In Firing Event", e);
        }
    }

    /**
     * Sets JQuery and Angular enabled, adds the directive to angular, and the attribute to the component
     */
    @Override
    protected void preConfigure()
    {
        if (!isConfigured())
        {
            getComponent().asAttributeBase()
                          .addAttribute("ng-bs-toast-shown-directive", STRING_ANGULAR_EVENT_START + renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
        }
        super.preConfigure();
    }

    /**
     * Triggers on Click
     * <p>
     *
     * @param call     The physical AJAX call
     * @param response The physical Ajax Receiver
     */
    public abstract void onShown(AjaxCall<?> call, AjaxResponse<?> response);
}
