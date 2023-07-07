/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSettingsBackendClass {

    @FunctionalInterface
    public interface OnRead extends com.sun.jna.Callback {
        long invoke(long backend, long key, long expected_type, boolean default_value);
    }

    @FunctionalInterface
    public interface OnGetWritable extends com.sun.jna.Callback {
        boolean invoke(long backend, long key);
    }

    @FunctionalInterface
    public interface OnWrite extends com.sun.jna.Callback {
        boolean invoke(long backend, long key, long value, long origin_tag);
    }

    @FunctionalInterface
    public interface OnWriteTree extends com.sun.jna.Callback {
        boolean invoke(long backend, long tree, long origin_tag);
    }

    @FunctionalInterface
    public interface OnReset extends com.sun.jna.Callback {
        void invoke(long backend, long key, long origin_tag);
    }

    @FunctionalInterface
    public interface OnSubscribe extends com.sun.jna.Callback {
        void invoke(long backend, long name);
    }

    @FunctionalInterface
    public interface OnUnsubscribe extends com.sun.jna.Callback {
        void invoke(long backend, long name);
    }

    @FunctionalInterface
    public interface OnSync extends com.sun.jna.Callback {
        void invoke(long backend);
    }

    @FunctionalInterface
    public interface OnGetPermission extends com.sun.jna.Callback {
        long invoke(long backend, long path);
    }

    @FunctionalInterface
    public interface OnReadUserValue extends com.sun.jna.Callback {
        long invoke(long backend, long key, long expected_type);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("SettingsBackendClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({SettingsBackendClass.PARENT_CLASS, SettingsBackendClass.READ, SettingsBackendClass.GET_WRITABLE, SettingsBackendClass.WRITE, SettingsBackendClass.WRITE_TREE, SettingsBackendClass.RESET, SettingsBackendClass.SUBSCRIBE, SettingsBackendClass.UNSUBSCRIBE, SettingsBackendClass.SYNC, SettingsBackendClass.GET_PERMISSION, SettingsBackendClass.READ_USER_VALUE})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnRead read;
        public OnGetWritable get_writable;
        public OnWrite write;
        public OnWriteTree write_tree;
        public OnReset reset;
        public OnSubscribe subscribe;
        public OnUnsubscribe unsubscribe;
        public OnSync sync;
        public OnGetPermission get_permission;
        public OnReadUserValue read_user_value;
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
