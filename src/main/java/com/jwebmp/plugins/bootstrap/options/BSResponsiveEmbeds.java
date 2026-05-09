package com.jwebmp.plugins.bootstrap.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Responsive embeds
 * <p>
 * Allow browsers to determine video or slideshow dimensions based on the width of their containing block by creating an intrinsic ratio
 * that will properly scale on any device.
 * <p>
 * Rules are directly applied to &lt;iframe&gt;, &lt;embed&gt;, &lt;video&gt;, and &lt;object&gt; elements; optionally use an explicit
 * descendant class .embed-responsive-item when you want to match
 * the styling for other attributes.
 * <p>
 * Pro-Tip! You don’t need to include frameborder="0" in your &lt;iframe&gt;s as we override that for you.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSResponsiveEmbeds
		implements IBSComponentOptions
{
	/**
	 * Responsive embeds
	 * <p>
	 * Allow browsers to determine video or slideshow dimensions based on the width of their containing block by creating an intrinsic
	 * ratio
	 * that will properly scale on any device.
	 * <p>
	 * Rules are directly applied to &lt;iframe&gt;, &lt;embed&gt;, &lt;video&gt;, and &lt;object&gt; elements; optionally use an explicit
	 * descendant class .embed-responsive-item when you want to
	 * match the styling for other attributes.
	 * <p>
	 * Pro-Tip! You don’t need to include frameborder="0" in your &lt;iframe&gt;s as we override that for you.
	 */
	Embed_Responsive,
	/**
	 * Any tag other than iframe, embed, video and object
	 */
	Embed_Responsive_Item;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
