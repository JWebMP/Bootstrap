package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.angular.client.annotations.boot.NgBootDeclaration;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.annotations.structures.NgField;
import com.jwebmp.core.base.angular.client.annotations.structures.NgMethod;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.angular.client.services.interfaces.IComponent;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.Bold;
import com.jwebmp.core.base.html.DivSimple;

import java.util.List;
import java.util.Set;

import static com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils.getTsFilename;

@NgImportReference(value = "TemplateRef", reference = "@angular/core")
@NgBootDeclaration("BSToasts")

@NgField("toastData?: any;")
@NgField("private updated: boolean = false;")
@NgMethod("isTemplate(toast : any) { return toast.textOrTpl instanceof TemplateRef; }")

@NgImportModule("NgbToast")
@NgImportReference(value = "NgbToast", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportReference(value = "NgbToastHeader", reference = "@ng-bootstrap/ng-bootstrap")
public class BSToasts<J extends BSToasts<J>> extends DivSimple<J> implements INgComponent<J>
{
    private static ToastDataService<?> toastDataService;
    private boolean icon;

    public BSToasts(ToastDataService<?> toastDataService)
    {
        this();
        BSToasts.toastDataService = toastDataService;
    }

    public BSToasts()
    {
        setTag("ngb-toast");
    }

    @Override
    public Set<String> moduleImports()
    {
        var s = INgComponent.super.moduleImports();
        s.add("NgbToast");
        s.add("NgbToastHeader");
        return s;
    }

    public String getServiceName()
    {
        if (toastDataService == null)
        {
            return "toastDataService";
        }
        String name = getTsFilename(toastDataService.getClass());
        name = name.substring(0, 1)
                .toLowerCase() + name.substring(1);
        return name;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            String name = getServiceName();
            if (toastDataService != null)
            {
                addConfiguration(AnnotationUtils.getNgComponentReference((Class<? extends IComponent<?>>) toastDataService.getClass()));
                addConfiguration(AnnotationUtils.getNgConstructorParameter("public " + getServiceName() + " : " + getTsFilename(toastDataService.getClass())));

                addAttribute("*ngFor", "let toast of toastData?.out ");
                addAttribute("[class]", "toast.classname ");
                addAttribute("[autohide]", "toast.autohide ");
                addAttribute("[delay]", "toast.delay || 5000");
                //addAttribute("(hidden)", "" + name + ".remove(toast) ");

                DivSimple<?> template = new DivSimple<>();
                template.setTag("ng-template");
                template.addAttribute("ngbToastHeader", "");
                template.addAttribute("*ngIf", "toast.header");
                template.add(new Bold<>().addClass("me-auto {{toast.classname}}")
                        .setText("{{toast.header}}"));
                add(template);
                add("{{toast.body}}");

            }
        }
        super.init();
    }

    @Override
    public List<String> afterViewInit()
    {
        List<String> out = INgComponent.super.afterViewInit();
        if (toastDataService != null)
        {
            out.add("""
                            this.%s.data.subscribe((dd : any) => {
                                this.toastData = dd;
                                this.updated = true;
                            });
                    """.formatted(getServiceName()));
        }
        return out;
    }

    @Override
    public List<String> host()
    {
        return List.of("{'class': 'toast-container position-fixed top-0 end-0 p-3', 'style': 'z-index: 1200'}");
    }

}
