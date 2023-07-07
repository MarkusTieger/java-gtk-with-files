/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A layout manager constraining its children to a given size.
 * <br>
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;clamp-wide-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;clamp-wide.png&quot; alt=&quot;clamp-wide&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>&lt;picture&gt;
 * <br>  &lt;source srcset=&quot;clamp-narrow-dark.png&quot; media=&quot;(prefers-color-scheme: dark)&quot;&gt;
 * <br>  &lt;img src=&quot;clamp-narrow.png&quot; alt=&quot;clamp-narrow&quot;&gt;
 * <br>&lt;/picture&gt;
 * <br>
 * <br>`AdwClampLayout` constraints the size of the widgets it contains to a given
 * <br>maximum size. It will constrain the width if it is horizontal, or the height
 * <br>if it is vertical. The expansion of the children from their minimum to their
 * <br>maximum size is eased out for a smooth transition.
 * <br>
 * <br>If a child requires more than the requested maximum size, it will be
 * <br>allocated the minimum size it can fit in instead.
 * <br>
 * <br>Each child will get the style  classes .large when it reached its maximum
 * <br>size, .small when it's allocated the full size, .medium in-between, or none
 * <br>if it hasn't been allocated yet.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ClampLayout.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.ClampLayout.html</a></p>
*/
public class ClampLayout extends ch.bailu.gtk.gtk.LayoutManager {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ClampLayout.class.getCanonicalName());
    }

    public ClampLayout(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwClampLayout`.
    */
    public ClampLayout() {
        super(cast(JnaClampLayout.INST().adw_clamp_layout_new()));
    }

    /**
     * Gets the maximum size allocated to the children.
     * @return the maximum size to allocate to the children
    */
    public int getMaximumSize()  {
        return JnaClampLayout.INST().adw_clamp_layout_get_maximum_size(asCPointer());
    }

    /**
     * Gets the size above which the children are clamped.
     * @return the size above which the children are clamped
    */
    public int getTighteningThreshold()  {
        return JnaClampLayout.INST().adw_clamp_layout_get_tightening_threshold(asCPointer());
    }

    /**
     * Sets the maximum size allocated to the children.
     * <br>
     * <br>It is the width if the layout is horizontal, or the height if it is vertical.
     * @param maximum_size the maximum size
    */
    public void setMaximumSize(int maximum_size)  {
        JnaClampLayout.INST().adw_clamp_layout_set_maximum_size(asCPointer(), maximum_size);
    }

    /**
     * Sets the size above which the children are clamped.
     * <br>
     * <br>Starting from this size, the layout will tighten its grip on the children,
     * <br>slowly allocating less and less of the available size up to the maximum
     * <br>allocated size. Below that threshold and below the maximum size, the children
     * <br>will be allocated all the available size.
     * <br>
     * <br>If the threshold is greater than the maximum size to allocate to the
     * <br>children, they will be allocated the whole size up to the maximum. If the
     * <br>threshold is lower than the minimum size to allocate to the children, that
     * <br>size will be used as the tightening threshold.
     * <br>
     * <br>Effectively, tightening the grip on a child before it reaches its maximum
     * <br>size makes transitions to and from the maximum size smoother when resizing.
     * @param tightening_threshold the tightening threshold
    */
    public void setTighteningThreshold(int tightening_threshold)  {
        JnaClampLayout.INST().adw_clamp_layout_set_tightening_threshold(asCPointer(), tightening_threshold);
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Orientable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Orientable}
    */
    public ch.bailu.gtk.gtk.Orientable asOrientable() {
        return new ch.bailu.gtk.gtk.Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaClampLayout.INST().adw_clamp_layout_get_type(); 
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
