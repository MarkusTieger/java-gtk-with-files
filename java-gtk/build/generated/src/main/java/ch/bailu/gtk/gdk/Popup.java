/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkPopup` is a surface that is attached to another surface.
 * <br>
 * <br>The `GdkPopup` is positioned relative to its parent surface.
 * <br>
 * <br>`GdkPopup`s are typically used to implement menus and similar popups.
 * <br>They can be modal, which is indicated by the [property&#64;GdkPopup:autohide]
 * <br>property.
 * <p><a href="https://docs.gtk.org/gdk4/iface.Popup.html">https://docs.gtk.org/gdk4/iface.Popup.html</a></p>
*/
public class Popup extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Popup.class.getCanonicalName());
    }

    public Popup(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns whether this popup is set to hide on outside clicks.
     * @return %TRUE if &#64;popup will autohide
    */
    public boolean getAutohide()  {
        return JnaPopup.INST().gdk_popup_get_autohide(asCPointer());
    }

    /**
     * Returns the parent surface of a popup.
     * @return the parent surface
    */
    public Surface getParent()  {
        return new Surface(new PointerContainer(JnaPopup.INST().gdk_popup_get_parent(asCPointer())));
    }

    /**
     * Obtains the position of the popup relative to its parent.
     * @return the X coordinate of &#64;popup position
    */
    public int getPositionX()  {
        return JnaPopup.INST().gdk_popup_get_position_x(asCPointer());
    }

    /**
     * Obtains the position of the popup relative to its parent.
     * @return the Y coordinate of &#64;popup position
    */
    public int getPositionY()  {
        return JnaPopup.INST().gdk_popup_get_position_y(asCPointer());
    }

    /**
     * Gets the current popup rectangle anchor.
     * <br>
     * <br>The value returned may change after calling [method&#64;Gdk.Popup.present],
     * <br>or after the [signal&#64;Gdk.Surface::layout] signal is emitted.
     * @return the current rectangle anchor value of &#64;popup
    */
    public int getRectAnchor()  {
        return JnaPopup.INST().gdk_popup_get_rect_anchor(asCPointer());
    }

    /**
     * Gets the current popup surface anchor.
     * <br>
     * <br>The value returned may change after calling [method&#64;Gdk.Popup.present],
     * <br>or after the [signal&#64;Gdk.Surface::layout] signal is emitted.
     * @return the current surface anchor value of &#64;popup
    */
    public int getSurfaceAnchor()  {
        return JnaPopup.INST().gdk_popup_get_surface_anchor(asCPointer());
    }

    /**
     * Present &#64;popup after having processed the `GdkPopupLayout` rules.
     * <br>
     * <br>If the popup was previously now showing, it will be showed,
     * <br>otherwise it will change position according to &#64;layout.
     * <br>
     * <br>After calling this function, the result should be handled in response
     * <br>to the [signal&#64;GdkSurface::layout] signal being emitted. The resulting
     * <br>popup position can be queried using [method&#64;Gdk.Popup.get_position_x],
     * <br>[method&#64;Gdk.Popup.get_position_y], and the resulting size will be sent as
     * <br>parameters in the layout signal. Use [method&#64;Gdk.Popup.get_rect_anchor]
     * <br>and [method&#64;Gdk.Popup.get_surface_anchor] to get the resulting anchors.
     * <br>
     * <br>Presenting may fail, for example if the &#64;popup is set to autohide
     * <br>and is immediately hidden upon being presented. If presenting failed,
     * <br>the [signal&#64;Gdk.Surface::layout] signal will not me emitted.
     * @param width the unconstrained popup width to layout
     * @param height the unconstrained popup height to layout
     * @param layout the `GdkPopupLayout` object used to layout
     * @return %FALSE if it failed to be presented, otherwise %TRUE.
    */
    public boolean present(int width, int height, @Nonnull PopupLayout layout)  {
        return JnaPopup.INST().gdk_popup_present(asCPointer(), width, height, asCPointerNotNull(layout));
    }

    public static long getTypeID() { 
        return JnaPopup.INST().gdk_popup_get_type(); 
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
interface-type
*/
