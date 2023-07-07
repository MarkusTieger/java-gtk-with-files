/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaEmblemedIcon {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_emblemed_icon_new(long icon, long emblem);
        void g_emblemed_icon_add_emblem(long _self, long emblem);
        void g_emblemed_icon_clear_emblems(long _self);
        long g_emblemed_icon_get_emblems(long _self);
        long g_emblemed_icon_get_icon(long _self);
        long g_emblemed_icon_get_type();
    }

}
