/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaInitable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_initable_init(long _self, long cancellable, long _error);
        long g_initable_get_type();
    }

}
