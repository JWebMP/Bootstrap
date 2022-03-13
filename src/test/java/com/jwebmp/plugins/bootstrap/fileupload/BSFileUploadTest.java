package com.jwebmp.plugins.bootstrap.fileupload;

import org.junit.jupiter.api.Test;

class BSFileUploadTest
{

	@Test
	void showNew()
	{
		BSFileUpload upload = new BSFileUpload();
		upload.getInput()
		      .setID("fUploadInput");
		upload.setID("fUpload");
		upload.getLabel()
		      .setID("fUploadLabel");

		System.out.println(upload.toString(0));
	}
	@Test
	void isShowFilename()
	{
		BSFileUpload upload = new BSFileUpload();
		upload.getInput()
		      .setID("fUploadInput");
		upload.setID("fUpload");
		upload.getLabel()
		      .setID("fUploadLabel");

		upload.setShowFilename(true);
		System.out.println(upload.toString(0));
		System.out.println(upload.renderJavascriptAll());
	}


}