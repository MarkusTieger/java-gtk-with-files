/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to a pad-based device.
 * <p><a href="https://docs.gtk.org/gdk4/class.PadEvent.html">https://docs.gtk.org/gdk4/class.PadEvent.html</a></p>
*/
public class PadEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(PadEvent.class.getCanonicalName());
    }

    public PadEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extracts information about the pressed button from
     * <br>a pad event.
     * @return the button of &#64;event
    */
    public int getButton()  {
        return JnaPadEvent.INST().gdk_pad_event_get_button(asCPointer());
    }

    public static long getTypeID() { 
        return JnaPadEvent.INST().gdk_pad_event_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getAxisValue:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]

[MethodModel:java-type-not-supported:java-type-not-supported:getGroupMode:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:guint*}}:{j:}]
*/
