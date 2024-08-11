/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.modal;

import com.jwebmp.core.base.angular.client.annotations.constructors.NgConstructorParameter;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.annotations.structures.NgField;
import com.jwebmp.core.base.angular.client.annotations.structures.NgMethod;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.children.BodyChildren;
import com.jwebmp.core.base.html.interfaces.children.FormChildren;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.BSSizes;
import com.jwebmp.plugins.bootstrap.modal.parts.BSModalBody;
import com.jwebmp.plugins.bootstrap.modal.parts.BSModalFooter;
import com.jwebmp.plugins.bootstrap.modal.parts.BSModalHeader;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;

import java.util.ArrayList;
import java.util.List;

/**
 * Modal Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user
 * notification to completely custom content and feature a handful of
 * helpful subcomponents, sizes, and more.
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 9 Nov 2016
 */
@ComponentInformation(name = "Bootstrap Modals",
                      description = "Modal\n" +
                              "Use Bootstrap’s JavaScript modal plugin to add dialogs to your site for lightboxes, user " +
                              "notifications, or completely custom content.",
                      url = "https://ng-bootstrap.github.io/#/components/modal/examples",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")

@NgImportReference(value = "NgbModal", reference = "@ng-bootstrap/ng-bootstrap", onParent = true)
@NgImportReference(value = "ModalDismissReasons", reference = "@ng-bootstrap/ng-bootstrap")
@NgConstructorParameter(value = "public modalService: NgbModal", onParent = true)

@NgField("closeResult? : string;")
@NgMethod("private getDismissReason(reason: any): string {\n" +
        "    if (reason === ModalDismissReasons.ESC) {\n" +
        "      return 'by pressing ESC';\n" +
        "    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {\n" +
        "      return 'by clicking on a backdrop';\n" +
        "    } else {\n" +
        "      return `with: ${reason}`;\n" +
        "    }\n" +
        "  }")
@NgMethod("")
public class BSModal<J extends BSModal<J>>
        extends Div<BSModalChildren, BSModalAttributes, BSModalFeatures, BSModalEvents, J>
        implements BSNavBarChildren, IBSModal<J>, BodyChildren, FormChildren, ListItemChildren, INgComponent<J>
{

    @Override
    public List<String> componentMethods()
    {
        List<String> list = INgComponent.super.componentMethods();
        if (list == null)
        {
            list = new ArrayList<>();
        }
        list.add("openModal(content : any) {\n" +
                         "                  this.modalService.open(content, " + renderOptions() + ");\n" +
                         "                  }\n");

        return list;
    }

    /**
     * The modal content
     */
    private BSModalHeader<?> modalHeader;
    /**
     * The modal content
     */
    private BSModalBody<?> modalContent;
    /**
     * The modal content
     */
    private BSModalFooter<?> modalFooter;

    private boolean backdrop = true;
    private boolean backdropStatic;
    private boolean centered;
    private boolean fullScreen;
    private BSSizes fullScreenBelow;
    private boolean keyboard = true;
    private BSSizes size;

    /**
     * Modal Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user
     * notification to completely custom content and feature a handful of
     * helpful subcomponents, sizes, and more.
     */
    public BSModal()
    {
        setTag("ng-template");
    }

    /**
     * Gets the modal content pane
     *
     * @return
     */

    public BSModalBody<?> getModalBody()
    {
        if (modalContent == null)
        {
            modalContent = new BSModalBody<>();
        }
        return modalContent;
    }

    public BSModalHeader<?> getModalHeader()
    {
        if (modalHeader == null)
        {
            modalHeader = new BSModalHeader<>();
        }
        return modalHeader;
    }

    public void setModalHeader(BSModalHeader<?> modalHeader)
    {
        this.modalHeader = modalHeader;
    }

    public void setModalBody(BSModalBody<?> modalContent)
    {
        this.modalContent = modalContent;
    }

    public BSModalFooter<?> getModalFooter()
    {
        if (modalFooter == null)
        {
            modalFooter = new BSModalFooter<>();
        }
        return modalFooter;
    }

    public void setModalFooter(BSModalFooter<?> modalFooter)
    {
        this.modalFooter = modalFooter;
    }

    public String getTemplateName()
    {
        return "content";
    }


    public <T extends IComponentHierarchyBase<?, ?>> T setCloseButton(T component)
    {
        component.asAttributeBase()
                 .addAttribute("(click)", "modal.close('Save click')");
        return component;
    }

    public String renderOptions()
    {
        String options = "{";
        if (!backdrop)
        {
            options += "backdrop:false,";
        }
        if (backdropStatic)
        {
            options += "backdrop:'static',";
        }
        if (centered)
        {
            options += "centered:true,";
        }
        if (keyboard)
        {
            options += "keyboard:true,";
        }
        else
        {
            options += "keyboard:false,";
        }
        if (size != null)
        {
            options += "size:'" + size + "',";
        }
        if (options.endsWith(","))
        {
            options = options.substring(0, options.length() - 1);
        }
        options += "}";
        return options;
    }

    public <T extends IComponentHierarchyBase<?, ?>> T setOpenButton(T component)
    {
        component.asAttributeBase()
                 .addAttribute("(click)", "this.modalService.open('" + getTemplateName() + "'," + renderOptions() + ")");
        return component;
    }

    @Override
    public void init()
    {
        if (!isInitialized())
        {
            addAttribute("#" + getTemplateName(), "");
            addAttribute("let-modal", "");

            if (modalHeader != null)
            {
                add(modalHeader);
            }
            if (modalContent != null)
            {
                add(modalContent);
            }
            if (modalFooter != null)
            {
                add(modalFooter);
            }
        }
        super.init();
    }

    public boolean isBackdropStatic()
    {
        return backdropStatic;
    }

    public J setBackdropStatic(boolean backdropStatic)
    {
        this.backdropStatic = backdropStatic;
        return (J) this;
    }

    /**
     * Returns this modal with only its methods
     *
     * @return
     */
    public IBSModal<?> asMe()
    {
        return this;
    }

    public boolean isBackdrop()
    {
        return backdrop;
    }

    public J setBackdrop(boolean backdrop)
    {
        this.backdrop = backdrop;
        return (J) this;
    }

    public boolean isCentered()
    {
        return centered;
    }

    public J setCentered(boolean centered)
    {
        this.centered = centered;
        return (J) this;
    }

    public boolean isFullScreen()
    {
        return fullScreen;
    }

    public J setFullScreen(boolean fullScreen)
    {
        this.fullScreen = fullScreen;
        return (J) this;
    }

    public BSSizes getFullScreenBelow()
    {
        return fullScreenBelow;
    }

    public J setFullScreenBelow(BSSizes fullScreenBelow)
    {
        this.fullScreenBelow = fullScreenBelow;
        return (J) this;
    }

    public boolean isKeyboard()
    {
        return keyboard;
    }

    public J setKeyboard(boolean keyboard)
    {
        this.keyboard = keyboard;
        return (J) this;
    }

    public BSSizes getSize()
    {
        return size;
    }

    public J setSize(BSSizes size)
    {
        this.size = size;
        return (J) this;
    }
}
