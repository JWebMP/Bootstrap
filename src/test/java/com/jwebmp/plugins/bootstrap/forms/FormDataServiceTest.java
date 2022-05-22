package com.jwebmp.plugins.bootstrap.forms;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.modules.services.angular.forms.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

public class FormDataServiceTest extends FormDataService<FormDataServiceTest>
{
	@Override
	public DynamicData getData(AjaxCall<?> call)
	{
		return new DynamicData();
	}
}
