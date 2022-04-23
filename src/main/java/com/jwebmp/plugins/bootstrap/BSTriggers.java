package com.jwebmp.plugins.bootstrap;

public enum BSTriggers
{
	True,
	False,
	Inside,
	Outside;
	
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
