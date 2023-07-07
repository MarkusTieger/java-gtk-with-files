/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaInfoBar {

    @FunctionalInterface
    public interface OnClose extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnResponse extends com.sun.jna.Callback {
        void invoke(long _self, int response_id, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_info_bar_new();
        long gtk_info_bar_new_with_buttons(long first_button_text, java.lang.Object... _elipse);
        long gtk_info_bar_new_with_buttons(String first_button_text, java.lang.Object... _elipse);
        void gtk_info_bar_add_action_widget(long _self, long child, int response_id);
        long gtk_info_bar_add_button(long _self, long button_text, int response_id);
        long gtk_info_bar_add_button(long _self, String button_text, int response_id);
        void gtk_info_bar_add_buttons(long _self, long first_button_text, java.lang.Object... _elipse);
        void gtk_info_bar_add_buttons(long _self, String first_button_text, java.lang.Object... _elipse);
        void gtk_info_bar_add_child(long _self, long widget);
        int gtk_info_bar_get_message_type(long _self);
        boolean gtk_info_bar_get_revealed(long _self);
        boolean gtk_info_bar_get_show_close_button(long _self);
        void gtk_info_bar_remove_action_widget(long _self, long widget);
        void gtk_info_bar_remove_child(long _self, long widget);
        void gtk_info_bar_response(long _self, int response_id);
        void gtk_info_bar_set_default_response(long _self, int response_id);
        void gtk_info_bar_set_message_type(long _self, int message_type);
        void gtk_info_bar_set_response_sensitive(long _self, int response_id, boolean setting);
        void gtk_info_bar_set_revealed(long _self, boolean revealed);
        void gtk_info_bar_set_show_close_button(long _self, boolean setting);
        long gtk_info_bar_get_type();
    }

}
