package com.jwebmp.plugins.bootstrap4.fileupload;

import com.jwebmp.core.base.html.inputs.InputFileType;
import com.jwebmp.plugins.bootstrap4.forms.BSFormLabel;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;

import jakarta.validation.constraints.NotNull;

import static com.jwebmp.core.base.servlets.enumarations.ComponentTypes.*;
import static com.jwebmp.plugins.bootstrap4.forms.groups.enumerations.BSFormGroupOptions.*;

/**
 * Custom File Upload
 * To create a custom file upload, wrap a container element with a class of .custom-file around the input with type="file". Then add the .custom-control-input to it.
 * <p>
 * Tip: If you use labels for accompanying text, add the .custom-control-label class to it. Note that the value of the for attribute should match the id of the checkbox:
 * <p>
 * Choose file Default file:
 * Note that you also have to include some jQuery code if you want the name of the file to appear when you select a specific file:
 *
 * @param <J>
 */
public class BSFileUpload<J extends BSFileUpload<J>>
		extends BSFormGroup<J, InputFileType<?>>
{
	private boolean showFilename;
	private BSFormLabel<?> label;

	/**
	 * Custom File Upload
	 * To create a custom file upload, wrap a container element with a class of .custom-file around the input with type="file". Then add the .custom-control-input to it.
	 * <p>
	 * Tip: If you use labels for accompanying text, add the .custom-control-label class to it. Note that the value of the for attribute should match the id of the checkbox:
	 * <p>
	 * Choose file Default file:
	 * Note that you also have to include some jQuery code if you want the name of the file to appear when you select a specific file:
	 */
	public BSFileUpload()
	{
		setTag(Div);
		setInput(new InputFileType<>());
		addClass("custom-file");
		removeClass(Form_Group);
	}

	/**
	 * Custom File Upload
	 * To create a custom file upload, wrap a container element with a class of .custom-file around the input with type="file". Then add the .custom-control-input to it.
	 * <p>
	 * Tip: If you use labels for accompanying text, add the .custom-control-label class to it. Note that the value of the for attribute should match the id of the checkbox:
	 * <p>
	 * Choose file Default file:
	 * Note that you also have to include some jQuery code if you want the name of the file to appear when you select a specific file:
	 *
	 * @param showFilename
	 * @param label
	 */
	public BSFileUpload(boolean showFilename, String label)
	{
		this();
		this.showFilename = showFilename;
		setLabel(label);
	}

	/**
	 * Custom File Upload
	 * To create a custom file upload, wrap a container element with a class of .custom-file around the input with type="file". Then add the .custom-control-input to it.
	 * <p>
	 * Tip: If you use labels for accompanying text, add the .custom-control-label class to it. Note that the value of the for attribute should match the id of the checkbox:
	 * <p>
	 * Choose file Default file:
	 * Note that you also have to include some jQuery code if you want the name of the file to appear when
	 * you select a specific file:
	 *
	 * @param label
	 */
	public BSFileUpload(String label)
	{
		this();
		setLabel(label);
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			add(getInput());
			if (this.label != null)
			{
				add(this.label);
			}
			if (showFilename)
			{
				getInput().addFeature(new BSFileUploadShowFilenameFeature<>(getInput()));
			}
		}
		super.init();
	}

	@Override
	public InputFileType<?> setInput(@NotNull InputFileType<?> inputComponent)
	{
		InputFileType<?> f = super.setInput(inputComponent);
		f.addClass("custom-file-input");
		return f;
	}

	/**
	 * Sets the label to a given item
	 *
	 * @param label
	 *
	 * @return
	 */
	public BSFileUpload<J> setLabel(BSFormLabel<?> label)
	{
		if (this.label != null)
		{
			remove(this.label);
		}
		this.label = label;
		if (this.label != null)
		{
			this.label.addClass("custom-file-label");
			this.label.setForInputComponent(getInput());
		}
		return this;
	}

	/**
	 * Getter for property 'showFilename'.
	 *
	 * @return Value for property 'showFilename'.
	 */
	public boolean isShowFilename()
	{
		return showFilename;
	}

	/**
	 * Setter for property 'showFilename'.
	 *
	 * @param showFilename
	 * 		Value to set for property 'showFilename'.
	 */
	public BSFileUpload<J> setShowFilename(boolean showFilename)
	{
		this.showFilename = showFilename;
		return this;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return
	 */
	@Override
	public BSFormLabel<?> getLabel()
	{
		if (label == null)
		{
			setLabel("");
		}

		return label;
	}

	/**
	 * Setter for property 'label'.
	 *
	 * @param label
	 * 		Value to set for property 'label'.
	 */
	public BSFileUpload<J> setLabel(String label)
	{
		if (this.label != null)
		{
			remove(this.label);
		}
		this.label = new BSFormLabel<>(label);
		this.label.addClass("custom-file-label");
		this.label.setForInputComponent(getInput());
		return this;
	}
}
