/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaVolumeIface {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long volume);
    }

    @FunctionalInterface
    public interface OnRemoved extends com.sun.jna.Callback {
        void invoke(long volume);
    }

    @FunctionalInterface
    public interface OnGetName extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    @FunctionalInterface
    public interface OnGetIcon extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    @FunctionalInterface
    public interface OnGetUuid extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    @FunctionalInterface
    public interface OnGetDrive extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    @FunctionalInterface
    public interface OnGetMount extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    @FunctionalInterface
    public interface OnCanMount extends com.sun.jna.Callback {
        boolean invoke(long volume);
    }

    @FunctionalInterface
    public interface OnCanEject extends com.sun.jna.Callback {
        boolean invoke(long volume);
    }

    @FunctionalInterface
    public interface OnMountFn extends com.sun.jna.Callback {
        void invoke(long volume, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnMountFinish extends com.sun.jna.Callback {
        boolean invoke(long volume, long result, long _error);
    }

    @FunctionalInterface
    public interface OnEject extends com.sun.jna.Callback {
        void invoke(long volume, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnEjectFinish extends com.sun.jna.Callback {
        boolean invoke(long volume, long result, long _error);
    }

    @FunctionalInterface
    public interface OnGetIdentifier extends com.sun.jna.Callback {
        long invoke(long volume, long kind);
    }

    @FunctionalInterface
    public interface OnEnumerateIdentifiers extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    @FunctionalInterface
    public interface OnShouldAutomount extends com.sun.jna.Callback {
        boolean invoke(long volume);
    }

    @FunctionalInterface
    public interface OnGetActivationRoot extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    @FunctionalInterface
    public interface OnEjectWithOperation extends com.sun.jna.Callback {
        void invoke(long volume, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnEjectWithOperationFinish extends com.sun.jna.Callback {
        boolean invoke(long volume, long result, long _error);
    }

    @FunctionalInterface
    public interface OnGetSortKey extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    @FunctionalInterface
    public interface OnGetSymbolicIcon extends com.sun.jna.Callback {
        long invoke(long volume);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("VolumeIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({VolumeIface.G_IFACE, VolumeIface.CHANGED, VolumeIface.REMOVED, VolumeIface.GET_NAME, VolumeIface.GET_ICON, VolumeIface.GET_UUID, VolumeIface.GET_DRIVE, VolumeIface.GET_MOUNT, VolumeIface.CAN_MOUNT, VolumeIface.CAN_EJECT, VolumeIface.MOUNT_FN, VolumeIface.MOUNT_FINISH, VolumeIface.EJECT, VolumeIface.EJECT_FINISH, VolumeIface.GET_IDENTIFIER, VolumeIface.ENUMERATE_IDENTIFIERS, VolumeIface.SHOULD_AUTOMOUNT, VolumeIface.GET_ACTIVATION_ROOT, VolumeIface.EJECT_WITH_OPERATION, VolumeIface.EJECT_WITH_OPERATION_FINISH, VolumeIface.GET_SORT_KEY, VolumeIface.GET_SYMBOLIC_ICON})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnChanged changed;
        public OnRemoved removed;
        public OnGetName get_name;
        public OnGetIcon get_icon;
        public OnGetUuid get_uuid;
        public OnGetDrive get_drive;
        public OnGetMount get_mount;
        public OnCanMount can_mount;
        public OnCanEject can_eject;
        public OnMountFn mount_fn;
        public OnMountFinish mount_finish;
        public OnEject eject;
        public OnEjectFinish eject_finish;
        public OnGetIdentifier get_identifier;
        public OnEnumerateIdentifiers enumerate_identifiers;
        public OnShouldAutomount should_automount;
        public OnGetActivationRoot get_activation_root;
        public OnEjectWithOperation eject_with_operation;
        public OnEjectWithOperationFinish eject_with_operation_finish;
        public OnGetSortKey get_sort_key;
        public OnGetSymbolicIcon get_symbolic_icon;
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
