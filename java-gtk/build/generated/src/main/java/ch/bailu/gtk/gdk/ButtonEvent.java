/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to a button on a pointer device.
 * <p><a href="https://docs.gtk.org/gdk4/class.ButtonEvent.html">https://docs.gtk.org/gdk4/class.ButtonEvent.html</a></p>
*/
public class ButtonEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ButtonEvent.class.getCanonicalName());
    }

    public ButtonEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extract the button number from a button event.
     * @return the button of &#64;event
    */
    public int getButton()  {
        return JnaButtonEvent.INST().gdk_button_event_get_button(asCPointer());
    }

    public static long getTypeID() { 
        return JnaButtonEvent.INST().gdk_button_event_get_type(); 
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
