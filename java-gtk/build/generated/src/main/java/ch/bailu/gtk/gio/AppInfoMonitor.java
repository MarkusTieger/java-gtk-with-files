/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GAppInfoMonitor is a very simple object used for monitoring the app
 * <br>info database for changes (ie: newly installed or removed
 * <br>applications).
 * <br>
 * <br>Call g_app_info_monitor_get() to get a &#35;GAppInfoMonitor and connect
 * <br>to the &quot;changed&quot; signal.
 * <br>
 * <br>In the usual case, applications should try to make note of the change
 * <br>(doing things like invalidating caches) but not act on it.  In
 * <br>particular, applications should avoid making calls to &#35;GAppInfo APIs
 * <br>in response to the change signal, deferring these until the time that
 * <br>the data is actually required.  The exception to this case is when
 * <br>application information is actually being displayed on the screen
 * <br>(eg: during a search or when the list of all applications is shown).
 * <br>The reason for this is that changes to the list of installed
 * <br>applications often come in groups (like during system updates) and
 * <br>rescanning the list on every change is pointless and expensive.
 * <p><a href="https://docs.gtk.org/gio/class.AppInfoMonitor.html">https://docs.gtk.org/gio/class.AppInfoMonitor.html</a></p>
*/
public class AppInfoMonitor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(AppInfoMonitor.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnChanged {
        /**
         * Signal emitted when the app info database for changes (ie: newly installed
         * <br>or removed applications).
        */
        void onChanged();
    }
    
    private static com.sun.jna.Callback toOnChanged(OnChanged in) {
        return (in == null) ? null: (JnaAppInfoMonitor.OnChanged) (__self, __data) -> in.onChanged();
    }

    public AppInfoMonitor(PointerContainer pointer) {
        super(pointer);
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

    /**
     * Gets the &#35;GAppInfoMonitor for the current thread-default main
     * <br>context.
     * <br>
     * <br>The &#35;GAppInfoMonitor will emit a &quot;changed&quot; signal in the
     * <br>thread-default main context whenever the list of installed
     * <br>applications (as reported by g_app_info_get_all()) may have changed.
     * <br>
     * <br>You must only call g_object_unref() on the return value from under
     * <br>the same main context as you created it.
     * @return a reference to a &#35;GAppInfoMonitor
    */
    public static AppInfoMonitor get()  {
        return new AppInfoMonitor(new PointerContainer(JnaAppInfoMonitor.INST().g_app_info_monitor_get()));
    }

    public static long getTypeID() { 
        return JnaAppInfoMonitor.INST().g_app_info_monitor_get_type(); 
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
