/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to drag and drop operations.
 * <p><a href="https://docs.gtk.org/gdk4/class.DNDEvent.html">https://docs.gtk.org/gdk4/class.DNDEvent.html</a></p>
*/
public class DNDEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(DNDEvent.class.getCanonicalName());
    }

    public DNDEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets the `GdkDrop` object from a DND event.
     * @return the drop
    */
    public Drop getDrop()  {
        return new Drop(new PointerContainer(JnaDNDEvent.INST().gdk_dnd_event_get_drop(asCPointer())));
    }

    public static long getTypeID() { 
        return JnaDNDEvent.INST().gdk_dnd_event_get_type(); 
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
