package com.jwebmp.plugins.bootstrap.options.interfaces;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap.options.BSAlignmentVerticalOptions;

import static com.jwebmp.plugins.bootstrap.options.BSAlignmentHorizontalOptions.*;

/**
 * Defines default methods for alignment and placing in bootstrap containers
 *
 * @param <J>
 * 		Always this
 */
public interface IBSAlignmentCapable<J extends IBSAlignmentCapable<J>>
{

	default IBSAlignmentCapable<J> asAlignment()
	{
		return this;
	}

	@SuppressWarnings("unchecked")
	default J setAlignCenterX(boolean alignCenter)
	{
		ComponentHierarchyBase comp = (ComponentHierarchyBase) this;
		comp.addClass("d-flex");
		if (alignCenter)
		{
			comp.addClass(Align_Center);
		}
		else
		{
			comp.removeClass(Align_Center);
		}

		return (J) this;
	}

	@SuppressWarnings("unchecked")
	default J setAlignCenterY(boolean alignCenter)
	{
		ComponentHierarchyBase comp = (ComponentHierarchyBase) this;
		comp.addClass("d-flex");
		if (alignCenter)
		{
			comp.addClass(BSAlignmentVerticalOptions.Align_Middle);
		}
		else
		{
			comp.removeClass(BSAlignmentVerticalOptions.Align_Middle);
		}
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	default J setAlignTopY(boolean alignTop)
	{
		ComponentHierarchyBase comp = (ComponentHierarchyBase) this;
		comp.addClass("d-flex");
		if (alignTop)
		{
			comp.addClass(BSAlignmentVerticalOptions.Align_Top);
		}
		else
		{
			comp.removeClass(BSAlignmentVerticalOptions.Align_Top);
		}
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	default J setAlignBottomY(boolean alignButton)
	{
		ComponentHierarchyBase comp = (ComponentHierarchyBase) this;
		comp.addClass("d-flex");
		if (alignButton)
		{
			comp.addClass(BSAlignmentVerticalOptions.Align_Bottom);
		}
		else
		{
			comp.removeClass(BSAlignmentVerticalOptions.Align_Bottom);
		}
		return (J) this;
	}


	@SuppressWarnings("unchecked")
	default J setAlignLeftX(boolean alignButton)
	{
		ComponentHierarchyBase comp = (ComponentHierarchyBase) this;
		comp.addClass("d-flex");
		if (alignButton)
		{
			comp.addClass(Align_Left);
		}
		else
		{
			comp.removeClass(Align_Left);
		}
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	default J setAlignRightX(boolean alignButton)
	{
		ComponentHierarchyBase comp = (ComponentHierarchyBase) this;
		comp.addClass("d-flex");
		if (alignButton)
		{
			comp.addClass(Align_Right);
		}
		else
		{
			comp.removeClass(Align_Right);
		}
		return (J) this;
	}

	@SuppressWarnings("unchecked")
	default J setAlignAroundX(boolean alignButton)
	{
		ComponentHierarchyBase comp = (ComponentHierarchyBase) this;
		comp.addClass("d-flex");
		if (alignButton)
		{
			comp.addClass(Align_Around);
		}
		else
		{
			comp.removeClass(Align_Around);
		}
		return (J) this;
	}


	@SuppressWarnings("unchecked")
	default J setAlignBetweenX(boolean alignButton)
	{
		ComponentHierarchyBase comp = (ComponentHierarchyBase) this;
		comp.addClass("d-flex");
		if (alignButton)
		{
			comp.addClass(Align_Between);
		}
		else
		{
			comp.removeClass(Align_Between);
		}
		return (J) this;
	}
}
