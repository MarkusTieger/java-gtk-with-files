/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to a touch-based device.
 * <p><a href="https://docs.gtk.org/gdk4/class.TouchEvent.html">https://docs.gtk.org/gdk4/class.TouchEvent.html</a></p>
*/
public class TouchEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(TouchEvent.class.getCanonicalName());
    }

    public TouchEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extracts whether a touch event is emulating a pointer event.
     * @return %TRUE if &#64;event is emulating
    */
    public boolean getEmulatingPointer()  {
        return JnaTouchEvent.INST().gdk_touch_event_get_emulating_pointer(asCPointer());
    }

    public static long getTypeID() { 
        return JnaTouchEvent.INST().gdk_touch_event_get_type(); 
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
