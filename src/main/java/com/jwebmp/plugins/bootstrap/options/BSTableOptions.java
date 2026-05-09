package com.jwebmp.plugins.bootstrap.options;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Clearfix
 * <p>
 * Easily clear floats by adding .clearfix to the parent element. Utilizes the micro clearfix as popularized by Nicolas Gallagher. Can also
 * be used as a mixin.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSTableOptions
		implements IBSComponentOptions
{
	/**
	 * Adds basic styling (light padding and only horizontal dividers) to any &lt;table&gt;
	 */
	Table,
	/**
	 * Adds zebra_striping to any table row within &lt;tbody&gt; (not available in IE8)
	 */
	Table_Striped,
	/**
	 * Adds border on all sides of the table and cells
	 */
	Table_Bordered,
	/**
	 * Enables a hover state on table rows within a &lt;tbody&gt;
	 */
	Table_Hover,
	/**
	 * Makes table more compact by cutting cell padding in half
	 */
	Table_Sm,

	Table_Active,

	Table_Primary,
	Table_Secondary,
	Table_Success,
	Table_Danger,
	Table_Warning,
	Table_Info,
	Table_Light,
	/**
	 * Applies a dark theme to the table
	 */
	Table_Dark,

	/**
	 * For THead items, makes the table header dark
	 */
	Table_Header_Dark,

	Table_Responsive,
	Table_Responsive_Sm,
	Table_Responsive_Md,
	Table_Responsive_Lg,
	Table_Responsive_Xl,

	THead_Light,
	THead_Dark;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
