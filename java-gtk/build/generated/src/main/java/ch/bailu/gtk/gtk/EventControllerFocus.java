/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEventControllerFocus` is an event controller to keep track of
 * <br>keyboard focus.
 * <br>
 * <br>The event controller offers [signal&#64;Gtk.EventControllerFocus::enter]
 * <br>and [signal&#64;Gtk.EventControllerFocus::leave] signals, as well as
 * <br>[property&#64;Gtk.EventControllerFocus:is-focus] and
 * <br>[property&#64;Gtk.EventControllerFocus:contains-focus] properties
 * <br>which are updated to reflect focus changes inside the widget hierarchy
 * <br>that is rooted at the controllers widget.
 * <p><a href="https://docs.gtk.org/gtk4/class.EventControllerFocus.html">https://docs.gtk.org/gtk4/class.EventControllerFocus.html</a></p>
*/
public class EventControllerFocus extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EventControllerFocus.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnEnter {
        /**
         * Emitted whenever the focus enters into the widget or one
         * <br>of its descendents.
         * <br>
         * <br>Note that this means you may not get an ::enter signal
         * <br>even though the widget becomes the focus location, in
         * <br>certain cases (such as when the focus moves from a descendent
         * <br>of the widget to the widget itself). If you are interested
         * <br>in these cases, you can monitor the
         * <br>[property&#64;Gtk.EventControllerFocus:is-focus]
         * <br>property for changes.
        */
        void onEnter();
    }
    
    private static com.sun.jna.Callback toOnEnter(OnEnter in) {
        return (in == null) ? null: (JnaEventControllerFocus.OnEnter) (__self, __data) -> in.onEnter();
    }

    @FunctionalInterface
    public interface OnLeave {
        /**
         * Emitted whenever the focus leaves the widget hierarchy
         * <br>that is rooted at the widget that the controller is attached to.
         * <br>
         * <br>Note that this means you may not get a ::leave signal
         * <br>even though the focus moves away from the widget, in
         * <br>certain cases (such as when the focus moves from the widget
         * <br>to a descendent). If you are interested in these cases, you
         * <br>can monitor the [property&#64;Gtk.EventControllerFocus:is-focus]
         * <br>property for changes.
        */
        void onLeave();
    }
    
    private static com.sun.jna.Callback toOnLeave(OnLeave in) {
        return (in == null) ? null: (JnaEventControllerFocus.OnLeave) (__self, __data) -> in.onLeave();
    }

    public EventControllerFocus(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new event controller that will handle focus events.
    */
    public EventControllerFocus() {
        super(cast(JnaEventControllerFocus.INST().gtk_event_controller_focus_new()));
    }

    /**
     * Returns %TRUE if focus is within &#64;self or one of its children.
     * @return %TRUE if focus is within &#64;self or one of its children
    */
    public boolean containsFocus()  {
        return JnaEventControllerFocus.INST().gtk_event_controller_focus_contains_focus(asCPointer());
    }

    /**
     * Returns %TRUE if focus is within &#64;self, but not one of its children.
     * @return %TRUE if focus is within &#64;self, but not one of its children
    */
    public boolean isFocus()  {
        return JnaEventControllerFocus.INST().gtk_event_controller_focus_is_focus(asCPointer());
    }

    public final static String SIGNAL_ON_ENTER = "enter";
    
    /**
     * Connect to signal "enter".
     * <br>See {@link OnEnter#onEnter} for signal description.
     * <br>Field {@link #SIGNAL_ON_ENTER} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEnter(OnEnter signal) {
        return connectSignal(SIGNAL_ON_ENTER, toOnEnter(signal));
    }

    public final static String SIGNAL_ON_LEAVE = "leave";
    
    /**
     * Connect to signal "leave".
     * <br>See {@link OnLeave#onLeave} for signal description.
     * <br>Field {@link #SIGNAL_ON_LEAVE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLeave(OnLeave signal) {
        return connectSignal(SIGNAL_ON_LEAVE, toOnLeave(signal));
    }

    public static long getTypeID() { 
        return JnaEventControllerFocus.INST().gtk_event_controller_focus_get_type(); 
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
