/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.bootstrap.forms.groups;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.guicedee.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.angular.forms.AngularFormMessages;
import com.jwebmp.angular.forms.enumerations.InputErrorValidations;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.inputs.InputCheckBoxType;
import com.jwebmp.core.base.html.inputs.InputFileType;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.children.FormChildren;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.generics.CompassPoints;
import com.jwebmp.core.utilities.GUIDGenerator;
import com.jwebmp.plugins.bootstrap.containers.BSRowChildren;
import com.jwebmp.plugins.bootstrap.forms.BSComponentFormOptions;
import com.jwebmp.plugins.bootstrap.forms.BSForm;
import com.jwebmp.plugins.bootstrap.forms.BSFormChildren;
import com.jwebmp.plugins.bootstrap.forms.BSFormLabel;
import com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupOptions;
import com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupSizes;
import com.jwebmp.plugins.bootstrap.forms.interfaces.IBSFormGroup;
import com.jwebmp.plugins.bootstrap.options.BSColumnOptions;
import jakarta.validation.constraints.NotNull;
import lombok.extern.java.Log;

import static com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupOptions.Form_Text;
import static com.jwebmp.plugins.bootstrap.options.BSContainerOptions.Row;
import static com.jwebmp.plugins.bootstrap.options.BSTypographyOptions.Text_Muted;

/**
 * An implementation of
 * <p>
 *
 * @param <J> Always this class
 * @param <I> The input type control
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@Log
public class BSFormGroup<J extends BSFormGroup<J, I>, I extends Input<?, ?>>
        extends Div<GlobalChildren, BSFormGroupAttributes, GlobalFeatures, GlobalEvents, J>
        implements BSFormChildren, IBSFormGroup<J, I>, FormChildren, BSRowChildren
{
    /**
     * The label
     */
    private BSFormLabel<?> label;

    @JsonIdentityReference(alwaysAsId = true)
    private BSForm<?> form;

    private CompassPoints messagePlacement = CompassPoints.S;

    private boolean addInput = true;
    private boolean addLabel = true;

    /**
     * The input component for the form group
     */
    private I input;

    /**
     * Form Group Messages
     */
    private AngularFormMessages<?> messages;

    /**
     * Constructs a new BS Form Group
     */
    public BSFormGroup()
    {
        addClass(BSFormGroupOptions.Form_Group);
    }

    /**
     * Returns the applied messages
     *
     * @return
     */

    @NotNull
    public AngularFormMessages<?> getMessages()
    {
        if (messages == null)
        {
            messages = new AngularFormMessages<>(getInput());
        }

        return messages;
    }

    /**
     */
    /**
     * Sets the collection of validation messages to display
     *
     * @param messages
     * @return
     */

    @SuppressWarnings("unchecked")
    @NotNull
    protected J setMessages(AngularFormMessages<?> messages)
    {
        this.messages = messages;
        return (J) this;
    }


    /**
     * The slimmer neater version
     *
     * @return
     */
    public IBSFormGroup<J, I> asMe()
    {
        return this;
    }

    @Override
    @NotNull
    public BSFormLabel<?> addLabel(String text)
    {
        if (label != null)
        {
            remove(label);
        }
        if (label == null)
        {
            label = new BSFormLabel<>();
        }
        label.setText(text);
        if (addLabel)
        {
            add(label);
        }
        return label;
    }

    @Override
    @NotNull
    public BSFormLabel<?> addLabel(BSFormLabel<?> text)
    {
        if (label != null)
        {
            remove(label);
        }
        label = text;
        if (addLabel)
        {
            add(label);
        }
        return label;
    }

    @Override
    @NotNull
    public I setInput(@NotNull I inputComponent)
    {
        if (input != null)
        {
            remove(input);
        }
        if (addInput)
        {
            add(inputComponent);
        }
        input = inputComponent;

        if (addInput)
        {
            if (inputComponent != null)
            {
                if (!(inputComponent instanceof InputFileType))
                {
                    inputComponent.addClass(BSFormGroupOptions.Form_Control);
                }
            }
        }

        if (label != null)
        {
            if (inputComponent != null)
            {
                inputComponent.addAttribute(GlobalAttributes.Aria_Describedby, label.getID());
                label.setForInputComponent(inputComponent);
            }
        }
        return inputComponent;
    }

    /**
     * Adds a success feedback configured with styled if it is set before it
     * <p>
     * make sure to style before this method
     *
     * @param feedback
     * @param inline
     * @return
     */
    @Override
    @NotNull
    @SuppressWarnings("unchecked")
    public J addSuccessFeedback(String feedback, boolean inline)
    {
        IComponentHierarchyBase<GlobalChildren, ?> component;
        if (inline)
        {
            component = new Span<>();
        }
        else
        {
            component = new Div<>();
        }
        component.add(new Paragraph<>(feedback).setTextOnly(true));
        component.addClass("valid-feedback");
        add(component);
        return (J) this;
    }

    /**
     * Returns the associated form
     *
     * @return
     */
    @Override
    public BSForm<?> getForm()
    {
        if (form == null)
        {
            form = new BSForm<>(GUIDGenerator.generateGuid(), null);
        }
        return form;
    }

    /**
     * Sets the form
     *
     * @param form
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J setForm(BSForm<?> form)
    {
        this.form = form;
        return (J) this;
    }

    public I getInputRaw()
    {
        return input;
    }

    /**
     * Returns the input component associated
     *
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public I getInput()
    {
        if (input == null)
        {
            input = (I) new InputCheckBoxType<>();
        }
        return input;
    }

    /**
     * Adds help text immediately to the
     *
     * @param text
     * @return
     */
    @Override
    @NotNull
    @SuppressWarnings("unchecked")
    public J addHelpText(String text)
    {
        SmallText<?> smallText = new SmallText<>(text);
        smallText.addClass(Form_Text);
        smallText.addClass(Text_Muted);
        add(smallText);
        return (J) this;
    }

    /**
     * Adds help text immediately to the
     *
     * @param text
     * @return
     */
    @Override
    @NotNull
    @SuppressWarnings("unchecked")
    public J addHelpText(IComponentHierarchyBase<?, ?> text)
    {
        text.addClass(Form_Text);
        text.addClass(Text_Muted);
        add(text);
        return (J) this;
    }


    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J addMessage(@NotNull InputErrorValidations forError, String message, boolean inline)
    {
        getMessages().addMessage(forError, message)
                     .addClass("invalid-feedback");
		/*getMessages().addMessage(forError, message, inline)
		             .addClass("invalid-feedback");*/
        return (J) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J addMessage(@NotNull InputErrorValidations forError, String message)
    {
        getMessages().addMessage(forError, message);
        //getMessages().addMessage(forError, message, false);
        return (J) this;
    }

    /**
     * Gets the position to place the angular messages in the component
     *
     * @return
     */
    @Override
    public CompassPoints getMessagePlacement()
    {
        return messagePlacement;
    }

    /**
     * Sets the message placement
     *
     * @param messagePlacement
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J setMessagePlacement(@NotNull CompassPoints messagePlacement)
    {
        this.messagePlacement = messagePlacement;
        return (J) this;
    }

    /**
     * Sets the size of the input controller
     *
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J setSize(BSFormGroupSizes size)
    {
        if (input == null)
        {
            throw new UnsupportedOperationException("Unable to set the size of an input that doesn't exist...");
        }
        addClass(size);
        return (J) this;
    }

    /**
     * Add the readonly boolean attribute on an input to prevent modification of the input’s value. Read-only inputs appear lighter (just
     * like disabled inputs), but retain the standard cursor.
     *
     * @param readOnly
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J setReadOnly(boolean readOnly)
    {
        if (getInput() == null)
        {
            throw new UnsupportedOperationException("Can't set read only on a non-existent input.....");
        }
        if (readOnly)
        {
            getInput().addAttribute(BSFormGroupAttributes.ReadOnly.toString(), StaticStrings.STRING_EMPTY);
        }
        else
        {
            getInput().removeAttribute(BSFormGroupAttributes.ReadOnly.toString());
        }
        return (J) this;
    }

    /**
     * Readonly plain text
     * If you want to have input readonly elements in your form styled as plain text, use the .form-control-plaintext class to remove the
     * default form field styling and preserve the correct margin and padding.
     *
     * @param asPlainText
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J setPlainText(boolean asPlainText)
    {
        if (getInput() == null)
        {
            throw new UnsupportedOperationException("Can't set plain text on a non-existent input.....");
        }

        if (asPlainText)
        {
            getInput().removeClass(BSFormGroupOptions.Form_Control);
            getInput().addClass(BSFormGroupOptions.Form_Control_PlainText);
        }
        else
        {
            getInput().addClass(BSFormGroupOptions.Form_Control);
            getInput().removeClass(BSFormGroupOptions.Form_Control_PlainText);
        }
        return (J) this;
    }

    /**
     * Horizontal form
     * Create horizontal forms with the grid by adding the .row class to form groups and using the .col-*-* classes to specify the width of
     * your labels and controls. Be sure to add .col-form-label to your labels as well so they’re vertically centered with their
     * associated form controls.
     * <p>
     * At times, you maybe need to use margin or padding utilities to create that perfect alignment you need. For example, we’ve removed
     * the
     * padding-top on our stacked radio inputs label to better align the text baseline.
     *
     * @param labelSpan
     * @param inputSpan
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public J asHorizontalLayout(BSColumnOptions labelSpan, BSColumnOptions inputSpan)
    {
        if (getInput() == null)
        {
            throw new UnsupportedOperationException("Can't set as horizontal layout until at least the input is set");
        }
        if (getLabel() == null)
        {
            BSFormGroup.log.warning("Label span set where no label exists. Make sure to add the label before setting as horizontal layout or it may " + "appear funny.");
        }
        else
        {
            getLabel().addClass(labelSpan);
            getLabel().addClass(BSComponentFormOptions.Col_Form_Label);
        }
        getInput().getClasses()
                  .forEach(a ->
                           {
                               if (a.contains("form-control-lg"))
                               {
                                   getLabel().addClass("col-form-label-lg");
                               }
                               else if (a.contains("form-control-sm"))
                               {
                                   getLabel().addClass("col-form-label-sm");
                               }
                           });
        addClass(Row);
        getInput().addClass(inputSpan);

        return (J) this;
    }

    /**
     * Returns the label associated
     *
     * @return
     */
    @Override

    public BSFormLabel<?> getLabel()
    {
        if (label == null)
        {
            label = new BSFormLabel<>();
            //	label.addClass("custom-control-label");
            label.setForInputComponent(getInput());
        }
        return label;
    }

    public boolean isAddInput()
    {
        return addInput;
    }

    public BSFormGroup<J, I> setAddInput(boolean addInput)
    {
        this.addInput = addInput;
        return this;
    }

    public boolean isAddLabel()
    {
        return addLabel;
    }

    public BSFormGroup<J, I> setAddLabel(boolean addLabel)
    {
        this.addLabel = addLabel;
        return this;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        return super.equals(o);
    }
}

