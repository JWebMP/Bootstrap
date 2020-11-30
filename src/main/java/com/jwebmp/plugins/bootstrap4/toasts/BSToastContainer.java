package com.jwebmp.plugins.bootstrap4.toasts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Strong;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.plugins.bootstrap4.images.BSImage;
import com.jwebmp.plugins.bootstrap4.options.interfaces.IBSAlignmentCapable;
import com.jwebmp.plugins.bootstrap4.toasts.features.BSToastFeature;

public class BSToastContainer<J extends BSToastContainer<J>>
		extends DivSimple<J>
		implements IBSAlignmentCapable<J>
{
	private final BSToastFeature<?> feature;

	public BSToastContainer()
	{
		addAttribute(GlobalAttributes.Aria_Live, "polite");
		addAttribute(GlobalAttributes.Aria_Atomic, "true");
		feature = new BSToastFeature<>(this);
		addFeature(feature);
	}

	/**
	 * Sets the minimum height for the toast container
	 *
	 * @param pixels
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setMinHeight(Integer pixels)
	{
		addStyle("min-height", pixels + "px");
		return (J) this;
	}

	/**
	 * Adds a new toast item
	 *
	 * @param toast
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J addToast(BSToast<?> toast)
	{
		add(toast);
		return (J) this;
	}

	/**
	 * Adds a new toast item
	 *
	 * @return
	 */
	public J addToast(String title, String description)
	{
		BSToast<?> toast = new BSToast<>();
		toast.getToastHeader()
		     .setTitle(new Strong<>(title));
		toast.getToastBody()
		     .setText(description);
		return addToast(toast);
	}

	/**
	 * Adds a new toast item
	 *
	 * @return
	 */
	public J addToast(IIcon<?,?> icon, String title, String description)
	{
		BSToast<?> toast = new BSToast<>();
		toast.getToastHeader()
		     .setTitle(new Strong<>(title))
		     .setImageIcon(icon);
		toast.getToastBody()
		     .setText(description);
		return addToast(toast);
	}

	/**
	 * Adds a new toast item
	 *
	 * @return
	 */
	public J addToast(BSImage<?> icon, String title, String description)
	{
		BSToast<?> toast = new BSToast<>();
		toast.getToastHeader()
		     .setTitle(new Strong<>(title))
		     .setImage(icon);
		toast.getToastBody()
		     .setText(description);
		return addToast(toast);
	}



}
