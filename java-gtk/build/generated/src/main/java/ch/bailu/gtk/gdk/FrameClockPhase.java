/* this file is machine generated */
package ch.bailu.gtk.gdk;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface FrameClockPhase {

    /**
     * no phase
    */
    int NONE = 0;

    /**
     * corresponds to GdkFrameClock::flush-events. Should not be handled by applications.
    */
    int FLUSH_EVENTS = 1;

    /**
     * corresponds to GdkFrameClock::before-paint. Should not be handled by applications.
    */
    int BEFORE_PAINT = 2;

    /**
     * corresponds to GdkFrameClock::update.
    */
    int UPDATE = 4;

    /**
     * corresponds to GdkFrameClock::layout. Should not be handled by applications.
    */
    int LAYOUT = 8;

    /**
     * corresponds to GdkFrameClock::paint.
    */
    int PAINT = 16;

    /**
     * corresponds to GdkFrameClock::resume-events. Should not be handled by applications.
    */
    int RESUME_EVENTS = 32;

    /**
     * corresponds to GdkFrameClock::after-paint. Should not be handled by applications.
    */
    int AFTER_PAINT = 64;

}

/*
enumeration-type
*/
