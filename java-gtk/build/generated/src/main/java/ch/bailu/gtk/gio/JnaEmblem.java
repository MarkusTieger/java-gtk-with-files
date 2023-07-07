/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaEmblem {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_emblem_new(long icon);
        long g_emblem_new_with_origin(long icon, int origin);
        long g_emblem_get_icon(long _self);
        int g_emblem_get_origin(long _self);
        long g_emblem_get_type();
    }

}
