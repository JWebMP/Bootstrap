package com.jwebmp.plugins.bootstrap.navs.parts;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.plugins.bootstrap.navs.interfaces.BSNavsChildren;

import java.util.Set;

/**
 * A navigation link item
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
@NgImportReference(value = "NgbNavContent", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportModule("NgbNavContent")
public class BSNavContent<J extends BSNavContent<J>>
        extends Link<J>
        implements BSNavsChildren, ListItemChildren, INgComponent<J>
{
    /**
     * A navigation link contents
     */
    public BSNavContent()
    {
        setTag("ng-template");
        addAttribute("ngbNavContent", "");
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        return super.equals(o);
    }
}
