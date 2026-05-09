package com.jwebmp.plugins.bootstrap.carousel.events;


import com.jwebmp.core.Component;
import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.plugins.bootstrap.carousel.BSCarouselEvents;
import io.smallrye.mutiny.Uni;
import lombok.extern.java.Log;

import java.util.logging.Level;

/**
 * Handles all events. Over-ride methods.
 *
 * @author GedMarc
 */
@Log
public abstract class BSCarouselSlideEvent<J extends BSCarouselSlideEvent<J>>
        extends Event<GlobalFeatures, J>
        implements GlobalEvents<J>, BSCarouselEvents<J>
{
    /**
     * Logger for the Component
     */


    /**
     * Performs a click
     *
     * @param component The component this click is going to be acting on
     */
    public BSCarouselSlideEvent(Component component)
    {
        super(EventTypes.undefined, component);
    }

    @Override
    public Uni<Void> fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
    {
        try
        {
            onSlide(call, response);
        }
        catch (Exception e)
        {
            BSCarouselSlideEvent.log.log(Level.SEVERE, "Error In Firing Event", e);
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
                          .addAttribute("slideClassName", getClass().getCanonicalName());
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
    public abstract void onSlide(AjaxCall<?> call, AjaxResponse<?> response);
}
