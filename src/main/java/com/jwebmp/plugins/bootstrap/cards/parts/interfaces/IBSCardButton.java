package com.jwebmp.plugins.bootstrap.cards.parts.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap.cards.parts.BSCardButton;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;

import java.util.Comparator;

public interface IBSCardButton<J extends BSCardButton<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>, IBSLayout<J>
{
	/**
	 * Sets the style with button options
	 *
	 * @param buttonOptions
	 *
	 * @return
	 */
	J setStyle(BSButtonOptions buttonOptions);
}
