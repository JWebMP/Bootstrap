package com.jwebmp.plugins.bootstrap.forms;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.client.*;
import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;

@NgDataService("FormDataService")
public class FormDataServiceTest implements INgDataService<FormDataServiceTest>
{
	@Override
	public DynamicData getData(AjaxCall<?> call)
	{
		return new DynamicData();
	}
}
