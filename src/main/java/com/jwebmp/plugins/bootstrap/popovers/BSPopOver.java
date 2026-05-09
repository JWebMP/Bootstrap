package com.jwebmp.plugins.bootstrap.popovers;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.BSPlacements;
import com.jwebmp.plugins.bootstrap.BSTriggers;
import com.jwebmp.plugins.bootstrap.popovers.interfaces.BSPopOverEvents;
import com.jwebmp.plugins.bootstrap.popovers.interfaces.BSPopOverFeatures;
import com.jwebmp.plugins.bootstrap.popovers.interfaces.IBSPopOver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Popovers
 * <p>
 * Add small overlay content, like those found in iOS, to any element for housing secondary information.
 * <p>
 * Overview
 * <p>
 * Things to know when using the popover plugin:
 * <p>
 * Popovers rely on the 3rd party library Tether for positioning. You must include tether.min.js before bootstrap.js in order for popovers
 * to work! Popovers require the tooltip plugin as a dependency.
 * Popovers are opt-in for performance reasons, so you must initialize them yourself. Zero-length title and content values will never show a
 * popover. Specify container: 'body' to avoid rendering
 * problems in more complex components (like our input groups, button groups, etc). Triggering popovers on hidden elements will not work.
 * Popovers for .disabled or disabled elements must be triggered
 * on a wrapper element. When triggered from hyperlinks that span multiple lines, popovers will be centered. Use white-space: nowrap; on
 * your as to avoid this behavior.
 * <p>
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Popovers",
        description = "Add small overlay content, like those found in iOS, to any element for housing secondary information.",
        url = "https://v4-alpha.getbootstrap.com/components/popovers/",
        wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
@NgImportReference(value = "NgbPopover", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportModule("NgbPopover")
public class BSPopOver<J extends BSPopOver<J>>
        extends Div<GlobalChildren, BSPopOverAttributes, BSPopOverFeatures, BSPopOverEvents, J>
        implements IBSPopOver, INgComponent<J>
{
    private BSPopOverTitle<?> popOverTitle;
    private BSPopOverContent<?> popOverContent;


    private boolean animation;
    private BSTriggers autoClose;
    private Integer closeDelay;
    private Boolean containInBody;
    private boolean disablePopover;
    private Integer openDelay;
    private BSPlacements placement;
    private String popoverClass;
    private List<BSTriggers> triggers = new ArrayList<>();

    /**
     * Popovers
     * <p>
     * Add small overlay content, like those found in iOS, to any element for housing secondary information.
     * <p>
     * Overview
     * <p>
     * Things to know when using the popover plugin:
     * <p>
     * Popovers rely on the 3rd party library Tether for positioning.
     * <p>
     * You must include tether.min.js before bootstrap.js in order for popovers to work!
     * <p>
     * Popovers require the tooltip plugin as a
     * <p>
     * dependency. Popovers are opt-in for performance reasons, so you must initialize them yourself.
     * <p>
     * Zero-length title and content values will never show a popover. Specify container: 'body' to avoid
     * <p>
     * rendering problems in more complex components (like our input groups, button groups, etc).
     * <p>
     * Triggering popovers on hidden elements will not work. Popovers for .disabled or disabled elements must be triggered on a wrapper
     * element. When triggered from hyperlinks that span multiple
     * lines, popovers will be centered.
     * <p>
     * Use white-space: nowrap; on your as to avoid this behavior.
     * <p>
     * <p>
     */
    public BSPopOver()
    {

    }

    @Override
    public BSPopOverTitle<?> getPopOverTitle()
    {
        return popOverTitle;
    }

    @Override
    @SuppressWarnings("unchecked")
    public J setPopOverTitle(BSPopOverTitle<?> popOverTitle)
    {
        this.popOverTitle = popOverTitle;
        return (J) this;
    }

    @Override
    public BSPopOverContent<?> getPopOverContent()
    {
        return popOverContent;
    }

    @Override
    @SuppressWarnings("unchecked")
    public J setPopOverContent(BSPopOverContent<?> popOverContent)
    {
        this.popOverContent = popOverContent;
        return (J) this;
    }

    @Override
    protected StringBuilder renderBeforeTag()
    {
        StringBuilder sb = new StringBuilder();
        if (popOverTitle != null)
        {
            sb.append(getCurrentTabIndentString())
                    .append(popOverTitle.toString(0))
                    .append(getNewLine());
        }
        if (popOverContent != null)
        {
            sb.append(getCurrentTabIndentString())
                    .append(popOverContent.toString(0))
                    .append(getNewLine());
        }
        return sb;
    }

    @Override
    protected void init()
    {
        if (popOverTitle != null)
        {
            addAttribute("[popoverTitle]", popOverTitle.getID());
        }
        if (popOverContent != null)
        {
            addAttribute("[ngbPopover]", popOverContent.getID());
        }

        addAttribute("[animation]", animation + "");
        if (autoClose != null)
        {
            addOption("autoClose", autoClose.toString());
        }
        if (closeDelay != null)
        {
            addOption("closeDelay", closeDelay);
        }
        if (containInBody != null)
        {
            if (containInBody)
            {
                addOption("container", "body");
            }
        }
        if (disablePopover)
        {
            addOption("disablePopover", disablePopover);
        }
        if (openDelay != null)
        {
            addOption("openDelay", openDelay);
        }
        if (placement != null)
        {
            addOption("placement", placement.toString());
        }
        if (popoverClass != null)
        {
            addOption("popoverClass", popoverClass);
        }
        if (triggers != null && !triggers.isEmpty())
        {
            StringBuilder sb = new StringBuilder();
            for (BSTriggers trigger : triggers)
            {
                sb.append(trigger.toString())
                        .append(" ");
            }
        }
        super.init();
    }


    public boolean isAnimation()
    {
        return animation;
    }

    @SuppressWarnings("unchecked")
    public J setAnimation(boolean animation)
    {
        this.animation = animation;
        return (J) this;
    }

    public BSTriggers getAutoClose()
    {
        return autoClose;
    }

    @SuppressWarnings("unchecked")
    public J setAutoClose(BSTriggers autoClose)
    {
        this.autoClose = autoClose;
        return (J) this;
    }

    public Integer getCloseDelay()
    {
        return closeDelay;
    }

    @SuppressWarnings("unchecked")
    public J setCloseDelay(Integer closeDelay)
    {
        this.closeDelay = closeDelay;
        return (J) this;
    }

    public boolean isContainInBody()
    {
        return containInBody;
    }

    @SuppressWarnings("unchecked")
    public J setContainInBody(boolean containInBody)
    {
        this.containInBody = containInBody;
        return (J) this;
    }

    public boolean isDisablePopover()
    {
        return disablePopover;
    }

    @SuppressWarnings("unchecked")
    public J setDisablePopover(boolean disablePopover)
    {
        this.disablePopover = disablePopover;
        return (J) this;
    }

    public Integer getOpenDelay()
    {
        return openDelay;
    }

    @SuppressWarnings("unchecked")
    public J setOpenDelay(Integer openDelay)
    {
        this.openDelay = openDelay;
        return (J) this;
    }

    public BSPlacements getPlacement()
    {
        return placement;
    }

    @SuppressWarnings("unchecked")
    public J setPlacement(BSPlacements placement)
    {
        this.placement = placement;
        return (J) this;
    }

    public String getPopoverClass()
    {
        return popoverClass;
    }

    @SuppressWarnings("unchecked")
    public J setPopoverClass(String popoverClass)
    {
        this.popoverClass = popoverClass;
        return (J) this;
    }

    public List<BSTriggers> getTriggers()
    {
        return triggers;
    }

    @SuppressWarnings("unchecked")
    public J setTriggers(List<BSTriggers> triggers)
    {
        this.triggers = triggers;
        return (J) this;
    }

    /**
     * Neater representation
     *
     * @return
     */
    public IBSPopOver asMe()
    {
        return this;
    }
}
