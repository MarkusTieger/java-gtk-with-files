/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaStrvBuilder {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_strv_builder_add(long _self, long value);
        void g_strv_builder_add(long _self, String value);
        void g_strv_builder_add_many(long _self, java.lang.Object... _elipse);
        void g_strv_builder_addv(long _self, long value);
        long g_strv_builder_ref(long _self);
        void g_strv_builder_unref(long _self);
        long g_strv_builder_new();
    }

}
