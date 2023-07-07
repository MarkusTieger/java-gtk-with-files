/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusNodeInfo {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DBusNodeInfo size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DBusNodeInfo.REF_COUNT, DBusNodeInfo.PATH})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int ref_count;
        public long path;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_dbus_node_info_new_for_xml(long xml_data, long _error);
        long g_dbus_node_info_new_for_xml(String xml_data, long _error);
        void g_dbus_node_info_generate_xml(long _self, int indent, long string_builder);
        long g_dbus_node_info_lookup_interface(long _self, long name);
        long g_dbus_node_info_lookup_interface(long _self, String name);
        long g_dbus_node_info_ref(long _self);
        void g_dbus_node_info_unref(long _self);
        long g_dbus_node_info_get_type();
    }

}
