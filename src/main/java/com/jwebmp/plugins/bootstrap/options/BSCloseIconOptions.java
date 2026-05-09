package com.jwebmp.plugins.bootstrap.options;

/**
 * Close icon
 * <p>
 * Use a generic close icon for dismissing content like modals and alerts. Be sure to include text for screen readers, as we’ve done with
 * aria-label.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSCloseIconOptions
		implements IBSComponentOptions
{
	/**
	 * Marks an item as a close item
	 */
	Close;

	BSCloseIconOptions()
	{
 
	}

	@Override
	public String toString()
	{
		return name().toLowerCase();
	}

}
