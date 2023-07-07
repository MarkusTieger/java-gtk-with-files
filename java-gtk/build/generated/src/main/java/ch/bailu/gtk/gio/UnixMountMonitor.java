/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * Watches &#35;GUnixMounts for changes.
 * <p><a href="https://docs.gtk.org/gio/class.UnixMountMonitor.html">https://docs.gtk.org/gio/class.UnixMountMonitor.html</a></p>
*/
public class UnixMountMonitor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(UnixMountMonitor.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnMountpointsChanged {
        /**
         * Emitted when the unix mount points have changed.
        */
        void onMountpointsChanged();
    }
    
    private static com.sun.jna.Callback toOnMountpointsChanged(OnMountpointsChanged in) {
        return (in == null) ? null: (JnaUnixMountMonitor.OnMountpointsChanged) (__self, __data) -> in.onMountpointsChanged();
    }

    @FunctionalInterface
    public interface OnMountsChanged {
        /**
         * Emitted when the unix mounts have changed.
        */
        void onMountsChanged();
    }
    
    private static com.sun.jna.Callback toOnMountsChanged(OnMountsChanged in) {
        return (in == null) ? null: (JnaUnixMountMonitor.OnMountsChanged) (__self, __data) -> in.onMountsChanged();
    }

    public UnixMountMonitor(PointerContainer pointer) {
        super(pointer);
    }

    public final static String SIGNAL_ON_MOUNTPOINTS_CHANGED = "mountpoints-changed";
    
    /**
     * Connect to signal "mountpoints-changed".
     * <br>See {@link OnMountpointsChanged#onMountpointsChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOUNTPOINTS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMountpointsChanged(OnMountpointsChanged signal) {
        return connectSignal(SIGNAL_ON_MOUNTPOINTS_CHANGED, toOnMountpointsChanged(signal));
    }

    public final static String SIGNAL_ON_MOUNTS_CHANGED = "mounts-changed";
    
    /**
     * Connect to signal "mounts-changed".
     * <br>See {@link OnMountsChanged#onMountsChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOUNTS_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMountsChanged(OnMountsChanged signal) {
        return connectSignal(SIGNAL_ON_MOUNTS_CHANGED, toOnMountsChanged(signal));
    }

    /**
     * Gets the &#35;GUnixMountMonitor for the current thread-default main
     * <br>context.
     * <br>
     * <br>The mount monitor can be used to monitor for changes to the list of
     * <br>mounted filesystems as well as the list of mount points (ie: fstab
     * <br>entries).
     * <br>
     * <br>You must only call g_object_unref() on the return value from under
     * <br>the same main context as you called this function.
     * @return the &#35;GUnixMountMonitor.
    */
    public static UnixMountMonitor get()  {
        return new UnixMountMonitor(new PointerContainer(JnaUnixMountMonitor.INST().g_unix_mount_monitor_get()));
    }

    public static long getTypeID() { 
        return JnaUnixMountMonitor.INST().g_unix_mount_monitor_get_type(); 
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

[MethodModel:cb-deprecated:_new:[ParameterModel:Supported:{Gg:UnixMountMonitor:{c:GUnixMountMonitor*}}:{j:long}]]

[MethodModel:cb-deprecated:setRateLimit:[ParameterModel:Supported:{G_::{c:void}}:{j:void}]]
        [ParameterModel:Supported:{G_::{c:int}}:{j:int}]
*/
