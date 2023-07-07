/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkEventControllerScroll` is an event controller that handles scroll
 * <br>events.
 * <br>
 * <br>It is capable of handling both discrete and continuous scroll
 * <br>events from mice or touchpads, abstracting them both with the
 * <br>[signal&#64;Gtk.EventControllerScroll::scroll] signal. Deltas in
 * <br>the discrete case are multiples of 1.
 * <br>
 * <br>In the case of continuous scroll events, `GtkEventControllerScroll`
 * <br>encloses all [signal&#64;Gtk.EventControllerScroll::scroll] emissions
 * <br>between two [signal&#64;Gtk.EventControllerScroll::scroll-begin] and
 * <br>[signal&#64;Gtk.EventControllerScroll::scroll-end] signals.
 * <br>
 * <br>The behavior of the event controller can be modified by the flags
 * <br>given at creation time, or modified at a later point through
 * <br>[method&#64;Gtk.EventControllerScroll.set_flags] (e.g. because the scrolling
 * <br>conditions of the widget changed).
 * <br>
 * <br>The controller can be set up to emit motion for either/both vertical
 * <br>and horizontal scroll events through %GTK_EVENT_CONTROLLER_SCROLL_VERTICAL,
 * <br>%GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL and %GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES.
 * <br>If any axis is disabled, the respective [signal&#64;Gtk.EventControllerScroll::scroll]
 * <br>delta will be 0. Vertical scroll events will be translated to horizontal
 * <br>motion for the devices incapable of horizontal scrolling.
 * <br>
 * <br>The event controller can also be forced to emit discrete events on all
 * <br>devices through %GTK_EVENT_CONTROLLER_SCROLL_DISCRETE. This can be used
 * <br>to implement discrete actions triggered through scroll events (e.g.
 * <br>switching across combobox options).
 * <br>
 * <br>The %GTK_EVENT_CONTROLLER_SCROLL_KINETIC flag toggles the emission of the
 * <br>[signal&#64;Gtk.EventControllerScroll::decelerate] signal, emitted at the end
 * <br>of scrolling with two X/Y velocity arguments that are consistent with the
 * <br>motion that was received.
 * <p><a href="https://docs.gtk.org/gtk4/class.EventControllerScroll.html">https://docs.gtk.org/gtk4/class.EventControllerScroll.html</a></p>
*/
public class EventControllerScroll extends EventController {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(EventControllerScroll.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDecelerate {
        /**
         * Emitted after scroll is finished if the
         * <br>%GTK_EVENT_CONTROLLER_SCROLL_KINETIC flag is set.
         * <br>
         * <br>&#64;vel_x and &#64;vel_y express the initial velocity that was
         * <br>imprinted by the scroll events. &#64;vel_x and &#64;vel_y are expressed in
         * <br>pixels/ms.
         * @param vel_x X velocity
         * @param vel_y Y velocity
        */
        void onDecelerate(double vel_x, double vel_y);
    }
    
    private static com.sun.jna.Callback toOnDecelerate(OnDecelerate in) {
        return (in == null) ? null: (JnaEventControllerScroll.OnDecelerate) (__self, _vel_x, _vel_y, __data) -> in.onDecelerate(_vel_x, _vel_y);
    }

    @FunctionalInterface
    public interface OnScroll {
        /**
         * Signals that the widget should scroll by the
         * <br>amount specified by &#64;dx and &#64;dy.
         * <br>
         * <br>For the representation unit of the deltas, see
         * <br>[method&#64;Gtk.EventControllerScroll.get_unit].
         * @param dx X delta
         * @param dy Y delta
         * @return %TRUE if the scroll event was handled,   %FALSE otherwise.
        */
        boolean onScroll(double dx, double dy);
    }
    
    private static com.sun.jna.Callback toOnScroll(OnScroll in) {
        return (in == null) ? null: (JnaEventControllerScroll.OnScroll) (__self, _dx, _dy, __data) -> in.onScroll(_dx, _dy);
    }

    @FunctionalInterface
    public interface OnScrollBegin {
        /**
         * Signals that a new scrolling operation has begun.
         * <br>
         * <br>It will only be emitted on devices capable of it.
        */
        void onScrollBegin();
    }
    
    private static com.sun.jna.Callback toOnScrollBegin(OnScrollBegin in) {
        return (in == null) ? null: (JnaEventControllerScroll.OnScrollBegin) (__self, __data) -> in.onScrollBegin();
    }

    @FunctionalInterface
    public interface OnScrollEnd {
        /**
         * Signals that a scrolling operation has finished.
         * <br>
         * <br>It will only be emitted on devices capable of it.
        */
        void onScrollEnd();
    }
    
    private static com.sun.jna.Callback toOnScrollEnd(OnScrollEnd in) {
        return (in == null) ? null: (JnaEventControllerScroll.OnScrollEnd) (__self, __data) -> in.onScrollEnd();
    }

    public EventControllerScroll(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new event controller that will handle scroll events.
     * @param flags flags affecting the controller behavior
    */
    public EventControllerScroll(int flags) {
        super(cast(JnaEventControllerScroll.INST().gtk_event_controller_scroll_new(flags)));
    }

    /**
     * Gets the flags conditioning the scroll controller behavior.
     * @return the controller flags.
    */
    public int getFlags()  {
        return JnaEventControllerScroll.INST().gtk_event_controller_scroll_get_flags(asCPointer());
    }

    /**
     * Gets the scroll unit of the last
     * <br>[signal&#64;Gtk.EventControllerScroll::scroll] signal received.
     * <br>
     * <br>Always returns %GDK_SCROLL_UNIT_WHEEL if the
     * <br>%GTK_EVENT_CONTROLLER_SCROLL_DISCRETE flag is set.
     * @return the scroll unit.
    */
    public int getUnit()  {
        return JnaEventControllerScroll.INST().gtk_event_controller_scroll_get_unit(asCPointer());
    }

    /**
     * Sets the flags conditioning scroll controller behavior.
     * @param flags flags affecting the controller behavior
    */
    public void setFlags(int flags)  {
        JnaEventControllerScroll.INST().gtk_event_controller_scroll_set_flags(asCPointer(), flags);
    }

    public final static String SIGNAL_ON_DECELERATE = "decelerate";
    
    /**
     * Connect to signal "decelerate".
     * <br>See {@link OnDecelerate#onDecelerate} for signal description.
     * <br>Field {@link #SIGNAL_ON_DECELERATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDecelerate(OnDecelerate signal) {
        return connectSignal(SIGNAL_ON_DECELERATE, toOnDecelerate(signal));
    }

    public final static String SIGNAL_ON_SCROLL = "scroll";
    
    /**
     * Connect to signal "scroll".
     * <br>See {@link OnScroll#onScroll} for signal description.
     * <br>Field {@link #SIGNAL_ON_SCROLL} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onScroll(OnScroll signal) {
        return connectSignal(SIGNAL_ON_SCROLL, toOnScroll(signal));
    }

    public final static String SIGNAL_ON_SCROLL_BEGIN = "scroll-begin";
    
    /**
     * Connect to signal "scroll-begin".
     * <br>See {@link OnScrollBegin#onScrollBegin} for signal description.
     * <br>Field {@link #SIGNAL_ON_SCROLL_BEGIN} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onScrollBegin(OnScrollBegin signal) {
        return connectSignal(SIGNAL_ON_SCROLL_BEGIN, toOnScrollBegin(signal));
    }

    public final static String SIGNAL_ON_SCROLL_END = "scroll-end";
    
    /**
     * Connect to signal "scroll-end".
     * <br>See {@link OnScrollEnd#onScrollEnd} for signal description.
     * <br>Field {@link #SIGNAL_ON_SCROLL_END} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onScrollEnd(OnScrollEnd signal) {
        return connectSignal(SIGNAL_ON_SCROLL_END, toOnScrollEnd(signal));
    }

    public static long getTypeID() { 
        return JnaEventControllerScroll.INST().gtk_event_controller_scroll_get_type(); 
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
