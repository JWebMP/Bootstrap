package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@NgImportReference(value = "NgbAccordionBody", reference = "@ng-bootstrap/ng-bootstrap")
public class BSAccordionPanelBody<J extends BSAccordionPanelBody<J>> extends DivSimple<J> implements INgComponent<J>
{
    private DivSimple<?> ngTemplate = new DivSimple<>();

    @Override
    public Set<String> moduleImports()
    {
        var s = INgComponent.super.moduleImports();
        s.add("NgbAccordionBody");
        return s;
    }

    public BSAccordionPanelBody()
    {
        addAttribute("ngbAccordionBody", "");
        ngTemplate.setTag("ng-template");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            super.add(ngTemplate);
        }
        super.init();
    }

    @Override
    public @NotNull J add(@NotNull String textToAdd)
    {
        ngTemplate.add(textToAdd);
        return (J) this;
    }

    @Override
    public @NotNull J add(@NotNull GlobalChildren newChild)
    {
        ngTemplate.add(newChild);
        return (J) this;
    }

    @Override
    public @NotNull J add(@NotNull Integer position, @NotNull GlobalChildren newChild)
    {
        ngTemplate.add(position, newChild);
        return (J) this;
    }


}
