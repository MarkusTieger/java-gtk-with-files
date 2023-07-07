/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkSeparator` is a horizontal or vertical separator widget.
 * <br>
 * <br>![An example GtkSeparator](separators.png)
 * <br>
 * <br>A `GtkSeparator` can be used to group the widgets within a window.
 * <br>It displays a line with a shadow to make it appear sunken into the
 * <br>interface.
 * <br>
 * <br>&#35; CSS nodes
 * <br>
 * <br>`GtkSeparator` has a single CSS node with name separator. The node
 * <br>gets one of the .horizontal or .vertical style classes.
 * <br>
 * <br>&#35; Accessibility
 * <br>
 * <br>`GtkSeparator` uses the %GTK_ACCESSIBLE_ROLE_SEPARATOR role.
 * <p><a href="https://docs.gtk.org/gtk4/class.Separator.html">https://docs.gtk.org/gtk4/class.Separator.html</a></p>
*/
public class Separator extends Widget {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Separator.class.getCanonicalName());
    }

    public Separator(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `GtkSeparator` with the given orientation.
     * @param orientation the separator’s orientation.
    */
    public Separator(int orientation) {
        super(cast(JnaSeparator.INST().gtk_separator_new(orientation)));
    }

    /**
     * Implements interface {@link Accessible}. Call this to get access to interface functions.
     * @return {@link Accessible}
    */
    public Accessible asAccessible() {
        return new Accessible(cast());
    }

    /**
     * Implements interface {@link Buildable}. Call this to get access to interface functions.
     * @return {@link Buildable}
    */
    public Buildable asBuildable() {
        return new Buildable(cast());
    }

    /**
     * Implements interface {@link ConstraintTarget}. Call this to get access to interface functions.
     * @return {@link ConstraintTarget}
    */
    public ConstraintTarget asConstraintTarget() {
        return new ConstraintTarget(cast());
    }

    /**
     * Implements interface {@link Orientable}. Call this to get access to interface functions.
     * @return {@link Orientable}
    */
    public Orientable asOrientable() {
        return new Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaSeparator.INST().gtk_separator_get_type(); 
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
