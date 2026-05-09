package com.jwebmp.plugins.bootstrap.buttons.groups.interfaces;

import com.jwebmp.plugins.bootstrap.buttons.groups.BSButtonGroup;
import com.jwebmp.plugins.bootstrap.buttons.groups.options.BSButtonGroupSizeOptions;

/**
 * @author GedMarc
 * @since 16 Feb 2017
 */
public interface IBSButtonGroup
{

	/**
	 * Sets the screen reader label for this group
	 *
	 * @param label
	 *
	 * @return
	 */
	BSButtonGroup<?> setAriaLabel(String label);

	/**
	 * Sizes
	 * <p>
	 * Fancy larger or smaller buttons? Add .btn-lg or .btn-sm for additional sizes.
	 *
	 * @param size
	 *
	 * @return
	 */
	BSButtonGroup<?> setSize(BSButtonGroupSizeOptions size);

}
