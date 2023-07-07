/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A widget constraining its child to a given size.
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
 * <br>The `AdwClamp` widget constrains the size of the widget it contains to a
 * <br>given maximum size. It will constrain the width if it is horizontal, or the
 * <br>height if it is vertical. The expansion of the child from its minimum to its
 * <br>maximum size is eased out for a smooth transition.
 * <br>
 * <br>If the child requires more than the requested maximum size, it will be
 * <br>allocated the minimum size it can fit in instead.
 * <br>
 * <br>&#35;&#35; CSS nodes
 * <br>
 * <br>`AdwClamp` has a single CSS node with name `clamp`.
 * <br>
 * <br>Its children will receive the style classes `.large` when the child reached
 * <br>its maximum size, `.small` when the clamp allocates its full size to the
 * <br>child, `.medium` in-between, or none if it hasn't computed its size yet.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Clamp.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.Clamp.html</a></p>
*/
public class Clamp extends ch.bailu.gtk.gtk.Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Clamp.class.getCanonicalName());
    }

    public Clamp(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwClamp`.
    */
    public Clamp() {
        super(cast(JnaClamp.INST().adw_clamp_new()));
    }

    /**
     * Gets the child widget of &#64;self.
     * @return the child widget of &#64;self
    */
    public ch.bailu.gtk.gtk.Widget getChild()  {
        return new ch.bailu.gtk.gtk.Widget(new PointerContainer(JnaClamp.INST().adw_clamp_get_child(asCPointer())));
    }

    /**
     * Gets the maximum size allocated to the child.
     * @return the maximum size to allocate to the child
    */
    public int getMaximumSize()  {
        return JnaClamp.INST().adw_clamp_get_maximum_size(asCPointer());
    }

    /**
     * Gets the size above which the child is clamped.
     * @return the size above which the child is clamped
    */
    public int getTighteningThreshold()  {
        return JnaClamp.INST().adw_clamp_get_tightening_threshold(asCPointer());
    }

    /**
     * Sets the child widget of &#64;self.
     * @param child the child widget
    */
    public void setChild(@Nullable ch.bailu.gtk.gtk.Widget child)  {
        JnaClamp.INST().adw_clamp_set_child(asCPointer(), asCPointer(child));
    }

    /**
     * Sets the maximum size allocated to the child.
     * <br>
     * <br>It is the width if the clamp is horizontal, or the height if it is vertical.
     * @param maximum_size the maximum size
    */
    public void setMaximumSize(int maximum_size)  {
        JnaClamp.INST().adw_clamp_set_maximum_size(asCPointer(), maximum_size);
    }

    /**
     * Sets the size above which the child is clamped.
     * <br>
     * <br>Starting from this size, the clamp will tighten its grip on the child, slowly
     * <br>allocating less and less of the available size up to the maximum allocated
     * <br>size. Below that threshold and below the maximum size, the child will be
     * <br>allocated all the available size.
     * <br>
     * <br>If the threshold is greater than the maximum size to allocate to the child,
     * <br>the child will be allocated all the size up to the maximum. If the threshold
     * <br>is lower than the minimum size to allocate to the child, that size will be
     * <br>used as the tightening threshold.
     * <br>
     * <br>Effectively, tightening the grip on the child before it reaches its maximum
     * <br>size makes transitions to and from the maximum size smoother when resizing.
     * @param tightening_threshold the tightening threshold
    */
    public void setTighteningThreshold(int tightening_threshold)  {
        JnaClamp.INST().adw_clamp_set_tightening_threshold(asCPointer(), tightening_threshold);
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

    public static long getTypeID() { 
        return JnaClamp.INST().adw_clamp_get_type(); 
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
