package com.jwebmp.plugins.bootstrap;

import com.fasterxml.jackson.annotation.*;

/**
 * A Size setting
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 30, 2016
 */
public enum BSColourTypes
{
	Success,
	Info,
	Warning,
	Danger,
	Primary,
	Secondary,
	Light,
	Dark,
	AlertsType;
	
	@Override
	@JsonValue
	public String toString()
	{
		if (this == AlertsType)
		{
			return "alert.type";
		}
		return name().toLowerCase();
	}
}
