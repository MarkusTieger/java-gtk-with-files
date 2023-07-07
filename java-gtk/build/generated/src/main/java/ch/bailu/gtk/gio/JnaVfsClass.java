/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaVfsClass {

    @FunctionalInterface
    public interface OnIsActive extends com.sun.jna.Callback {
        boolean invoke(long vfs);
    }

    @FunctionalInterface
    public interface OnGetFileForPath extends com.sun.jna.Callback {
        long invoke(long vfs, long path);
    }

    @FunctionalInterface
    public interface OnGetFileForUri extends com.sun.jna.Callback {
        long invoke(long vfs, long uri);
    }

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("VfsClass size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({VfsClass.PARENT_CLASS, VfsClass.IS_ACTIVE, VfsClass.GET_FILE_FOR_PATH, VfsClass.GET_FILE_FOR_URI})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public byte[] parent_class = new byte[ch.bailu.gtk.gobject.ObjectClass.getInstanceSize()];
        public OnIsActive is_active;
        public OnGetFileForPath get_file_for_path;
        public OnGetFileForUri get_file_for_uri;
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
