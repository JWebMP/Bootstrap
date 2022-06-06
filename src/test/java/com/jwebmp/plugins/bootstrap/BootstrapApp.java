package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.services.*;

@NgApp(name = "bootstrap", bootComponent = BootstrapKitchenSink.class)
public class BootstrapApp extends NGApplication<BootstrapApp>
{
	public BootstrapApp()
	{
		getOptions().setTitle("Bootstrap Kitchen Sink");
	}
	
}
