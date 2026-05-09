package com.jwebmp.plugins.bootstrap.carousel.events;


import com.jwebmp.core.Component;
import com.jwebmp.core.Event;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.plugins.bootstrap.carousel.BSCarouselEvents;

import java.util.Objects;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;
import static com.jwebmp.interception.services.StaticStrings.STRING_ANGULAR_EVENT_START;

/**
 * Handles all events. Over-ride methods.
 *
 * @author GedMarc
 */
public abstract class BSCarouselSlidEvent<J extends BSCarouselSlidEvent<J>>
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
    public BSCarouselSlidEvent(Component component)
    {
        super(EventTypes.undefined, component);
    }


    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getComponent());
    }

    @Override
    public boolean equals(Object o)
    {
        return super.equals(o);
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
                          .addAttribute("bs-carousel-slid", STRING_ANGULAR_EVENT_START + renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
        }
        super.preConfigure();
    }

}
