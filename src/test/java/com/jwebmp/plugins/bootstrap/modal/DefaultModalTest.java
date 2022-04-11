package com.jwebmp.plugins.bootstrap.modal;

import com.jwebmp.core.base.angular.services.annotations.NgComponent;
import com.jwebmp.core.base.angular.services.interfaces.INgComponent;
import com.jwebmp.core.base.angular.services.interfaces.INgModule;


public class DefaultModalTest extends BSModal<DefaultModalTest>
{
	public DefaultModalTest()
	{
		getModalHeader().addTitle("This is a default modal");
		getModalHeader().addDismissIcon();
		
		getModalBody().add("Some content");
		getModalFooter().add("and some footer");
	}
	
	@Override
	public String getTemplateName()
	{
		return "defaultModalTest";
	}
}
