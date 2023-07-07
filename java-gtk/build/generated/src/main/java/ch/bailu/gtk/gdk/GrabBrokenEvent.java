/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to a broken windowing system grab.
 * <p><a href="https://docs.gtk.org/gdk4/class.GrabBrokenEvent.html">https://docs.gtk.org/gdk4/class.GrabBrokenEvent.html</a></p>
*/
public class GrabBrokenEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GrabBrokenEvent.class.getCanonicalName());
    }

    public GrabBrokenEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extracts the grab surface from a grab broken event.
     * @return the grab surface of &#64;event
    */
    public Surface getGrabSurface()  {
        return new Surface(new PointerContainer(JnaGrabBrokenEvent.INST().gdk_grab_broken_event_get_grab_surface(asCPointer())));
    }

    /**
     * Checks whether the grab broken event is for an implicit grab.
     * @return %TRUE if the an implicit grab was broken
    */
    public boolean getImplicit()  {
        return JnaGrabBrokenEvent.INST().gdk_grab_broken_event_get_implicit(asCPointer());
    }

    public static long getTypeID() { 
        return JnaGrabBrokenEvent.INST().gdk_grab_broken_event_get_type(); 
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
