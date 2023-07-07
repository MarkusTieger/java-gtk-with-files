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
public interface FileMonitorFlags {

    /**
     * No flags set.
    */
    int NONE = 0;

    /**
     * Watch for mount events.
    */
    int WATCH_MOUNTS = 1;

    /**
     * Pair DELETED and CREATED events caused
     * <br>  by file renames (moves) and send a single G_FILE_MONITOR_EVENT_MOVED
     * <br>  event instead (NB: not supported on all backends; the default
     * <br>  behaviour -without specifying this flag- is to send single DELETED
     * <br>  and CREATED events).  Deprecated since 2.46: use
     * <br>  %G_FILE_MONITOR_WATCH_MOVES instead.
    */
    int SEND_MOVED = 2;

    /**
     * Watch for changes to the file made
     * <br>  via another hard link. Since 2.36.
    */
    int WATCH_HARD_LINKS = 4;

    /**
     * Watch for rename operations on a
     * <br>  monitored directory.  This causes %G_FILE_MONITOR_EVENT_RENAMED,
     * <br>  %G_FILE_MONITOR_EVENT_MOVED_IN and %G_FILE_MONITOR_EVENT_MOVED_OUT
     * <br>  events to be emitted when possible.  Since: 2.46.
    */
    int WATCH_MOVES = 8;

}

/*
enumeration-type
*/
