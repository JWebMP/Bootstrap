package za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.interfaces;

import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.interfaces.AttributeDefinitions;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;

public interface IBSNavBarToggler<C extends GlobalChildren, A extends Enum & AttributeDefinitions, F extends GlobalFeatures, E extends
		                                                                                                                               GlobalEvents, J extends Button<C, A, F, E, J>>
		extends ICssStructure<J>
{
	/**
	 * Gets the screen reader aria label
	 *
	 * @return
	 */
	String getAriaLabel();

	/**
	 * sets the screen reader aria label
	 */
	J setAriaLabel(String ariaLabel);

	/**
	 * Gets the span for the navbar icon
	 *
	 * @return
	 */
	Span<?, ?, ?> getIconSpan();

	/**
	 * Gets the Icon Class
	 *
	 * @return
	 */
	String getIconClass();

	/**
	 * Sets the Icon Class
	 *
	 * @param iconClass
	 */
	J setIconClass(String iconClass);

	/**
	 * Sets the icon for the span
	 *
	 * @param iconSpan
	 *
	 * @return
	 */
	J setIconSpan(Span<?, ?, ?> iconSpan);
}
