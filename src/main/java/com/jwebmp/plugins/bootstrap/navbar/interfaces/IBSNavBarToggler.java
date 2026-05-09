package com.jwebmp.plugins.bootstrap.navbar.interfaces;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.ICssStructure;

public interface IBSNavBarToggler<C extends GlobalChildren,
		A extends Enum<?> & AttributeDefinitions,
		F extends GlobalFeatures,
		E extends GlobalEvents,
		J extends Button<C, A, F, E, J>>
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
