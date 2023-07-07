/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaIcon {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_icon_equal(long _self, long icon2);
        long g_icon_serialize(long _self);
        long g_icon_to_string(long _self);
        long g_icon_deserialize(long value);
        int g_icon_hash(long icon);
        long g_icon_new_for_string(long str, long _error);
        long g_icon_get_type();
    }

}
