/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * @author GedMarc
 * @since 20 Apr 2016
 */
public enum BootstrapReferencePool implements ReferencePool
{

	Bootstrap4CoreReference(new JavascriptReference("BS4Core", 4.003, "bower_components/bootstrap4/dist/js/bootstrap.min.js", 10),
	                        new CSSReference("BS4Core", 4.003, "bower_components/bootstrap4/dist/css/bootstrap.min.css", 10)),

	Bootstrap4TetherReference(new JavascriptReference("BS4Tether", 4.003, "bower_components/tether/dist/js/tether.min.js", 9),
	                          new CSSReference("BS4Tether", 4.003, "bower_components/tether/dist/css/tether.min.css", 9)),

	Bootstrap4PopperReference(new JavascriptReference("BS4Popper", 4.003, "bower_components/popper.js/dist/umd/popper.min.js", 9),
	                          null),

	Bootstrap4RebootReference(null,
	                          new CSSReference("BS4Reboot", 4.003, "bower_components/bootstrap4/dist/css/bootstrap-reboot.min.css", 11)),

	Bootstrap4DropDownReference(null,
	                            new CSSReference("BS4DropDownNoCaret", 4.006, "bs4custom/bs4hidecaret.css", 90));

	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	BootstrapReferencePool()
	{
	}

	BootstrapReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		if (this.javaScriptReference != null)
		{
			this.javaScriptReference.setPriority(RequirementsPriority.Third);
		}
		this.cssReference = cssReference;
		if (this.cssReference != null)
		{
			this.cssReference.setPriority(RequirementsPriority.Third);
		}
	}

	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}

	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}
}
