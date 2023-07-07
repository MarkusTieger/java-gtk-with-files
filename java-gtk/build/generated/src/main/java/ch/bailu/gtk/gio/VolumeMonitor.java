/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * &#35;GVolumeMonitor is for listing the user interesting devices and volumes
 * <br>on the computer. In other words, what a file selector or file manager
 * <br>would show in a sidebar.
 * <br>
 * <br>&#35;GVolumeMonitor is not
 * <br>[thread-default-context aware][g-main-context-push-thread-default],
 * <br>and so should not be used other than from the main thread, with no
 * <br>thread-default-context active.
 * <br>
 * <br>In order to receive updates about volumes and mounts monitored through GVFS,
 * <br>a main loop must be running.
 * <p><a href="https://docs.gtk.org/gio/class.VolumeMonitor.html">https://docs.gtk.org/gio/class.VolumeMonitor.html</a></p>
*/
public class VolumeMonitor extends ch.bailu.gtk.gobject.Object {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VolumeMonitor.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnDriveChanged {
        /**
         * Emitted when a drive changes.
         * @param drive the drive that changed
        */
        void onDriveChanged(@Nonnull Drive drive);
    }
    
    private static com.sun.jna.Callback toOnDriveChanged(OnDriveChanged in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnDriveChanged) (__self, _drive, __data) -> in.onDriveChanged(new Drive(new PointerContainer(_drive)));
    }

    @FunctionalInterface
    public interface OnDriveConnected {
        /**
         * Emitted when a drive is connected to the system.
         * @param drive a &#35;GDrive that was connected.
        */
        void onDriveConnected(@Nonnull Drive drive);
    }
    
    private static com.sun.jna.Callback toOnDriveConnected(OnDriveConnected in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnDriveConnected) (__self, _drive, __data) -> in.onDriveConnected(new Drive(new PointerContainer(_drive)));
    }

    @FunctionalInterface
    public interface OnDriveDisconnected {
        /**
         * Emitted when a drive is disconnected from the system.
         * @param drive a &#35;GDrive that was disconnected.
        */
        void onDriveDisconnected(@Nonnull Drive drive);
    }
    
    private static com.sun.jna.Callback toOnDriveDisconnected(OnDriveDisconnected in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnDriveDisconnected) (__self, _drive, __data) -> in.onDriveDisconnected(new Drive(new PointerContainer(_drive)));
    }

    @FunctionalInterface
    public interface OnDriveEjectButton {
        /**
         * Emitted when the eject button is pressed on &#64;drive.
         * @param drive the drive where the eject button was pressed
        */
        void onDriveEjectButton(@Nonnull Drive drive);
    }
    
    private static com.sun.jna.Callback toOnDriveEjectButton(OnDriveEjectButton in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnDriveEjectButton) (__self, _drive, __data) -> in.onDriveEjectButton(new Drive(new PointerContainer(_drive)));
    }

    @FunctionalInterface
    public interface OnDriveStopButton {
        /**
         * Emitted when the stop button is pressed on &#64;drive.
         * @param drive the drive where the stop button was pressed
        */
        void onDriveStopButton(@Nonnull Drive drive);
    }
    
    private static com.sun.jna.Callback toOnDriveStopButton(OnDriveStopButton in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnDriveStopButton) (__self, _drive, __data) -> in.onDriveStopButton(new Drive(new PointerContainer(_drive)));
    }

    @FunctionalInterface
    public interface OnMountAdded {
        /**
         * Emitted when a mount is added.
         * @param mount a &#35;GMount that was added.
        */
        void onMountAdded(@Nonnull Mount mount);
    }
    
    private static com.sun.jna.Callback toOnMountAdded(OnMountAdded in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnMountAdded) (__self, _mount, __data) -> in.onMountAdded(new Mount(new PointerContainer(_mount)));
    }

    @FunctionalInterface
    public interface OnMountChanged {
        /**
         * Emitted when a mount changes.
         * @param mount a &#35;GMount that changed.
        */
        void onMountChanged(@Nonnull Mount mount);
    }
    
    private static com.sun.jna.Callback toOnMountChanged(OnMountChanged in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnMountChanged) (__self, _mount, __data) -> in.onMountChanged(new Mount(new PointerContainer(_mount)));
    }

    @FunctionalInterface
    public interface OnMountPreUnmount {
        /**
         * May be emitted when a mount is about to be removed.
         * <br>
         * <br>This signal depends on the backend and is only emitted if
         * <br>GIO was used to unmount.
         * @param mount a &#35;GMount that is being unmounted.
        */
        void onMountPreUnmount(@Nonnull Mount mount);
    }
    
    private static com.sun.jna.Callback toOnMountPreUnmount(OnMountPreUnmount in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnMountPreUnmount) (__self, _mount, __data) -> in.onMountPreUnmount(new Mount(new PointerContainer(_mount)));
    }

    @FunctionalInterface
    public interface OnMountRemoved {
        /**
         * Emitted when a mount is removed.
         * @param mount a &#35;GMount that was removed.
        */
        void onMountRemoved(@Nonnull Mount mount);
    }
    
    private static com.sun.jna.Callback toOnMountRemoved(OnMountRemoved in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnMountRemoved) (__self, _mount, __data) -> in.onMountRemoved(new Mount(new PointerContainer(_mount)));
    }

    @FunctionalInterface
    public interface OnVolumeAdded {
        /**
         * Emitted when a mountable volume is added to the system.
         * @param volume a &#35;GVolume that was added.
        */
        void onVolumeAdded(@Nonnull Volume volume);
    }
    
    private static com.sun.jna.Callback toOnVolumeAdded(OnVolumeAdded in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnVolumeAdded) (__self, _volume, __data) -> in.onVolumeAdded(new Volume(new PointerContainer(_volume)));
    }

    @FunctionalInterface
    public interface OnVolumeChanged {
        /**
         * Emitted when mountable volume is changed.
         * @param volume a &#35;GVolume that changed.
        */
        void onVolumeChanged(@Nonnull Volume volume);
    }
    
    private static com.sun.jna.Callback toOnVolumeChanged(OnVolumeChanged in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnVolumeChanged) (__self, _volume, __data) -> in.onVolumeChanged(new Volume(new PointerContainer(_volume)));
    }

    @FunctionalInterface
    public interface OnVolumeRemoved {
        /**
         * Emitted when a mountable volume is removed from the system.
         * @param volume a &#35;GVolume that was removed.
        */
        void onVolumeRemoved(@Nonnull Volume volume);
    }
    
    private static com.sun.jna.Callback toOnVolumeRemoved(OnVolumeRemoved in) {
        return (in == null) ? null: (JnaVolumeMonitor.OnVolumeRemoved) (__self, _volume, __data) -> in.onVolumeRemoved(new Volume(new PointerContainer(_volume)));
    }

    public VolumeMonitor(PointerContainer pointer) {
        super(pointer);
    }

    /**
     * Gets a list of drives connected to the system.
     * <br>
     * <br>The returned list should be freed with g_list_free(), after
     * <br>its elements have been unreffed with g_object_unref().
     * @return a &#35;GList of connected &#35;GDrive objects.
    */
    public ch.bailu.gtk.glib.List getConnectedDrives()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaVolumeMonitor.INST().g_volume_monitor_get_connected_drives(asCPointer())));
    }

    /**
     * Finds a &#35;GMount object by its UUID (see g_mount_get_uuid())
     * @param uuid the UUID to look for
     * @return a &#35;GMount or %NULL if no such mount is available.     Free the returned object with g_object_unref().
    */
    public Mount getMountForUuid(@Nonnull ch.bailu.gtk.type.Str uuid)  {
        return new Mount(new PointerContainer(JnaVolumeMonitor.INST().g_volume_monitor_get_mount_for_uuid(asCPointer(), asCPointerNotNull(uuid))));
    }

    /**
     * Finds a &#35;GMount object by its UUID (see g_mount_get_uuid())
     * @param uuid the UUID to look for
     * @return a &#35;GMount or %NULL if no such mount is available.     Free the returned object with g_object_unref().
    */
    public Mount getMountForUuid(String uuid)  {
        return new Mount(new PointerContainer(JnaVolumeMonitor.INST().g_volume_monitor_get_mount_for_uuid(asCPointer(), uuid)));
    }

    /**
     * Gets a list of the mounts on the system.
     * <br>
     * <br>The returned list should be freed with g_list_free(), after
     * <br>its elements have been unreffed with g_object_unref().
     * @return a &#35;GList of &#35;GMount objects.
    */
    public ch.bailu.gtk.glib.List getMounts()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaVolumeMonitor.INST().g_volume_monitor_get_mounts(asCPointer())));
    }

    /**
     * Finds a &#35;GVolume object by its UUID (see g_volume_get_uuid())
     * @param uuid the UUID to look for
     * @return a &#35;GVolume or %NULL if no such volume is available.     Free the returned object with g_object_unref().
    */
    public Volume getVolumeForUuid(@Nonnull ch.bailu.gtk.type.Str uuid)  {
        return new Volume(new PointerContainer(JnaVolumeMonitor.INST().g_volume_monitor_get_volume_for_uuid(asCPointer(), asCPointerNotNull(uuid))));
    }

    /**
     * Finds a &#35;GVolume object by its UUID (see g_volume_get_uuid())
     * @param uuid the UUID to look for
     * @return a &#35;GVolume or %NULL if no such volume is available.     Free the returned object with g_object_unref().
    */
    public Volume getVolumeForUuid(String uuid)  {
        return new Volume(new PointerContainer(JnaVolumeMonitor.INST().g_volume_monitor_get_volume_for_uuid(asCPointer(), uuid)));
    }

    /**
     * Gets a list of the volumes on the system.
     * <br>
     * <br>The returned list should be freed with g_list_free(), after
     * <br>its elements have been unreffed with g_object_unref().
     * @return a &#35;GList of &#35;GVolume objects.
    */
    public ch.bailu.gtk.glib.List getVolumes()  {
        return new ch.bailu.gtk.glib.List(new PointerContainer(JnaVolumeMonitor.INST().g_volume_monitor_get_volumes(asCPointer())));
    }

    public final static String SIGNAL_ON_DRIVE_CHANGED = "drive-changed";
    
    /**
     * Connect to signal "drive-changed".
     * <br>See {@link OnDriveChanged#onDriveChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRIVE_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDriveChanged(OnDriveChanged signal) {
        return connectSignal(SIGNAL_ON_DRIVE_CHANGED, toOnDriveChanged(signal));
    }

    public final static String SIGNAL_ON_DRIVE_CONNECTED = "drive-connected";
    
    /**
     * Connect to signal "drive-connected".
     * <br>See {@link OnDriveConnected#onDriveConnected} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRIVE_CONNECTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDriveConnected(OnDriveConnected signal) {
        return connectSignal(SIGNAL_ON_DRIVE_CONNECTED, toOnDriveConnected(signal));
    }

    public final static String SIGNAL_ON_DRIVE_DISCONNECTED = "drive-disconnected";
    
    /**
     * Connect to signal "drive-disconnected".
     * <br>See {@link OnDriveDisconnected#onDriveDisconnected} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRIVE_DISCONNECTED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDriveDisconnected(OnDriveDisconnected signal) {
        return connectSignal(SIGNAL_ON_DRIVE_DISCONNECTED, toOnDriveDisconnected(signal));
    }

    public final static String SIGNAL_ON_DRIVE_EJECT_BUTTON = "drive-eject-button";
    
    /**
     * Connect to signal "drive-eject-button".
     * <br>See {@link OnDriveEjectButton#onDriveEjectButton} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRIVE_EJECT_BUTTON} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDriveEjectButton(OnDriveEjectButton signal) {
        return connectSignal(SIGNAL_ON_DRIVE_EJECT_BUTTON, toOnDriveEjectButton(signal));
    }

    public final static String SIGNAL_ON_DRIVE_STOP_BUTTON = "drive-stop-button";
    
    /**
     * Connect to signal "drive-stop-button".
     * <br>See {@link OnDriveStopButton#onDriveStopButton} for signal description.
     * <br>Field {@link #SIGNAL_ON_DRIVE_STOP_BUTTON} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onDriveStopButton(OnDriveStopButton signal) {
        return connectSignal(SIGNAL_ON_DRIVE_STOP_BUTTON, toOnDriveStopButton(signal));
    }

    public final static String SIGNAL_ON_MOUNT_ADDED = "mount-added";
    
    /**
     * Connect to signal "mount-added".
     * <br>See {@link OnMountAdded#onMountAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOUNT_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMountAdded(OnMountAdded signal) {
        return connectSignal(SIGNAL_ON_MOUNT_ADDED, toOnMountAdded(signal));
    }

    public final static String SIGNAL_ON_MOUNT_CHANGED = "mount-changed";
    
    /**
     * Connect to signal "mount-changed".
     * <br>See {@link OnMountChanged#onMountChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOUNT_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMountChanged(OnMountChanged signal) {
        return connectSignal(SIGNAL_ON_MOUNT_CHANGED, toOnMountChanged(signal));
    }

    public final static String SIGNAL_ON_MOUNT_PRE_UNMOUNT = "mount-pre-unmount";
    
    /**
     * Connect to signal "mount-pre-unmount".
     * <br>See {@link OnMountPreUnmount#onMountPreUnmount} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOUNT_PRE_UNMOUNT} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMountPreUnmount(OnMountPreUnmount signal) {
        return connectSignal(SIGNAL_ON_MOUNT_PRE_UNMOUNT, toOnMountPreUnmount(signal));
    }

    public final static String SIGNAL_ON_MOUNT_REMOVED = "mount-removed";
    
    /**
     * Connect to signal "mount-removed".
     * <br>See {@link OnMountRemoved#onMountRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_MOUNT_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onMountRemoved(OnMountRemoved signal) {
        return connectSignal(SIGNAL_ON_MOUNT_REMOVED, toOnMountRemoved(signal));
    }

    public final static String SIGNAL_ON_VOLUME_ADDED = "volume-added";
    
    /**
     * Connect to signal "volume-added".
     * <br>See {@link OnVolumeAdded#onVolumeAdded} for signal description.
     * <br>Field {@link #SIGNAL_ON_VOLUME_ADDED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onVolumeAdded(OnVolumeAdded signal) {
        return connectSignal(SIGNAL_ON_VOLUME_ADDED, toOnVolumeAdded(signal));
    }

    public final static String SIGNAL_ON_VOLUME_CHANGED = "volume-changed";
    
    /**
     * Connect to signal "volume-changed".
     * <br>See {@link OnVolumeChanged#onVolumeChanged} for signal description.
     * <br>Field {@link #SIGNAL_ON_VOLUME_CHANGED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onVolumeChanged(OnVolumeChanged signal) {
        return connectSignal(SIGNAL_ON_VOLUME_CHANGED, toOnVolumeChanged(signal));
    }

    public final static String SIGNAL_ON_VOLUME_REMOVED = "volume-removed";
    
    /**
     * Connect to signal "volume-removed".
     * <br>See {@link OnVolumeRemoved#onVolumeRemoved} for signal description.
     * <br>Field {@link #SIGNAL_ON_VOLUME_REMOVED} contains original signal name and can be used as resource reference.
     * <br>
     * @param signal callback function (lambda).
     * @return {@link ch.bailu.gtk.lib.handler.SignalHandler}. Can be used to disconnect signal and to release callback function.
    */
    public ch.bailu.gtk.lib.handler.SignalHandler onVolumeRemoved(OnVolumeRemoved signal) {
        return connectSignal(SIGNAL_ON_VOLUME_REMOVED, toOnVolumeRemoved(signal));
    }

    /**
     * Gets the volume monitor used by gio.
     * @return a reference to the &#35;GVolumeMonitor used by gio. Call    g_object_unref() when done with it.
    */
    public static VolumeMonitor get()  {
        return new VolumeMonitor(new PointerContainer(JnaVolumeMonitor.INST().g_volume_monitor_get()));
    }

    public static long getTypeID() { 
        return JnaVolumeMonitor.INST().g_volume_monitor_get_type(); 
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

[MethodModel:cb-deprecated:adoptOrphanMount:[ParameterModel:Supported:{Gg:Volume:{c:GVolume*}}:{j:long}]]
        [ParameterModel:Supported:{Gg:Mount:{c:GMount*}}:{j:long}]
*/
