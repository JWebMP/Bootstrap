package com.jwebmp.plugins.bootstrap.buttons.toolbars;

/**
 * @author GedMarc
 * @since 16 Feb 2017
 */
@FunctionalInterface
public interface IBSButtonToolbar
{

	/**
	 * Sets the screen reader label for this group
	 *
	 * @param label
	 *
	 * @return
	 */
	BSButtonToolbar<?> setAriaLabel(String label);

}
