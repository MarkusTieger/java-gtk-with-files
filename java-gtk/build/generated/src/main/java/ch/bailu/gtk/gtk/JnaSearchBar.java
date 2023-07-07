/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSearchBar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_search_bar_new();
        void gtk_search_bar_connect_entry(long _self, long entry);
        long gtk_search_bar_get_child(long _self);
        long gtk_search_bar_get_key_capture_widget(long _self);
        boolean gtk_search_bar_get_search_mode(long _self);
        boolean gtk_search_bar_get_show_close_button(long _self);
        void gtk_search_bar_set_child(long _self, long child);
        void gtk_search_bar_set_key_capture_widget(long _self, long widget);
        void gtk_search_bar_set_search_mode(long _self, boolean search_mode);
        void gtk_search_bar_set_show_close_button(long _self, boolean visible);
        long gtk_search_bar_get_type();
    }

}
