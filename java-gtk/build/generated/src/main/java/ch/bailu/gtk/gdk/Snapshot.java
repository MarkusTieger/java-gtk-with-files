/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Base type for snapshot operations.
 * <br>
 * <br>The subclass of `GdkSnapshot` used by GTK is [class&#64;Gtk.Snapshot].
 * <p><a href="https://docs.gtk.org/gdk4/class.Snapshot.html">https://docs.gtk.org/gdk4/class.Snapshot.html</a></p>
*/
public class Snapshot extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Snapshot.class.getCanonicalName());
    }

    public Snapshot(PointerContainer pointer) {
        super(pointer);
    }

    public static long getTypeID() { 
        return JnaSnapshot.INST().gdk_snapshot_get_type(); 
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
