/* this file is machine generated */
package ch.bailu.gtk.gtk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * `GtkGestureLongPress` is a `GtkGesture` for long presses.
 * <br>
 * <br>This gesture is also known as “Press and Hold”.
 * <br>
 * <br>When the timeout is exceeded, the gesture is triggering the
 * <br>[signal&#64;Gtk.GestureLongPress::pressed] signal.
 * <br>
 * <br>If the touchpoint is lifted before the timeout passes, or if
 * <br>it drifts too far of the initial press point, the
 * <br>[signal&#64;Gtk.GestureLongPress::cancelled] signal will be emitted.
 * <br>
 * <br>How long the timeout is before the ::pressed signal gets emitted is
 * <br>determined by the [property&#64;Gtk.Settings:gtk-long-press-time] setting.
 * <br>It can be modified by the [property&#64;Gtk.GestureLongPress:delay-factor]
 * <br>property.
 * <p><a href="https://docs.gtk.org/gtk4/class.GestureLongPress.html">https://docs.gtk.org/gtk4/class.GestureLongPress.html</a></p>
*/
public class GestureLongPress extends GestureSingle {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(GestureLongPress.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnCancelled {
        /**
         * Emitted whenever a press moved too far, or was released
         * <br>before [signal&#64;Gtk.GestureLongPress::pressed] happened.
        */
        void onCancelled();
    }
    
    private static com.sun.jna.Callback toOnCancelled(OnCancelled in) {
        return (in == null) ? null: (JnaGestureLongPress.OnCancelled) (__self, __data) -> in.onCancelled();
    }

    @FunctionalInterface
    public interface OnPressed {
        /**
         * Emitted whenever a press goes unmoved/unreleased longer than
         * <br>what the GTK defaults tell.
         * @param x the X coordinate where the press happened, relative to the widget allocation
         * @param y the Y coordinate where the press happened, relative to the widget allocation
        */
        void onPressed(double x, double y);
    }
    
    private static com.sun.jna.Callback toOnPressed(OnPressed in) {
        return (in == null) ? null: (JnaGestureLongPress.OnPressed) (__self, _x, _y, __data) -> in.onPressed(_x, _y);
    }

    public GestureLongPress(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns a newly created `GtkGesture` that recognizes long presses.
    */
    public GestureLongPress() {
        super(cast(JnaGestureLongPress.INST().gtk_gesture_long_press_new()));
    }

    /**
     * Returns the delay factor.
     * @return the delay factor
    */
    public double getDelayFactor()  {
        return JnaGestureLongPress.INST().gtk_gesture_long_press_get_delay_factor(asCPointer());
    }

    /**
     * Applies the given delay factor.
     * <br>
     * <br>The default long press time will be multiplied by this value.
     * <br>Valid values are in the range [0.5..2.0].
     * @param delay_factor The delay factor to apply
    */
    public void setDelayFactor(double delay_factor)  {
        JnaGestureLongPress.INST().gtk_gesture_long_press_set_delay_factor(asCPointer(), delay_factor);
    }

    public final static String SIGNAL_ON_CANCELLED = "cancelled";
    
    /**
     * Connect to signal "cancelled".
     * <br>See {@link OnCancelled#onCancelled} for signal description.
     * <br>Field {@link #SIGNAL_ON_CANCELLED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onCancelled(OnCancelled signal) {
        return connectSignal(SIGNAL_ON_CANCELLED, toOnCancelled(signal));
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

    public static long getTypeID() { 
        return JnaGestureLongPress.INST().gtk_gesture_long_press_get_type(); 
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
