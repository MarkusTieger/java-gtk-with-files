/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaMessageDialog {

    @FunctionalInterface
    public interface OnResponse extends com.sun.jna.Callback {
        void invoke(long _self, long response, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_message_dialog_new(long parent, long heading, long body);
        long adw_message_dialog_new(long parent, String heading, String body);
        void adw_message_dialog_add_response(long _self, long id, long label);
        void adw_message_dialog_add_response(long _self, String id, String label);
        void adw_message_dialog_add_responses(long _self, long first_id, java.lang.Object... _elipse);
        void adw_message_dialog_add_responses(long _self, String first_id, java.lang.Object... _elipse);
        void adw_message_dialog_format_body(long _self, long format, java.lang.Object... _elipse);
        void adw_message_dialog_format_body(long _self, String format, java.lang.Object... _elipse);
        void adw_message_dialog_format_body_markup(long _self, long format, java.lang.Object... _elipse);
        void adw_message_dialog_format_body_markup(long _self, String format, java.lang.Object... _elipse);
        void adw_message_dialog_format_heading(long _self, long format, java.lang.Object... _elipse);
        void adw_message_dialog_format_heading(long _self, String format, java.lang.Object... _elipse);
        void adw_message_dialog_format_heading_markup(long _self, long format, java.lang.Object... _elipse);
        void adw_message_dialog_format_heading_markup(long _self, String format, java.lang.Object... _elipse);
        long adw_message_dialog_get_body(long _self);
        boolean adw_message_dialog_get_body_use_markup(long _self);
        long adw_message_dialog_get_close_response(long _self);
        long adw_message_dialog_get_default_response(long _self);
        long adw_message_dialog_get_extra_child(long _self);
        long adw_message_dialog_get_heading(long _self);
        boolean adw_message_dialog_get_heading_use_markup(long _self);
        int adw_message_dialog_get_response_appearance(long _self, long response);
        int adw_message_dialog_get_response_appearance(long _self, String response);
        boolean adw_message_dialog_get_response_enabled(long _self, long response);
        boolean adw_message_dialog_get_response_enabled(long _self, String response);
        long adw_message_dialog_get_response_label(long _self, long response);
        long adw_message_dialog_get_response_label(long _self, String response);
        boolean adw_message_dialog_has_response(long _self, long response);
        boolean adw_message_dialog_has_response(long _self, String response);
        void adw_message_dialog_response(long _self, long response);
        void adw_message_dialog_response(long _self, String response);
        void adw_message_dialog_set_body(long _self, long body);
        void adw_message_dialog_set_body(long _self, String body);
        void adw_message_dialog_set_body_use_markup(long _self, boolean use_markup);
        void adw_message_dialog_set_close_response(long _self, long response);
        void adw_message_dialog_set_close_response(long _self, String response);
        void adw_message_dialog_set_default_response(long _self, long response);
        void adw_message_dialog_set_default_response(long _self, String response);
        void adw_message_dialog_set_extra_child(long _self, long child);
        void adw_message_dialog_set_heading(long _self, long heading);
        void adw_message_dialog_set_heading(long _self, String heading);
        void adw_message_dialog_set_heading_use_markup(long _self, boolean use_markup);
        void adw_message_dialog_set_response_appearance(long _self, long response, int appearance);
        void adw_message_dialog_set_response_appearance(long _self, String response, int appearance);
        void adw_message_dialog_set_response_enabled(long _self, long response, boolean enabled);
        void adw_message_dialog_set_response_enabled(long _self, String response, boolean enabled);
        void adw_message_dialog_set_response_label(long _self, long response, long label);
        void adw_message_dialog_set_response_label(long _self, String response, String label);
        long adw_message_dialog_get_type();
    }

}
