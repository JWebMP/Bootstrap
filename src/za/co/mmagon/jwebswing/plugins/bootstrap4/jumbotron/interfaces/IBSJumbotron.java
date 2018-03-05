package za.co.mmagon.jwebswing.plugins.bootstrap4.jumbotron.interfaces;

import za.co.mmagon.jwebswing.base.html.H1;
import za.co.mmagon.jwebswing.base.html.HorizontalRule;
import za.co.mmagon.jwebswing.base.html.Paragraph;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.jumbotron.BSJumbotron;

import javax.validation.constraints.NotNull;

public interface IBSJumbotron<J extends BSJumbotron<J>>
		extends ICssStructure<J>
{
	H1<?> addJumboText(String text);

	Paragraph<?> addLead(String text);

	HorizontalRule<?> addHorizontalRule();

	@SuppressWarnings("unchecked")
	@NotNull
	J setFluid();
}
