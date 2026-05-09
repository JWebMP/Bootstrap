package com.jwebmp.plugins.bootstrap.options;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Use .d-block, .d-inline, or .d-inline-block to simply set an element’s display property to block, inline, or inline-block (respectively).
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSDisplayOptions
		implements IBSComponentOptions
{
	/**
	 * Sets the display property to block
	 */
	Block,
	/**
	 * Sets the display property to block
	 */
	Lg_Block,
	/**
	 * Sets the display property to block
	 */
	Md_Block,
	/**
	 * Sets the display property to block
	 */
	Sm_Block,
	/**
	 * Sets the display property to block
	 */
	Xl_Block,
	/**
	 * Sets the display property to inline
	 */
	Inline,
	/**
	 * Sets the display property to block
	 */
	Lg_Inline,
	/**
	 * Sets the display property to block
	 */
	Md_Inline,
	/**
	 * Sets the display property to block
	 */
	Sm_Inline,
	/**
	 * Sets the display property to block
	 */
	Xl_Inline,
	/**
	 * Sets the display property to block
	 */
	Inline_Block,
	/**
	 * Sets the display property to block
	 */
	Lg_Inline_Block,
	/**
	 * Sets the display property to block
	 */
	Md_Inline_Block,
	/**
	 * Sets the display property to block
	 */
	Sm_Inline_Block,
	/**
	 * Sets the display property to block
	 */
	Xl_Inline_Block,
	/**
	 * Displays as flex
	 */
	Flex,
	/**
	 * Sets the display property to block
	 */
	Lg_Flex,
	/**
	 * Sets the display property to block
	 */
	Md_Flex,
	/**
	 * Sets the display property to block
	 */
	Sm_Flex,
	/**
	 * Sets the display property to block
	 */
	Xl_Flex,
	/**
	 * d-none
	 */
	None,
	/**
	 * Sets the display property to block
	 */
	Lg_None,
	/**
	 * Sets the display property to block
	 */
	Md_None,
	/**
	 * Sets the display property to block
	 */
	Sm_None,
	/**
	 * Sets the display property to block
	 */
	Xl_None,
	
	
	
	;
	
	@Override
	public String toString()
	{
		return "d-" + name().toLowerCase()
		                    .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}
}
