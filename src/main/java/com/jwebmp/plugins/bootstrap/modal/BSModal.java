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

import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.base.html.interfaces.children.*;
import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.core.base.servlets.enumarations.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.buttons.*;
import com.jwebmp.plugins.bootstrap.modal.features.*;
import com.jwebmp.plugins.bootstrap.modal.parts.*;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.*;
import com.jwebmp.plugins.bootstrap.options.*;
import jakarta.validation.constraints.*;

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
public class BSModal<J extends BSModal<J>>
		extends Div<BSModalChildren, BSModalAttributes, BSModalFeatures, BSModalEvents, J>
		implements BSNavBarChildren, IBSModal<J>, BodyChildren, FormChildren, ListItemChildren
{
	private BSModalFeature feature;
	/**
	 * The modal dialog
	 */
	private BSModalDialog<?> modalDialog;
	/**
	 * The modal content
	 */
	private BSModalContent<?> modalContent;
	
	/**
	 * Modal Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user
	 * notification to completely custom content and feature a handful of
	 * helpful subcomponents, sizes, and more.
	 */
	public BSModal()
	{
		addFeature(getFeature());
		addClass(BSModalOptions.Modal);
		addAttribute(BSModalAttributes.Role, "dialog");
		addAttribute(BSModalAttributes.TabIndex, "-1");
	}
	
	public final BSModalFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BSModalFeature(this);
		}
		return feature;
	}
	
	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	@Override
	public BSModalHeader<?> addModalHeader()
	{
		BSModalHeader<?> modalHeader = new BSModalHeader<>();
		getModalContent().add(modalHeader);
		return modalHeader;
	}
	
	/**
	 * Gets the modal content pane
	 *
	 * @return
	 */
	
	public BSModalContent<?> getModalContent()
	{
		if (modalContent == null)
		{
			setModalContent(new BSModalContent<>());
		}
		return modalContent;
	}
	
	public BSModalDialog<?> getModalDialog()
	{
		if (modalDialog == null)
		{
			setModalDialog(new BSModalDialog<>());
		}
		return modalDialog;
	}
	
	/**
	 * Sets the overall dialog of the modal
	 *
	 * @param modalDialog
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setModalDialog(BSModalDialog<?> modalDialog)
	{
		remove(this.modalDialog);
		this.modalDialog = modalDialog;
		if (this.modalDialog != null)
		{
			add(modalDialog);
			
		}
		return (J) this;
	}
	
	/**
	 * Sets the modal content pane
	 *
	 * @param modalContent
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setModalContent(BSModalContent<?> modalContent)
	{
		getModalDialog().remove(this.modalContent);
		this.modalContent = modalContent;
		if (this.modalContent != null)
		{
			this.modalContent.addClass(BSModalOptions.Modal_Content);
			getModalDialog().add(this.modalContent);
		}
		return (J) this;
	}
	
	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	@Override
	public BSModalBody<?> addModalBody()
	{
		BSModalBody<?> modalBody = new BSModalBody<>();
		getModalContent().add(modalBody);
		return modalBody;
	}
	
	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	@Override
	public BSModalFooter<?> addModalFooter()
	{
		BSModalFooter<?> modalFooter = new BSModalFooter<>();
		getModalContent().add(modalFooter);
		return modalFooter;
	}
	
	@Override
	public BSButton<?> createDismissButton()
	{
		BSButton<?> button = new BSButton<>();
		return createDismissButton(button);
	}
	
	/**
	 * Adds the dismiss button to the modal
	 *
	 * @return
	 */
	@Override
	public <T extends IComponentHierarchyBase<?, ?>> T createDismissButton(T component)
	{
		component.asAttributeBase()
		         .addAttribute("data-dismiss", BSModalOptions.Modal.toString());
		component.asAttributeBase()
		         .addAttribute(ButtonAttributes.Data_Toggle.toString(), BSModalOptions.Modal.toString());
		component.asTagBase()
		         .setTag(ComponentTypes.Button.getComponentTag());
		component.asAttributeBase()
		         .addAttribute("type", ComponentTypes.Button.getComponentTag());
		return component;
	}
	
	/**
	 * Adds a button that will open up the modal
	 *
	 * @param button
	 * @return
	 */
	@Override
	@NotNull
	public J addOpenButton(Button<?, ?, ?, ?, ?> button)
	{
		return addOpenButton(button, true);
	}
	
	/**
	 * Sets the size to render for the modal. By default medium. false sets small
	 *
	 * @param options
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setModalDialogSize(BSModalOptions options)
	{
		getModalDialog().removeClass(BSModalOptions.Modal_Sm);
		getModalDialog().removeClass(BSModalOptions.Modal_Lg);
		getModalDialog().removeClass(BSModalOptions.Modal_Xl);
		
		getModalDialog().addClass(options);
		return (J) this;
	}
	
	/**
	 * Includes a modal-backdrop element. Alternatively, specify static for a backdrop which doesn't close the modal on click.
	 *
	 * @param backdrop
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBackdrop(boolean backdrop)
	{
		addAttribute(BSModalAttributes.Data_Backdrop, backdrop);
		return (J) this;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFade()
	{
		addClass(BSDefaultOptions.Fade);
		return (J) this;
	}
	
	/**
	 * Puts the focus on the modal when initialized.
	 *
	 * @param focus
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFocus(boolean focus)
	{
		addAttribute(BSModalAttributes.Data_Focus, focus);
		return (J) this;
	}
	
	/**
	 * Closes the modal when escape key is pressed
	 *
	 * @param keyboard
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setKeyboard(boolean keyboard)
	{
		addAttribute(BSModalAttributes.Data_Keyboard, keyboard);
		return (J) this;
	}
	
	/**
	 * Shows the modal when initialized.
	 *
	 * @param show
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShow(boolean show)
	{
		addAttribute(BSModalAttributes.Data_Show, show);
		return (J) this;
	}
	
	/**
	 * Sets the dialog content container
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J setModalDialogCenter(boolean centered)
	{
		getModalDialog().addClass("model-dialog-centered");
		return (J) this;
	}
	
	/**
	 * Adds a button that will open up the modal
	 *
	 * @param button
	 * @return
	 */
	@Override
	@NotNull
	public J addOpenButton(IComponentHierarchyBase<?, ?> button)
	{
		return addOpenButton(button, true);
	}
	
	/**
	 * Adds a button that will open up the modal
	 *
	 * @param button
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addOpenButton(IComponentHierarchyBase<?, ?> button, boolean setButtonTag)
	{
		if (setButtonTag)
		{
			button.asTagBase()
			      .setTag("button");
		}
		button.asAttributeBase()
		      .addAttribute(ButtonAttributes.Data_Toggle.toString(), BSModalOptions.Modal.toString());
		button.asAttributeBase()
		      .addAttribute(ButtonAttributes.Data_Target.toString(), getID(true));
		return (J) this;
	}
	
	/**
	 * Creates a show event for the create show feature
	 *
	 * @return
	 */
	@Override
	public BSModalShowFeature createShowFeature()
	{
		return new BSModalShowFeature(this);
	}
	
	/**
	 * Creates the hide feature
	 *
	 * @return
	 */
	@Override
	public BSModalHideFeature createHideFeature()
	{
		return new BSModalHideFeature(this);
	}
	
	/**
	 * Creates the toggle feature
	 *
	 * @return
	 */
	@Override
	public BSModalToggleFeature createToggleFeature()
	{
		return new BSModalToggleFeature(this);
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
