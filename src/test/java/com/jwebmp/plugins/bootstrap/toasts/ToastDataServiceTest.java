package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.client.*;
import com.jwebmp.core.base.angular.client.annotations.angular.*;

@NgDataService("ToastDataServiceTest")
public class ToastDataServiceTest extends ToastDataService<ToastDataServiceTest>
{
	@Override
	public DynamicData getData(AjaxCall<?> call, AjaxResponse<?> response)
	{
		return new DynamicData().addData(new ToastInfo().setHeader("Header")
		                                                .setBody("Toast Body")
		                                                .setAutohide(false)
		);
	}
}
