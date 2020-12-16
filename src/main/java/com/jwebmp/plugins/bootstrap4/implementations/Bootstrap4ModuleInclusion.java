package com.jwebmp.plugins.bootstrap4.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class Bootstrap4ModuleInclusion implements IGuiceScanModuleInclusions<Bootstrap4ModuleInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.bootstrap4");
		return set;
	}
}
