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

import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.annotations.structures.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.children.*;
import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.modal.parts.*;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.*;

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
@NgImportReference(name = "NgbModal, ModalDismissReasons", reference = "@ng-bootstrap/ng-bootstrap")
@NgConstructorParameter("private modalService: NgbModal")
public class BSModal<J extends BSModal<J>>
		extends Div<BSModalChildren, BSModalAttributes, BSModalFeatures, BSModalEvents, J>
		implements BSNavBarChildren, IBSModal<J>, BodyChildren, FormChildren, ListItemChildren,
		           INgComponent<J>
{
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
	
	@Override
	public List<String> fields()
	{
		return List.of("closeResult = '';");
	}
	
	@Override
	public List<String> methods()
	{
		return List.of("open(content : any) {\n" +
		               "    this.modalService.open(content, {ariaLabelledBy: '.modal-title'}).result.then((result) => {\n" +
		               "      this.closeResult = `Closed with: ${result}`;\n" +
		               "    }, (reason) => {\n" +
		               "      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;\n" +
		               "    });\n" +
		               "  }\n"
				,
				"private getDismissReason(reason: any): string {\n" +
				"    if (reason === ModalDismissReasons.ESC) {\n" +
				"      return 'by pressing ESC';\n" +
				"    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {\n" +
				"      return 'by clicking on a backdrop';\n" +
				"    } else {\n" +
				"      return `with: ${reason}`;\n" +
				"    }\n" +
				"  }");
	}
	
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
	
	public <T extends IComponentHierarchyBase<?, ?>> T setOpenButton(T component)
	{
		component.asAttributeBase()
		         .addAttribute("(click)", "this.modalService.open(" + getTemplateName() + ")");
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
	
	/**
	 * Returns this modal with only its methods
	 *
	 * @return
	 */
	public IBSModal<?> asMe()
	{
		return this;
	}
}
