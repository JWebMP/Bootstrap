package com.jwebmp.plugins.bootstrap.toasts.events;


import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.plugins.bootstrap.alerts.events.BSAlertEvents;
import io.smallrye.mutiny.Uni;
import lombok.extern.java.Log;

import java.util.logging.Level;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;
import static com.jwebmp.interception.services.StaticStrings.STRING_ANGULAR_EVENT_START;

/**
 * Handles all events. Over-ride methods.
 *
 * @author GedMarc
 */
@Log
public abstract class BSToastHideEvent<J extends BSToastHideEvent<J>>
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
    public BSToastHideEvent(IComponentHierarchyBase<?, ?> component)
    {
        super(EventTypes.undefined, component);
        setComponent(component);
    }

    @Override
    public Uni<Void> fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
    {
        try
        {
            onHide(call, response);
        }
        catch (Exception e)
        {
            BSToastHideEvent.log.log(Level.SEVERE, "Error In Firing Event", e);
        }
        return Uni.createFrom()
                  .voidItem();
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
                          .addAttribute("ng-bs-toast-hide-directive",
                                  STRING_ANGULAR_EVENT_START + renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
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
    public abstract void onHide(AjaxCall<?> call, AjaxResponse<?> response);
}
