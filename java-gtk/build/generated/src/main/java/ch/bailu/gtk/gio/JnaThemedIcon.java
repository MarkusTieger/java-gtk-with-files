/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaThemedIcon {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_themed_icon_new(long iconname);
        long g_themed_icon_new(String iconname);
        long g_themed_icon_new_from_names(long iconnames, int len);
        long g_themed_icon_new_with_default_fallbacks(long iconname);
        long g_themed_icon_new_with_default_fallbacks(String iconname);
        void g_themed_icon_append_name(long _self, long iconname);
        void g_themed_icon_append_name(long _self, String iconname);
        void g_themed_icon_prepend_name(long _self, long iconname);
        void g_themed_icon_prepend_name(long _self, String iconname);
        long g_themed_icon_get_type();
    }

}
