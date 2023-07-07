/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaVolumeMonitor {

    @FunctionalInterface
    public interface OnDriveChanged extends com.sun.jna.Callback {
        void invoke(long _self, long drive, long _data);
    }

    @FunctionalInterface
    public interface OnDriveConnected extends com.sun.jna.Callback {
        void invoke(long _self, long drive, long _data);
    }

    @FunctionalInterface
    public interface OnDriveDisconnected extends com.sun.jna.Callback {
        void invoke(long _self, long drive, long _data);
    }

    @FunctionalInterface
    public interface OnDriveEjectButton extends com.sun.jna.Callback {
        void invoke(long _self, long drive, long _data);
    }

    @FunctionalInterface
    public interface OnDriveStopButton extends com.sun.jna.Callback {
        void invoke(long _self, long drive, long _data);
    }

    @FunctionalInterface
    public interface OnMountAdded extends com.sun.jna.Callback {
        void invoke(long _self, long mount, long _data);
    }

    @FunctionalInterface
    public interface OnMountChanged extends com.sun.jna.Callback {
        void invoke(long _self, long mount, long _data);
    }

    @FunctionalInterface
    public interface OnMountPreUnmount extends com.sun.jna.Callback {
        void invoke(long _self, long mount, long _data);
    }

    @FunctionalInterface
    public interface OnMountRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long mount, long _data);
    }

    @FunctionalInterface
    public interface OnVolumeAdded extends com.sun.jna.Callback {
        void invoke(long _self, long volume, long _data);
    }

    @FunctionalInterface
    public interface OnVolumeChanged extends com.sun.jna.Callback {
        void invoke(long _self, long volume, long _data);
    }

    @FunctionalInterface
    public interface OnVolumeRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long volume, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_volume_monitor_get_connected_drives(long _self);
        long g_volume_monitor_get_mount_for_uuid(long _self, long uuid);
        long g_volume_monitor_get_mount_for_uuid(long _self, String uuid);
        long g_volume_monitor_get_mounts(long _self);
        long g_volume_monitor_get_volume_for_uuid(long _self, long uuid);
        long g_volume_monitor_get_volume_for_uuid(long _self, String uuid);
        long g_volume_monitor_get_volumes(long _self);
        long g_volume_monitor_get();
        long g_volume_monitor_get_type();
    }

}
