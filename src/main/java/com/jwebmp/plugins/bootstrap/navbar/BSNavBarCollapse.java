package com.jwebmp.plugins.bootstrap.navbar;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.containers.BSContainerChildren;

public class BSNavBarCollapse<J extends BSNavBarCollapse<J>> extends DivSimple<J>
        implements BSContainerChildren
{
    private boolean animated = true;
    private String collapseFieldName;

    public BSNavBarCollapse(String collapseFieldName)
    {
        this.collapseFieldName = collapseFieldName;
        addClass("collapse");
        addClass("navbar-collapse");
    }

    public boolean isAnimated()
    {
        return animated;
    }

    public J setAnimated(boolean animated)
    {
        this.animated = animated;
        return (J) this;
    }

    public String getCollapseFieldName()
    {
        return collapseFieldName;
    }

    public J setCollapseFieldName(String collapseFieldName)
    {
        this.collapseFieldName = collapseFieldName;
        return (J) this;
    }

    public J addNavBar(BSNavBarNavs<?> navBarNavs)
    {
        add(navBarNavs);
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!Strings.isNullOrEmpty(getCollapseFieldName()))
        {
            addAttribute("[ngbCollapse]", getCollapseFieldName());
            addAttribute("[animation]", animated + "");
            addConfiguration(AnnotationUtils.getNgImportReference("NgbCollapse", "@ng-bootstrap/ng-bootstrap"));
            addConfiguration(AnnotationUtils.getNgImportModule("NgbCollapse"));
        }
        super.init();
    }
}
