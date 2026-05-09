package com.jwebmp.plugins.bootstrap.modal;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Modal Modals are streamlined, but flexible dialog prompts powered by JavaScript. They support a number of use cases from user
 * notification to completely custom content and feature a handful of
 * helpful subcomponents, sizes, and more.
 *
 * @author GedMarc
 */
public enum BSModalOptions
		implements IBSComponentOptions
{
	/**
	 * Represents a Modal
	 */
	Modal,
	/**
	 * The content of the modal
	 */
	Modal_Content,
	/**
	 * The header of the modal
	 */
	Modal_Header,
	/**
	 * The body of the modal
	 */
	Modal_Body,
	/**
	 * The footer of the modal
	 */
	Modal_Footer,
	/**
	 * The modal title
	 */
	Modal_Title,
	/**
	 * The modal dialog
	 */
	Modal_Dialog,
	/**
	 * Modal Xtra large
	 */
	Modal_Xl,
	/**
	 * Modal large
	 */
	Modal_Lg,
	/**
	 * Modal small
	 */
	Modal_Sm;

	BSModalOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
