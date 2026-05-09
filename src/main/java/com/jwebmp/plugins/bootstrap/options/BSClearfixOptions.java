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
public enum BSClearfixOptions
		implements IBSComponentOptions
{
	Clearfix;

	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
