package com.jwebmp.plugins.bootstrap.jumbotron.interfaces;

import com.jwebmp.core.base.html.H1;
import com.jwebmp.core.base.html.HorizontalRule;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.jumbotron.BSJumbotron;

import jakarta.validation.constraints.NotNull;

public interface IBSJumbotron<J extends BSJumbotron<J>>
		extends ICssStructure<J>
{
	H1<?> addJumboText(String text);

	Paragraph<?> addLead(String text);

	HorizontalRule<?> addHorizontalRule();

	@NotNull
	J setFluid();
}
