/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDBusInterfaceInfo {

    private static long _size = -1;
    public static long allocateStructure() {
        if (_size < 0) {
            _size = new Fields().size();
            System.out.println("DBusInterfaceInfo size: " + _size + " bytes");
        }
        return ch.bailu.gtk.lib.jna.CLib.allocate(_size);
    }
    
    @com.sun.jna.Structure.FieldOrder({DBusInterfaceInfo.REF_COUNT, DBusInterfaceInfo.NAME})
    public static class Fields extends com.sun.jna.Structure {
        public Fields() {
            super(); 
        }
    
        public Fields(long _self) {
            super(ch.bailu.gtk.type.Pointer.asJnaPointer(_self));
        }

        public int ref_count;
        public long name;
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_dbus_interface_info_cache_build(long _self);
        void g_dbus_interface_info_cache_release(long _self);
        void g_dbus_interface_info_generate_xml(long _self, int indent, long string_builder);
        long g_dbus_interface_info_lookup_method(long _self, long name);
        long g_dbus_interface_info_lookup_method(long _self, String name);
        long g_dbus_interface_info_lookup_property(long _self, long name);
        long g_dbus_interface_info_lookup_property(long _self, String name);
        long g_dbus_interface_info_lookup_signal(long _self, long name);
        long g_dbus_interface_info_lookup_signal(long _self, String name);
        long g_dbus_interface_info_ref(long _self);
        void g_dbus_interface_info_unref(long _self);
        long g_dbus_interface_info_get_type();
    }

}
