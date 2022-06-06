package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.angular.client.annotations.references.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;

import java.util.*;

@NgDataTypeReference(value = Alert.class, primary = false)
public abstract class AlertDataService<J extends AlertDataService<J>> implements INgDataService<J>
{
	@Override
	public List<String> methods()
	{
		return List.of("close(alert: Alert) {\n" +
		               "        this.dataStore.datas.out?.splice(this.dataStore.datas.out?.indexOf(alert), 1);\n" +
		               "        this._data.next(Object.assign({}, this.dataStore).datas);\n" +
		               "}\n");
	}
}
