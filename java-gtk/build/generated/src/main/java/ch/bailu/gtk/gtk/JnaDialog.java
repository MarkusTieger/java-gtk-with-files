/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDialog {

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
        long gtk_dialog_new();
        long gtk_dialog_new_with_buttons(long title, long parent, int flags, long first_button_text, java.lang.Object... _elipse);
        long gtk_dialog_new_with_buttons(String title, long parent, int flags, String first_button_text, java.lang.Object... _elipse);
        void gtk_dialog_add_action_widget(long _self, long child, int response_id);
        long gtk_dialog_add_button(long _self, long button_text, int response_id);
        long gtk_dialog_add_button(long _self, String button_text, int response_id);
        void gtk_dialog_add_buttons(long _self, long first_button_text, java.lang.Object... _elipse);
        void gtk_dialog_add_buttons(long _self, String first_button_text, java.lang.Object... _elipse);
        long gtk_dialog_get_content_area(long _self);
        long gtk_dialog_get_header_bar(long _self);
        int gtk_dialog_get_response_for_widget(long _self, long widget);
        long gtk_dialog_get_widget_for_response(long _self, int response_id);
        void gtk_dialog_response(long _self, int response_id);
        void gtk_dialog_set_default_response(long _self, int response_id);
        void gtk_dialog_set_response_sensitive(long _self, int response_id, boolean setting);
        long gtk_dialog_get_type();
    }

}
