/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMenuLinkIter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_menu_link_iter_get_name(long _self);
        long g_menu_link_iter_get_value(long _self);
        boolean g_menu_link_iter_next(long _self);
        long g_menu_link_iter_get_type();
    }

}
