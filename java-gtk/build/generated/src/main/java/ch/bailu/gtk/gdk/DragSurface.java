/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkDragSurface` is an interface for surfaces used during DND.
 * <p><a href="https://docs.gtk.org/gdk4/iface.DragSurface.html">https://docs.gtk.org/gdk4/iface.DragSurface.html</a></p>
*/
public class DragSurface extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DragSurface.class.getCanonicalName());
    }

    public DragSurface(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Present &#64;drag_surface.
     * @param width the unconstrained drag_surface width to layout
     * @param height the unconstrained drag_surface height to layout
     * @return %FALSE if it failed to be presented, otherwise %TRUE.
    */
    public boolean present(int width, int height)  {
        return JnaDragSurface.INST().gdk_drag_surface_present(asCPointer(), width, height);
    }

    public static long getTypeID() { 
        return JnaDragSurface.INST().gdk_drag_surface_get_type(); 
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
