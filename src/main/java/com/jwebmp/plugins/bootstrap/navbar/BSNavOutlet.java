package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.navs.BSNavs;

import java.util.Set;

@NgImportReference(value = "NgbNavOutlet", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportModule("NgbNavOutlet")
public class BSNavOutlet<J extends BSNavOutlet<J>> extends DivSimple<J> implements INgComponent<J>
{
    private BSNavs<?> forNav;

    public BSNavOutlet(BSNavs<?> forNav)
    {
        this.forNav = forNav;
    }

    @Override
    protected void init()
    {
        addAttribute("[ngbNavOutlet]", forNav.getID());
        super.init();
    }
}
