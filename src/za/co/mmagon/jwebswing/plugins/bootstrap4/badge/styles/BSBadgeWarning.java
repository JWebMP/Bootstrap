package za.co.mmagon.jwebswing.plugins.bootstrap4.badge.styles;

import za.co.mmagon.jwebswing.plugins.bootstrap4.badge.BSBadge;
import za.co.mmagon.jwebswing.plugins.bootstrap4.badge.BSBadgeOptions;

/**
 * Constructs a new Badge formatted with primary
 *
 * @param <J>
 */
public class BSBadgeWarning<J extends BSBadgeWarning<J>>
		extends BSBadge<J>
{
	/**
	 * Constructs a new Badge formatted with primary
	 */
	public BSBadgeWarning()
	{
		this(false);
	}

	/**
	 * Constructs a new Badge with the given settings
	 *
	 * @param asPill
	 * @param badgeOptions
	 */
	public BSBadgeWarning(boolean asPill, BSBadgeOptions... badgeOptions)
	{
		super(asPill, badgeOptions);
		setWarning(true);
	}

}
