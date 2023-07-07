/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEventControllerLegacy` is an event controller that provides raw
 * <br>access to the event stream.
 * <br>
 * <br>It should only be used as a last resort if none of the other event
 * <br>controllers or gestures do the job.
 * <p><a href="https://docs.gtk.org/gtk4/class.EventControllerLegacy.html">https://docs.gtk.org/gtk4/class.EventControllerLegacy.html</a></p>
*/
public class EventControllerLegacy extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EventControllerLegacy.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEvent {
        /**
         * Emitted for each GDK event delivered to &#64;controller.
         * @param event the `GdkEvent` which triggered this signal
         * @return %TRUE to stop other handlers from being invoked for the event   and the emission of this signal. %FALSE to propagate the event further.
        */
        boolean onEvent(@Nonnull ch.bailu.gtk.gdk.Event event);
    }
    
    private static com.sun.jna.Callback toOnEvent(OnEvent in) {
        return (in == null) ? null: (JnaEventControllerLegacy.OnEvent) (__self, _event, __data) -> in.onEvent(new ch.bailu.gtk.gdk.Event(new PointerContainer(_event)));
    }

    public EventControllerLegacy(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new legacy event controller.
    */
    public EventControllerLegacy() {
        super(cast(JnaEventControllerLegacy.INST().gtk_event_controller_legacy_new()));
    }

    public final static String SIGNAL_ON_EVENT = "event";
    
    /**
     * Connect to signal "event".
     * <br>See {@link OnEvent#onEvent} for signal description.
     * <br>Field {@link #SIGNAL_ON_EVENT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEvent(OnEvent signal) {
        return connectSignal(SIGNAL_ON_EVENT, toOnEvent(signal));
    }

    public static long getTypeID() { 
        return JnaEventControllerLegacy.INST().gtk_event_controller_legacy_get_type(); 
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
