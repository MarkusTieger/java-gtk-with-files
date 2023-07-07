/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileAttributeInfoList {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("FileAttributeInfoList size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({FileAttributeInfoList.INFOS, FileAttributeInfoList.N_INFOS})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public long infos;
        public int n_infos;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_file_attribute_info_list_new();
        void g_file_attribute_info_list_add(long _self, long name, int type, int flags);
        void g_file_attribute_info_list_add(long _self, String name, int type, int flags);
        long g_file_attribute_info_list_dup(long _self);
        long g_file_attribute_info_list_lookup(long _self, long name);
        long g_file_attribute_info_list_lookup(long _self, String name);
        long g_file_attribute_info_list_ref(long _self);
        void g_file_attribute_info_list_unref(long _self);
        long g_file_attribute_info_list_get_type();
    }

}
