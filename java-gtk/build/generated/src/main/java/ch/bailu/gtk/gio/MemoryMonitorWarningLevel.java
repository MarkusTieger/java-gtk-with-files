/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/">https://docs.gtk.org/</a></p>
*/
public interface MemoryMonitorWarningLevel {

    /**
     * Memory on the device is low, processes
     * <br>  should free up unneeded resources (for example, in-memory caches) so they can
     * <br>  be used elsewhere.
    */
    int LOW = 50;

    /**
     * Same as &#64;G_MEMORY_MONITOR_WARNING_LEVEL_LOW
     * <br>  but the device has even less free memory, so processes should try harder to free
     * <br>  up unneeded resources. If your process does not need to stay running, it is a
     * <br>  good time for it to quit.
    */
    int MEDIUM = 100;

    /**
     * The system will soon start terminating
     * <br>  processes to reclaim memory, including background processes.
    */
    int CRITICAL = 255;

}

/*
enumeration-type
*/
