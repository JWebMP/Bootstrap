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

package com.jwebmp.plugins.bootstrap.forms.interfaces;

import com.jwebmp.angular.forms.enumerations.InputErrorValidations;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.core.generics.CompassPoints;
import com.jwebmp.plugins.bootstrap.forms.BSForm;
import com.jwebmp.plugins.bootstrap.forms.BSFormLabel;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupSizes;
import com.jwebmp.plugins.bootstrap.options.BSColumnOptions;
import jakarta.validation.constraints.NotNull;

public interface IBSFormGroup<J extends BSFormGroup<J, I>, I extends Input<?, ?>>
        extends ICssStructure<J>
{
    @NotNull
    BSFormLabel<?> addLabel(String text);

    @NotNull
    BSFormLabel<?> addLabel(BSFormLabel<?> text);

    @NotNull
    I setInput(@NotNull I inputComponent);

    /**
     * Adds a success feedback configured with styled if it is set before it
     * <p>
     * make sure to style before this method
     *
     * @param feedback
     * @param inline
     * @return
     */
    @NotNull
    J addSuccessFeedback(String feedback, boolean inline);

    /**
     * Returns the associated form
     *
     * @return
     */
    BSForm<?> getForm();

    /**
     * Sets the form
     *
     * @param form
     * @return
     */

    @NotNull
    J setForm(BSForm<?> form);

    /**
     * Returns the input component associated
     *
     * @return
     */

    I getInput();

    /**
     * Adds help text immediately to the
     *
     * @param text
     * @return
     */
    @NotNull
    J addHelpText(String text);


    /**
     * Adds help text immediately to the
     *
     * @param text
     * @return
     */

    J addHelpText(IComponentHierarchyBase<?, ?> text);


    @NotNull
    J addMessage(@NotNull InputErrorValidations forError, String message, boolean inline);


    @NotNull
    J addMessage(@NotNull InputErrorValidations forError, String message);

    /**
     * Gets the position to place the angular messages in the component
     *
     * @return
     */
    CompassPoints getMessagePlacement();

    /**
     * Sets the message placement
     *
     * @param messagePlacement
     * @return
     */

    @NotNull
    J setMessagePlacement(@NotNull CompassPoints messagePlacement);

    /**
     * Sets the size of the input controller
     *
     * @return
     */

    @NotNull
    J setSize(BSFormGroupSizes size);

    /**
     * Add the readonly boolean attribute on an input to prevent modification of the input’s value. Read-only inputs appear lighter (just
     * like disabled inputs), but retain the standard cursor.
     *
     * @param readOnly
     * @return
     */

    @NotNull
    J setReadOnly(boolean readOnly);

    /**
     * Readonly plain text
     * If you want to have input readonly elements in your form styled as plain text, use the .form-control-plaintext class to remove the
     * default form field styling and preserve the correct margin and padding.
     *
     * @param asPlainText
     * @return
     */

    @NotNull
    J setPlainText(boolean asPlainText);

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

    @NotNull
    J asHorizontalLayout(BSColumnOptions labelSpan, BSColumnOptions inputSpan);

    /**
     * Returns the label associated
     *
     * @return
     */
    BSFormLabel<?> getLabel();
}
