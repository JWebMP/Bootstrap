package za.co.mmagon.jwebswing.plugins.bootstrap4.tables;

import za.co.mmagon.jwebswing.base.html.Table;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSTableOptions;

import javax.validation.constraints.NotNull;

public class BSTable<J extends BSTable<J>>
		extends Table<J>
{
	public BSTable()
	{
		addClass(BSTableOptions.Table);
	}

	/**
	 * Sets this table as striped or not
	 *
	 * @param striped
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStriped(boolean striped)
	{
		if (striped)
		{
			addClass(BSTableOptions.Table_Striped);
		}
		else
		{
			removeClass(BSTableOptions.Table_Striped);
		}
		return (J) this;
	}

	/**
	 * Sets this table as bordered or not
	 *
	 * @param bordered
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBordered(boolean bordered)
	{
		if (bordered)
		{
			addClass(BSTableOptions.Table_Bordered);
		}
		else
		{
			removeClass(BSTableOptions.Table_Bordered);
		}
		return (J) this;
	}

	/**
	 * Add .table-hover to enable a hover state on table rows within a tbody.
	 *
	 * @param hovered
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHover(boolean hovered)
	{
		if (hovered)
		{
			addClass(BSTableOptions.Table_Hover);
		}
		else
		{
			removeClass(BSTableOptions.Table_Hover);
		}
		return (J) this;
	}

	/**
	 * Sets the table as small
	 *
	 * @param small
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSmall(boolean small)
	{
		if (small)
		{
			addClass(BSTableOptions.Table_Sm);
		}
		else
		{
			removeClass(BSTableOptions.Table_Sm);
		}
		return (J) this;
	}

	/**
	 * Sets the table as responsive
	 *
	 * @param responsive
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setResponsive(boolean responsive)
	{
		if (responsive)
		{
			addClass(BSTableOptions.Table_Responsive);
		}
		else
		{
			removeClass(BSTableOptions.Table_Responsive);
		}
		return (J) this;
	}

	/**
	 * Sets the table as responsive
	 *
	 * @param responsive
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setResponsive(BSTableOptions responsive)
	{
		addClass(responsive);
		return (J) this;
	}
}
