package com.jwebmp.plugins.bootstrap.modal.events.show;


import com.jwebmp.core.Component;
import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
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
public abstract class BSModalShowAdapter<J extends BSModalShowAdapter<J>>
        extends Event<GlobalFeatures, J>
{

    /**
     * Logger for the Component
     */


    /**
     * Performs a click
     *
     * @param component The component this click is going to be acting on
     */
    public BSModalShowAdapter(Component component)
    {
        super(EventTypes.contextmenu, component);

    }

    @Override
    public Uni<Void> fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
    {
        try
        {
            onModalShow(call, response);
        }
        catch (Exception e)
        {
            BSModalShowAdapter.log.log(Level.SEVERE, "Error In Firing Event", e);
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
                          .addAttribute("ng-show-bootstrap-modal", STRING_ANGULAR_EVENT_START + renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
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
    public abstract void onModalShow(AjaxCall<?> call, AjaxResponse<?> response);
}
