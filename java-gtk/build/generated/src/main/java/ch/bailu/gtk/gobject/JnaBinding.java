/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaBinding {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_binding_dup_source(long _self);
        long g_binding_dup_target(long _self);
        int g_binding_get_flags(long _self);
        long g_binding_get_source_property(long _self);
        long g_binding_get_target_property(long _self);
        void g_binding_unbind(long _self);
        long g_binding_get_type();
    }

}
