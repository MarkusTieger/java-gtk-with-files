/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * The `GtkOrientable` interface is implemented by all widgets that can be
 * <br>oriented horizontally or vertically.
 * <br>
 * <br>`GtkOrientable` is more flexible in that it allows the orientation to be
 * <br>changed at runtime, allowing the widgets to “flip”.
 * <p><a href="https://docs.gtk.org/gtk4/iface.Orientable.html">https://docs.gtk.org/gtk4/iface.Orientable.html</a></p>
*/
public class Orientable extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Orientable.class.getCanonicalName());
    }

    public Orientable(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Retrieves the orientation of the &#64;orientable.
     * @return the orientation of the &#64;orientable
    */
    public int getOrientation()  {
        return JnaOrientable.INST().gtk_orientable_get_orientation(asCPointer());
    }

    /**
     * Sets the orientation of the &#64;orientable.
     * @param orientation the orientable’s new orientation
    */
    public void setOrientation(int orientation)  {
        JnaOrientable.INST().gtk_orientable_set_orientation(asCPointer(), orientation);
    }

    public static long getTypeID() { 
        return JnaOrientable.INST().gtk_orientable_get_type(); 
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
