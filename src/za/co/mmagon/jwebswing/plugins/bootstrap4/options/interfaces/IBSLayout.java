package za.co.mmagon.jwebswing.plugins.bootstrap4.options.interfaces;

import za.co.mmagon.jwebswing.plugins.bootstrap4.options.*;

import javax.validation.constraints.NotNull;

public interface IBSLayout<J extends IBSLayout<J>>
{
	/**
	 * Sets the style with the given colours
	 *
	 * @param backgroundOptions
	 * 		background colour
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setStyle(BSBackgroundOptions backgroundOptions, BSColoursOptions coloursOptions);

	/**
	 * Sets the style with the given colours
	 *
	 * @param borderOptions
	 * 		background colour
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setStyle(BSBorderOptions borderOptions, BSColoursOptions coloursOptions);

	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setMargin(BSMarginOptions margin);

	/**
	 * Applies the padding to the card
	 *
	 * @param padding
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setPadding(BSPaddingOptions padding);

	/**
	 * Sets the border to the correct structure
	 *
	 * @param border
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setBorder(BSBorderOptions border);
}
