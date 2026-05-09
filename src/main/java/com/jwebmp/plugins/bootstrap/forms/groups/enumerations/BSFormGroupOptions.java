package com.jwebmp.plugins.bootstrap.forms.groups.enumerations;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included
 * Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public enum BSFormGroupOptions
		implements IBSComponentOptions
{
	/**
	 * Is a form group
	 */
	Form_Group,
	/**
	 * Denotes a specific form control
	 */
	Form_Control,
	/**
	 * Makes a &lt;form&gt; left_aligned with inline_block controls (This only applies to forms within viewports that are at least 768px
	 * wide)
	 */
	Form_Inline,
	/**
	 * Aligns labels and groups of form controls in a horizontal layout
	 */
	Form_Horizontal,
	/**
	 * File Inputs
	 */
	Form_Control_File,
	/**
	 * Marks this item as a validation feedback item
	 */
	Form_Control_Feedback,
	/**
	 * Renders the form control as plain text
	 */
	Form_Control_PlainText,
	/**
	 * Checkboxes and radios
	 */
	Form_Check,
	/**
	 * Label for checkboxes and radio button
	 */
	Form_Check_Label,
	/**
	 * The input for checkbox and radio buttons
	 */
	Form_Check_Input,
	/**
	 * Inline grouping for checkboxes and radio buttons
	 */
	Form_Check_Inline,
	/**
	 * Deprecated?
	 */
	Form_Text;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
