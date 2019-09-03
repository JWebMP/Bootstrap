package com.jwebmp.plugins.bootstrap4.toasts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BSToastOptions<J extends BSToastOptions<J>>
		extends JavaScriptPart<J>
{
	private Boolean animation;
	private Boolean autohide;
	private Integer delay;

	/**
	 * A new options object
	 */
	public BSToastOptions()
	{
		//No config required
	}

	/**
	 * Getter for property 'animation'.
	 *
	 * @return Value for property 'animation'.
	 */
	public Boolean getAnimation()
	{
		return animation;
	}

	/**
	 * Setter for property 'animation'.
	 *
	 * @param animation
	 * 		Value to set for property 'animation'.
	 */
	public BSToastOptions<J> setAnimation(Boolean animation)
	{
		this.animation = animation;
		return this;
	}

	/**
	 * Getter for property 'autohide'.
	 *
	 * @return Value for property 'autohide'.
	 */
	public Boolean getAutohide()
	{
		return autohide;
	}

	/**
	 * Setter for property 'autohide'.
	 *
	 * @param autohide
	 * 		Value to set for property 'autohide'.
	 */
	public BSToastOptions<J> setAutohide(Boolean autohide)
	{
		this.autohide = autohide;
		return this;
	}

	/**
	 * Getter for property 'delay'.
	 *
	 * @return Value for property 'delay'.
	 */
	public Integer getDelay()
	{
		return delay;
	}

	/**
	 * Setter for property 'delay'.
	 *
	 * @param delay
	 * 		Value to set for property 'delay'.
	 */
	public BSToastOptions<J> setDelay(Integer delay)
	{
		this.delay = delay;
		return this;
	}
}
