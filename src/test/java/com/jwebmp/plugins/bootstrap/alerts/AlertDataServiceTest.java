package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

import static com.jwebmp.plugins.bootstrap.BSColourTypes.*;

@NgDataService("AlertDataServiceTest")
public class AlertDataServiceTest extends AlertDataService<AlertDataServiceTest>
{
	public AlertDataServiceTest()
	{
	
	}
	
	@Override
	public DynamicData getData(AjaxCall<?> call)
	{
		return new DynamicData().addData(new Alert(Success, "SuccessMessage"))
		                        .addData(new Alert(Primary, "Primary Message"))
		                        .addData(new Alert(Secondary, "Secondary Message"))
		                        .addData(new Alert(Danger, "Danger Message"));
	}
}
