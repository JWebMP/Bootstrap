package com.jwebmp.plugins.bootstrap;

public enum BSPlacements
{
	auto,
	top,
	top_start,
	top_left,
	top_end,
	top_right,
	bottom,
	bottom_start,
	bottom_left,
	bottom_end,
	bottom_right,
	start,
	left,
	start_top,
	left_top,
	start_bottom,
	left_bottom,
	end,
	right,
	end_top,
	right_top,
	end_bottom,
	right_bottom;
	
	@Override
	public String toString()
	{
		return name().replace('_', '-');
	}
}
