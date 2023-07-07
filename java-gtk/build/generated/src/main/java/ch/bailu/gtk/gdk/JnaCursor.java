/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaCursor {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_cursor_new_from_name(long name, long fallback);
        long gdk_cursor_new_from_name(String name, long fallback);
        long gdk_cursor_new_from_texture(long texture, int hotspot_x, int hotspot_y, long fallback);
        long gdk_cursor_get_fallback(long _self);
        int gdk_cursor_get_hotspot_x(long _self);
        int gdk_cursor_get_hotspot_y(long _self);
        long gdk_cursor_get_name(long _self);
        long gdk_cursor_get_texture(long _self);
        long gdk_cursor_get_type();
    }

}
