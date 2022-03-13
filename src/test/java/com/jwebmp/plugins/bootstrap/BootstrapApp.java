package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.base.angular.services.NGApplication;
import com.jwebmp.core.base.angular.services.annotations.NgApp;

@NgApp(value = "bootstrap", bootComponent = BootstrapKitchenSink.class)
public class BootstrapApp extends NGApplication<BootstrapApp>
{
	public BootstrapApp()
	{
		getOptions().setTitle("Bootstrap Kitchen Sink");
	}
	
}
