package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

import java.util.*;

@NgDataTypeReference(Alerts.class)
@NgDataTypeReference(value = Alert.class, primary = false)
public abstract class AlertDataService<J extends AlertDataService<J>> implements INgDataService<J>
{
	
	@Override
	public List<String> methods()
	{
		return List.of("close(alert: Alert) {\n" +
		               "this.data.alerts?.splice(this.data.alerts?.indexOf(alert), 1);\n" +
		               "}\n");
	}
}
