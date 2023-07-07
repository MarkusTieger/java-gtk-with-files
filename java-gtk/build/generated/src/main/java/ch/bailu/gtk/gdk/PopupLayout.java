/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GdkPopupLayout` struct contains information that is
 * <br>necessary position a [iface&#64;Gdk.Popup] relative to its parent.
 * <br>
 * <br>The positioning requires a negotiation with the windowing system,
 * <br>since it depends on external constraints, such as the position of
 * <br>the parent surface, and the screen dimensions.
 * <br>
 * <br>The basic ingredients are a rectangle on the parent surface,
 * <br>and the anchor on both that rectangle and the popup. The anchors
 * <br>specify a side or corner to place next to each other.
 * <br>
 * <br>![Popup anchors](popup-anchors.png)
 * <br>
 * <br>For cases where placing the anchors next to each other would make
 * <br>the popup extend offscreen, the layout includes some hints for how
 * <br>to resolve this problem. The hints may suggest to flip the anchor
 * <br>position to the other side, or to 'slide' the popup along a side,
 * <br>or to resize it.
 * <br>
 * <br>![Flipping popups](popup-flip.png)
 * <br>
 * <br>![Sliding popups](popup-slide.png)
 * <br>
 * <br>These hints may be combined.
 * <br>
 * <br>Ultimatively, it is up to the windowing system to determine the position
 * <br>and size of the popup. You can learn about the result by calling
 * <br>[method&#64;Gdk.Popup.get_position_x], [method&#64;Gdk.Popup.get_position_y],
 * <br>[method&#64;Gdk.Popup.get_rect_anchor] and [method&#64;Gdk.Popup.get_surface_anchor]
 * <br>after the popup has been presented. This can be used to adjust the rendering.
 * <br>For example, [class&#64;Gtk.Popover] changes its arrow position accordingly.
 * <br>But you have to be careful avoid changing the size of the popover, or it
 * <br>has to be presented again.
 * <p><a href="https://docs.gtk.org/gdk4/struct.PopupLayout.html">https://docs.gtk.org/gdk4/struct.PopupLayout.html</a></p>
*/
public class PopupLayout extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PopupLayout.class.getCanonicalName());
    }

    public PopupLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Create a popup layout description.
     * <br>
     * <br>Used together with [method&#64;Gdk.Popup.present] to describe how a popup
     * <br>surface should be placed and behave on-screen.
     * <br>
     * <br>&#64;anchor_rect is relative to the top-left corner of the surface's parent.
     * <br>&#64;rect_anchor and &#64;surface_anchor determine anchor points on &#64;anchor_rect
     * <br>and surface to pin together.
     * <br>
     * <br>The position of &#64;anchor_rect's anchor point can optionally be offset using
     * <br>[method&#64;Gdk.PopupLayout.set_offset], which is equivalent to offsetting the
     * <br>position of surface.
     * @param anchor_rect the anchor `GdkRectangle` to align &#64;surface with
     * @param rect_anchor the point on &#64;anchor_rect to align with &#64;surface's anchor point
     * @param surface_anchor the point on &#64;surface to align with &#64;rect's anchor point
    */
    public PopupLayout(@Nonnull Rectangle anchor_rect, int rect_anchor, int surface_anchor) {
        super(cast(JnaPopupLayout.INST().gdk_popup_layout_new(asCPointerNotNull(anchor_rect), rect_anchor, surface_anchor)));
    }

    /**
     * Makes a copy of &#64;layout.
     * @return a copy of &#64;layout.
    */
    public PopupLayout copy()  {
        return new PopupLayout(new PointerContainer(JnaPopupLayout.INST().gdk_popup_layout_copy(asCPointer())));
    }

    /**
     * Check whether &#64;layout and &#64;other has identical layout properties.
     * @param other another `GdkPopupLayout`
     * @return %TRUE if &#64;layout and &#64;other have identical layout properties,   otherwise %FALSE.
    */
    public boolean equal(@Nonnull PopupLayout other)  {
        return JnaPopupLayout.INST().gdk_popup_layout_equal(asCPointer(), asCPointerNotNull(other));
    }

    /**
     * Get the `GdkAnchorHints`.
     * @return the `GdkAnchorHints`
    */
    public int getAnchorHints()  {
        return JnaPopupLayout.INST().gdk_popup_layout_get_anchor_hints(asCPointer());
    }

    /**
     * Get the anchor rectangle.
     * @return The anchor rectangle
    */
    public Rectangle getAnchorRect()  {
        return new Rectangle(new PointerContainer(JnaPopupLayout.INST().gdk_popup_layout_get_anchor_rect(asCPointer())));
    }

    /**
     * Retrieves the offset for the anchor rectangle.
     * @param dx return location for the delta X coordinate
     * @param dy return location for the delta Y coordinate
    */
    public void getOffset(@Nonnull ch.bailu.gtk.type.Int dx, @Nonnull ch.bailu.gtk.type.Int dy)  {
        JnaPopupLayout.INST().gdk_popup_layout_get_offset(asCPointer(), asCPointerNotNull(dx), asCPointerNotNull(dy));
    }

    /**
     * Returns the anchor position on the anchor rectangle.
     * @return the anchor on the anchor rectangle.
    */
    public int getRectAnchor()  {
        return JnaPopupLayout.INST().gdk_popup_layout_get_rect_anchor(asCPointer());
    }

    /**
     * Obtains the shadow widths of this layout.
     * @param left return location for the left shadow width
     * @param right return location for the right shadow width
     * @param top return location for the top shadow width
     * @param bottom return location for the bottom shadow width
    */
    public void getShadowWidth(@Nonnull ch.bailu.gtk.type.Int left, @Nonnull ch.bailu.gtk.type.Int right, @Nonnull ch.bailu.gtk.type.Int top, @Nonnull ch.bailu.gtk.type.Int bottom)  {
        JnaPopupLayout.INST().gdk_popup_layout_get_shadow_width(asCPointer(), asCPointerNotNull(left), asCPointerNotNull(right), asCPointerNotNull(top), asCPointerNotNull(bottom));
    }

    /**
     * Returns the anchor position on the popup surface.
     * @return the anchor on the popup surface.
    */
    public int getSurfaceAnchor()  {
        return JnaPopupLayout.INST().gdk_popup_layout_get_surface_anchor(asCPointer());
    }

    /**
     * Increases the reference count of &#64;value.
     * @return the same &#64;layout
    */
    public PopupLayout ref()  {
        return new PopupLayout(new PointerContainer(JnaPopupLayout.INST().gdk_popup_layout_ref(asCPointer())));
    }

    /**
     * Set new anchor hints.
     * <br>
     * <br>The set &#64;anchor_hints determines how &#64;surface will be moved
     * <br>if the anchor points cause it to move off-screen. For example,
     * <br>%GDK_ANCHOR_FLIP_X will replace %GDK_GRAVITY_NORTH_WEST with
     * <br>%GDK_GRAVITY_NORTH_EAST and vice versa if &#64;surface extends
     * <br>beyond the left or right edges of the monitor.
     * @param anchor_hints the new `GdkAnchorHints`
    */
    public void setAnchorHints(int anchor_hints)  {
        JnaPopupLayout.INST().gdk_popup_layout_set_anchor_hints(asCPointer(), anchor_hints);
    }

    /**
     * Set the anchor rectangle.
     * @param anchor_rect the new anchor rectangle
    */
    public void setAnchorRect(@Nonnull Rectangle anchor_rect)  {
        JnaPopupLayout.INST().gdk_popup_layout_set_anchor_rect(asCPointer(), asCPointerNotNull(anchor_rect));
    }

    /**
     * Offset the position of the anchor rectangle with the given delta.
     * @param dx x delta to offset the anchor rectangle with
     * @param dy y delta to offset the anchor rectangle with
    */
    public void setOffset(int dx, int dy)  {
        JnaPopupLayout.INST().gdk_popup_layout_set_offset(asCPointer(), dx, dy);
    }

    /**
     * Set the anchor on the anchor rectangle.
     * @param anchor the new rect anchor
    */
    public void setRectAnchor(int anchor)  {
        JnaPopupLayout.INST().gdk_popup_layout_set_rect_anchor(asCPointer(), anchor);
    }

    /**
     * Sets the shadow width of the popup.
     * <br>
     * <br>The shadow width corresponds to the part of the computed
     * <br>surface size that would consist of the shadow margin
     * <br>surrounding the window, would there be any.
     * @param left width of the left part of the shadow
     * @param right width of the right part of the shadow
     * @param top height of the top part of the shadow
     * @param bottom height of the bottom part of the shadow
    */
    public void setShadowWidth(int left, int right, int top, int bottom)  {
        JnaPopupLayout.INST().gdk_popup_layout_set_shadow_width(asCPointer(), left, right, top, bottom);
    }

    /**
     * Set the anchor on the popup surface.
     * @param anchor the new popup surface anchor
    */
    public void setSurfaceAnchor(int anchor)  {
        JnaPopupLayout.INST().gdk_popup_layout_set_surface_anchor(asCPointer(), anchor);
    }

    /**
     * Decreases the reference count of &#64;value.
    */
    public void unref()  {
        JnaPopupLayout.INST().gdk_popup_layout_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaPopupLayout.INST().gdk_popup_layout_get_type(); 
    }
    
    public static long getParentTypeID() {
        return ch.bailu.gtk.gobject.Gobject.typeParent(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().instanceSize;
    }

}

/*
record-type
all-fields-supported
*/
