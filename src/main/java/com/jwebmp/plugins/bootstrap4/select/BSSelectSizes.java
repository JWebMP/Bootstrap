package com.jwebmp.plugins.bootstrap4.select;

import com.jwebmp.core.base.interfaces.ICssClassName;

public enum BSSelectSizes
		implements ICssClassName
{
	Small("custom-select-sm"),
	Normal("custom-select"),
	Large("custom-select-lg");

	private String className;

	BSSelectSizes(String className)
	{
		this.className = className;
	}

	@Override
	public String toString()
	{
		return className;
	}
}
