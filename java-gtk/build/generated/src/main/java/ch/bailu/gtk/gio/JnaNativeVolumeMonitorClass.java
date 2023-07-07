/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaNativeVolumeMonitorClass {

    @FunctionalInterface
    public interface OnGetMountForMountPath extends com.sun.jna.Callback {
        long invoke(long mount_path, long cancellable);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("NativeVolumeMonitorClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({NativeVolumeMonitorClass.PARENT_CLASS, NativeVolumeMonitorClass.GET_MOUNT_FOR_MOUNT_PATH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[VolumeMonitorClass.getInstanceSize()];
        public OnGetMountForMountPath get_mount_for_mount_path;
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
