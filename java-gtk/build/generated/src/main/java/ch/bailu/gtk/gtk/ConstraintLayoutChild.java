/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkLayoutChild` subclass for children in a `GtkConstraintLayout`.
 * <p><a href="https://docs.gtk.org/gtk4/class.ConstraintLayoutChild.html">https://docs.gtk.org/gtk4/class.ConstraintLayoutChild.html</a></p>
*/
public class ConstraintLayoutChild extends LayoutChild {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConstraintLayoutChild.class.getCanonicalName());
    }

    public ConstraintLayoutChild(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaConstraintLayoutChild.INST().gtk_constraint_layout_child_get_type(); 
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
