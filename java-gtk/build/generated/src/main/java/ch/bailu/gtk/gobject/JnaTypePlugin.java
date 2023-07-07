/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaTypePlugin {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_type_plugin_complete_interface_info(long _self, long instance_type, long interface_type, long info);
        void g_type_plugin_complete_type_info(long _self, long g_type, long info, long value_table);
        void g_type_plugin_unuse(long _self);
        void g_type_plugin_use(long _self);
        long g_type_plugin_get_type();
    }

}
