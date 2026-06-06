package com.jwebmp.plugins.bootstrap.images;

import com.jwebmp.core.base.interfaces.ICssStructure;

import java.util.Comparator;

public interface IBSImage<J extends BSImage<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Getter for property 'responsive'.
	 *
	 * @return Value for property 'responsive'.
	 */
	boolean isResponsive();

	/**
	 * Setter for property 'responsive'.
	 *
	 * @param responsive
	 * 		Value to set for property 'responsive'.
	 */
    J setResponsive(boolean responsive);

	/**
	 * Getter for property 'rounded'.
	 *
	 * @return Value for property 'rounded'.
	 */
	boolean isRounded();

	/**
	 * Setter for property 'rounded'.
	 *
	 * @param rounded
	 * 		Value to set for property 'rounded'.
	 */
    J setRounded(boolean rounded);

	/**
	 * Getter for property 'thumbnail'.
	 *
	 * @return Value for property 'thumbnail'.
	 */
	boolean isThumbnail();

	/**
	 * Setter for property 'thumbnail'.
	 *
	 * @param thumbnail
	 * 		Value to set for property 'thumbnail'.
	 */
    J setThumbnail(boolean thumbnail);

	/**
	 * Sets the alignment left using the float-left class
	 *
	 * @param floatLeft
	 * 		on or off
	 *
	 * @return This class
	 */
    J setAlignLeft(boolean floatLeft);

	/**
	 * Sets the alignment right for the class float left
	 *
	 * @param floatRight
	 * 		on or off
	 *
	 * @return This class
	 */
    J setAlignRight(boolean floatRight);

	/**
	 * Aligns center using auto margin left and right and display block
	 *
	 * @param alignCenter
	 * 		on/off
	 *
	 * @return This
	 */
    J setAlignCenter(boolean alignCenter);

	/**
	 * Aligns text center by adding the text-center class
	 *
	 * @param textCenter
	 * 		on/off
	 *
	 * @return This
	 */
    J setTextCenter(boolean textCenter);
}
