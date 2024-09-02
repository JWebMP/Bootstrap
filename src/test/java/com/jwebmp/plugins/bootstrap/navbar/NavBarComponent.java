package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.angular.client.annotations.angular.NgComponent;
import com.jwebmp.plugins.bootstrap.BSSizes;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarColourSchemes;
import org.junit.jupiter.api.Test;

@NgComponent("navbar-widget")
public class NavBarComponent extends BSNavBar<NavBarComponent>
{
    private NavBarNavsComponent navsComponent;

    public NavBarComponent()
    {
        navsComponent = new NavBarNavsComponent();
        setColourTheme(BSNavBarColourSchemes.Navbar_Light);
        setCollapseWhen(BSSizes.Large);
    }

    @Override
    protected void init()
    {
        addBrand("Responsive Navbar");
        addToggle().setText("&#9776;")
                   .setCollapseFieldName("isMenuCollapsed");
        addNavs(navsComponent);
        super.init();
    }

    @Test
    public void testOutput()
    {

        System.out.println(new NavBarComponent().toString(0));
    }

    public NavBarNavsComponent getNavsComponent()
    {
        return navsComponent;
    }
}
