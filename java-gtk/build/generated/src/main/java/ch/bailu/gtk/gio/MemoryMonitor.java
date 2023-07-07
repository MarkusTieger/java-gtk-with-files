/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GMemoryMonitor will monitor system memory and suggest to the application
 * <br>when to free memory so as to leave more room for other applications.
 * <br>It is implemented on Linux using the [Low Memory Monitor](https://gitlab.freedesktop.org/hadess/low-memory-monitor/)
 * <br>([API documentation](https://hadess.pages.freedesktop.org/low-memory-monitor/)).
 * <br>
 * <br>There is also an implementation for use inside Flatpak sandboxes.
 * <br>
 * <br>Possible actions to take when the signal is received are:
 * <br>
 * <br> - Free caches
 * <br> - Save files that haven't been looked at in a while to disk, ready to be reopened when needed
 * <br> - Run a garbage collection cycle
 * <br> - Try and compress fragmented allocations
 * <br> - Exit on idle if the process has no reason to stay around
 * <br> - Call [`malloc_trim(3)`](man:malloc_trim) to return cached heap pages to
 * <br>   the kernel (if supported by your libc)
 * <br>
 * <br>Note that some actions may not always improve system performance, and so
 * <br>should be profiled for your application. `malloc_trim()`, for example, may
 * <br>make future heap allocations slower (due to releasing cached heap pages back
 * <br>to the kernel).
 * <br>
 * <br>See &#35;GMemoryMonitorWarningLevel for details on the various warning levels.
 * <br>
 * <pre>&lt;!-- language=&quot;C&quot; --&gt;
 * static void
 * warning_cb (GMemoryMonitor *m, GMemoryMonitorWarningLevel level)
 * {
 *   g_debug (&quot;Warning level: %d&quot;, level);
 *   if (warning_level &gt; G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
 *     drop_caches ();
 * }
 * 
 * static GMemoryMonitor *
 * monitor_low_memory (void)
 * {
 *   GMemoryMonitor *m;
 *   m = g_memory_monitor_dup_default ();
 *   g_signal_connect (G_OBJECT (m), &quot;low-memory-warning&quot;,
 *                     G_CALLBACK (warning_cb), NULL);
 *   return m;
 * }
 * </pre>
 * <br>
 * <br>Don't forget to disconnect the &#35;GMemoryMonitor::low-memory-warning
 * <br>signal, and unref the &#35;GMemoryMonitor itself when exiting.
 * <p><a href="https://docs.gtk.org/gio/iface.MemoryMonitor.html">https://docs.gtk.org/gio/iface.MemoryMonitor.html</a></p>
*/
public class MemoryMonitor extends ch.bailu.gtk.type.Interface {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(MemoryMonitor.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnLowMemoryWarning {
        /**
         * Emitted when the system is running low on free memory. The signal
         * <br>handler should then take the appropriate action depending on the
         * <br>warning level. See the &#35;GMemoryMonitorWarningLevel documentation for
         * <br>details.
         * @param level the &#35;GMemoryMonitorWarningLevel warning level
        */
        void onLowMemoryWarning(int level);
    }
    
    private static com.sun.jna.Callback toOnLowMemoryWarning(OnLowMemoryWarning in) {
        return (in == null) ? null: (JnaMemoryMonitor.OnLowMemoryWarning) (__self, _level, __data) -> in.onLowMemoryWarning(_level);
    }

    public MemoryMonitor(PointerContainer pointer) {
        super(pointer);
    }

    public final static String SIGNAL_ON_LOW_MEMORY_WARNING = "low-memory-warning";
    
    /**
     * Connect to signal "low-memory-warning".
     * <br>See {@link OnLowMemoryWarning#onLowMemoryWarning} for signal description.
     * <br>Field {@link #SIGNAL_ON_LOW_MEMORY_WARNING} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onLowMemoryWarning(OnLowMemoryWarning signal) {
        return connectSignal(SIGNAL_ON_LOW_MEMORY_WARNING, toOnLowMemoryWarning(signal));
    }

    /**
     * Gets a reference to the default &#35;GMemoryMonitor for the system.
     * @return a new reference to the default &#35;GMemoryMonitor
    */
    public static MemoryMonitor dupDefault()  {
        return new MemoryMonitor(new PointerContainer(JnaMemoryMonitor.INST().g_memory_monitor_dup_default()));
    }

    public static long getTypeID() { 
        return JnaMemoryMonitor.INST().g_memory_monitor_get_type(); 
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
interface-type
*/
