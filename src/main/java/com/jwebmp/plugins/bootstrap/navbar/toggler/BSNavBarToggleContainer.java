package com.jwebmp.plugins.bootstrap.navbar.toggler;

import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarOptions;
import com.jwebmp.plugins.bootstrap.navs.BSNavs;

/**
 * A container for the objects that adding a toggler create
 */
public class BSNavBarToggleContainer<J extends BSNavBarToggleContainer<J>>

{
	private final BSNavBarToggler<?,?,?,?,?> toggler;
	private final BSNavs<?> content;

	/**
	 * Constructs a new container
	 */
	public BSNavBarToggleContainer()
	{
		this(new BSNavBarToggler<>(), new BSNavs<>());
	}

	/**
	 * Constructs a new container with the given toggler and content
	 *
	 * @param toggler
	 * @param content
	 */
	public BSNavBarToggleContainer(BSNavBarToggler<?,?,?,?,?> toggler, BSNavs<?> content)
	{
		this.toggler = toggler;
		this.content = content;

		content.addClass(BSNavBarOptions.Collapse$Navbar_Collapse);
		content.addClass("navbar-nav");
	}

	/**
	 * Returns the associated toggler
	 *
	 * @return
	 */
	public BSNavBarToggler<?,?,?,?,?> getToggler()
	{
		return toggler;
	}

	/**
	 * Gets the content associated
	 *
	 * @return
	 */
	public BSNavs<?> getContent()
	{
		return content;
	}
}


