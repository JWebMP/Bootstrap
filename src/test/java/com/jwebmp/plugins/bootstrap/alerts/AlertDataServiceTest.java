package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.services.annotations.*;

import static com.jwebmp.plugins.bootstrap.BSColourTypes.*;

@NgDataService("AlertDataServiceTest")
public class AlertDataServiceTest extends AlertDataService<AlertDataServiceTest>
{
	public AlertDataServiceTest()
	{
	
	}
	
	@Override
	public Alerts getData(AjaxCall<?> call)
	{
		return new Alerts()
				.addAlert(new Alert(Success, "SuccessMessage"))
				.addAlert(new Alert(Primary, "Primary Message"))
				.addAlert(new Alert(Secondary, "Secondary Message"))
				.addAlert(new Alert(Danger, "Danger Message"));
	}
}
