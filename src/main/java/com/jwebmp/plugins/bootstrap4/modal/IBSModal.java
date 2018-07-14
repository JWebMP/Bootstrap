/*
 * Copyright (C) 2017 Marc Magon
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

package com.jwebmp.plugins.bootstrap4.modal;

import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.base.html.Button;
import com.jwebmp.plugins.bootstrap4.buttons.BSButton;
import com.jwebmp.plugins.bootstrap4.modal.features.BSModalHideFeature;
import com.jwebmp.plugins.bootstrap4.modal.features.BSModalShowFeature;
import com.jwebmp.plugins.bootstrap4.modal.features.BSModalToggleFeature;
import com.jwebmp.plugins.bootstrap4.modal.parts.BSModalBody;
import com.jwebmp.plugins.bootstrap4.modal.parts.BSModalFooter;
import com.jwebmp.plugins.bootstrap4.modal.parts.BSModalHeader;

import javax.validation.constraints.NotNull;

public interface IBSModal<J extends BSModal<J>>
{
	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	BSModalHeader<?> addModalHeader(boolean dismissButton);

	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	BSModalBody<?> addModalBody();

	/**
	 * Adds the modal header to the content of the modal
	 *
	 * @return
	 */
	BSModalFooter<?> addModalFooter();

	/**
	 * Adds the dismiss button to the modal
	 *
	 * @return
	 */
	BSButton<?> createDismissButton();

	<T extends ComponentHierarchyBase> T createDismissButton(T component);

	/**
	 * Adds a button that will open up the modal
	 *
	 * @param button
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J addOpenButton(Button button);

	/**
	 * Sets the size to render for the modal. By default medium. false sets small
	 *
	 * @param large
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setModalDialogSize(boolean large);

	/**
	 * Includes a modal-backdrop element. Alternatively, specify static for a backdrop which doesn't close the modal on click.
	 *
	 * @param backdrop
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setBackdrop(boolean backdrop);

	@SuppressWarnings("unchecked")
	@NotNull
	J setFade();

	/**
	 * Puts the focus on the modal when initialized.
	 *
	 * @param focus
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setFocus(boolean focus);

	/**
	 * Closes the modal when escape key is pressed
	 *
	 * @param keyboard
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setKeyboard(boolean keyboard);

	/**
	 * Shows the modal when initialized.
	 *
	 * @param show
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setShow(boolean show);

	@SuppressWarnings("unchecked")
	@NotNull
	J setModalDialogCenter(boolean centered);

	@SuppressWarnings("unchecked")
	@NotNull
	J addOpenButton(ComponentHierarchyBase button);

	@SuppressWarnings("unchecked")
	@NotNull
	J addOpenButton(ComponentHierarchyBase button, boolean setButtonTag);

	BSModalShowFeature createShowFeature();

	BSModalHideFeature createHideFeature();

	BSModalToggleFeature createToggleFeature();
}
