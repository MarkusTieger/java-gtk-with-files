/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDriveIface {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long drive);
    }

    @FunctionalInterface
    public interface OnDisconnected extends com.sun.jna.Callback {
        void invoke(long drive);
    }

    @FunctionalInterface
    public interface OnEjectButton extends com.sun.jna.Callback {
        void invoke(long drive);
    }

    @FunctionalInterface
    public interface OnGetName extends com.sun.jna.Callback {
        long invoke(long drive);
    }

    @FunctionalInterface
    public interface OnGetIcon extends com.sun.jna.Callback {
        long invoke(long drive);
    }

    @FunctionalInterface
    public interface OnHasVolumes extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnGetVolumes extends com.sun.jna.Callback {
        long invoke(long drive);
    }

    @FunctionalInterface
    public interface OnIsMediaRemovable extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnHasMedia extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnIsMediaCheckAutomatic extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnCanEject extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnCanPollForMedia extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnEject extends com.sun.jna.Callback {
        void invoke(long drive, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnEjectFinish extends com.sun.jna.Callback {
        boolean invoke(long drive, long result, long _error);
    }

    @FunctionalInterface
    public interface OnPollForMedia extends com.sun.jna.Callback {
        void invoke(long drive, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnPollForMediaFinish extends com.sun.jna.Callback {
        boolean invoke(long drive, long result, long _error);
    }

    @FunctionalInterface
    public interface OnGetIdentifier extends com.sun.jna.Callback {
        long invoke(long drive, long kind);
    }

    @FunctionalInterface
    public interface OnEnumerateIdentifiers extends com.sun.jna.Callback {
        long invoke(long drive);
    }

    @FunctionalInterface
    public interface OnGetStartStopType extends com.sun.jna.Callback {
        int invoke(long drive);
    }

    @FunctionalInterface
    public interface OnCanStart extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnCanStartDegraded extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnStart extends com.sun.jna.Callback {
        void invoke(long drive, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnStartFinish extends com.sun.jna.Callback {
        boolean invoke(long drive, long result, long _error);
    }

    @FunctionalInterface
    public interface OnCanStop extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    @FunctionalInterface
    public interface OnStop extends com.sun.jna.Callback {
        void invoke(long drive, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnStopFinish extends com.sun.jna.Callback {
        boolean invoke(long drive, long result, long _error);
    }

    @FunctionalInterface
    public interface OnStopButton extends com.sun.jna.Callback {
        void invoke(long drive);
    }

    @FunctionalInterface
    public interface OnEjectWithOperation extends com.sun.jna.Callback {
        void invoke(long drive, int flags, long mount_operation, long cancellable, com.sun.jna.Callback callback, long user_data);
    }

    @FunctionalInterface
    public interface OnEjectWithOperationFinish extends com.sun.jna.Callback {
        boolean invoke(long drive, long result, long _error);
    }

    @FunctionalInterface
    public interface OnGetSortKey extends com.sun.jna.Callback {
        long invoke(long drive);
    }

    @FunctionalInterface
    public interface OnGetSymbolicIcon extends com.sun.jna.Callback {
        long invoke(long drive);
    }

    @FunctionalInterface
    public interface OnIsRemovable extends com.sun.jna.Callback {
        boolean invoke(long drive);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DriveIface size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DriveIface.G_IFACE, DriveIface.CHANGED, DriveIface.DISCONNECTED, DriveIface.EJECT_BUTTON, DriveIface.GET_NAME, DriveIface.GET_ICON, DriveIface.HAS_VOLUMES, DriveIface.GET_VOLUMES, DriveIface.IS_MEDIA_REMOVABLE, DriveIface.HAS_MEDIA, DriveIface.IS_MEDIA_CHECK_AUTOMATIC, DriveIface.CAN_EJECT, DriveIface.CAN_POLL_FOR_MEDIA, DriveIface.EJECT, DriveIface.EJECT_FINISH, DriveIface.POLL_FOR_MEDIA, DriveIface.POLL_FOR_MEDIA_FINISH, DriveIface.GET_IDENTIFIER, DriveIface.ENUMERATE_IDENTIFIERS, DriveIface.GET_START_STOP_TYPE, DriveIface.CAN_START, DriveIface.CAN_START_DEGRADED, DriveIface.START, DriveIface.START_FINISH, DriveIface.CAN_STOP, DriveIface.STOP, DriveIface.STOP_FINISH, DriveIface.STOP_BUTTON, DriveIface.EJECT_WITH_OPERATION, DriveIface.EJECT_WITH_OPERATION_FINISH, DriveIface.GET_SORT_KEY, DriveIface.GET_SYMBOLIC_ICON, DriveIface.IS_REMOVABLE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] g_iface = new byte[ch.bailu.gtk.gobject.TypeInterface.getInstanceSize()];
        public OnChanged changed;
        public OnDisconnected disconnected;
        public OnEjectButton eject_button;
        public OnGetName get_name;
        public OnGetIcon get_icon;
        public OnHasVolumes has_volumes;
        public OnGetVolumes get_volumes;
        public OnIsMediaRemovable is_media_removable;
        public OnHasMedia has_media;
        public OnIsMediaCheckAutomatic is_media_check_automatic;
        public OnCanEject can_eject;
        public OnCanPollForMedia can_poll_for_media;
        public OnEject eject;
        public OnEjectFinish eject_finish;
        public OnPollForMedia poll_for_media;
        public OnPollForMediaFinish poll_for_media_finish;
        public OnGetIdentifier get_identifier;
        public OnEnumerateIdentifiers enumerate_identifiers;
        public OnGetStartStopType get_start_stop_type;
        public OnCanStart can_start;
        public OnCanStartDegraded can_start_degraded;
        public OnStart start;
        public OnStartFinish start_finish;
        public OnCanStop can_stop;
        public OnStop stop;
        public OnStopFinish stop_finish;
        public OnStopButton stop_button;
        public OnEjectWithOperation eject_with_operation;
        public OnEjectWithOperationFinish eject_with_operation_finish;
        public OnGetSortKey get_sort_key;
        public OnGetSymbolicIcon get_symbolic_icon;
        public OnIsRemovable is_removable;
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
