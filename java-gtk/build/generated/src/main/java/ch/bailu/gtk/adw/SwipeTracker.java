/* this file is machine generated */
package ch.bailu.gtk.adw;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A swipe tracker used in [class&#64;Carousel], [class&#64;Flap] and [class&#64;Leaflet].
 * <br>
 * <br>The `AdwSwipeTracker` object can be used for implementing widgets with swipe
 * <br>gestures. It supports touch-based swipes, pointer dragging, and touchpad
 * <br>scrolling.
 * <br>
 * <br>The widgets will probably want to expose the [property&#64;SwipeTracker:enabled]
 * <br>property. If they expect to use horizontal orientation,
 * <br>[property&#64;SwipeTracker:reversed] can be used for supporting RTL text
 * <br>direction.
 * <p><a href="https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.SwipeTracker.html">https://gnome.pages.gitlab.gnome.org/libadwaita/doc/main/class.SwipeTracker.html</a></p>
*/
public class SwipeTracker extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(SwipeTracker.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnBeginSwipe {
        /**
         * This signal is emitted right before a swipe will be started, after the
         * <br>drag threshold has been passed.
        */
        void onBeginSwipe();
    }
    
    private static com.sun.jna.Callback toOnBeginSwipe(OnBeginSwipe in) {
        return (in == null) ? null: (JnaSwipeTracker.OnBeginSwipe) (__self, __data) -> in.onBeginSwipe();
    }

    @FunctionalInterface
    public interface OnEndSwipe {
        /**
         * This signal is emitted as soon as the gesture has stopped.
         * <br>
         * <br>The user is expected to animate the deceleration from the current progress
         * <br>value to &#64;to with an animation using &#64;velocity as the initial velocity,
         * <br>provided in pixels per second. [class&#64;SpringAnimation] is usually a good
         * <br>fit for this.
         * @param velocity the velocity of the swipe
         * @param to the progress value to animate to
        */
        void onEndSwipe(double velocity, double to);
    }
    
    private static com.sun.jna.Callback toOnEndSwipe(OnEndSwipe in) {
        return (in == null) ? null: (JnaSwipeTracker.OnEndSwipe) (__self, _velocity, _to, __data) -> in.onEndSwipe(_velocity, _to);
    }

    @FunctionalInterface
    public interface OnPrepare {
        /**
         * This signal is emitted when a possible swipe is detected.
         * <br>
         * <br>The &#64;direction value can be used to restrict the swipe to a certain
         * <br>direction.
         * @param direction the direction of the swipe
        */
        void onPrepare(int direction);
    }
    
    private static com.sun.jna.Callback toOnPrepare(OnPrepare in) {
        return (in == null) ? null: (JnaSwipeTracker.OnPrepare) (__self, _direction, __data) -> in.onPrepare(_direction);
    }

    @FunctionalInterface
    public interface OnUpdateSwipe {
        /**
         * This signal is emitted every time the progress value changes.
         * @param progress the current animation progress value
        */
        void onUpdateSwipe(double progress);
    }
    
    private static com.sun.jna.Callback toOnUpdateSwipe(OnUpdateSwipe in) {
        return (in == null) ? null: (JnaSwipeTracker.OnUpdateSwipe) (__self, _progress, __data) -> in.onUpdateSwipe(_progress);
    }

    public SwipeTracker(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Creates a new `AdwSwipeTracker` for &#64;widget.
     * @param swipeable a widget to add the tracker on
    */
    public SwipeTracker(@Nonnull Swipeable swipeable) {
        super(cast(JnaSwipeTracker.INST().adw_swipe_tracker_new(asCPointerNotNull(swipeable))));
    }

    /**
     * Gets whether to allow swiping for more than one snap point at a time.
     * @return whether long swipes are allowed
    */
    public boolean getAllowLongSwipes()  {
        return JnaSwipeTracker.INST().adw_swipe_tracker_get_allow_long_swipes(asCPointer());
    }

    /**
     * Gets whether &#64;self can be dragged with mouse pointer.
     * @return whether mouse dragging is allowed
    */
    public boolean getAllowMouseDrag()  {
        return JnaSwipeTracker.INST().adw_swipe_tracker_get_allow_mouse_drag(asCPointer());
    }

    /**
     * Gets whether &#64;self is enabled.
     * @return whether &#64;self is enabled
    */
    public boolean getEnabled()  {
        return JnaSwipeTracker.INST().adw_swipe_tracker_get_enabled(asCPointer());
    }

    /**
     * Gets whether &#64;self is reversing the swipe direction.
     * @return whether the direction is reversed
    */
    public boolean getReversed()  {
        return JnaSwipeTracker.INST().adw_swipe_tracker_get_reversed(asCPointer());
    }

    /**
     * Get the widget &#64;self is attached to.
     * @return the swipeable widget
    */
    public Swipeable getSwipeable()  {
        return new Swipeable(new PointerContainer(JnaSwipeTracker.INST().adw_swipe_tracker_get_swipeable(asCPointer())));
    }

    /**
     * Sets whether to allow swiping for more than one snap point at a time.
     * <br>
     * <br>If the value is `FALSE`, each swipe can only move to the adjacent snap
     * <br>points.
     * @param allow_long_swipes whether to allow long swipes
    */
    public void setAllowLongSwipes(boolean allow_long_swipes)  {
        JnaSwipeTracker.INST().adw_swipe_tracker_set_allow_long_swipes(asCPointer(), allow_long_swipes);
    }

    /**
     * Sets whether &#64;self can be dragged with mouse pointer.
     * @param allow_mouse_drag whether to allow mouse dragging
    */
    public void setAllowMouseDrag(boolean allow_mouse_drag)  {
        JnaSwipeTracker.INST().adw_swipe_tracker_set_allow_mouse_drag(asCPointer(), allow_mouse_drag);
    }

    /**
     * Sets whether &#64;self is enabled.
     * <br>
     * <br>When it's not enabled, no events will be processed. Usually widgets will want
     * <br>to expose this via a property.
     * @param enabled whether &#64;self is enabled
    */
    public void setEnabled(boolean enabled)  {
        JnaSwipeTracker.INST().adw_swipe_tracker_set_enabled(asCPointer(), enabled);
    }

    /**
     * Sets whether to reverse the swipe direction.
     * <br>
     * <br>If the swipe tracker is horizontal, it can be used for supporting RTL text
     * <br>direction.
     * @param reversed whether to reverse the swipe direction
    */
    public void setReversed(boolean reversed)  {
        JnaSwipeTracker.INST().adw_swipe_tracker_set_reversed(asCPointer(), reversed);
    }

    /**
     * Moves the current progress value by &#64;delta.
     * <br>
     * <br>This can be used to adjust the current position if snap points move during
     * <br>the gesture.
     * @param delta the position delta
    */
    public void shiftPosition(double delta)  {
        JnaSwipeTracker.INST().adw_swipe_tracker_shift_position(asCPointer(), delta);
    }

    public final static String SIGNAL_ON_BEGIN_SWIPE = "begin-swipe";
    
    /**
     * Connect to signal "begin-swipe".
     * <br>See {@link OnBeginSwipe#onBeginSwipe} for signal description.
     * <br>Field {@link #SIGNAL_ON_BEGIN_SWIPE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onBeginSwipe(OnBeginSwipe signal) {
        return connectSignal(SIGNAL_ON_BEGIN_SWIPE, toOnBeginSwipe(signal));
    }

    public final static String SIGNAL_ON_END_SWIPE = "end-swipe";
    
    /**
     * Connect to signal "end-swipe".
     * <br>See {@link OnEndSwipe#onEndSwipe} for signal description.
     * <br>Field {@link #SIGNAL_ON_END_SWIPE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onEndSwipe(OnEndSwipe signal) {
        return connectSignal(SIGNAL_ON_END_SWIPE, toOnEndSwipe(signal));
    }

    public final static String SIGNAL_ON_PREPARE = "prepare";
    
    /**
     * Connect to signal "prepare".
     * <br>See {@link OnPrepare#onPrepare} for signal description.
     * <br>Field {@link #SIGNAL_ON_PREPARE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPrepare(OnPrepare signal) {
        return connectSignal(SIGNAL_ON_PREPARE, toOnPrepare(signal));
    }

    public final static String SIGNAL_ON_UPDATE_SWIPE = "update-swipe";
    
    /**
     * Connect to signal "update-swipe".
     * <br>See {@link OnUpdateSwipe#onUpdateSwipe} for signal description.
     * <br>Field {@link #SIGNAL_ON_UPDATE_SWIPE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUpdateSwipe(OnUpdateSwipe signal) {
        return connectSignal(SIGNAL_ON_UPDATE_SWIPE, toOnUpdateSwipe(signal));
    }

    /**
     * Implements interface {@link ch.bailu.gtk.gtk.Orientable}. Call this to get access to interface functions.
     * @return {@link ch.bailu.gtk.gtk.Orientable}
    */
    public ch.bailu.gtk.gtk.Orientable asOrientable() {
        return new ch.bailu.gtk.gtk.Orientable(cast());
    }

    public static long getTypeID() { 
        return JnaSwipeTracker.INST().adw_swipe_tracker_get_type(); 
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
