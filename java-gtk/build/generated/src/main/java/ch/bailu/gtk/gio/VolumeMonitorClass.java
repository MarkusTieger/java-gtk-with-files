/* this file is machine generated */
package ch.bailu.gtk.gio;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import ch.bailu.gtk.type.Str;
import ch.bailu.gtk.type.PointerContainer;


/**
 * 
 * <p><a href="https://docs.gtk.org/gio/struct.VolumeMonitorClass.html">https://docs.gtk.org/gio/struct.VolumeMonitorClass.html</a></p>
*/
public class VolumeMonitorClass extends ch.bailu.gtk.type.Record {
    public static ch.bailu.gtk.lib.handler.ClassHandler getClassHandler() {
        return ch.bailu.gtk.lib.handler.ClassHandler.get(VolumeMonitorClass.class.getCanonicalName());
    }

    @FunctionalInterface
    public interface OnVolumeAdded {
        /**
         * 
         * @param volume_monitor 
         * @param volume 
        */
        void onVolumeAdded(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Volume volume);
    }
    
    private static JnaVolumeMonitorClass.OnVolumeAdded toOnVolumeAdded(ch.bailu.gtk.type.Pointer instance, String methodName, OnVolumeAdded in) {
        JnaVolumeMonitorClass.OnVolumeAdded out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _volume) -> in.onVolumeAdded(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Volume(new PointerContainer(_volume)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnVolumeRemoved {
        /**
         * 
         * @param volume_monitor 
         * @param volume 
        */
        void onVolumeRemoved(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Volume volume);
    }
    
    private static JnaVolumeMonitorClass.OnVolumeRemoved toOnVolumeRemoved(ch.bailu.gtk.type.Pointer instance, String methodName, OnVolumeRemoved in) {
        JnaVolumeMonitorClass.OnVolumeRemoved out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _volume) -> in.onVolumeRemoved(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Volume(new PointerContainer(_volume)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnVolumeChanged {
        /**
         * 
         * @param volume_monitor 
         * @param volume 
        */
        void onVolumeChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Volume volume);
    }
    
    private static JnaVolumeMonitorClass.OnVolumeChanged toOnVolumeChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnVolumeChanged in) {
        JnaVolumeMonitorClass.OnVolumeChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _volume) -> in.onVolumeChanged(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Volume(new PointerContainer(_volume)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMountAdded {
        /**
         * 
         * @param volume_monitor 
         * @param mount 
        */
        void onMountAdded(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Mount mount);
    }
    
    private static JnaVolumeMonitorClass.OnMountAdded toOnMountAdded(ch.bailu.gtk.type.Pointer instance, String methodName, OnMountAdded in) {
        JnaVolumeMonitorClass.OnMountAdded out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _mount) -> in.onMountAdded(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Mount(new PointerContainer(_mount)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMountRemoved {
        /**
         * 
         * @param volume_monitor 
         * @param mount 
        */
        void onMountRemoved(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Mount mount);
    }
    
    private static JnaVolumeMonitorClass.OnMountRemoved toOnMountRemoved(ch.bailu.gtk.type.Pointer instance, String methodName, OnMountRemoved in) {
        JnaVolumeMonitorClass.OnMountRemoved out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _mount) -> in.onMountRemoved(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Mount(new PointerContainer(_mount)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMountPreUnmount {
        /**
         * 
         * @param volume_monitor 
         * @param mount 
        */
        void onMountPreUnmount(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Mount mount);
    }
    
    private static JnaVolumeMonitorClass.OnMountPreUnmount toOnMountPreUnmount(ch.bailu.gtk.type.Pointer instance, String methodName, OnMountPreUnmount in) {
        JnaVolumeMonitorClass.OnMountPreUnmount out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _mount) -> in.onMountPreUnmount(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Mount(new PointerContainer(_mount)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnMountChanged {
        /**
         * 
         * @param volume_monitor 
         * @param mount 
        */
        void onMountChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Mount mount);
    }
    
    private static JnaVolumeMonitorClass.OnMountChanged toOnMountChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnMountChanged in) {
        JnaVolumeMonitorClass.OnMountChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _mount) -> in.onMountChanged(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Mount(new PointerContainer(_mount)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDriveConnected {
        /**
         * 
         * @param volume_monitor 
         * @param drive 
        */
        void onDriveConnected(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Drive drive);
    }
    
    private static JnaVolumeMonitorClass.OnDriveConnected toOnDriveConnected(ch.bailu.gtk.type.Pointer instance, String methodName, OnDriveConnected in) {
        JnaVolumeMonitorClass.OnDriveConnected out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _drive) -> in.onDriveConnected(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDriveDisconnected {
        /**
         * 
         * @param volume_monitor 
         * @param drive 
        */
        void onDriveDisconnected(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Drive drive);
    }
    
    private static JnaVolumeMonitorClass.OnDriveDisconnected toOnDriveDisconnected(ch.bailu.gtk.type.Pointer instance, String methodName, OnDriveDisconnected in) {
        JnaVolumeMonitorClass.OnDriveDisconnected out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _drive) -> in.onDriveDisconnected(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDriveChanged {
        /**
         * 
         * @param volume_monitor 
         * @param drive 
        */
        void onDriveChanged(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Drive drive);
    }
    
    private static JnaVolumeMonitorClass.OnDriveChanged toOnDriveChanged(ch.bailu.gtk.type.Pointer instance, String methodName, OnDriveChanged in) {
        JnaVolumeMonitorClass.OnDriveChanged out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _drive) -> in.onDriveChanged(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnIsSupported {
        /**
         * 
         * @return 
        */
        boolean onIsSupported(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaVolumeMonitorClass.OnIsSupported toOnIsSupported(ch.bailu.gtk.type.Pointer instance, String methodName, OnIsSupported in) {
        JnaVolumeMonitorClass.OnIsSupported out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onIsSupported(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetConnectedDrives {
        /**
         * 
         * @param volume_monitor a &#35;GVolumeMonitor.
         * @return a &#35;GList of connected &#35;GDrive objects.
        */
        ch.bailu.gtk.glib.List onGetConnectedDrives(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor);
    }
    
    private static JnaVolumeMonitorClass.OnGetConnectedDrives toOnGetConnectedDrives(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetConnectedDrives in) {
        JnaVolumeMonitorClass.OnGetConnectedDrives out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor) -> in.onGetConnectedDrives(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetVolumes {
        /**
         * 
         * @param volume_monitor a &#35;GVolumeMonitor.
         * @return a &#35;GList of &#35;GVolume objects.
        */
        ch.bailu.gtk.glib.List onGetVolumes(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor);
    }
    
    private static JnaVolumeMonitorClass.OnGetVolumes toOnGetVolumes(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetVolumes in) {
        JnaVolumeMonitorClass.OnGetVolumes out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor) -> in.onGetVolumes(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetMounts {
        /**
         * 
         * @param volume_monitor a &#35;GVolumeMonitor.
         * @return a &#35;GList of &#35;GMount objects.
        */
        ch.bailu.gtk.glib.List onGetMounts(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor);
    }
    
    private static JnaVolumeMonitorClass.OnGetMounts toOnGetMounts(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetMounts in) {
        JnaVolumeMonitorClass.OnGetMounts out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor) -> in.onGetMounts(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetVolumeForUuid {
        /**
         * 
         * @param volume_monitor a &#35;GVolumeMonitor.
         * @param uuid the UUID to look for
         * @return a &#35;GVolume or %NULL if no such volume is available.     Free the returned object with g_object_unref().
        */
        Volume onGetVolumeForUuid(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull ch.bailu.gtk.type.Str uuid);
    }
    
    private static JnaVolumeMonitorClass.OnGetVolumeForUuid toOnGetVolumeForUuid(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetVolumeForUuid in) {
        JnaVolumeMonitorClass.OnGetVolumeForUuid out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _uuid) -> in.onGetVolumeForUuid(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new ch.bailu.gtk.type.Str(new PointerContainer(_uuid))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGetMountForUuid {
        /**
         * 
         * @param volume_monitor a &#35;GVolumeMonitor.
         * @param uuid the UUID to look for
         * @return a &#35;GMount or %NULL if no such mount is available.     Free the returned object with g_object_unref().
        */
        Mount onGetMountForUuid(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull ch.bailu.gtk.type.Str uuid);
    }
    
    private static JnaVolumeMonitorClass.OnGetMountForUuid toOnGetMountForUuid(ch.bailu.gtk.type.Pointer instance, String methodName, OnGetMountForUuid in) {
        JnaVolumeMonitorClass.OnGetMountForUuid out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _uuid) -> in.onGetMountForUuid(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new ch.bailu.gtk.type.Str(new PointerContainer(_uuid))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnAdoptOrphanMount {
        /**
         * 
         * @param mount 
         * @param volume_monitor 
         * @return 
        */
        Volume onAdoptOrphanMount(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull Mount mount, @Nonnull VolumeMonitor volume_monitor);
    }
    
    private static JnaVolumeMonitorClass.OnAdoptOrphanMount toOnAdoptOrphanMount(ch.bailu.gtk.type.Pointer instance, String methodName, OnAdoptOrphanMount in) {
        JnaVolumeMonitorClass.OnAdoptOrphanMount out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_mount, _volume_monitor) -> in.onAdoptOrphanMount(__callback, new Mount(new PointerContainer(_mount)), new VolumeMonitor(new PointerContainer(_volume_monitor))).asCPointer();
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDriveEjectButton {
        /**
         * 
         * @param volume_monitor 
         * @param drive 
        */
        void onDriveEjectButton(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Drive drive);
    }
    
    private static JnaVolumeMonitorClass.OnDriveEjectButton toOnDriveEjectButton(ch.bailu.gtk.type.Pointer instance, String methodName, OnDriveEjectButton in) {
        JnaVolumeMonitorClass.OnDriveEjectButton out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _drive) -> in.onDriveEjectButton(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnDriveStopButton {
        /**
         * 
         * @param volume_monitor 
         * @param drive 
        */
        void onDriveStopButton(ch.bailu.gtk.lib.handler.CallbackHandler __self, @Nonnull VolumeMonitor volume_monitor, @Nonnull Drive drive);
    }
    
    private static JnaVolumeMonitorClass.OnDriveStopButton toOnDriveStopButton(ch.bailu.gtk.type.Pointer instance, String methodName, OnDriveStopButton in) {
        JnaVolumeMonitorClass.OnDriveStopButton out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = (_volume_monitor, _drive) -> in.onDriveStopButton(__callback, new VolumeMonitor(new PointerContainer(_volume_monitor)), new Drive(new PointerContainer(_drive)));
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved1 {
        void onGReserved1(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaVolumeMonitorClass.OnGReserved1 toOnGReserved1(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved1 in) {
        JnaVolumeMonitorClass.OnGReserved1 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved1(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved2 {
        void onGReserved2(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaVolumeMonitorClass.OnGReserved2 toOnGReserved2(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved2 in) {
        JnaVolumeMonitorClass.OnGReserved2 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved2(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved3 {
        void onGReserved3(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaVolumeMonitorClass.OnGReserved3 toOnGReserved3(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved3 in) {
        JnaVolumeMonitorClass.OnGReserved3 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved3(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved4 {
        void onGReserved4(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaVolumeMonitorClass.OnGReserved4 toOnGReserved4(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved4 in) {
        JnaVolumeMonitorClass.OnGReserved4 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved4(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved5 {
        void onGReserved5(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaVolumeMonitorClass.OnGReserved5 toOnGReserved5(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved5 in) {
        JnaVolumeMonitorClass.OnGReserved5 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved5(__callback);
            __callback.register(out);
        }
        return out;
    }

    @FunctionalInterface
    public interface OnGReserved6 {
        void onGReserved6(ch.bailu.gtk.lib.handler.CallbackHandler __self);
    }
    
    private static JnaVolumeMonitorClass.OnGReserved6 toOnGReserved6(ch.bailu.gtk.type.Pointer instance, String methodName, OnGReserved6 in) {
        JnaVolumeMonitorClass.OnGReserved6 out = null;
        if (in != null) {
            ch.bailu.gtk.lib.handler.CallbackHandler __callback = new ch.bailu.gtk.lib.handler.CallbackHandler(instance, methodName);
            out = () -> in.onGReserved6(__callback);
            __callback.register(out);
        }
        return out;
    }

    public VolumeMonitorClass(PointerContainer pointer) {
        super(pointer);
    }

    public VolumeMonitorClass() {
        super(cast(JnaVolumeMonitorClass.allocateStructure()));
    }

    private JnaVolumeMonitorClass.Fields _fields;
    
    JnaVolumeMonitorClass.Fields toFields() {
        if (_fields == null) {
            _fields = new JnaVolumeMonitorClass.Fields(asCPointer());
        }
        return _fields;
    }

    /**
     * 
     * <br>Private field: direct-type
    */
    public static final String PARENT_CLASS = "parent_class";

    /**
     * 
     * <br>See {@link OnVolumeAdded#onVolumeAdded}
    */
    public static final String VOLUME_ADDED = "volume_added";

    /**
     * 
     * <br>See {@link OnVolumeAdded#onVolumeAdded}
    */
    public void setFieldVolumeAdded(OnVolumeAdded volume_added) {
        toFields().volume_added = toOnVolumeAdded(this, VOLUME_ADDED, volume_added);
        toFields().writeField(VOLUME_ADDED);
    }

    /**
     * 
     * <br>See {@link OnVolumeAdded#onVolumeAdded}
    */
    public JnaVolumeMonitorClass.OnVolumeAdded getFieldVolumeAdded() {
       toFields().readField(VOLUME_ADDED);
       return toFields().volume_added;
    } 

    /**
     * 
     * <br>See {@link OnVolumeRemoved#onVolumeRemoved}
    */
    public static final String VOLUME_REMOVED = "volume_removed";

    /**
     * 
     * <br>See {@link OnVolumeRemoved#onVolumeRemoved}
    */
    public void setFieldVolumeRemoved(OnVolumeRemoved volume_removed) {
        toFields().volume_removed = toOnVolumeRemoved(this, VOLUME_REMOVED, volume_removed);
        toFields().writeField(VOLUME_REMOVED);
    }

    /**
     * 
     * <br>See {@link OnVolumeRemoved#onVolumeRemoved}
    */
    public JnaVolumeMonitorClass.OnVolumeRemoved getFieldVolumeRemoved() {
       toFields().readField(VOLUME_REMOVED);
       return toFields().volume_removed;
    } 

    /**
     * 
     * <br>See {@link OnVolumeChanged#onVolumeChanged}
    */
    public static final String VOLUME_CHANGED = "volume_changed";

    /**
     * 
     * <br>See {@link OnVolumeChanged#onVolumeChanged}
    */
    public void setFieldVolumeChanged(OnVolumeChanged volume_changed) {
        toFields().volume_changed = toOnVolumeChanged(this, VOLUME_CHANGED, volume_changed);
        toFields().writeField(VOLUME_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnVolumeChanged#onVolumeChanged}
    */
    public JnaVolumeMonitorClass.OnVolumeChanged getFieldVolumeChanged() {
       toFields().readField(VOLUME_CHANGED);
       return toFields().volume_changed;
    } 

    /**
     * 
     * <br>See {@link OnMountAdded#onMountAdded}
    */
    public static final String MOUNT_ADDED = "mount_added";

    /**
     * 
     * <br>See {@link OnMountAdded#onMountAdded}
    */
    public void setFieldMountAdded(OnMountAdded mount_added) {
        toFields().mount_added = toOnMountAdded(this, MOUNT_ADDED, mount_added);
        toFields().writeField(MOUNT_ADDED);
    }

    /**
     * 
     * <br>See {@link OnMountAdded#onMountAdded}
    */
    public JnaVolumeMonitorClass.OnMountAdded getFieldMountAdded() {
       toFields().readField(MOUNT_ADDED);
       return toFields().mount_added;
    } 

    /**
     * 
     * <br>See {@link OnMountRemoved#onMountRemoved}
    */
    public static final String MOUNT_REMOVED = "mount_removed";

    /**
     * 
     * <br>See {@link OnMountRemoved#onMountRemoved}
    */
    public void setFieldMountRemoved(OnMountRemoved mount_removed) {
        toFields().mount_removed = toOnMountRemoved(this, MOUNT_REMOVED, mount_removed);
        toFields().writeField(MOUNT_REMOVED);
    }

    /**
     * 
     * <br>See {@link OnMountRemoved#onMountRemoved}
    */
    public JnaVolumeMonitorClass.OnMountRemoved getFieldMountRemoved() {
       toFields().readField(MOUNT_REMOVED);
       return toFields().mount_removed;
    } 

    /**
     * 
     * <br>See {@link OnMountPreUnmount#onMountPreUnmount}
    */
    public static final String MOUNT_PRE_UNMOUNT = "mount_pre_unmount";

    /**
     * 
     * <br>See {@link OnMountPreUnmount#onMountPreUnmount}
    */
    public void setFieldMountPreUnmount(OnMountPreUnmount mount_pre_unmount) {
        toFields().mount_pre_unmount = toOnMountPreUnmount(this, MOUNT_PRE_UNMOUNT, mount_pre_unmount);
        toFields().writeField(MOUNT_PRE_UNMOUNT);
    }

    /**
     * 
     * <br>See {@link OnMountPreUnmount#onMountPreUnmount}
    */
    public JnaVolumeMonitorClass.OnMountPreUnmount getFieldMountPreUnmount() {
       toFields().readField(MOUNT_PRE_UNMOUNT);
       return toFields().mount_pre_unmount;
    } 

    /**
     * 
     * <br>See {@link OnMountChanged#onMountChanged}
    */
    public static final String MOUNT_CHANGED = "mount_changed";

    /**
     * 
     * <br>See {@link OnMountChanged#onMountChanged}
    */
    public void setFieldMountChanged(OnMountChanged mount_changed) {
        toFields().mount_changed = toOnMountChanged(this, MOUNT_CHANGED, mount_changed);
        toFields().writeField(MOUNT_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnMountChanged#onMountChanged}
    */
    public JnaVolumeMonitorClass.OnMountChanged getFieldMountChanged() {
       toFields().readField(MOUNT_CHANGED);
       return toFields().mount_changed;
    } 

    /**
     * 
     * <br>See {@link OnDriveConnected#onDriveConnected}
    */
    public static final String DRIVE_CONNECTED = "drive_connected";

    /**
     * 
     * <br>See {@link OnDriveConnected#onDriveConnected}
    */
    public void setFieldDriveConnected(OnDriveConnected drive_connected) {
        toFields().drive_connected = toOnDriveConnected(this, DRIVE_CONNECTED, drive_connected);
        toFields().writeField(DRIVE_CONNECTED);
    }

    /**
     * 
     * <br>See {@link OnDriveConnected#onDriveConnected}
    */
    public JnaVolumeMonitorClass.OnDriveConnected getFieldDriveConnected() {
       toFields().readField(DRIVE_CONNECTED);
       return toFields().drive_connected;
    } 

    /**
     * 
     * <br>See {@link OnDriveDisconnected#onDriveDisconnected}
    */
    public static final String DRIVE_DISCONNECTED = "drive_disconnected";

    /**
     * 
     * <br>See {@link OnDriveDisconnected#onDriveDisconnected}
    */
    public void setFieldDriveDisconnected(OnDriveDisconnected drive_disconnected) {
        toFields().drive_disconnected = toOnDriveDisconnected(this, DRIVE_DISCONNECTED, drive_disconnected);
        toFields().writeField(DRIVE_DISCONNECTED);
    }

    /**
     * 
     * <br>See {@link OnDriveDisconnected#onDriveDisconnected}
    */
    public JnaVolumeMonitorClass.OnDriveDisconnected getFieldDriveDisconnected() {
       toFields().readField(DRIVE_DISCONNECTED);
       return toFields().drive_disconnected;
    } 

    /**
     * 
     * <br>See {@link OnDriveChanged#onDriveChanged}
    */
    public static final String DRIVE_CHANGED = "drive_changed";

    /**
     * 
     * <br>See {@link OnDriveChanged#onDriveChanged}
    */
    public void setFieldDriveChanged(OnDriveChanged drive_changed) {
        toFields().drive_changed = toOnDriveChanged(this, DRIVE_CHANGED, drive_changed);
        toFields().writeField(DRIVE_CHANGED);
    }

    /**
     * 
     * <br>See {@link OnDriveChanged#onDriveChanged}
    */
    public JnaVolumeMonitorClass.OnDriveChanged getFieldDriveChanged() {
       toFields().readField(DRIVE_CHANGED);
       return toFields().drive_changed;
    } 

    /**
     * 
     * <br>See {@link OnIsSupported#onIsSupported}
    */
    public static final String IS_SUPPORTED = "is_supported";

    /**
     * 
     * <br>See {@link OnIsSupported#onIsSupported}
    */
    public void setFieldIsSupported(OnIsSupported is_supported) {
        toFields().is_supported = toOnIsSupported(this, IS_SUPPORTED, is_supported);
        toFields().writeField(IS_SUPPORTED);
    }

    /**
     * 
     * <br>See {@link OnIsSupported#onIsSupported}
    */
    public JnaVolumeMonitorClass.OnIsSupported getFieldIsSupported() {
       toFields().readField(IS_SUPPORTED);
       return toFields().is_supported;
    } 

    /**
     * 
     * <br>See {@link OnGetConnectedDrives#onGetConnectedDrives}
    */
    public static final String GET_CONNECTED_DRIVES = "get_connected_drives";

    /**
     * 
     * <br>See {@link OnGetConnectedDrives#onGetConnectedDrives}
    */
    public void setFieldGetConnectedDrives(OnGetConnectedDrives get_connected_drives) {
        toFields().get_connected_drives = toOnGetConnectedDrives(this, GET_CONNECTED_DRIVES, get_connected_drives);
        toFields().writeField(GET_CONNECTED_DRIVES);
    }

    /**
     * 
     * <br>See {@link OnGetConnectedDrives#onGetConnectedDrives}
    */
    public JnaVolumeMonitorClass.OnGetConnectedDrives getFieldGetConnectedDrives() {
       toFields().readField(GET_CONNECTED_DRIVES);
       return toFields().get_connected_drives;
    } 

    /**
     * 
     * <br>See {@link OnGetVolumes#onGetVolumes}
    */
    public static final String GET_VOLUMES = "get_volumes";

    /**
     * 
     * <br>See {@link OnGetVolumes#onGetVolumes}
    */
    public void setFieldGetVolumes(OnGetVolumes get_volumes) {
        toFields().get_volumes = toOnGetVolumes(this, GET_VOLUMES, get_volumes);
        toFields().writeField(GET_VOLUMES);
    }

    /**
     * 
     * <br>See {@link OnGetVolumes#onGetVolumes}
    */
    public JnaVolumeMonitorClass.OnGetVolumes getFieldGetVolumes() {
       toFields().readField(GET_VOLUMES);
       return toFields().get_volumes;
    } 

    /**
     * 
     * <br>See {@link OnGetMounts#onGetMounts}
    */
    public static final String GET_MOUNTS = "get_mounts";

    /**
     * 
     * <br>See {@link OnGetMounts#onGetMounts}
    */
    public void setFieldGetMounts(OnGetMounts get_mounts) {
        toFields().get_mounts = toOnGetMounts(this, GET_MOUNTS, get_mounts);
        toFields().writeField(GET_MOUNTS);
    }

    /**
     * 
     * <br>See {@link OnGetMounts#onGetMounts}
    */
    public JnaVolumeMonitorClass.OnGetMounts getFieldGetMounts() {
       toFields().readField(GET_MOUNTS);
       return toFields().get_mounts;
    } 

    /**
     * 
     * <br>See {@link OnGetVolumeForUuid#onGetVolumeForUuid}
    */
    public static final String GET_VOLUME_FOR_UUID = "get_volume_for_uuid";

    /**
     * 
     * <br>See {@link OnGetVolumeForUuid#onGetVolumeForUuid}
    */
    public void setFieldGetVolumeForUuid(OnGetVolumeForUuid get_volume_for_uuid) {
        toFields().get_volume_for_uuid = toOnGetVolumeForUuid(this, GET_VOLUME_FOR_UUID, get_volume_for_uuid);
        toFields().writeField(GET_VOLUME_FOR_UUID);
    }

    /**
     * 
     * <br>See {@link OnGetVolumeForUuid#onGetVolumeForUuid}
    */
    public JnaVolumeMonitorClass.OnGetVolumeForUuid getFieldGetVolumeForUuid() {
       toFields().readField(GET_VOLUME_FOR_UUID);
       return toFields().get_volume_for_uuid;
    } 

    /**
     * 
     * <br>See {@link OnGetMountForUuid#onGetMountForUuid}
    */
    public static final String GET_MOUNT_FOR_UUID = "get_mount_for_uuid";

    /**
     * 
     * <br>See {@link OnGetMountForUuid#onGetMountForUuid}
    */
    public void setFieldGetMountForUuid(OnGetMountForUuid get_mount_for_uuid) {
        toFields().get_mount_for_uuid = toOnGetMountForUuid(this, GET_MOUNT_FOR_UUID, get_mount_for_uuid);
        toFields().writeField(GET_MOUNT_FOR_UUID);
    }

    /**
     * 
     * <br>See {@link OnGetMountForUuid#onGetMountForUuid}
    */
    public JnaVolumeMonitorClass.OnGetMountForUuid getFieldGetMountForUuid() {
       toFields().readField(GET_MOUNT_FOR_UUID);
       return toFields().get_mount_for_uuid;
    } 

    /**
     * 
     * <br>See {@link OnAdoptOrphanMount#onAdoptOrphanMount}
    */
    public static final String ADOPT_ORPHAN_MOUNT = "adopt_orphan_mount";

    /**
     * 
     * <br>See {@link OnAdoptOrphanMount#onAdoptOrphanMount}
    */
    public void setFieldAdoptOrphanMount(OnAdoptOrphanMount adopt_orphan_mount) {
        toFields().adopt_orphan_mount = toOnAdoptOrphanMount(this, ADOPT_ORPHAN_MOUNT, adopt_orphan_mount);
        toFields().writeField(ADOPT_ORPHAN_MOUNT);
    }

    /**
     * 
     * <br>See {@link OnAdoptOrphanMount#onAdoptOrphanMount}
    */
    public JnaVolumeMonitorClass.OnAdoptOrphanMount getFieldAdoptOrphanMount() {
       toFields().readField(ADOPT_ORPHAN_MOUNT);
       return toFields().adopt_orphan_mount;
    } 

    /**
     * 
     * <br>See {@link OnDriveEjectButton#onDriveEjectButton}
    */
    public static final String DRIVE_EJECT_BUTTON = "drive_eject_button";

    /**
     * 
     * <br>See {@link OnDriveEjectButton#onDriveEjectButton}
    */
    public void setFieldDriveEjectButton(OnDriveEjectButton drive_eject_button) {
        toFields().drive_eject_button = toOnDriveEjectButton(this, DRIVE_EJECT_BUTTON, drive_eject_button);
        toFields().writeField(DRIVE_EJECT_BUTTON);
    }

    /**
     * 
     * <br>See {@link OnDriveEjectButton#onDriveEjectButton}
    */
    public JnaVolumeMonitorClass.OnDriveEjectButton getFieldDriveEjectButton() {
       toFields().readField(DRIVE_EJECT_BUTTON);
       return toFields().drive_eject_button;
    } 

    /**
     * 
     * <br>See {@link OnDriveStopButton#onDriveStopButton}
    */
    public static final String DRIVE_STOP_BUTTON = "drive_stop_button";

    /**
     * 
     * <br>See {@link OnDriveStopButton#onDriveStopButton}
    */
    public void setFieldDriveStopButton(OnDriveStopButton drive_stop_button) {
        toFields().drive_stop_button = toOnDriveStopButton(this, DRIVE_STOP_BUTTON, drive_stop_button);
        toFields().writeField(DRIVE_STOP_BUTTON);
    }

    /**
     * 
     * <br>See {@link OnDriveStopButton#onDriveStopButton}
    */
    public JnaVolumeMonitorClass.OnDriveStopButton getFieldDriveStopButton() {
       toFields().readField(DRIVE_STOP_BUTTON);
       return toFields().drive_stop_button;
    } 

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public static final String _G_RESERVED1 = "_g_reserved1";

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public void setFieldGReserved1(OnGReserved1 _g_reserved1) {
        toFields()._g_reserved1 = toOnGReserved1(this, _G_RESERVED1, _g_reserved1);
        toFields().writeField(_G_RESERVED1);
    }

    /**
     * 
     * <br>See {@link OnGReserved1#onGReserved1}
    */
    public JnaVolumeMonitorClass.OnGReserved1 getFieldGReserved1() {
       toFields().readField(_G_RESERVED1);
       return toFields()._g_reserved1;
    } 

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public static final String _G_RESERVED2 = "_g_reserved2";

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public void setFieldGReserved2(OnGReserved2 _g_reserved2) {
        toFields()._g_reserved2 = toOnGReserved2(this, _G_RESERVED2, _g_reserved2);
        toFields().writeField(_G_RESERVED2);
    }

    /**
     * 
     * <br>See {@link OnGReserved2#onGReserved2}
    */
    public JnaVolumeMonitorClass.OnGReserved2 getFieldGReserved2() {
       toFields().readField(_G_RESERVED2);
       return toFields()._g_reserved2;
    } 

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public static final String _G_RESERVED3 = "_g_reserved3";

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public void setFieldGReserved3(OnGReserved3 _g_reserved3) {
        toFields()._g_reserved3 = toOnGReserved3(this, _G_RESERVED3, _g_reserved3);
        toFields().writeField(_G_RESERVED3);
    }

    /**
     * 
     * <br>See {@link OnGReserved3#onGReserved3}
    */
    public JnaVolumeMonitorClass.OnGReserved3 getFieldGReserved3() {
       toFields().readField(_G_RESERVED3);
       return toFields()._g_reserved3;
    } 

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public static final String _G_RESERVED4 = "_g_reserved4";

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public void setFieldGReserved4(OnGReserved4 _g_reserved4) {
        toFields()._g_reserved4 = toOnGReserved4(this, _G_RESERVED4, _g_reserved4);
        toFields().writeField(_G_RESERVED4);
    }

    /**
     * 
     * <br>See {@link OnGReserved4#onGReserved4}
    */
    public JnaVolumeMonitorClass.OnGReserved4 getFieldGReserved4() {
       toFields().readField(_G_RESERVED4);
       return toFields()._g_reserved4;
    } 

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public static final String _G_RESERVED5 = "_g_reserved5";

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public void setFieldGReserved5(OnGReserved5 _g_reserved5) {
        toFields()._g_reserved5 = toOnGReserved5(this, _G_RESERVED5, _g_reserved5);
        toFields().writeField(_G_RESERVED5);
    }

    /**
     * 
     * <br>See {@link OnGReserved5#onGReserved5}
    */
    public JnaVolumeMonitorClass.OnGReserved5 getFieldGReserved5() {
       toFields().readField(_G_RESERVED5);
       return toFields()._g_reserved5;
    } 

    /**
     * 
     * <br>See {@link OnGReserved6#onGReserved6}
    */
    public static final String _G_RESERVED6 = "_g_reserved6";

    /**
     * 
     * <br>See {@link OnGReserved6#onGReserved6}
    */
    public void setFieldGReserved6(OnGReserved6 _g_reserved6) {
        toFields()._g_reserved6 = toOnGReserved6(this, _G_RESERVED6, _g_reserved6);
        toFields().writeField(_G_RESERVED6);
    }

    /**
     * 
     * <br>See {@link OnGReserved6#onGReserved6}
    */
    public JnaVolumeMonitorClass.OnGReserved6 getFieldGReserved6() {
       toFields().readField(_G_RESERVED6);
       return toFields()._g_reserved6;
    } 

    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(VolumeMonitor.getTypeID());
    }
    
    public static ch.bailu.gtk.type.gobject.TypeSystem.TypeSize getParentTypeSize() {
        return ch.bailu.gtk.type.gobject.TypeSystem.getTypeSize(VolumeMonitor.getParentTypeID());
    }
    
    public static int getInstanceSize() {
        return getTypeSize().classSize;
    }

}

/*
record-type
all-fields-supported
*/
