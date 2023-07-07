/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaToast {

    @FunctionalInterface
    public interface OnButtonClicked extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnDismissed extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_toast_new(long title);
        long adw_toast_new(String title);
        long adw_toast_new_format(long format, java.lang.Object... _elipse);
        long adw_toast_new_format(String format, java.lang.Object... _elipse);
        void adw_toast_dismiss(long _self);
        long adw_toast_get_action_name(long _self);
        long adw_toast_get_action_target_value(long _self);
        long adw_toast_get_button_label(long _self);
        long adw_toast_get_custom_title(long _self);
        int adw_toast_get_priority(long _self);
        int adw_toast_get_timeout(long _self);
        long adw_toast_get_title(long _self);
        void adw_toast_set_action_name(long _self, long action_name);
        void adw_toast_set_action_name(long _self, String action_name);
        void adw_toast_set_action_target(long _self, long format_string, java.lang.Object... _elipse);
        void adw_toast_set_action_target(long _self, String format_string, java.lang.Object... _elipse);
        void adw_toast_set_action_target_value(long _self, long action_target);
        void adw_toast_set_button_label(long _self, long button_label);
        void adw_toast_set_button_label(long _self, String button_label);
        void adw_toast_set_custom_title(long _self, long widget);
        void adw_toast_set_detailed_action_name(long _self, long detailed_action_name);
        void adw_toast_set_detailed_action_name(long _self, String detailed_action_name);
        void adw_toast_set_priority(long _self, int priority);
        void adw_toast_set_timeout(long _self, int timeout);
        void adw_toast_set_title(long _self, long title);
        void adw_toast_set_title(long _self, String title);
        long adw_toast_get_type();
    }

}
