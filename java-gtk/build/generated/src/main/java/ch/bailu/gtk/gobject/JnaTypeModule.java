/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaTypeModule {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_type_module_add_interface(long _self, long instance_type, long interface_type, long interface_info);
        long g_type_module_register_enum(long _self, long name, long const_static_values);
        long g_type_module_register_enum(long _self, String name, long const_static_values);
        long g_type_module_register_flags(long _self, long name, long const_static_values);
        long g_type_module_register_flags(long _self, String name, long const_static_values);
        long g_type_module_register_type(long _self, long parent_type, long type_name, long type_info, int flags);
        long g_type_module_register_type(long _self, long parent_type, String type_name, long type_info, int flags);
        void g_type_module_set_name(long _self, long name);
        void g_type_module_set_name(long _self, String name);
        void g_type_module_unuse(long _self);
        boolean g_type_module_use(long _self);
        long g_type_module_get_type();
    }

}
