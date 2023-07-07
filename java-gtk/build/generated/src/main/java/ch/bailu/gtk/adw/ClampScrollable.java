/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A scrollable [class&#64;Clamp].
 * <br>
 * <br>`AdwClampScrollable` is a variant of [class&#64;Clamp] that implements the
 * <br>[iface&#64;Gtk.Scrollable] interface.
 * <br>
 * <br>The primary use case for `AdwClampScrollable` is clamping
 * <br>[class&#64;Gtk.ListView].
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ClampScrollable.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ClampScrollable.html</a></p>
*/
public class ClampScrollable extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ClampScrollable.class.getCanonicalName());
    }

    public ClampScrollable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwClampScrollable`.
    */
    public ClampScrollable() {
        super(cast(JnaClampScrollable.INST().adw_clamp_scrollable_new()));
    }

    /**
     * Gets the child widget of &#64;self.
     * @return the child widget of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaClampScrollable.INST().adw_clamp_scrollable_get_child(asCPointer())));
    }

    /**
     * Gets the maximum size allocated to the child.
     * @return the maximum size to allocate to the child
    */
    public int getMaximumSize()  {
        return JnaClampScrollable.INST().adw_clamp_scrollable_get_maximum_size(asCPointer());
    }

    /**
     * Gets the size above which the child is clamped.
     * @return the size above which the child is clamped
    */
    public int getTighteningThreshold()  {
        return JnaClampScrollable.INST().adw_clamp_scrollable_get_tightening_threshold(asCPointer());
    }

    /**
     * Sets the child widget of &#64;self.
     * @param child the child widget
    */
    public void setChild(@Nullable ch.bailu.gtk.gtk.Widget child)  {
        JnaClampScrollable.INST().adw_clamp_scrollable_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the maximum size allocated to the child.
     * <br>
     * <br>It is the width if the clamp is horizontal, or the height if it is vertical.
     * @param maximum_size the maximum size
    */
    public void setMaximumSize(int maximum_size)  {
        JnaClampScrollable.INST().adw_clamp_scrollable_set_maximum_size(asCPointer(), maximum_size);
    }

    /**
     * Sets the size above which the child is clamped.
     * <br>
     * <br>Starting from this size, the clamp will tighten its grip on the child, slowly
     * <br>allocating less and less of the available size up to the maximum allocated
     * <br>size. Below that threshold and below the maximum width, the child will be
     * <br>allocated all the available size.
     * <br>
     * <br>If the threshold is greater than the maximum size to allocate to the child,
     * <br>the child will be allocated all the width up to the maximum. If the threshold
     * <br>is lower than the minimum size to allocate to the child, that size will be
     * <br>used as the tightening threshold.
     * <br>
     * <br>Effectively, tightening the grip on the child before it reaches its maximum
     * <br>size makes transitions to and from the maximum size smoother when resizing.
     * @param tightening_threshold the tightening threshold
    */
    public void setTighteningThreshold(int tightening_threshold)  {
        JnaClampScrollable.INST().adw_clamp_scrollable_set_tightening_threshold(asCPointer(), tightening_threshold);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Accessible}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Accessible}
    */
    public ch.bailu.gtk.gtk.Accessible asAccessible() {
        return new ch.bailu.gtk.gtk.Accessible(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Buildable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Buildable}
    */
    public ch.bailu.gtk.gtk.Buildable asBuildable() {
        return new ch.bailu.gtk.gtk.Buildable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.ConstraintTarget}
    */
    public ch.bailu.gtk.gtk.ConstraintTarget asConstraintTarget() {
        return new ch.bailu.gtk.gtk.ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Orientable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Orientable}
    */
    public ch.bailu.gtk.gtk.Orientable asOrientable() {
        return new ch.bailu.gtk.gtk.Orientable(cast());
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Scrollable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Scrollable}
    */
    public ch.bailu.gtk.gtk.Scrollable asScrollable() {
        return new ch.bailu.gtk.gtk.Scrollable(cast());
    }

    public static long getTypeID() { 
        return JnaClampScrollable.INST().adw_clamp_scrollable_get_type(); 
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
class-type
*/
