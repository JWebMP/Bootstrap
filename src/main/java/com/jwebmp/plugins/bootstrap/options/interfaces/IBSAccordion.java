package com.jwebmp.plugins.bootstrap.options.interfaces;

import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.plugins.bootstrap.accordion.*;

import java.util.*;

public interface IBSAccordion<J extends BSAccordion<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	
	J addPanel(String panelId, BSAccordionPanelTitle<?> header, BSAccordionPanelContent<?> content, boolean active);
	
	J addPanel(String panelId, BSAccordionPanelHeader<?> header, BSAccordionPanelContent<?> content, boolean active);
	
	IBSAccordion<?> asMe();
}
