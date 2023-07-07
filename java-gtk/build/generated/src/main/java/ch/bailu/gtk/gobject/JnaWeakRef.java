/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaWeakRef {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_weak_ref_clear(long _self);
        long g_weak_ref_get(long _self);
        void g_weak_ref_init(long _self, long object);
        void g_weak_ref_set(long _self, long object);
    }

}
