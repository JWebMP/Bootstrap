package com.jwebmp.plugins.bootstrap4.toasts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.plugins.bootstrap4.toasts.features.BSToastFeature;

import static com.jwebmp.plugins.bootstrap4.toasts.BSToastClasses.*;

/**
 * Toasts
 * Push notifications to your visitors with a toast, a lightweight and easily customizable alert message.
 *
 * @param <J>
 */
public class BSToast<J extends BSToast<J>>
		extends DivSimple<J>
{
	private BSToastHeader<?> toastHeader;
	private BSToastBody<?> toastBody;

	private final BSToastFeature<?> feature;

	public BSToast()
	{
		addClass(Toast);
		addAttribute("role", "alert");
		addAttribute(GlobalAttributes.Aria_Atomic, "true");
		addAttribute(GlobalAttributes.Aria_Live, "assertive");
		feature = new BSToastFeature<>(this);
		addFeature(feature);
	}

	/**
	 * Returns the feature
	 *
	 * @return
	 */
	public BSToastFeature<?> getFeature()
	{
		return feature;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (toastHeader != null)
			{
				add(toastHeader);
			}
			if (toastBody != null)
			{
				add(toastBody);
			}
		}
		super.init();
	}

	/**
	 * Getter for property 'toastHeader'.
	 *
	 * @return Value for property 'toastHeader'.
	 */
	public BSToastHeader<?> getToastHeader()
	{
		if (toastHeader == null)
		{
			setToastHeader(new BSToastHeader<>());
		}
		return toastHeader;
	}

	/**
	 * Setter for property 'toastHeader'.
	 *
	 * @param toastHeader
	 * 		Value to set for property 'toastHeader'.
	 */
	@SuppressWarnings("unchecked")
	public J setToastHeader(BSToastHeader<?> toastHeader)
	{
		this.toastHeader = toastHeader;
		return (J) this;
	}

	/**
	 * Getter for property 'toastBody'.
	 *
	 * @return Value for property 'toastBody'.
	 */
	public BSToastBody<?> getToastBody()
	{
		if (toastBody == null)
		{
			setToastBody(new BSToastBody<>());
		}
		return toastBody;
	}

	/**
	 * Setter for property 'toastBody'.
	 *
	 * @param toastBody
	 * 		Value to set for property 'toastBody'.
	 */
	@SuppressWarnings("unchecked")
	public J setToastBody(BSToastBody<?> toastBody)
	{
		this.toastBody = toastBody;
		return (J) this;
	}

	/**
	 * If this toast must auto hide
	 * <p>
	 * If false  you must add a close icon
	 *
	 * @param autoHide
	 *
	 * @return
	 */
	public J setAutoHide(boolean autoHide)
	{
		addAttribute("data-autohide", Boolean.toString(autoHide));
		return (J) this;
	}

	public J setShowDelay(Integer autoHide)
	{
		addAttribute("data-delay", Integer.toString(autoHide));
		return (J) this;
	}


}
