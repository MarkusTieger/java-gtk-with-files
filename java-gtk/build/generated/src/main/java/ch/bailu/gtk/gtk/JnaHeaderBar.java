/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaHeaderBar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_header_bar_new();
        long gtk_header_bar_get_decoration_layout(long _self);
        boolean gtk_header_bar_get_show_title_buttons(long _self);
        long gtk_header_bar_get_title_widget(long _self);
        void gtk_header_bar_pack_end(long _self, long child);
        void gtk_header_bar_pack_start(long _self, long child);
        void gtk_header_bar_remove(long _self, long child);
        void gtk_header_bar_set_decoration_layout(long _self, long layout);
        void gtk_header_bar_set_decoration_layout(long _self, String layout);
        void gtk_header_bar_set_show_title_buttons(long _self, boolean setting);
        void gtk_header_bar_set_title_widget(long _self, long title_widget);
        long gtk_header_bar_get_type();
    }

}
