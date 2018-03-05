package za.co.mmagon.jwebswing.plugins.bootstrap4.alerts.styles;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.bootstrap4.alerts.BSAlert;

class BSAlertPrimaryTest
{

	@Test
	public void testMe()
	{
		BSAlert alert = new BSAlertPrimary<>().setText("This is an alert");
		System.out.println(alert.toString(0));

		alert.asMe()
		     .createDismissButton();

		System.out.println(alert.toString(0));

		Link wrapped = alert.wrapLinkStyle(new Span<>("Does it wrappeth?"), null);
		alert.add(wrapped);
		System.out.println(alert.toString(0));
	}
}
