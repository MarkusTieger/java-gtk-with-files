/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * An event related to a scrolling motion.
 * <p><a href="https://docs.gtk.org/gdk4/class.ScrollEvent.html">https://docs.gtk.org/gdk4/class.ScrollEvent.html</a></p>
*/
public class ScrollEvent extends Event {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(ScrollEvent.class.getCanonicalName());
    }

    public ScrollEvent(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Extracts the direction of a scroll event.
     * @return the scroll direction of &#64;event
    */
    public int getDirection()  {
        return JnaScrollEvent.INST().gdk_scroll_event_get_direction(asCPointer());
    }

    /**
     * Extracts the scroll delta unit of a scroll event.
     * <br>
     * <br>The unit will always be %GDK_SCROLL_UNIT_WHEEL if the scroll direction is not
     * <br>%GDK_SCROLL_SMOOTH.
     * @return the scroll unit.
    */
    public int getUnit()  {
        return JnaScrollEvent.INST().gdk_scroll_event_get_unit(asCPointer());
    }

    /**
     * Check whether a scroll event is a stop scroll event.
     * <br>
     * <br>Scroll sequences with smooth scroll information may provide
     * <br>a stop scroll event once the interaction with the device finishes,
     * <br>e.g. by lifting a finger. This stop scroll event is the signal
     * <br>that a widget may trigger kinetic scrolling based on the current
     * <br>velocity.
     * <br>
     * <br>Stop scroll events always have a delta of 0/0.
     * @return %TRUE if the event is a scroll stop event
    */
    public boolean isStop()  {
        return JnaScrollEvent.INST().gdk_scroll_event_is_stop(asCPointer());
    }

    public static long getTypeID() { 
        return JnaScrollEvent.INST().gdk_scroll_event_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getDeltas:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:double*}}:{j:}]
*/
