/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaVolumeMonitorClass {

    @FunctionalInterface
    public interface OnVolumeAdded extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long volume);
    }

    @FunctionalInterface
    public interface OnVolumeRemoved extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long volume);
    }

    @FunctionalInterface
    public interface OnVolumeChanged extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long volume);
    }

    @FunctionalInterface
    public interface OnMountAdded extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long mount);
    }

    @FunctionalInterface
    public interface OnMountRemoved extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long mount);
    }

    @FunctionalInterface
    public interface OnMountPreUnmount extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long mount);
    }

    @FunctionalInterface
    public interface OnMountChanged extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long mount);
    }

    @FunctionalInterface
    public interface OnDriveConnected extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long drive);
    }

    @FunctionalInterface
    public interface OnDriveDisconnected extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long drive);
    }

    @FunctionalInterface
    public interface OnDriveChanged extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long drive);
    }

    @FunctionalInterface
    public interface OnIsSupported extends com.sun.jna.Callback {
        boolean invoke();
    }

    @FunctionalInterface
    public interface OnGetConnectedDrives extends com.sun.jna.Callback {
        long invoke(long volume_monitor);
    }

    @FunctionalInterface
    public interface OnGetVolumes extends com.sun.jna.Callback {
        long invoke(long volume_monitor);
    }

    @FunctionalInterface
    public interface OnGetMounts extends com.sun.jna.Callback {
        long invoke(long volume_monitor);
    }

    @FunctionalInterface
    public interface OnGetVolumeForUuid extends com.sun.jna.Callback {
        long invoke(long volume_monitor, long uuid);
    }

    @FunctionalInterface
    public interface OnGetMountForUuid extends com.sun.jna.Callback {
        long invoke(long volume_monitor, long uuid);
    }

    @FunctionalInterface
    public interface OnAdoptOrphanMount extends com.sun.jna.Callback {
        long invoke(long mount, long volume_monitor);
    }

    @FunctionalInterface
    public interface OnDriveEjectButton extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long drive);
    }

    @FunctionalInterface
    public interface OnDriveStopButton extends com.sun.jna.Callback {
        void invoke(long volume_monitor, long drive);
    }

    @FunctionalInterface
    public interface OnGReserved1 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved2 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved3 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved4 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved5 extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnGReserved6 extends com.sun.jna.Callback {
        void invoke();
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("VolumeMonitorClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({VolumeMonitorClass.PARENT_CLASS, VolumeMonitorClass.VOLUME_ADDED, VolumeMonitorClass.VOLUME_REMOVED, VolumeMonitorClass.VOLUME_CHANGED, VolumeMonitorClass.MOUNT_ADDED, VolumeMonitorClass.MOUNT_REMOVED, VolumeMonitorClass.MOUNT_PRE_UNMOUNT, VolumeMonitorClass.MOUNT_CHANGED, VolumeMonitorClass.DRIVE_CONNECTED, VolumeMonitorClass.DRIVE_DISCONNECTED, VolumeMonitorClass.DRIVE_CHANGED, VolumeMonitorClass.IS_SUPPORTED, VolumeMonitorClass.GET_CONNECTED_DRIVES, VolumeMonitorClass.GET_VOLUMES, VolumeMonitorClass.GET_MOUNTS, VolumeMonitorClass.GET_VOLUME_FOR_UUID, VolumeMonitorClass.GET_MOUNT_FOR_UUID, VolumeMonitorClass.ADOPT_ORPHAN_MOUNT, VolumeMonitorClass.DRIVE_EJECT_BUTTON, VolumeMonitorClass.DRIVE_STOP_BUTTON, VolumeMonitorClass._G_RESERVED1, VolumeMonitorClass._G_RESERVED2, VolumeMonitorClass._G_RESERVED3, VolumeMonitorClass._G_RESERVED4, VolumeMonitorClass._G_RESERVED5, VolumeMonitorClass._G_RESERVED6})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnVolumeAdded volume_added;
        public OnVolumeRemoved volume_removed;
        public OnVolumeChanged volume_changed;
        public OnMountAdded mount_added;
        public OnMountRemoved mount_removed;
        public OnMountPreUnmount mount_pre_unmount;
        public OnMountChanged mount_changed;
        public OnDriveConnected drive_connected;
        public OnDriveDisconnected drive_disconnected;
        public OnDriveChanged drive_changed;
        public OnIsSupported is_supported;
        public OnGetConnectedDrives get_connected_drives;
        public OnGetVolumes get_volumes;
        public OnGetMounts get_mounts;
        public OnGetVolumeForUuid get_volume_for_uuid;
        public OnGetMountForUuid get_mount_for_uuid;
        public OnAdoptOrphanMount adopt_orphan_mount;
        public OnDriveEjectButton drive_eject_button;
        public OnDriveStopButton drive_stop_button;
        public OnGReserved1 _g_reserved1;
        public OnGReserved2 _g_reserved2;
        public OnGReserved3 _g_reserved3;
        public OnGReserved4 _g_reserved4;
        public OnGReserved5 _g_reserved5;
        public OnGReserved6 _g_reserved6;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
    }

}
