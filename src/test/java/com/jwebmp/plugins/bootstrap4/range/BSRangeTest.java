package com.jwebmp.plugins.bootstrap4.range;

import com.jwebmp.core.base.html.attributes.InputRangeAttributes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSRangeTest
{
	@Test
	void testBSRange()
	{
		BSRange<?> range = new BSRange<>();
		range.addAttribute(InputRangeAttributes.Max, "5");
		range.addAttribute(InputRangeAttributes.Min, "0");
		range.addAttribute(InputRangeAttributes.Step, "0.1");

		System.out.println(range.toString(0));

	}

}