package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.interfaces;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.BSCard;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.layout.BSCardGroup;

import java.util.Comparator;

public interface IBSCardGroup<J extends BSCardGroup<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	BSCard<?> addCard();
}
