/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event caused by a pointing device moving between surfaces.
 * <p><a href="https://docs.gtk.org/gdk4/class.CrossingEvent.html">https://docs.gtk.org/gdk4/class.CrossingEvent.html</a></p>
*/
public class CrossingEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(CrossingEvent.class.getCanonicalName());
    }

    public CrossingEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extracts the notify detail from a crossing event.
     * @return the notify detail of &#64;event
    */
    public int getDetail()  {
        return JnaCrossingEvent.INST().gdk_crossing_event_get_detail(asCPointer());
    }

    /**
     * Checks if the &#64;event surface is the focus surface.
     * @return %TRUE if the surface is the focus surface
    */
    public boolean getFocus()  {
        return JnaCrossingEvent.INST().gdk_crossing_event_get_focus(asCPointer());
    }

    /**
     * Extracts the crossing mode from a crossing event.
     * @return the mode of &#64;event
    */
    public int getMode()  {
        return JnaCrossingEvent.INST().gdk_crossing_event_get_mode(asCPointer());
    }

    public static long getTypeID() { 
        return JnaCrossingEvent.INST().gdk_crossing_event_get_type(); 
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
