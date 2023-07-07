/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaBytesIcon {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_bytes_icon_new(long bytes);
        long g_bytes_icon_get_bytes(long _self);
        long g_bytes_icon_get_type();
    }

}
