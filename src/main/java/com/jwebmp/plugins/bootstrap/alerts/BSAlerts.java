package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.angular.client.annotations.angular.NgComponent;
import com.jwebmp.core.base.angular.client.annotations.references.NgDataTypeReference;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.annotations.structures.NgField;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.angular.client.services.interfaces.IComponent;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.BSColourTypes;
import com.jwebmp.plugins.bootstrap.alerts.events.BSAlertEvents;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils.getTsFilename;

/**
 * Alerts
 * <p>
 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
@NgComponent("alert-closable")

@ComponentInformation(name = "Bootstrap Alert",
        description = "Provide contextual feedback messages for typical user actions with the handful of available and flexible alert " + "messages.",
        url = "https://v4-alpha.getbootstrap.com/components/alerts/",
        wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
@NgDataTypeReference(Alert.class)

@NgField("data?: any;")
@NgField("private updated: boolean = false;")
@NgImportReference(value = "NgbAlert", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportModule("NgbAlert")
public abstract class BSAlerts<J extends BSAlerts<J>>
        extends Div<GlobalChildren, NoAttributes, GlobalFeatures, BSAlertEvents, J>
        implements IBSAlerts<J>, INgComponent<J>
{
    private AlertDataService alertDataService;

    public BSAlerts(AlertDataService<?> alertDataService)
    {
        this();
        this.alertDataService = alertDataService;
        addConfiguration(AnnotationUtils.getNgComponentReference((Class<? extends IComponent<?>>) alertDataService.getClass()));
        addAttribute("*ngFor", "let alert of data?.out");
        add(new BSAlertsAlert().setType(BSColourTypes.AlertsType)
                .bind("alert.message")
                .addAttribute("(closed)", "close(alert)"));
    }

    /**
     * Alerts
     * <p>
     * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
     */
    public BSAlerts()
    {

    }

    public String getServiceName()
    {
        if (alertDataService == null)
        {
            return "alertDataService";
        }
        String name = getTsFilename(alertDataService.getClass());
        name = name.substring(0, 1)
                .toLowerCase() + name.substring(1);
        return name;
    }

    @Override
    public List<String> afterViewInit()
    {
        List<String> out = INgComponent.super.afterViewInit();
        out.add("        this." + getServiceName() + ".data.subscribe((dd) => {\n" +
                "            this.data = dd;\n" +
                "            this.updated = true;\n" +
                "        });\n");
        return out;
    }

    @Override
    public List<String> methods()
    {
        List<String> out = INgComponent.super.methods();
        if (alertDataService != null)
        {
         /*   out.add("close(alertItem: Alert) {\n" +
                            "    this.data.out?.splice(this.data.out?.indexOf(alertItem), 1);\n" +
                            "}\n");*/
        }
        else
        {
            return List.of();
        }
        return out;
    }

    @Override
    public List<String> constructorParameters()
    {
        List<String> out = new ArrayList<>();
        if (alertDataService != null)
        {
            out.add("public " + getServiceName() + " : " + getTsFilename(alertDataService.getClass()));
        }
        return out;
    }

    /**
     * Alerts
     * <p>
     * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
     */
    public BSAlerts(String paragraph)
    {
        this();
        setText(paragraph);
    }

    /**
     * Alerts
     * <p>
     * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
     */
    public BSAlerts(IComponentHierarchyBase<?, ?> component)
    {
        this();
        add(component);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            String name = getServiceName();

        }
    }

    /**
     * Neater view of this component
     *
     * @return
     */
    public IBSAlerts<?> asMe()
    {
        return this;
    }

}
