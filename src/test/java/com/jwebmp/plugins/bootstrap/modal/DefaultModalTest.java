package com.jwebmp.plugins.bootstrap.modal;


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
