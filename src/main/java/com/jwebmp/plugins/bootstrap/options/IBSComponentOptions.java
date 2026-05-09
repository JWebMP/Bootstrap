package com.jwebmp.plugins.bootstrap.options;

import com.jwebmp.core.base.interfaces.ICssClassName;

/**
 * Defines any class that is registered as a bootstrap associated class
 *
 * @author GedMarc
 * @since 2016/10/10
 */
@FunctionalInterface
public interface IBSComponentOptions
		extends ICssClassName
{

	/**
	 * Replaces the text with its HTML class equivalent
	 *
	 * @return
	 */
	@Override
	String toString();

	/**
	 * Default name method for enumerations
	 *
	 * @return
	 */
	String name();
}
