package za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.checkbox.styles;

import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.checkbox.BSCheckBox;

/**
 * Checkbox and radio buttons
 * Bootstrap’s .button styles can be applied to other elements, such as <label>s, to provide checkbox or radio style button toggling. Add
 * data-toggle="buttons" to a .btn-group containing those modified buttons to enable their toggling behavior via JavaScript and add
 * .btn-group-toggle to style the <input>s within your buttons. Note that you can create single input-powered buttons or groups of them.
 * <p>
 * The checked state for these buttons is only updated via click event on the button. If you use another method to update the input—e.g.,
 * with <input type="reset"> or by manually applying the input’s checked property—you’ll need to toggle .active on the <label> manually.
 * <p>
 * Note that pre-checked buttons require you to manually add the .active class to the input’s <label>.
 *
 * @param <J>
 */
public class BSCheckBoxDanger<J extends BSCheckBoxDanger<J>>
		extends BSCheckBox<J>
{

	/**
	 * Checkbox and radio buttons
	 * Bootstrap’s .button styles can be applied to other elements, such as <label>s, to provide checkbox or radio style button toggling.
	 * Add data-toggle="buttons" to a .btn-group containing those modified buttons to enable their toggling behavior via JavaScript and add
	 * .btn-group-toggle to style the <input>s within your buttons. Note that you can create single input-powered buttons or groups of
	 * them.
	 * <p>
	 * The checked state for these buttons is only updated via click event on the button. If you use another method to update the
	 * input—e.g., with <input type="reset"> or by manually applying the input’s checked property—you’ll need to toggle .active on the
	 * <label> manually.
	 * <p>
	 * Note that pre-checked buttons require you to manually add the .active class to the input’s <label>.
	 */
	public BSCheckBoxDanger()
	{
		getLabel().addClass(BSButtonOptions.Btn_Danger);
	}
}
