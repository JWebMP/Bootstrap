package com.jwebmp.plugins.bootstrap4.toasts;

import com.jwebmp.core.base.html.SmallText;
import com.jwebmp.core.base.html.Strong;
import com.jwebmp.plugins.bootstrap4.images.BSImage;
import org.junit.jupiter.api.Test;

class BSToastTest
{

	@Test
	void testInit()
	{
		BSToast<?> toast = new BSToast<>()
				                   .setToastHeader(new BSToastHeader<>().setTitle(new Strong<>("Title"))
				                                                        .setShowCloseIcon(true)
				                                                        .setSubtitle(new SmallText<>("Subtitle"))
				                                                        .setImage(new BSImage<>("image"))

				                                  )
				                   .setToastBody(new BSToastBody<>().setText("body"));

		toast.setShowDelay(500);
		toast.setAutoHide(true);

		System.out.println(toast.toString(0));
		System.out.println(toast.renderJavascriptAll());
	}


}