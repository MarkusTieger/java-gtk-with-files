/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Monitors a file or directory for changes.
 * <br>
 * <br>To obtain a &#35;GFileMonitor for a file or directory, use
 * <br>g_file_monitor(), g_file_monitor_file(), or
 * <br>g_file_monitor_directory().
 * <br>
 * <br>To get informed about changes to the file or directory you are
 * <br>monitoring, connect to the &#35;GFileMonitor::changed signal. The
 * <br>signal will be emitted in the
 * <br>[thread-default main context][g-main-context-push-thread-default]
 * <br>of the thread that the monitor was created in
 * <br>(though if the global default main context is blocked, this may
 * <br>cause notifications to be blocked even if the thread-default
 * <br>context is still running).
 * <p><a href="https://docs.gtk.org/gio/class.FileMonitor.html">https://docs.gtk.org/gio/class.FileMonitor.html</a></p>
*/
public class FileMonitor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(FileMonitor.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Emitted when &#64;file has been changed.
         * <br>
         * <br>If using %G_FILE_MONITOR_WATCH_MOVES on a directory monitor, and
         * <br>the information is available (and if supported by the backend),
         * <br>&#64;event_type may be %G_FILE_MONITOR_EVENT_RENAMED,
         * <br>%G_FILE_MONITOR_EVENT_MOVED_IN or %G_FILE_MONITOR_EVENT_MOVED_OUT.
         * <br>
         * <br>In all cases &#64;file will be a child of the monitored directory.  For
         * <br>renames, &#64;file will be the old name and &#64;other_file is the new
         * <br>name.  For &quot;moved in&quot; events, &#64;file is the name of the file that
         * <br>appeared and &#64;other_file is the old name that it was moved from (in
         * <br>another directory).  For &quot;moved out&quot; events, &#64;file is the name of
         * <br>the file that used to be in this directory and &#64;other_file is the
         * <br>name of the file at its new location.
         * <br>
         * <br>It makes sense to treat %G_FILE_MONITOR_EVENT_MOVED_IN as
         * <br>equivalent to %G_FILE_MONITOR_EVENT_CREATED and
         * <br>%G_FILE_MONITOR_EVENT_MOVED_OUT as equivalent to
         * <br>%G_FILE_MONITOR_EVENT_DELETED, with extra information.
         * <br>%G_FILE_MONITOR_EVENT_RENAMED is equivalent to a delete/create
         * <br>pair.  This is exactly how the events will be reported in the case
         * <br>that the %G_FILE_MONITOR_WATCH_MOVES flag is not in use.
         * <br>
         * <br>If using the deprecated flag %G_FILE_MONITOR_SEND_MOVED flag and &#64;event_type is
         * <br>%G_FILE_MONITOR_EVENT_MOVED, &#64;file will be set to a &#35;GFile containing the
         * <br>old path, and &#64;other_file will be set to a &#35;GFile containing the new path.
         * <br>
         * <br>In all the other cases, &#64;other_file will be set to &#35;NULL.
         * @param file a &#35;GFile.
         * @param other_file a &#35;GFile or &#35;NULL.
         * @param event_type a &#35;GFileMonitorEvent.
        */
        void onChanged(@Nonnull File file, @Nullable File other_file, int event_type);
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaFileMonitor.OnChanged) (__self, _file, _other_file, _event_type, __data) -> in.onChanged(new File(new PointerContainer(_file)), new File(new PointerContainer(_other_file)), _event_type);
    }

    public FileMonitor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Cancels a file monitor.
     * @return always %TRUE
    */
    public boolean cancel()  {
        return JnaFileMonitor.INST().g_file_monitor_cancel(asCPointer());
    }

    /**
     * Emits the &#35;GFileMonitor::changed signal if a change
     * <br>has taken place. Should be called from file monitor
     * <br>implementations only.
     * <br>
     * <br>Implementations are responsible to call this method from the
     * <br>[thread-default main context][g-main-context-push-thread-default] of the
     * <br>thread that the monitor was created in.
     * @param child a &#35;GFile.
     * @param other_file a &#35;GFile.
     * @param event_type a set of &#35;GFileMonitorEvent flags.
    */
    public void emitEvent(@Nonnull File child, @Nonnull File other_file, int event_type)  {
        JnaFileMonitor.INST().g_file_monitor_emit_event(asCPointer(), asCPointerNotNull(child), asCPointerNotNull(other_file), event_type);
    }

    /**
     * Returns whether the monitor is canceled.
     * @return %TRUE if monitor is canceled. %FALSE otherwise.
    */
    public boolean isCancelled()  {
        return JnaFileMonitor.INST().g_file_monitor_is_cancelled(asCPointer());
    }

    /**
     * Sets the rate limit to which the &#64;monitor will report
     * <br>consecutive change events to the same file.
     * @param limit_msecs a non-negative integer with the limit in milliseconds     to poll for changes
    */
    public void setRateLimit(int limit_msecs)  {
        JnaFileMonitor.INST().g_file_monitor_set_rate_limit(asCPointer(), limit_msecs);
    }

    public final static String SIGNAL_ON_CHANGED = "changed";
    
    /**
     * Connect to signal "changed".
     * <br>See {@link OnChanged#onChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onChanged(OnChanged signal) {
        return connectSignal(SIGNAL_ON_CHANGED, toOnChanged(signal));
    }

    public static long getTypeID() { 
        return JnaFileMonitor.INST().g_file_monitor_get_type(); 
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
