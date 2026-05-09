package com.jwebmp.plugins.bootstrap.figures;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.TableCaption;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.plugins.bootstrap.options.BSFigureOptions;
import com.jwebmp.plugins.bootstrap.options.BSTypographyOptions;

import jakarta.validation.constraints.NotNull;

/**
 * Anytime you need to display a piece of content—like an image with an optional caption, consider using a figure.
 * <p>
 * Use the included .figure , .figure-img and .figure-caption classes to provide some baseline styles for the HTML5 figure and figcaption
 * elements.
 * <p>
 * Images in figures have no explicit size, so be sure to add the .img-fluid class to your img to make it responsive.
 *
 * @param <J>
 */
public class BSFigure<J extends BSFigure<J>>
        extends DivSimple<J>
{
    private IComponentHierarchyBase<?, ?> header;
    private TableCaption<?> caption;

    /**
     * Anytime you need to display a piece of content—like an image with an optional caption, consider using a figure.
     * <p>
     * Use the included .figure , .figure-img and .figure-caption classes to provide some baseline styles for the HTML5 figure and
     * figcaption elements.
     * <p>
     * Images in figures have no explicit size, so be sure to add the .img-fluid class to your img to make it responsive.
     *
     * @param header
     * @param caption
     */
    public BSFigure(IComponentHierarchyBase<?, ?> header, TableCaption<?> caption)
    {
        this();
        this.header = header;
        this.caption = caption;
    }

    /**
     * Anytime you need to display a piece of content—like an image with an optional caption, consider using a figure.
     * <p>
     * Use the included .figure , .figure-img and .figure-caption classes to provide some baseline styles for the HTML5 figure and
     * figcaption elements.
     * <p>
     * Images in figures have no explicit size, so be sure to add the .img-fluid class to your img to make it responsive.
     */
    public BSFigure()
    {
        setTag(ComponentTypes.Figure.getComponentTag());
        addClass(ComponentTypes.Figure.getComponentTag());
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            add(getHeader());
            add(getCaption());
        }
        super.init();
    }

    /**
     * Returns the header
     *
     * @return
     */

    public IComponentHierarchyBase<?, ?> getHeader()
    {
        return header;
    }

    @SuppressWarnings("unchecked")
    @NotNull
    public J setHeader(IComponentHierarchyBase<?, ?> header)
    {
        this.header = header;
        if (this.header != null)
        {
            addClass(BSFigureOptions.Figure_Img);
        }
        return (J) this;
    }

    public TableCaption<?> getCaption()
    {
        return caption;
    }

    @SuppressWarnings("unchecked")
    @NotNull
    public J setCaption(TableCaption<?> caption, boolean right)
    {
        this.caption = caption;
        if (caption != null)
        {
            caption.addClass(BSFigureOptions.Figure_Caption);
            if (right)
            {
                caption.addClass(BSTypographyOptions.Text_Right);
            }
        }
        return (J) this;
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
