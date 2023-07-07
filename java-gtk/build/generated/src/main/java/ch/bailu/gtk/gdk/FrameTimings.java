/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * A `GdkFrameTimings` object holds timing information for a single frame
 * <br>of the application’s displays.
 * <br>
 * <br>To retrieve `GdkFrameTimings` objects, use [method&#64;Gdk.FrameClock.get_timings]
 * <br>or [method&#64;Gdk.FrameClock.get_current_timings]. The information in
 * <br>`GdkFrameTimings` is useful for precise synchronization of video with
 * <br>the event or audio streams, and for measuring quality metrics for the
 * <br>application’s display, such as latency and jitter.
 * <p><a href="https://docs.gtk.org/gdk4/struct.FrameTimings.html">https://docs.gtk.org/gdk4/struct.FrameTimings.html</a></p>
*/
public class FrameTimings extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FrameTimings.class.getCanonicalName());
    }

    public FrameTimings(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Returns whether &#64;timings are complete.
     * <br>
     * <br>The timing information in a `GdkFrameTimings` is filled in
     * <br>incrementally as the frame as drawn and passed off to the
     * <br>window system for processing and display to the user. The
     * <br>accessor functions for `GdkFrameTimings` can return 0 to
     * <br>indicate an unavailable value for two reasons: either because
     * <br>the information is not yet available, or because it isn't
     * <br>available at all.
     * <br>
     * <br>Once this function returns %TRUE for a frame, you can be
     * <br>certain that no further values will become available and be
     * <br>stored in the `GdkFrameTimings`.
     * @return %TRUE if all information that will be available   for the frame has been filled in.
    */
    public boolean getComplete()  {
        return JnaFrameTimings.INST().gdk_frame_timings_get_complete(asCPointer());
    }

    /**
     * Gets the frame counter value of the `GdkFrameClock` when
     * <br>this frame was drawn.
     * @return the frame counter value for this frame
    */
    public long getFrameCounter()  {
        return JnaFrameTimings.INST().gdk_frame_timings_get_frame_counter(asCPointer());
    }

    /**
     * Returns the frame time for the frame.
     * <br>
     * <br>This is the time value that is typically used to time
     * <br>animations for the frame. See [method&#64;Gdk.FrameClock.get_frame_time].
     * @return the frame time for the frame, in the timescale  of g_get_monotonic_time()
    */
    public long getFrameTime()  {
        return JnaFrameTimings.INST().gdk_frame_timings_get_frame_time(asCPointer());
    }

    /**
     * Gets the predicted time at which this frame will be displayed.
     * <br>
     * <br>Although no predicted time may be available, if one is available,
     * <br>it will be available while the frame is being generated, in contrast
     * <br>to [method&#64;Gdk.FrameTimings.get_presentation_time], which is only
     * <br>available after the frame has been presented.
     * <br>
     * <br>In general, if you are simply animating, you should use
     * <br>[method&#64;Gdk.FrameClock.get_frame_time] rather than this function,
     * <br>but this function is useful for applications that want exact control
     * <br>over latency. For example, a movie player may want this information
     * <br>for Audio/Video synchronization.
     * @return The predicted time at which the frame will be presented,   in the timescale of g_get_monotonic_time(), or 0 if no predicted   presentation time is available.
    */
    public long getPredictedPresentationTime()  {
        return JnaFrameTimings.INST().gdk_frame_timings_get_predicted_presentation_time(asCPointer());
    }

    /**
     * Reurns the presentation time.
     * <br>
     * <br>This is the time at which the frame became visible to the user.
     * @return the time the frame was displayed to the user, in the   timescale of g_get_monotonic_time(), or 0 if no presentation   time is available. See [method&#64;Gdk.FrameTimings.get_complete]
    */
    public long getPresentationTime()  {
        return JnaFrameTimings.INST().gdk_frame_timings_get_presentation_time(asCPointer());
    }

    /**
     * Gets the natural interval between presentation times for
     * <br>the display that this frame was displayed on.
     * <br>
     * <br>Frame presentation usually happens during the “vertical
     * <br>blanking interval”.
     * @return the refresh interval of the display, in microseconds,   or 0 if the refresh interval is not available.   See [method&#64;Gdk.FrameTimings.get_complete].
    */
    public long getRefreshInterval()  {
        return JnaFrameTimings.INST().gdk_frame_timings_get_refresh_interval(asCPointer());
    }

    /**
     * Increases the reference count of &#64;timings.
     * @return &#64;timings
    */
    public FrameTimings ref()  {
        return new FrameTimings(new PointerContainer(JnaFrameTimings.INST().gdk_frame_timings_ref(asCPointer())));
    }

    /**
     * Decreases the reference count of &#64;timings.
     * <br>
     * <br>If &#64;timings is no longer referenced, it will be freed.
    */
    public void unref()  {
        JnaFrameTimings.INST().gdk_frame_timings_unref(asCPointer());
    }

    public static long getTypeID() { 
        return JnaFrameTimings.INST().gdk_frame_timings_get_type(); 
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
record-type
all-fields-supported
*/
