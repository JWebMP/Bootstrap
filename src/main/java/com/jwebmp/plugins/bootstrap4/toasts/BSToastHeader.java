package com.jwebmp.plugins.bootstrap4.toasts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.SmallText;
import com.jwebmp.core.base.html.Strong;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.plugins.bootstrap4.close.BSCloseIcon;
import com.jwebmp.plugins.bootstrap4.images.BSImage;

import static com.jwebmp.plugins.bootstrap4.options.BSBorderOptions.*;
import static com.jwebmp.plugins.bootstrap4.options.BSSpacingOptions.*;
import static com.jwebmp.plugins.bootstrap4.toasts.BSToastClasses.*;

public class BSToastHeader<J extends BSToastHeader<J>>
		extends DivSimple<J>
{
	private BSImage<?> image;
	private IIcon<?,?> imageIcon;
	private Strong<?> title;
	private SmallText<?> subtitle;
	private BSCloseIcon<?> closeIcon;

	public BSToastHeader()
	{
		addClass(Toast_Header);
	}

	@SuppressWarnings("unchecked")
	public J setShowCloseIcon(boolean showCloseIcon)
	{
		if (showCloseIcon)
		{
			setCloseIcon(new BSCloseIcon<>());
		}
		else
		{
			setCloseIcon(null);
		}
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	public J setHeaderImage(String image)
	{
		this.imageIcon = null;
		this.image = new BSImage<>(image).addClass(Rounded)
		                                 .addClass(Margin_Right_2);
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	public J setHeaderImage(IIcon<?,?> image)
	{
		this.image = null;
		this.imageIcon = image;
		return (J) this;
	}


	/**
	 * Getter for property 'image'.
	 *
	 * @return Value for property 'image'.
	 */
	public BSImage<?> getImage()
	{
		return image;
	}

	/**
	 * Setter for property 'image'.
	 *
	 * @param image
	 * 		Value to set for property 'image'.
	 */
	@SuppressWarnings("unchecked")
	public J setImage(BSImage<?> image)
	{
		this.image = image;
		return (J) this;
	}

	/**
	 * Getter for property 'imageIcon'.
	 *
	 * @return Value for property 'imageIcon'.
	 */
	public IIcon<?,?> getImageIcon()
	{
		return imageIcon;
	}

	/**
	 * Setter for property 'imageIcon'.
	 *
	 * @param imageIcon
	 * 		Value to set for property 'imageIcon'.
	 */
	@SuppressWarnings("unchecked")
	public J setImageIcon(IIcon<?,?> imageIcon)
	{
		this.imageIcon = imageIcon;
		return (J) this;
	}

	/**
	 * Getter for property 'title'.
	 *
	 * @return Value for property 'title'.
	 */
	public Strong<?> getTitle()
	{
		return title;
	}

	/**
	 * Setter for property 'title'.
	 *
	 * @param title
	 * 		Value to set for property 'title'.
	 */
	@SuppressWarnings("unchecked")
	public J setTitle(Strong<?> title)
	{
		this.title = title;
		return (J) this;
	}

	/**
	 * Getter for property 'subtitle'.
	 *
	 * @return Value for property 'subtitle'.
	 */
	public SmallText<?> getSubtitle()
	{
		return subtitle;
	}

	/**
	 * Setter for property 'subtitle'.
	 *
	 * @param subtitle
	 * 		Value to set for property 'subtitle'.
	 */
	@SuppressWarnings("unchecked")
	public J setSubtitle(SmallText<?> subtitle)
	{
		this.subtitle = subtitle;
		return (J) this;
	}

	/**
	 * Getter for property 'closeIcon'.
	 *
	 * @return Value for property 'closeIcon'.
	 */
	public BSCloseIcon<?> getCloseIcon()
	{
		return closeIcon;
	}

	/**
	 * Setter for property 'closeIcon'.
	 *
	 * @param closeIcon
	 * 		Value to set for property 'closeIcon'.
	 */
	@SuppressWarnings("unchecked")
	public J setCloseIcon(BSCloseIcon<?> closeIcon)
	{
		if (this.closeIcon != null)
		{
			remove(this.closeIcon);
		}

		this.closeIcon = closeIcon;
		if (this.closeIcon != null)
		{
			this.closeIcon.setDataDismiss(Toast.toString())
			              .setAriaLabel("Close")
			              .addClass(Margin_Left_2)
			              .addClass(Margin_Bottom_1);
		}
		return (J) this;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (image != null)
			{
				add(image);
			}
			if (imageIcon != null)
			{
				add(imageIcon.getIconComponent());
			}
			if (title != null)
			{
				add((title));
			}
			if (subtitle != null)
			{
				add(subtitle);
			}
			if (closeIcon != null)
			{
				add(closeIcon);
			}
		}
		super.init();
	}
}
