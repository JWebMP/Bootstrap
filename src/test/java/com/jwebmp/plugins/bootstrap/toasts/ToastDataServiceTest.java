package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

@NgDataService("ToastDataServiceTest")
public class ToastDataServiceTest extends ToastDataService<ToastDataServiceTest>
{
	@Override
	public DynamicData getData(AjaxCall<?> call)
	{
		return new DynamicData().addData(new ToastInfo().setHeader("Header")
		                                                .setBody("Toast Body")
		                                                .setAutohide(false)
		);
	}
}
