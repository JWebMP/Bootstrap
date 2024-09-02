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
package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.html.interfaces.events.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.*;
import com.jwebmp.plugins.bootstrap.navs.*;
import com.jwebmp.plugins.bootstrap.navs.interfaces.*;

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
public class BSNavBarNavs<J extends BSNavBarNavs<J>>
        extends Div<BSNavsChildren, BSNavsAttributes, GlobalFeatures, GlobalEvents, J>
        implements BSNavBarChildren, INgComponent<J>
{
    /**
     * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states.
     * Swap modifier classes to switch between each style.
     */
    public BSNavBarNavs()
    {
        setTag("ul");
        addClass("navbar-nav");
    }

    public J addNav(BSNavBarItem<?> navBarItem)
    {
        return addNav(navBarItem, false);
    }

    public J addNav(BSNavBarItem<?> navBarItem, boolean active)
    {
        add(navBarItem);
        if (active)
        {
            navBarItem.addClass("active");
        }
        return (J) this;
    }

    @Override
    protected void init()
    {
        super.init();
    }

}
