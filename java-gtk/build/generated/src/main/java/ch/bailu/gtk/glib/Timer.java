/* this file is machine generated */
package ch.bailu.gtk.glib;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Opaque datatype that records a start time.
 * <p><a href="https://docs.gtk.org/glib/struct.Timer.html">https://docs.gtk.org/glib/struct.Timer.html</a></p>
*/
class Timer extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(Timer.class.getCanonicalName());
    }

    public Timer(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Resumes a timer that has previously been stopped with
     * <br>g_timer_stop(). g_timer_stop() must be called before using this
     * <br>function.
    */
    public void _continue()  {
        JnaTimer.INST().g_timer_continue(asCPointer());
    }

    /**
     * Destroys a timer, freeing associated resources.
    */
    public void destroy()  {
        JnaTimer.INST().g_timer_destroy(asCPointer());
    }

    /**
     * Exposes whether the timer is currently active.
     * @return %TRUE if the timer is running, %FALSE otherwise
    */
    public boolean isActive()  {
        return JnaTimer.INST().g_timer_is_active(asCPointer());
    }

    /**
     * This function is useless; it's fine to call g_timer_start() on an
     * <br>already-started timer to reset the start time, so g_timer_reset()
     * <br>serves no purpose.
    */
    public void reset()  {
        JnaTimer.INST().g_timer_reset(asCPointer());
    }

    /**
     * Marks a start time, so that future calls to g_timer_elapsed() will
     * <br>report the time since g_timer_start() was called. g_timer_new()
     * <br>automatically marks the start time, so no need to call
     * <br>g_timer_start() immediately after creating the timer.
    */
    public void start()  {
        JnaTimer.INST().g_timer_start(asCPointer());
    }

    /**
     * Marks an end time, so calls to g_timer_elapsed() will return the
     * <br>difference between this end time and the start time.
    */
    public void stop()  {
        JnaTimer.INST().g_timer_stop(asCPointer());
    }

    /**
     * Creates a new timer, and starts timing (i.e. g_timer_start() is
     * <br>implicitly called for you).
     * @return a new &#35;GTimer.
    */
    public static Timer _new()  {
        return new Timer(new PointerContainer(JnaTimer.INST().g_timer_new()));
    }

}

/*
record-type
flag-disguised
all-fields-supported

[MethodModel:java-type-not-supported:elapsed:[ParameterModel:Supported:{G_::{c:gdouble}}:{j:double}]]
        [ParameterModel:java-type-not-supported:{G_::{c:gulong*}}:{j:}]
*/
