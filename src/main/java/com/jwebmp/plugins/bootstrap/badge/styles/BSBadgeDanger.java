package com.jwebmp.plugins.bootstrap.badge.styles;

import com.jwebmp.plugins.bootstrap.badge.BSBadge;
import com.jwebmp.plugins.bootstrap.badge.BSBadgeOptions;

/**
 * Constructs a new Badge formatted with primary
 *
 * @param <J>
 */
public class BSBadgeDanger<J extends BSBadgeDanger<J>>
		extends BSBadge<J>
{
	/**
	 * Constructs a new Badge formatted with primary
	 */
	public BSBadgeDanger()
	{
		this(false);
	}

	/**
	 * Constructs a new Badge with the given settings
	 *
	 * @param asPill
	 * @param badgeOptions
	 */
	public BSBadgeDanger(boolean asPill, BSBadgeOptions... badgeOptions)
	{
		super(asPill, badgeOptions);
		setDanger(true);
	}

}
