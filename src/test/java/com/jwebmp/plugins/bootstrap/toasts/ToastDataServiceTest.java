package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

@NgDataService("ToastDataServiceTest")
public class ToastDataServiceTest extends ToastDataService<ToastDataServiceTest>
{
	@Override
	public Toasts getData(AjaxCall<?> call)
	{
		return new Toasts().addToast(new ToastInfo().setHeader("Header")
		                                            .setBody("Toast Body")
		                                            .setAutohide(false)
		);
	}
}
