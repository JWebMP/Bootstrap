package com.jwebmp.plugins.bootstrap.implementations;

import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.angular.services.interfaces.IOnNgComponentAdded;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap.alerts.BSAlert;
import com.jwebmp.plugins.bootstrap.alerts.BSAlerts;
import com.jwebmp.plugins.bootstrap.modal.BSModal;

public class OnBootstrapComponentAdded implements IOnNgComponentAdded<OnBootstrapComponentAdded>
{
    @Override
    public void onComponentAdded(IComponentHierarchyBase<GlobalChildren, ?> parent, IComponentHierarchyBase<GlobalChildren, ?> component)
    {
        var ngComponent = IOnNgComponentAdded.findOwningNgComponent(component);
        if (ngComponent == null)
        {
            return;
        }

        if (component instanceof BSModal comp)
        {
            ngComponent.addConfiguration(AnnotationUtils.getNgConstructorParameter("public modalService: NgbModal"));
            ngComponent.addConfiguration(AnnotationUtils.getNgImportReference("NgbModal", "@ng-bootstrap/ng-bootstrap"));
        }

        if (component instanceof BSAlerts comp)
        {
            ngComponent.addConfiguration(AnnotationUtils.getNgImportReference("NgbAlert", "@ng-bootstrap/ng-bootstrap"));
            ngComponent.addConfiguration(AnnotationUtils.getNgImportModule("NgbAlert"));
        }
        if (component instanceof BSAlert comp)
        {
            ngComponent.addConfiguration(AnnotationUtils.getNgImportReference("NgbAlert", "@ng-bootstrap/ng-bootstrap"));
            ngComponent.addConfiguration(AnnotationUtils.getNgImportModule("NgbAlert"));
        }
    }

    @Override
    public Integer sortOrder()
    {
        return Integer.MIN_VALUE;
    }
}
