package za.co.mmagon.jwebswing.plugins.bootstrap4.badge.styles;

import za.co.mmagon.jwebswing.plugins.bootstrap4.badge.BSBadge;
import za.co.mmagon.jwebswing.plugins.bootstrap4.badge.BSBadgeOptions;

/**
 * Constructs a new Badge formatted with primary
 *
 * @param <J>
 */
public class BSBadgeSuccess<J extends BSBadgeSuccess<J>>
		extends BSBadge<J>
{
	/**
	 * Constructs a new Badge formatted with primary
	 */
	public BSBadgeSuccess()
	{
		this(false);
	}

	/**
	 * Constructs a new Badge with the given settings
	 *
	 * @param asPill
	 * @param badgeOptions
	 */
	public BSBadgeSuccess(boolean asPill, BSBadgeOptions... badgeOptions)
	{
		super(asPill, badgeOptions);
		setSuccess(true);
	}

}
