/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkFrameClock` tells the application when to update and repaint
 * <br>a surface.
 * <br>
 * <br>This may be synced to the vertical refresh rate of the monitor, for example.
 * <br>Even when the frame clock uses a simple timer rather than a hardware-based
 * <br>vertical sync, the frame clock helps because it ensures everything paints at
 * <br>the same time (reducing the total number of frames).
 * <br>
 * <br>The frame clock can also automatically stop painting when it knows the frames
 * <br>will not be visible, or scale back animation framerates.
 * <br>
 * <br>`GdkFrameClock` is designed to be compatible with an OpenGL-based implementation
 * <br>or with mozRequestAnimationFrame in Firefox, for example.
 * <br>
 * <br>A frame clock is idle until someone requests a frame with
 * <br>[method&#64;Gdk.FrameClock.request_phase]. At some later point that makes sense
 * <br>for the synchronization being implemented, the clock will process a frame and
 * <br>emit signals for each phase that has been requested. (See the signals of the
 * <br>`GdkFrameClock` class for documentation of the phases.
 * <br>%GDK_FRAME_CLOCK_PHASE_UPDATE and the [signal&#64;GdkFrameClock::update] signal
 * <br>are most interesting for application writers, and are used to update the
 * <br>animations, using the frame time given by [method&#64;Gdk.FrameClock.get_frame_time].
 * <br>
 * <br>The frame time is reported in microseconds and generally in the same
 * <br>timescale as g_get_monotonic_time(), however, it is not the same
 * <br>as g_get_monotonic_time(). The frame time does not advance during
 * <br>the time a frame is being painted, and outside of a frame, an attempt
 * <br>is made so that all calls to [method&#64;Gdk.FrameClock.get_frame_time] that
 * <br>are called at a “similar” time get the same value. This means that
 * <br>if different animations are timed by looking at the difference in
 * <br>time between an initial value from [method&#64;Gdk.FrameClock.get_frame_time]
 * <br>and the value inside the [signal&#64;GdkFrameClock::update] signal of the clock,
 * <br>they will stay exactly synchronized.
 * <p><a href="https://docs.gtk.org/gdk4/class.FrameClock.html">https://docs.gtk.org/gdk4/class.FrameClock.html</a></p>
*/
public class FrameClock extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FrameClock.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnAfterPaint {
        /**
         * This signal ends processing of the frame.
         * <br>
         * <br>Applications should generally not handle this signal.
        */
        void onAfterPaint();
    }
    
    private static com.sun.jna.Callback toOnAfterPaint(OnAfterPaint in) {
        return (in == null) ? null: (JnaFrameClock.OnAfterPaint) (__self, __data) -> in.onAfterPaint();
    }

    @FunctionalInterface
    public interface OnBeforePaint {
        /**
         * Begins processing of the frame.
         * <br>
         * <br>Applications should generally not handle this signal.
        */
        void onBeforePaint();
    }
    
    private static com.sun.jna.Callback toOnBeforePaint(OnBeforePaint in) {
        return (in == null) ? null: (JnaFrameClock.OnBeforePaint) (__self, __data) -> in.onBeforePaint();
    }

    @FunctionalInterface
    public interface OnFlushEvents {
        /**
         * Used to flush pending motion events that are being batched up and
         * <br>compressed together.
         * <br>
         * <br>Applications should not handle this signal.
        */
        void onFlushEvents();
    }
    
    private static com.sun.jna.Callback toOnFlushEvents(OnFlushEvents in) {
        return (in == null) ? null: (JnaFrameClock.OnFlushEvents) (__self, __data) -> in.onFlushEvents();
    }

    @FunctionalInterface
    public interface OnLayout {
        /**
         * Emitted as the second step of toolkit and application processing
         * <br>of the frame.
         * <br>
         * <br>Any work to update sizes and positions of application elements
         * <br>should be performed. GTK normally handles this internally.
        */
        void onLayout();
    }
    
    private static com.sun.jna.Callback toOnLayout(OnLayout in) {
        return (in == null) ? null: (JnaFrameClock.OnLayout) (__self, __data) -> in.onLayout();
    }

    @FunctionalInterface
    public interface OnPaint {
        /**
         * Emitted as the third step of toolkit and application processing
         * <br>of the frame.
         * <br>
         * <br>The frame is repainted. GDK normally handles this internally and
         * <br>emits [signal&#64;Gdk.Surface::render] signals which are turned into
         * <br>[signal&#64;Gtk.Widget::snapshot] signals by GTK.
        */
        void onPaint();
    }
    
    private static com.sun.jna.Callback toOnPaint(OnPaint in) {
        return (in == null) ? null: (JnaFrameClock.OnPaint) (__self, __data) -> in.onPaint();
    }

    @FunctionalInterface
    public interface OnResumeEvents {
        /**
         * Emitted after processing of the frame is finished.
         * <br>
         * <br>This signal is handled internally by GTK to resume normal
         * <br>event processing. Applications should not handle this signal.
        */
        void onResumeEvents();
    }
    
    private static com.sun.jna.Callback toOnResumeEvents(OnResumeEvents in) {
        return (in == null) ? null: (JnaFrameClock.OnResumeEvents) (__self, __data) -> in.onResumeEvents();
    }

    @FunctionalInterface
    public interface OnUpdate {
        /**
         * Emitted as the first step of toolkit and application processing
         * <br>of the frame.
         * <br>
         * <br>Animations should be updated using [method&#64;Gdk.FrameClock.get_frame_time].
         * <br>Applications can connect directly to this signal, or use
         * <br>[method&#64;Gtk.Widget.add_tick_callback] as a more convenient interface.
        */
        void onUpdate();
    }
    
    private static com.sun.jna.Callback toOnUpdate(OnUpdate in) {
        return (in == null) ? null: (JnaFrameClock.OnUpdate) (__self, __data) -> in.onUpdate();
    }

    public FrameClock(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Starts updates for an animation.
     * <br>
     * <br>Until a matching call to [method&#64;Gdk.FrameClock.end_updating] is made,
     * <br>the frame clock will continually request a new frame with the
     * <br>%GDK_FRAME_CLOCK_PHASE_UPDATE phase. This function may be called multiple
     * <br>times and frames will be requested until gdk_frame_clock_end_updating()
     * <br>is called the same number of times.
    */
    public void beginUpdating()  {
        JnaFrameClock.INST().gdk_frame_clock_begin_updating(asCPointer());
    }

    /**
     * Stops updates for an animation.
     * <br>
     * <br>See the documentation for [method&#64;Gdk.FrameClock.begin_updating].
    */
    public void endUpdating()  {
        JnaFrameClock.INST().gdk_frame_clock_end_updating(asCPointer());
    }

    /**
     * Gets the frame timings for the current frame.
     * @return the `GdkFrameTimings` for the   frame currently being processed, or even no frame is being   processed, for the previous frame. Before any frames have been   processed, returns %NULL.
    */
    public FrameTimings getCurrentTimings()  {
        return new FrameTimings(new PointerContainer(JnaFrameClock.INST().gdk_frame_clock_get_current_timings(asCPointer())));
    }

    /**
     * Calculates the current frames-per-second, based on the
     * <br>frame timings of &#64;frame_clock.
     * @return the current fps, as a `double`
    */
    public double getFps()  {
        return JnaFrameClock.INST().gdk_frame_clock_get_fps(asCPointer());
    }

    /**
     * `GdkFrameClock` maintains a 64-bit counter that increments for
     * <br>each frame drawn.
     * @return inside frame processing, the value of the frame counter   for the current frame. Outside of frame processing, the frame   counter for the last frame.
    */
    public long getFrameCounter()  {
        return JnaFrameClock.INST().gdk_frame_clock_get_frame_counter(asCPointer());
    }

    /**
     * Gets the time that should currently be used for animations.
     * <br>
     * <br>Inside the processing of a frame, it’s the time used to compute the
     * <br>animation position of everything in a frame. Outside of a frame, it's
     * <br>the time of the conceptual “previous frame,” which may be either
     * <br>the actual previous frame time, or if that’s too old, an updated
     * <br>time.
     * @return a timestamp in microseconds, in the timescale of  of g_get_monotonic_time().
    */
    public long getFrameTime()  {
        return JnaFrameClock.INST().gdk_frame_clock_get_frame_time(asCPointer());
    }

    /**
     * Returns the frame counter for the oldest frame available in history.
     * <br>
     * <br>`GdkFrameClock` internally keeps a history of `GdkFrameTimings`
     * <br>objects for recent frames that can be retrieved with
     * <br>[method&#64;Gdk.FrameClock.get_timings]. The set of stored frames
     * <br>is the set from the counter values given by
     * <br>[method&#64;Gdk.FrameClock.get_history_start] and
     * <br>[method&#64;Gdk.FrameClock.get_frame_counter], inclusive.
     * @return the frame counter value for the oldest frame  that is available in the internal frame history of the  `GdkFrameClock`
    */
    public long getHistoryStart()  {
        return JnaFrameClock.INST().gdk_frame_clock_get_history_start(asCPointer());
    }

    /**
     * Retrieves a `GdkFrameTimings` object holding timing information
     * <br>for the current frame or a recent frame.
     * <br>
     * <br>The `GdkFrameTimings` object may not yet be complete: see
     * <br>[method&#64;Gdk.FrameTimings.get_complete] and
     * <br>[method&#64;Gdk.FrameClock.get_history_start].
     * @param frame_counter the frame counter value identifying the frame to  be received
     * @return the `GdkFrameTimings` object   for the specified frame, or %NULL if it is not available
    */
    public FrameTimings getTimings(long frame_counter)  {
        return new FrameTimings(new PointerContainer(JnaFrameClock.INST().gdk_frame_clock_get_timings(asCPointer(), frame_counter)));
    }

    /**
     * Asks the frame clock to run a particular phase.
     * <br>
     * <br>The signal corresponding the requested phase will be emitted the next
     * <br>time the frame clock processes. Multiple calls to
     * <br>gdk_frame_clock_request_phase() will be combined together
     * <br>and only one frame processed. If you are displaying animated
     * <br>content and want to continually request the
     * <br>%GDK_FRAME_CLOCK_PHASE_UPDATE phase for a period of time,
     * <br>you should use [method&#64;Gdk.FrameClock.begin_updating] instead,
     * <br>since this allows GTK to adjust system parameters to get maximally
     * <br>smooth animations.
     * @param phase the phase that is requested
    */
    public void requestPhase(int phase)  {
        JnaFrameClock.INST().gdk_frame_clock_request_phase(asCPointer(), phase);
    }

    public final static String SIGNAL_ON_AFTER_PAINT = "after-paint";
    
    /**
     * Connect to signal "after-paint".
     * <br>See {@link OnAfterPaint#onAfterPaint} for signal description.
     * <br>Field {@link #SIGNAL_ON_AFTER_PAINT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onAfterPaint(OnAfterPaint signal) {
        return connectSignal(SIGNAL_ON_AFTER_PAINT, toOnAfterPaint(signal));
    }

    public final static String SIGNAL_ON_BEFORE_PAINT = "before-paint";
    
    /**
     * Connect to signal "before-paint".
     * <br>See {@link OnBeforePaint#onBeforePaint} for signal description.
     * <br>Field {@link #SIGNAL_ON_BEFORE_PAINT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onBeforePaint(OnBeforePaint signal) {
        return connectSignal(SIGNAL_ON_BEFORE_PAINT, toOnBeforePaint(signal));
    }

    public final static String SIGNAL_ON_FLUSH_EVENTS = "flush-events";
    
    /**
     * Connect to signal "flush-events".
     * <br>See {@link OnFlushEvents#onFlushEvents} for signal description.
     * <br>Field {@link #SIGNAL_ON_FLUSH_EVENTS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onFlushEvents(OnFlushEvents signal) {
        return connectSignal(SIGNAL_ON_FLUSH_EVENTS, toOnFlushEvents(signal));
    }

    public final static String SIGNAL_ON_LAYOUT = "layout";
    
    /**
     * Connect to signal "layout".
     * <br>See {@link OnLayout#onLayout} for signal description.
     * <br>Field {@link #SIGNAL_ON_LAYOUT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLayout(OnLayout signal) {
        return connectSignal(SIGNAL_ON_LAYOUT, toOnLayout(signal));
    }

    public final static String SIGNAL_ON_PAINT = "paint";
    
    /**
     * Connect to signal "paint".
     * <br>See {@link OnPaint#onPaint} for signal description.
     * <br>Field {@link #SIGNAL_ON_PAINT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onPaint(OnPaint signal) {
        return connectSignal(SIGNAL_ON_PAINT, toOnPaint(signal));
    }

    public final static String SIGNAL_ON_RESUME_EVENTS = "resume-events";
    
    /**
     * Connect to signal "resume-events".
     * <br>See {@link OnResumeEvents#onResumeEvents} for signal description.
     * <br>Field {@link #SIGNAL_ON_RESUME_EVENTS} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onResumeEvents(OnResumeEvents signal) {
        return connectSignal(SIGNAL_ON_RESUME_EVENTS, toOnResumeEvents(signal));
    }

    public final static String SIGNAL_ON_UPDATE = "update";
    
    /**
     * Connect to signal "update".
     * <br>See {@link OnUpdate#onUpdate} for signal description.
     * <br>Field {@link #SIGNAL_ON_UPDATE} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onUpdate(OnUpdate signal) {
        return connectSignal(SIGNAL_ON_UPDATE, toOnUpdate(signal));
    }

    public static long getTypeID() { 
        return JnaFrameClock.INST().gdk_frame_clock_get_type(); 
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

[MethodModel:java-type-not-supported:java-type-not-supported:getRefreshInfo:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:gint64}}:{j:long}]
        [ParameterModel:java-type-not-supported:{G_::{c:gint64*}}:{j:}]
        [ParameterModel:java-type-not-supported:{G_::{c:gint64*}}:{j:}]
*/
