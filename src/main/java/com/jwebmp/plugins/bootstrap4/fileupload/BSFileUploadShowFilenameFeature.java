package com.jwebmp.plugins.bootstrap4.fileupload;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.inputs.InputFileType;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class BSFileUploadShowFilenameFeature<J extends BSFileUploadShowFilenameFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart<?>, J>
{
	public BSFileUploadShowFilenameFeature(InputFileType<?> baseComponent)
	{
		super("BSFileUploadShowFilenameFeature");
		setComponent(baseComponent);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "on('change',function(){" + getNewLine() +
		         "var fileName = $(this).val().split(\"\\\\\").pop();" + getNewLine() +
		         "$(this).siblings('.custom-file-label').addClass('selected').html(fileName);" + getNewLine() +
		         "})");
	}
}
