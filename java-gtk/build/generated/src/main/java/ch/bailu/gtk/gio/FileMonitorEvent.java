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
public interface FileMonitorEvent {

    /**
     * a file changed.
    */
    int CHANGED = 0;

    /**
     * a hint that this was probably the last change in a set of changes.
    */
    int CHANGES_DONE_HINT = 1;

    /**
     * a file was deleted.
    */
    int DELETED = 2;

    /**
     * a file was created.
    */
    int CREATED = 3;

    /**
     * a file attribute was changed.
    */
    int ATTRIBUTE_CHANGED = 4;

    /**
     * the file location will soon be unmounted.
    */
    int PRE_UNMOUNT = 5;

    /**
     * the file location was unmounted.
    */
    int UNMOUNTED = 6;

    /**
     * the file was moved -- only sent if the
     * <br>  (deprecated) %G_FILE_MONITOR_SEND_MOVED flag is set
    */
    int MOVED = 7;

    /**
     * the file was renamed within the
     * <br>  current directory -- only sent if the %G_FILE_MONITOR_WATCH_MOVES
     * <br>  flag is set.  Since: 2.46.
    */
    int RENAMED = 8;

    /**
     * the file was moved into the
     * <br>  monitored directory from another location -- only sent if the
     * <br>  %G_FILE_MONITOR_WATCH_MOVES flag is set.  Since: 2.46.
    */
    int MOVED_IN = 9;

    /**
     * the file was moved out of the
     * <br>  monitored directory to another location -- only sent if the
     * <br>  %G_FILE_MONITOR_WATCH_MOVES flag is set.  Since: 2.46
    */
    int MOVED_OUT = 10;

}

/*
enumeration-type
*/
