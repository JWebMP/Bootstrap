package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.angular.implementations.*;
import org.junit.jupiter.api.*;

public class NavBarNavsComponent extends BSNavBarNavs<NavBarNavsComponent>
{
    @Override
    protected void init()
    {
        addNav(new BSNavBarItem<>(new BSNavBarLink<>(".").setText("Features"), "isMenuCollapsed"), true);
        addNav(new BSNavBarItem<>(new BSNavBarLink<>(".").setText("Examples"), "isMenuCollapsed"));
        addNav(new BSNavBarItem<>(new BSNavBarLink<>(".").setText("About"), "isMenuCollapsed"));
        super.init();
    }

    @Test
    public void testOutput()
    {

        System.out.println(new NavBarNavsComponent().toString(0));
    }

}
