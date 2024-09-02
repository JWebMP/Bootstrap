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
package com.jwebmp.plugins.bootstrap.navs;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap.navs.interfaces.BSNavsChildren;
import com.jwebmp.plugins.bootstrap.navs.interfaces.IBSNavs;
import com.jwebmp.plugins.bootstrap.navs.parts.BSNavItem;
import com.jwebmp.plugins.bootstrap.options.BSAlignmentHorizontalOptions;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

import static com.jwebmp.plugins.bootstrap.navs.BSNavsOptions.*;

/**
 * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states. Swap
 * modifier classes to switch between each style.
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Navs",
                      description = "Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and " +
                              "disabled states. Swap modifier classes to switch between each style.",
                      url = "https://v4-alpha.getbootstrap.com/components/navs/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")

@NgImportReference(value = "NgbNav", reference = "@ng-bootstrap/ng-bootstrap")
public class BSNavs<J extends BSNavs<J>>
        extends Div<BSNavsChildren, BSNavsAttributes, GlobalFeatures, GlobalEvents, J>
        implements BSNavBarChildren, IBSNavs<J>, INgComponent<J>
{
    @Override
    public Set<String> moduleImports()
    {
        var s = INgComponent.super.moduleImports();
        s.add("NgbNav");
        return s;
    }

    private boolean pills;
    private boolean vertical;
    private boolean animation;
    private boolean destroyOnHide;
    private String activeId;

    public boolean isPills()
    {
        return pills;
    }

    public J setPills(boolean pills)
    {
        this.pills = pills;
        return (J) this;
    }

    public boolean isVertical()
    {
        return vertical;
    }

    /**
     * The id of the nav that should be active
     * <p>
     * You could also use the .select() method and the (navChange) event
     * <p>
     * <p>
     * Type: any
     *
     * @return
     */
    public String getActiveId()
    {
        return activeId;
    }

    /**
     * Sets the actual alignment for the links, centered and right are good ones
     *
     * @param options
     * @return
     */
    @SuppressWarnings("unchecked")
    @NotNull
    public J setHorizontalAlignment(BSAlignmentHorizontalOptions options)
    {
        addClass(options);
        return (J) this;
    }


    /**
     * The id of the nav that should be active
     * <p>
     * You could also use the .select() method and the (navChange) event
     * <p>
     * <p>
     * Type: any
     *
     * @param activeId
     * @return
     */
    public J setActiveId(String activeId)
    {
        this.activeId = activeId;
        return (J) this;
    }

    /**
     * If true, nav change will be animated.
     * <p>
     * <p>
     * Type: boolean
     * Default value: - — initialized from NgbNavConfig service
     *
     * @return
     */
    public boolean isAnimation()
    {
        return animation;
    }

    /**
     * If true, nav change will be animated.
     * <p>
     * <p>
     * Type: boolean
     * Default value: - — initialized from NgbNavConfig service
     *
     * @param animation
     * @return
     */
    public J setAnimation(boolean animation)
    {
        this.animation = animation;
        return (J) this;
    }

    public boolean isDestroyOnHide()
    {
        return destroyOnHide;
    }

    public J setDestroyOnHide(boolean destroyOnHide)
    {
        this.destroyOnHide = destroyOnHide;
        return (J) this;
    }

    /**
     * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states.
     * Swap modifier classes to switch between each style.
     */
    public BSNavs()
    {
        setTag("ul");
        addAttribute("ngbNav", "");
    }

    @Override
    protected StringBuilder renderBeforeTag()
    {
        if (vertical)
        {
            return new StringBuilder("<div class=\"d-flex\">");
        }
        return super.renderBeforeTag();
    }

    @Override
    protected StringBuilder renderAfterTag()
    {
        if (vertical)
        {
            return new StringBuilder("</div>");
        }
        return super.renderAfterTag();
    }

    @Override
    protected void init()
    {
        addAttribute("#" + getID(), "ngbNav");
        addClass(isPills() ? Nav_Pills : Nav_Tabs);

        if (vertical)
        {
            addAttribute("[orientation]", "'vertical'");
        }
        else
        {
            addAttribute("[orientation]", "'horizontal'");
        }

        if (animation)
        {
            addAttribute("[animation]", "true");
        }
        else
        {
            addAttribute("[animation]", "false");
        }

        if (destroyOnHide)
        {
            addAttribute("[destroyOnHide]", "true");
        }
        else
        {
            addAttribute("[destroyOnHide]", "false");
        }

        if (!Strings.isNullOrEmpty(activeId))
        {
            addAttribute("[(activeId)]", getActiveId());
        }

        super.init();
    }

    /**
     * Returns a slimmer version of me
     *
     * @return
     */
    public IBSNavs<J> asMe()
    {
        return this;
    }

    /**
     * Stack your navigation by changing the flex item direction with the .flex-column utility. Need to stack them on some viewports but
     * not
     * others? Use the responsive versions (e.g., .flex-sm-column).
     *
     * @param vertical
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J setVertical(boolean vertical)
    {
        this.vertical = vertical;
        return (J) this;
    }

    /**
     * Fill and justify
     * Force your .nav’s contents to extend the full available width one of two modifier classes. To proportionately fill all available
     * space with your .nav-items, use .nav-fill. Notice that all horizontal space is occupied, but not every nav item has the same width.
     *
     * @param fill
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J setFill(boolean fill)
    {
        if (fill)
        {
            addClass(BSNavsOptions.Nav_Fill);
        }
        else
        {
            removeClass(BSNavsOptions.Nav_Fill);
        }
        return (J) this;
    }

    /**
     * Sets the buttons to equal width layout
     *
     * @param equalWidth
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J setEqualWidth(boolean equalWidth)
    {
        if (equalWidth)
        {
            addClass(Nav_Justified);
        }
        else
        {
            removeClass(Nav_Justified);
        }
        return (J) this;
    }

    /**
     * Adds a new tab to this collection
     *
     * @param navItem
     * @return
     */
    public J addTab(BSNavItem<?> navItem)
    {
        add(navItem);
        return (J) this;
    }

    /**
     * Adds a drop down to the dav items
     *
     * @return
     */
    @NotNull
    public J addDropDown(BSDropDown<?> dropDown)
    {
        add(dropDown);
        return (J) this;
    }
}
