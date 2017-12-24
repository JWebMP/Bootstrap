package za.co.mmagon.jwebswing.plugins.bootstrap.alerts;

import za.co.mmagon.jwebswing.base.html.H4;

public class BSAlertHeading extends H4
{
	/**
	 * Adds a new alert heading
	 */
	public BSAlertHeading()
	{
		addClass(BSAlertOptions.Alert_Heading);
	}

	/**
	 * Sets the alert heading
	 *
	 * @param text
	 */
	public BSAlertHeading(String text)
	{
		super(text);
	}
}
