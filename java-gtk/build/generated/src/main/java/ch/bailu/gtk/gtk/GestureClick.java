/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGestureClick` is a `GtkGesture` implementation for clicks.
 * <br>
 * <br>It is able to recognize multiple clicks on a nearby zone, which
 * <br>can be listened for through the [signal&#64;Gtk.GestureClick::pressed]
 * <br>signal. Whenever time or distance between clicks exceed the GTK
 * <br>defaults, [signal&#64;Gtk.GestureClick::stopped] is emitted, and the
 * <br>click counter is reset.
 * <p><a href="https://docs.gtk.org/gtk4/class.GestureClick.html">https://docs.gtk.org/gtk4/class.GestureClick.html</a></p>
*/
public class GestureClick extends GestureSingle {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GestureClick.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnPressed {
        /**
         * Emitted whenever a button or touch press happens.
         * @param n_press how many touch/button presses happened with this one
         * @param x The X coordinate, in widget allocation coordinates
         * @param y The Y coordinate, in widget allocation coordinates
        */
        void onPressed(int n_press, double x, double y);
    }
    
    private static com.sun.jna.Callback toOnPressed(OnPressed in) {
        return (in == null) ? null: (JnaGestureClick.OnPressed) (__self, _n_press, _x, _y, __data) -> in.onPressed(_n_press, _x, _y);
    }

    @FunctionalInterface
    public interface OnReleased {
        /**
         * Emitted when a button or touch is released.
         * <br>
         * <br>&#64;n_press will report the number of press that is paired to
         * <br>this event, note that [signal&#64;Gtk.GestureClick::stopped] may
         * <br>have been emitted between the press and its release, &#64;n_press
         * <br>will only start over at the next press.
         * @param n_press number of press that is paired with this release
         * @param x The X coordinate, in widget allocation coordinates
         * @param y The Y coordinate, in widget allocation coordinates
        */
        void onReleased(int n_press, double x, double y);
    }
    
    private static com.sun.jna.Callback toOnReleased(OnReleased in) {
        return (in == null) ? null: (JnaGestureClick.OnReleased) (__self, _n_press, _x, _y, __data) -> in.onReleased(_n_press, _x, _y);
    }

    @FunctionalInterface
    public interface OnStopped {
        /**
         * Emitted whenever any time/distance threshold has been exceeded.
        */
        void onStopped();
    }
    
    private static com.sun.jna.Callback toOnStopped(OnStopped in) {
        return (in == null) ? null: (JnaGestureClick.OnStopped) (__self, __data) -> in.onStopped();
    }

    @FunctionalInterface
    public interface OnUnpairedRelease {
        /**
         * Emitted whenever the gesture receives a release
         * <br>event that had no previous corresponding press.
         * <br>
         * <br>Due to implicit grabs, this can only happen on situations
         * <br>where input is grabbed elsewhere mid-press or the pressed
         * <br>widget voluntarily relinquishes its implicit grab.
         * @param x X coordinate of the event
         * @param y Y coordinate of the event
         * @param button Button being released
         * @param sequence Sequence being released
        */
        void onUnpairedRelease(double x, double y, int button, @Nullable ch.bailu.gtk.gdk.EventSequence sequence);
    }
    
    private static com.sun.jna.Callback toOnUnpairedRelease(OnUnpairedRelease in) {
        return (in == null) ? null: (JnaGestureClick.OnUnpairedRelease) (__self, _x, _y, _button, _sequence, __data) -> in.onUnpairedRelease(_x, _y, _button, new ch.bailu.gtk.gdk.EventSequence(new PointerContainer(_sequence)));
    }

    public GestureClick(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a newly created `GtkGesture` that recognizes
     * <br>single and multiple presses.
    */
    public GestureClick() {
        super(cast(JnaGestureClick.INST().gtk_gesture_click_new()));
    }

    public final static String SIGNAL_ON_PRESSED = "pressed";
    
    /**
     * Connect to signal "pressed".
     * <br>See {@link OnPressed#onPressed} for signal description.
     * <br>Field {@link #SIGNAL_ON_PRESSED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPressed(OnPressed signal) {
        return connectSignal(SIGNAL_ON_PRESSED, toOnPressed(signal));
    }

    public final static String SIGNAL_ON_RELEASED = "released";
    
    /**
     * Connect to signal "released".
     * <br>See {@link OnReleased#onReleased} for signal description.
     * <br>Field {@link #SIGNAL_ON_RELEASED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onReleased(OnReleased signal) {
        return connectSignal(SIGNAL_ON_RELEASED, toOnReleased(signal));
    }

    public final static String SIGNAL_ON_STOPPED = "stopped";
    
    /**
     * Connect to signal "stopped".
     * <br>See {@link OnStopped#onStopped} for signal description.
     * <br>Field {@link #SIGNAL_ON_STOPPED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onStopped(OnStopped signal) {
        return connectSignal(SIGNAL_ON_STOPPED, toOnStopped(signal));
    }

    public final static String SIGNAL_ON_UNPAIRED_RELEASE = "unpaired-release";
    
    /**
     * Connect to signal "unpaired-release".
     * <br>See {@link OnUnpairedRelease#onUnpairedRelease} for signal description.
     * <br>Field {@link #SIGNAL_ON_UNPAIRED_RELEASE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUnpairedRelease(OnUnpairedRelease signal) {
        return connectSignal(SIGNAL_ON_UNPAIRED_RELEASE, toOnUnpairedRelease(signal));
    }

    public static long getTypeID() { 
        return JnaGestureClick.INST().gtk_gesture_click_get_type(); 
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
