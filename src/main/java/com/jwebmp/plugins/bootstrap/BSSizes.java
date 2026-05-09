package com.jwebmp.plugins.bootstrap;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A Size setting
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 30, 2016
 */
public enum BSSizes
{
	/**
	 * Extra large devices (large desktops, 1200px and up)
	 */
	ExtraLarge("xl", 1200),
	/**
	 * Large devices (desktops, 992px and up)
	 */
	Large("lg", 992),
	/**
	 * Medium devices (tablets, 768px and up)
	 */
	Medium("md", 768),
	/**
	 * Small devices (landscape phones, 544px and up)
	 */
	Small("sm", 544),
	/**
	 * Starting at the bottom
	 */
	XSmall("xs", 0);

	private String name;
	private Integer size;

	BSSizes()
	{

	}

	BSSizes(String name, Integer size)
	{
		this.name = name;
		this.size = size;
	}

	/**
	 * The actual pixel size setting
	 *
	 * @return
	 */
	public Integer getSize()
	{
		return size;
	}

	/**
	 * The actual pixel size setting
	 *
	 * @param size
	 */
	public void setSize(Integer size)
	{
		this.size = size;
	}

	@Override
	public String toString()
	{
		return getName();
	}

	@JsonValue
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
