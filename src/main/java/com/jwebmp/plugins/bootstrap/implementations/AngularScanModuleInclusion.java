package com.jwebmp.plugins.bootstrap.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public class AngularScanModuleInclusion implements IGuiceScanModuleInclusions<AngularScanModuleInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		return Set.of("com.jwebmp.core.angular");
	}
}
