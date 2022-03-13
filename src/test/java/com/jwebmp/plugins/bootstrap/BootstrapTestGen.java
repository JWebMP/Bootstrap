package com.jwebmp.plugins.bootstrap;

import com.guicedee.guicedservlets.undertow.GuicedUndertow;
import com.guicedee.logger.LogFactory;

import java.util.logging.Level;

public class BootstrapTestGen
{
	public static void main(String[] args) throws Exception
	{
		LogFactory.configureConsoleColourOutput(Level.FINE);
		GuicedUndertow.boot("localhost", 6524);
	}
	
}
