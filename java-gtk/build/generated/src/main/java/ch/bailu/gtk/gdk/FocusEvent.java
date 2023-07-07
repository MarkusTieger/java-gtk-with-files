/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to a keyboard focus change.
 * <p><a href="https://docs.gtk.org/gdk4/class.FocusEvent.html">https://docs.gtk.org/gdk4/class.FocusEvent.html</a></p>
*/
public class FocusEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FocusEvent.class.getCanonicalName());
    }

    public FocusEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extracts whether this event is about focus entering or
     * <br>leaving the surface.
     * @return %TRUE of the focus is entering
    */
    public boolean getIn()  {
        return JnaFocusEvent.INST().gdk_focus_event_get_in(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFocusEvent.INST().gdk_focus_event_get_type(); 
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
