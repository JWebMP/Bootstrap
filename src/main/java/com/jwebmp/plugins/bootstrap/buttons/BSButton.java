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
package com.jwebmp.plugins.bootstrap.buttons;

import com.guicedee.services.jsonrepresentation.json.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.html.interfaces.events.*;
import com.jwebmp.core.base.servlets.enumarations.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.dropdown.interfaces.*;
import com.jwebmp.plugins.bootstrap.forms.*;
import com.jwebmp.plugins.bootstrap.options.*;

/**
 * Buttons
 * <p>
 * Use Bootstrap’s custom button styles for actions in forms, dialogs, and more. Includes support for a handful of contextual variations,
 * sizes, states, and more.
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Buttons",
                      description = "Use Bootstrap’s custom button styles for actions in forms, dialogs, and more. Includes support for a handful of " +
                              "contextual variations, sizes, states, and more.",
                      url = "https://v4-alpha.getbootstrap.com/components/buttons/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSButton<J extends BSButton<J>>
        extends Button<GlobalChildren, BSButtonAttributes, GlobalFeatures, GlobalEvents, J>
        implements GlobalChildren, BSFormChildren, IBSButton<J>
{
    private static final String roleAttribute = "button";

    /**
     * Constructs a new BS Button with the given text
     *
     * @param text
     */
    public BSButton(String text)
    {
        this();
        setText(text);
    }

    /**
     * Constructs a new button
     */
    @SuppressWarnings("")
    public BSButton()
    {
        addClass(BSButtonOptions.Btn);
        addAttribute(GlobalAttributes.Type, BSButton.roleAttribute);
    }

    /**
     * Neater view
     *
     * @return
     */
    public IBSButton<?> asMe()
    {
        return this;
    }

    /**
     * Button tags
     * <p>
     * The .btn classes are designed to be used with the &lt;button&gt; element.
     * <p>
     * However, you can also use these classes on &lt;a&gt; or &lt;input&gt; elements (though some browsers may apply a slightly different
     * rendering). &lt;p&gt; When using button classes on &lt;a&gt;
     * elements that are used to trigger in-page functionality (like collapsing content), rather than linking to new pages or sections
     * within the current page, these links should be given a
     * role="button" to appropriately convey their purpose to assistive technologies such as screen readers.
     */
    @Override
    protected void preConfigure()
    {
        if (!isConfigured() && ComponentTypes.Link.getComponentTag()
                                                  .equalsIgnoreCase(getTag()))
        {
            addAttribute(BSButtonAttributes.Role, BSButton.roleAttribute);
        }
        super.preConfigure();
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setDanger(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Danger);
        }
        else

        {
            removeClass(BSButtonOptions.Btn_Danger);
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setDangerOutline(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Outline_Danger);
        }
        else

        {
            removeClass(BSButtonOptions.Btn_Outline_Danger);
        }

        return (J) this;
    }

    /**
     * Disabled state
     * <p>
     * Make buttons look inactive by adding the disabled boolean attribute to any button element.
     * <p>
     * Heads up! IE9 and below render disabled buttons with gray, shadowed text that we can’t override.
     * <p>
     * Disabled buttons using the a element behave a bit different:
     * <p>
     * a's don’t support the disabled attribute, so you must add the .disabled class to make it visually appear disabled. Some
     * future-friendly styles are included to disable all pointer-events on
     * anchor buttons. In browsers which support that property, you won’t see the disabled cursor at all. Disabled buttons should include
     * the aria-disabled="true" attribute to indicate the state of
     * the element to assistive technologies.
     * <p>
     * <p>
     * <p>
     * Link functionality caveat
     * <p>
     * The .disabled class uses pointer-events: none to try to disable the link functionality of as, but that CSS property is not yet
     * standardized. In addition, even in browsers that do support
     * pointer-events: none, keyboard navigation remains unaffected, meaning that sighted keyboard users and users of assistive
     * technologies
     * will still be able to activate these links. So to be safe,
     * add a tabindex="-1" attribute on these links (to prevent them from receiving keyboard focus) and use custom JavaScript to disable
     * their functionality.
     *
     * @param disabled
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setDisabled(boolean disabled)
    {
        if (disabled)
        {
            addAttribute(GlobalAttributes.Aria_Disabled, Boolean.toString(true));
            addAttribute(BSButtonAttributes.Disabled, StaticStrings.STRING_EMPTY);
            addClass("disabled");
        }
        else
        {
            getAttributes().remove(BSButtonAttributes.Disabled.toString());
            addAttribute(GlobalAttributes.Aria_Disabled, Boolean.toString(false));
            removeClass("disabled");
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setInfo(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Info);
        }
        else
        {
            removeClass(BSButtonOptions.Btn_Info);
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setInfoOutline(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Outline_Info);
        }
        else
        {
            removeClass(BSButtonOptions.Btn_Outline_Info);
        }

        return (J) this;
    }

    /**
     * Sets the style as link
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setLink(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Link);
        }
        else
        {
            removeClass(BSButtonOptions.Btn_Link);
        }

        return (J) this;
    }

    /**
     * Buttons will appear pressed (with a darker background, darker border, and inset shadow) when active.
     * <p>
     * There’s no need to add a class to buttons as they use a pseudo-class. However, you can still force the same active appearance with
     * .active (and include the aria-pressed="true" attribute) should
     * you need to replicate the state programmatically.
     *
     * @param pressed
     * @return
     */
    @Override
    public BSButton<?> setPressed(boolean pressed)
    {
        if (pressed)
        {
            addAttribute(GlobalAttributes.Aria_Pressed, Boolean.toString(true));
            addClass(BSDefaultOptions.Active);
        }
        else
        {
            addAttribute(GlobalAttributes.Aria_Pressed, Boolean.toString(false));
            removeClass(BSDefaultOptions.Active.toString());
        }

        return this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setPrimary(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Primary);
        }
        else

        {
            removeClass(BSButtonOptions.Btn_Primary);
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setPrimaryOutline(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Outline_Primary);
        }
        else

        {
            removeClass(BSButtonOptions.Btn_Outline_Primary);
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setSecondary(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Secondary);
        }
        else

        {
            removeClass(BSButtonOptions.Btn_Secondary);
        }

        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setSecondaryOutline(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Outline_Secondary);
        }
        else

        {
            removeClass(BSButtonOptions.Btn_Outline_Secondary);
        }

        return (J) this;
    }

    /**
     * Sizes
     * <p>
     * Fancy larger or smaller buttons? Add .btn-lg or .btn-sm for additional sizes.
     *
     * @param size
     * @return
     */
    @Override
    public BSButton<?> setSize(BSButtonSizeOptions size)
    {
        for (BSButtonSizeOptions value : BSButtonSizeOptions.values())
        {
            removeClass(value.toString());
        }
        addClass(size);

        return this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setSuccess(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Success);
        }
        else
        {
            removeClass(BSButtonOptions.Btn_Success);
        }
        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setSuccessOutline(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Outline_Success);
        }
        else
        {
            removeClass(BSButtonOptions.Btn_Outline_Success);
        }
        return (J) this;
    }

    /**
     * Button plugin Do more with buttons. Control button states or create groups of buttons for more components like toolbars.
     * <p>
     * Toggle states Add data-toggle="button" to toggle a button’s active state. If you’re pre-toggling a button, you must manually add the
     * .active class
     *
     * @param toggle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setToggle(boolean toggle)
    {
        if (toggle)
        {
            addAttribute(BSButtonAttributes.Data_Toggle, BSButton.roleAttribute);
            addAttribute(InputButtonTypeAttributes.AutoComplete.toString(), "off");
        }
        else
        {
            getAttributes().remove(BSButtonAttributes.Data_Toggle.toString(), BSButton.roleAttribute);
            getAttributes().remove(InputButtonTypeAttributes.AutoComplete.toString());
        }
        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setWarning(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Warning);
        }
        else
        {
            removeClass(BSButtonOptions.Btn_Warning);
        }
        return (J) this;
    }

    /**
     * Set or remove the style
     *
     * @param applyStyle
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public J setWarningOutline(boolean applyStyle)
    {
        if (applyStyle)
        {
            addClass(BSButtonOptions.Btn_Outline_Warning);
        }
        else
        {
            removeClass(BSButtonOptions.Btn_Outline_Warning);
        }
        return (J) this;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
