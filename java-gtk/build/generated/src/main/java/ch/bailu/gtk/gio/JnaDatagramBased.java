/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDatagramBased {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int g_datagram_based_condition_check(long _self, int condition);
        boolean g_datagram_based_condition_wait(long _self, int condition, long timeout, long cancellable, long _error);
        long g_datagram_based_create_source(long _self, int condition, long cancellable);
        long g_datagram_based_get_type();
    }

}
