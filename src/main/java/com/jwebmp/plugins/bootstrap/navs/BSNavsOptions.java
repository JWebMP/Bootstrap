package com.jwebmp.plugins.bootstrap.navs;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states. Swap
 * modifier classes to switch between each style..
 *
 * @author GedMarc
 */
public enum BSNavsOptions
		implements IBSComponentOptions
{
	/**
	 * Base nav The base .nav component is built with flexbox and provide a strong foundation for building all types of navigation
	 * components. It includes some style overrides (for working with
	 * lists), some link padding for larger hit areas, and basic disabled styling. No active states are included in the base nav.
	 */
	Nav,
	/**
	 * Tabs Takes the basic nav from above and adds the .nav-tabs class to generate a tabbed interface. Use them to create tabbable regions
	 * with our tab JavaScript plugin.
	 */
	Nav_Tabs,
	/**
	 * Nav List Item
	 */
	Nav_Item,
	Nav_Justified,
	Nav_Bordered,
	/**
	 * An actual navigation link
	 */
	Nav_Link,
	/**
	 * Nav_Pills
	 */
	Nav_Pills,
	/**
	 * If the link is active (no effect on the base)
	 */
	Active,
	/**
	 * Sets the link as disabled
	 */
	Disabled,
	/**
	 * Horizontal alignment Change the horizontal alignment of your nav with flexbox utilities. By default, navs are left-aligned, but you
	 * can easily change them to center or right aligned.
	 * <p>
	 * Centered with .justify-content-center:
	 */
	Justify_Content_Center,
	/**
	 * Horizontal alignment Change the horizontal alignment of your nav with flexbox utilities. By default, navs are left-aligned, but you
	 * can easily change them to center or right aligned.
	 */
	Justify_Content_End,
	/**
	 * Base Navbar Nav
	 */
	Navbar_Nav,
	/**
	 * Fill and Justify
	 */
	Nav_Fill,
	Tab_Content,
	Tabs_Bordered,
	Tabs_Vertical_Env,
	Tabs_Vertical_Env_Right,
	Tabs_Vertical,;

	BSNavsOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
