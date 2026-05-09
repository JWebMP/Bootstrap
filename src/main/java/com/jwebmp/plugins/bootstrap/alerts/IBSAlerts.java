package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.plugins.bootstrap.*;

import java.util.*;

public interface IBSAlerts<J extends BSAlerts<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>, IBootstrapComponent<J>
{

}
