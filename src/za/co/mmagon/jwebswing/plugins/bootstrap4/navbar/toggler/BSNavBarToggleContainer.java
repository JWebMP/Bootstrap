package za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.toggler;

import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations.BSNavBarOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.BSNavs;

import java.io.Serializable;

/**
 * A container for the objects that adding a toggler create
 */
public class BSNavBarToggleContainer<J extends BSNavBarToggleContainer<J>>
		implements Serializable
{

	private static final long serialVersionUID = 1L;

	private final BSNavBarToggler toggler;
	private final BSNavs<?> content;

	/**
	 * Constructs a new container
	 */
	public BSNavBarToggleContainer()
	{
		this(new BSNavBarToggler(), new BSNavs<>());
	}

	/**
	 * Constructs a new container with the given toggler and content
	 *
	 * @param toggler
	 * @param content
	 */
	public BSNavBarToggleContainer(BSNavBarToggler toggler, BSNavs<?> content)
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
	public BSNavBarToggler getToggler()
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


