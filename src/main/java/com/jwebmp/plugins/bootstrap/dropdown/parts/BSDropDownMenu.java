package com.jwebmp.plugins.bootstrap.dropdown.parts;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

import java.util.Set;

/**
 * @author GedMarc
 * @since 13 Jan 2017
 */
@NgImportReference(value = "NgbDropdownMenu", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportModule("NgbDropdownMenu")
public class BSDropDownMenu<J extends BSDropDownMenu<J>>
        extends DivSimple<J> implements INgComponent<J>
{
    /**
     * Identifies a drop down menu
     *
     * @author GedMarc
     * @since 13 Jan 2017
     */
    public BSDropDownMenu()
    {
        addAttribute("ngbDropdownMenu", "");
    }

    /**
     * Adds a new item to the menu
     *
     * @param text
     * @return
     */
    public BSDropDownItem<?> addItem(String text)
    {
        BSDropDownItem<?> link = new BSDropDownItem<>();
        link.setText(text);
        add(link);
        return link;
    }

    /**
     * Adds a new item to the menu
     *
     * @param text
     * @return
     */
    public BSNavDropDownItem<?> addNavItem(String text)
    {
        return addNavItem().setText(text);
    }

    /**
     * Adds a new item to the menu
     *
     * @return
     */
    public BSNavDropDownItem<?> addNavItem()
    {
        BSNavDropDownItem<?> link = new BSNavDropDownItem<>();
        add(link);
        return link;
    }

    /**
     * Adds a divider to the menu
     *
     * @return
     */
    public J addDivider()
    {
        BSDropDownDivider<?> divider = new BSDropDownDivider<>();
        add(divider);
        return (J) this;
    }

    /**
     * Adds a header with the given text set
     *
     * @param text
     * @return
     */
    public J addHeader(String text)
    {
        BSDropDownHeader<?> menu = new BSDropDownHeader<>();
        menu.setText(text);
        add(menu);
        return (J) this;
    }

    /**
     * Adds a header with the given text set
     *
     * @param header
     * @return
     */
    public J addHeader(IComponentHierarchyBase<?, ?> header)
    {
        BSDropDownHeader<?> menu = new BSDropDownHeader<>();
        menu.add(header);
        add(menu);
        return (J) this;
    }
}
