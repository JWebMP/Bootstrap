package com.jwebmp.plugins.bootstrap.popovers.interfaces;


import com.jwebmp.plugins.bootstrap.popovers.*;

/**
 * @author GedMarc
 * @since 21 Feb 2017
 */
public interface IBSPopOver
{
	
	
	BSPopOverTitle<?> getPopOverTitle();
	
	BSPopOver setPopOverTitle(BSPopOverTitle<?> popOverTitle);
	
	BSPopOverContent<?> getPopOverContent();
	
	BSPopOver setPopOverContent(BSPopOverContent<?> popOverContent);
}
