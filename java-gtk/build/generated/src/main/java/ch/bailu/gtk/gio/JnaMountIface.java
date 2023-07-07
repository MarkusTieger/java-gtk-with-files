/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMountIface {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long mount);
    }

    @FunctionalInterface
    public interface OnUnmounted extends com.sun.jna.Callback {
        void invoke(long mount);
    }

    @FunctionalInterface
    public interface OnGetRoot extends com.sun.jna.Callback {
        long invoke(long mount);
    }

    @FunctionalInterface
    public interface OnGetName extends com.sun.jna.Callback {
        long invoke(long mount);
    }

    @FunctionalInterface
    public interface OnGetIcon extends com.sun.jna.Callback {
        long invoke(long mount);
    }

    @FunctionalInterface
    public interface OnGetUuid extends com.sun.jna.Callback {
        long invoke(long mount);
    }

    @FunctionalInterface
    public interface OnGetVolume extends com.sun.jna.Callback {
        long invoke(long mount);
    }

    @FunctionalInterface
    public interface OnGetDrive extends com.sun.jna.Callback {
        long invoke(long mount);
    }

    @FunctionalInterface
    public interface OnCanUnmount extends com.sun.jna.Callback {
        boolean invoke(long mount);
    }

    @FunctionalInterface
    public interface OnCanEject extends com.sun.jna.Callback {
        boolean invoke(long mount);
    }

    @FunctionalInterface
    public interface OnUnmount extends com.sun.jna.Callback {
        void invoke(long mount, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnUnmountFinish extends com.sun.jna.Callback {
        boolean invoke(long mount, long result, long _error);
    }

    @FunctionalInterface
    public interface OnEject extends com.sun.jna.Callback {
        void invoke(long mount, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnEjectFinish extends com.sun.jna.Callback {
        boolean invoke(long mount, long result, long _error);
    }

    @FunctionalInterface
    public interface OnRemount extends com.sun.jna.Callback {
        void invoke(long mount, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnRemountFinish extends com.sun.jna.Callback {
        boolean invoke(long mount, long result, long _error);
    }

    @FunctionalInterface
    public interface OnGuessContentType extends com.sun.jna.Callback {
        void invoke(long mount, boolean force_rescan, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("MountIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({MountIface.G_IFACE, MountIface.CHANGED, MountIface.UNMOUNTED, MountIface.GET_ROOT, MountIface.GET_NAME, MountIface.GET_ICON, MountIface.GET_UUID, MountIface.GET_VOLUME, MountIface.GET_DRIVE, MountIface.CAN_UNMOUNT, MountIface.CAN_EJECT, MountIface.UNMOUNT, MountIface.UNMOUNT_FINISH, MountIface.EJECT, MountIface.EJECT_FINISH, MountIface.REMOUNT, MountIface.REMOUNT_FINISH, MountIface.GUESS_CONTENT_TYPE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnChanged changed;
        public OnUnmounted unmounted;
        public OnGetRoot get_root;
        public OnGetName get_name;
        public OnGetIcon get_icon;
        public OnGetUuid get_uuid;
        public OnGetVolume get_volume;
        public OnGetDrive get_drive;
        public OnCanUnmount can_unmount;
        public OnCanEject can_eject;
        public OnUnmount unmount;
        public OnUnmountFinish unmount_finish;
        public OnEject eject;
        public OnEjectFinish eject_finish;
        public OnRemount remount;
        public OnRemountFinish remount_finish;
        public OnGuessContentType guess_content_type;
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
