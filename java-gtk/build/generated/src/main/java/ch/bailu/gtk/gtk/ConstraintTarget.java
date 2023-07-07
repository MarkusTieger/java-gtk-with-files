/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkConstraintTarget` interface is implemented by objects that
 * <br>can be used as source or target in `GtkConstraint`s.
 * <br>
 * <br>Besides `GtkWidget`, it is also implemented by `GtkConstraintGuide`.
 * <p><a href="https://docs.gtk.org/gtk4/iface.ConstraintTarget.html">https://docs.gtk.org/gtk4/iface.ConstraintTarget.html</a></p>
*/
public class ConstraintTarget extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ConstraintTarget.class.getCanonicalName());
    }

    public ConstraintTarget(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaConstraintTarget.INST().gtk_constraint_target_get_type(); 
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
