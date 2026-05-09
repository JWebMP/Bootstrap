package com.jwebmp.plugins.bootstrap.cards.parts.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.cards.BSCard;
import com.jwebmp.plugins.bootstrap.cards.layout.BSCardGroup;

import java.util.Comparator;

public interface IBSCardGroup<J extends BSCardGroup<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	BSCard<?> addCard();
}
