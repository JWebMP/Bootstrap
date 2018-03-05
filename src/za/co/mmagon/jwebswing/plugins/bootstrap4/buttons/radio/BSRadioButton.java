package za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.radio;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.inputs.InputRadioType;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;

import javax.validation.constraints.NotNull;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSDefaultOptions.Active;

/**
 * Checkbox and radio buttons
 * Bootstrap’s .button styles can be applied to other elements, such as lt;labelgt;s, to provide checkbox or radio style button toggling.
 * Add
 * data-toggle="buttons" to a .btn-group containing those modified buttons to enable their toggling behavior via JavaScript and add
 * .btn-group-toggle to style the lt;inputgt;s within your buttons. Note that you can create single input-powered buttons or groups of
 * them.
 * lt;pgt;
 * The checked state for these buttons is only updated via click event on the button. If you use another method to update the input—e.g.,
 * with lt;input type="reset"gt; or by manually applying the input’s checked property—you’ll need to toggle .active on the lt;labelgt;
 * manually.
 * lt;pgt;
 * Note that pre-checked buttons require you to manually add the .active class to the input’s lt;labelgt;.
 *
 * @param <J>
 */
public class BSRadioButton<J extends BSRadioButton<J>>
		extends DivSimple<J>
{
	/**
	 * The label component
	 */
	private Label<?> label;
	/**
	 * The input component
	 */
	private InputRadioType<?> input;

	/**
	 * Checkbox and radio buttons
	 * Bootstrap’s .button styles can be applied to other elements, such as &lt;labelgt;s, to provide checkbox or radio style button
	 * toggling.
	 * Add data-toggle="buttons" to a .btn-group containing those modified buttons to enable their toggling behavior via JavaScript and add
	 * .btn-group-toggle to style the &lt;inputgt;s within your buttons. Note that you can create single input-powered buttons or groups of
	 * them.
	 * &lt;pgt;
	 * The checked state for these buttons is only updated via click event on the button. If you use another method to update the
	 * input—e.g., with &lt;input type="reset"gt; or by manually applying the input’s checked property—you’ll need to toggle .active on the
	 * &lt;labelgt; manually.
	 * &lt;pgt;
	 * Note that pre-checked buttons require you to manually add the .active class to the input’s &lt;labelgt;.
	 */
	public BSRadioButton(String groupName)
	{
		addClass(BSButtonOptions.Btn_Group);
		addClass(BSButtonOptions.Btn_Group_Toggle);
		addAttribute("data-toggle", "buttons");
		setLabel(new Label());
		setInput(new InputRadioType());
		setName(groupName);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			add(label);
			add(input);
		}
		super.preConfigure();
	}

	/**
	 * Sets if the checkbox must display as active
	 *
	 * @param active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		if (active)
		{
			addClass(Active);
		}
		else
		{
			removeClass(Active);
		}
		return (J) this;
	}


	/**
	 * Returns the label associated with this checkbox
	 *
	 * @return
	 */
	@NotNull
	public Label<?> getLabel()
	{
		return label;
	}

	/**
	 * Sets the label of this checkbox
	 *
	 * @param label
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabel(@NotNull Label<?> label)
	{
		this.label = label;
		label.addClass(BSButtonOptions.Btn);
		return (J) this;
	}

	/**
	 * Gets the input component for the checkbox
	 *
	 * @return
	 */
	@NotNull
	public InputRadioType<?> getInput()
	{
		return input;
	}

	/**
	 * Sets the input component for the checkbox
	 *
	 * @param input
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInput(@NotNull InputRadioType<?> input)
	{
		this.input = input;
		input.addAttribute("autocomplete", "off");
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
