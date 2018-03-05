package za.co.mmagon.jwebswing.plugins.bootstrap4.badge.styles;

import za.co.mmagon.jwebswing.plugins.bootstrap4.badge.BSBadge;
import za.co.mmagon.jwebswing.plugins.bootstrap4.badge.BSBadgeOptions;

/**
 * Constructs a new Badge formatted with primary
 *
 * @param <J>
 */
public class BSBadgeSecondary<J extends BSBadgeSecondary<J>>
		extends BSBadge<J>
{
	/**
	 * Constructs a new Badge formatted with primary
	 */
	public BSBadgeSecondary()
	{
		this(false);
	}

	/**
	 * Constructs a new Badge with the given settings
	 *
	 * @param asPill
	 * @param badgeOptions
	 */
	public BSBadgeSecondary(boolean asPill, BSBadgeOptions... badgeOptions)
	{
		super(asPill, badgeOptions);
		setSecondary(true);
	}

}
