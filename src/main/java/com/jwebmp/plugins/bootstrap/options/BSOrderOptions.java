package com.jwebmp.plugins.bootstrap.options;

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
public enum BSOrderOptions
		implements IBSComponentOptions
{
	/**
	 * There’s also a responsive .order-first class that quickly changes the order of one element by applying order: -1.
	 */
	Order_First,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_1,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_2,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_3,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_4,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_5,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_6,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_7,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_8,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_9,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_10,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_11,
	/**
	 * Use .order- classes for controlling the visual order of your content. These classes are responsive, so you can set the order by
	 * breakpoint (e.g., .order-1.order-md-2). Includes support for 1 through 12 across all five grid tiers.
	 */
	Order_12;

	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
