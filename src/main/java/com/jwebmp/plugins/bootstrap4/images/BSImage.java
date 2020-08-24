package com.jwebmp.plugins.bootstrap4.images;

import com.jwebmp.core.base.html.Image;

import static com.guicedee.guicedinjection.json.StaticStrings.*;
import static com.jwebmp.plugins.bootstrap4.options.BSFloatOptions.*;
import static com.jwebmp.plugins.bootstrap4.options.BSImageOptions.*;

public class BSImage<J extends BSImage<J>>
		extends Image<J>
		implements IBSImage<J>
{
	/**
	 * If the image is responsive
	 */
	private boolean responsive;
	/**
	 * If the image is rounded
	 */
	private boolean rounded;
	/**
	 * If the image is a thumbnail
	 */
	private boolean thumbnail;

	/**
	 * The BS Image with a # img
	 */
	public BSImage()
	{
		this(STRING_HASH);
	}

	/**
	 * Construct a new Image
	 *
	 * @param image
	 * 		the url of image
	 */
	public BSImage(String image)
	{
		super(image);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			if (responsive)
			{
				addClass(Img_Fluid);
			}
			if (rounded)
			{
				addClass(Img_Rounded);
			}
			if (thumbnail)
			{
				addClass(Img_Thumbnail);
			}
		}
		super.preConfigure();
	}

	public IBSImage<J> asMe()
	{
		return this;
	}

	/**
	 * Getter for property 'responsive'.
	 *
	 * @return Value for property 'responsive'.
	 */
	@Override
	public boolean isResponsive()
	{
		return responsive;
	}

	/**
	 * Setter for property 'responsive'.
	 *
	 * @param responsive
	 * 		Value to set for property 'responsive'.
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setResponsive(boolean responsive)
	{
		this.responsive = responsive;
		return (J) this;
	}

	/**
	 * Getter for property 'rounded'.
	 *
	 * @return Value for property 'rounded'.
	 */
	@Override
	public boolean isRounded()
	{
		return rounded;
	}

	/**
	 * Setter for property 'rounded'.
	 *
	 * @param rounded
	 * 		Value to set for property 'rounded'.
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setRounded(boolean rounded)
	{
		this.rounded = rounded;
		return (J) this;
	}

	/**
	 * Getter for property 'thumbnail'.
	 *
	 * @return Value for property 'thumbnail'.
	 */
	@Override
	public boolean isThumbnail()
	{
		return thumbnail;
	}

	/**
	 * Setter for property 'thumbnail'.
	 *
	 * @param thumbnail
	 * 		Value to set for property 'thumbnail'.
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setThumbnail(boolean thumbnail)
	{
		this.thumbnail = thumbnail;
		return (J) this;
	}

	/**
	 * Sets the alignment left using the float-left class
	 *
	 * @param floatLeft
	 * 		on or off
	 *
	 * @return This class
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setAlignLeft(boolean floatLeft)
	{
		if (floatLeft)
		{
			addClass(Float_xs_Left);
		}
		else
		{
			removeClass(Float_xs_Left);
		}
		return (J) this;
	}

	/**
	 * Sets the alignment right for the class float left
	 *
	 * @param floatRight
	 * 		on or off
	 *
	 * @return This class
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setAlignRight(boolean floatRight)
	{
		if (floatRight)
		{
			addClass(Float_xs_Left);
		}
		else
		{
			removeClass(Float_xs_Left);
		}
		return (J) this;
	}

	/**
	 * Aligns center using auto margin left and right and display block
	 *
	 * @param alignCenter
	 * 		on/off
	 *
	 * @return This
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setAlignCenter(boolean alignCenter)
	{
		if (alignCenter)
		{
			addClass("mx-auto d-block");
		}
		else
		{
			removeClass("mx-auto d-block");
		}
		return (J) this;
	}

	/**
	 * Aligns text center by adding the text-center class
	 *
	 * @param textCenter
	 * 		on/off
	 *
	 * @return This
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setTextCenter(boolean textCenter)
	{
		if (textCenter)
		{
			addClass("text-center");
		}
		else
		{
			removeClass("text-center");
		}
		return (J) this;
	}


}
