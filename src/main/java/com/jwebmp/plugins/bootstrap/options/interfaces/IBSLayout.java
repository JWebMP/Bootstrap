package com.jwebmp.plugins.bootstrap.options.interfaces;

import com.jwebmp.plugins.bootstrap.options.*;

import jakarta.validation.constraints.NotNull;

public interface IBSLayout<J extends IBSLayout<J>>
{
	/**
	 * Sets the style with the given colours
	 *
	 * @param backgroundOptions
	 * 		background colour
	 *
	 * @return
	 */
	
	@NotNull
	J addBackground(BSBackgroundOptions backgroundOptions);

	/**
	 * Sets the style with the given colours
	 *
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return
	 */
	
	@NotNull
	J addForeground(BSColoursOptions coloursOptions);

	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin
	 *
	 * @return
	 */
	
	@NotNull
	J addMargin(BSMarginOptions margin);

	/**
	 * Applies the padding to the card
	 *
	 * @param padding
	 *
	 * @return
	 */
	
	@NotNull
	J addPadding(BSPaddingOptions padding);

	/**
	 * Sets the border to the correct structure
	 *
	 * @param border
	 *
	 * @return
	 */
	
	@NotNull
	J addBorder(BSBorderOptions border);

	/**
	 * Returns the Bootstrap layout options
	 *
	 * @return The IBSLayout Options
	 */
	default IBSLayout<?> asLayout()
	{
		return this;
	}
}
