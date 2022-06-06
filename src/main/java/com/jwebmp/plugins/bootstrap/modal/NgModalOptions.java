package com.jwebmp.plugins.bootstrap.modal;

import com.jwebmp.core.htmlbuilder.javascript.*;
import com.jwebmp.plugins.bootstrap.*;

public class NgModalOptions
		extends JavaScriptPart<NgModalOptions>
{
	private boolean backdrop = true;
	private boolean backdropStatic;
	private boolean centered;
	private boolean fullScreen;
	private BSSizes fullScreenBelow;
	private boolean keyboard = true;
	private BSSizes size;
	
	public boolean isBackdrop()
	{
		return backdrop;
	}
	
	public NgModalOptions setBackdrop(boolean backdrop)
	{
		this.backdrop = backdrop;
		return this;
	}
	
	public boolean isBackdropStatic()
	{
		return backdropStatic;
	}
	
	public NgModalOptions setBackdropStatic(boolean backdropStatic)
	{
		this.backdropStatic = backdropStatic;
		return this;
	}
	
	public boolean isCentered()
	{
		return centered;
	}
	
	public NgModalOptions setCentered(boolean centered)
	{
		this.centered = centered;
		return this;
	}
	
	public boolean isFullScreen()
	{
		return fullScreen;
	}
	
	public NgModalOptions setFullScreen(boolean fullScreen)
	{
		this.fullScreen = fullScreen;
		return this;
	}
	
	public BSSizes getFullScreenBelow()
	{
		return fullScreenBelow;
	}
	
	public NgModalOptions setFullScreenBelow(BSSizes fullScreenBelow)
	{
		this.fullScreenBelow = fullScreenBelow;
		return this;
	}
	
	public boolean isKeyboard()
	{
		return keyboard;
	}
	
	public NgModalOptions setKeyboard(boolean keyboard)
	{
		this.keyboard = keyboard;
		return this;
	}
	
	public BSSizes getSize()
	{
		return size;
	}
	
	public NgModalOptions setSize(BSSizes size)
	{
		this.size = size;
		return this;
	}
}
