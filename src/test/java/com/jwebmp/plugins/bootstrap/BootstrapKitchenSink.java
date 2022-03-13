package com.jwebmp.plugins.bootstrap;

import com.google.inject.Inject;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;

@NgComponent(value = "bootstrap-kitchen-sink")
//@NgProviderReference(SocketClientService.class)
//@NgModuleReference(OnInitModule.class)
public class BootstrapKitchenSink extends DivSimple<BootstrapKitchenSink>
		implements INgComponent<BootstrapKitchenSink>
{
	@Inject
	public void initialize()
	{
	
	}
}
