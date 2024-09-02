package com.jwebmp.plugins.bootstrap.datepicker;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

import java.util.Set;

@NgImportReference(value = "NgbDateStruct, NgbCalendar", reference = "@ng-bootstrap/ng-bootstrap")

@NgImportReference(value = "NgbDatepicker", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportReference(value = "NgbInputDatepicker", reference = "@ng-bootstrap/ng-bootstrap")
public class BSDatePicker<J extends BSDatePicker<J>> extends InputTextType<J> implements INgComponent<J>
{
    @Override
    public Set<String> moduleImports()
    {
        var s = INgComponent.super.moduleImports();
        s.add("NgbDatepicker");
        s.add("NgbInputDatepicker");
        return s;
    }

    private IComponentHierarchyBase<?, ?> toggle;

    public BSDatePicker()
    {

    }

    @Override
    protected void init()
    {
        if (toggle == null)
        {
            setTag("ngb-datepicker");
            setInlineClosingTag(false);
            setClosingTag(true);
        }
        else
        {
            addAttribute("ngbDatepicker", "");
            addClass("form-control");
            setTag("input");
            setInlineClosingTag(false);
            setClosingTag(false);
        }
        addAttribute("#" + getID(), "ngbDatepicker");
        super.init();
    }

    @Override
    public java.util.List<String> constructorParameters()
    {
        return java.util.List.of("private calendar: NgbCalendar");
    }

    @SuppressWarnings("unchecked")
    public <T extends IComponentHierarchyBase<?, ?>> J createToggle(T component)
    {
        this.toggle = component;
        component.asAttributeBase()
                 .addAttribute("(click)", getID() + ".toggle()");
        return (J) this;
    }

    @Override
    protected StringBuilder renderAfterTag()
    {
        if (this.toggle != null)
        {
            return new StringBuilder(toggle.toString(0));
        }
        return super.renderAfterTag();
    }
}
