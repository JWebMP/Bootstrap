package za.co.mmagon.jwebswing.plugins.bootstrap4.modal;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts.BSModalBody;
import za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts.BSModalFooter;
import za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts.BSModalHeader;

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
}
