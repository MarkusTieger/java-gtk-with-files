/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaStaticResource {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_static_resource_fini(long _self);
        long g_static_resource_get_resource(long _self);
        void g_static_resource_init(long _self);
    }

}
