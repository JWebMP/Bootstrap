package com.jwebmp.plugins.bootstrap.dropdown.parts;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;

import java.util.Set;

/**
 * @author GedMarc
 * @since 13 Jan 2017
 */
@NgImportReference(value = "NgbDropdownItem", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportModule("NgbDropdownItem")
public class BSDropDownItem<J extends BSDropDownItem<J>>
        extends DivSimple<J> implements INgComponent<J>
{
    public BSDropDownItem()
    {
        setTag("button");
        addAttribute("ngbDropdownItem", "");
    }
}
