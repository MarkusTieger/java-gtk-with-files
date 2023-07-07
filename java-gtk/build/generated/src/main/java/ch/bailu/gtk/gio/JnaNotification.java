/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaNotification {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_notification_new(long title);
        long g_notification_new(String title);
        void g_notification_add_button(long _self, long label, long detailed_action);
        void g_notification_add_button(long _self, String label, String detailed_action);
        void g_notification_add_button_with_target(long _self, long label, long action, long target_format, java.lang.Object... _elipse);
        void g_notification_add_button_with_target(long _self, String label, String action, String target_format, java.lang.Object... _elipse);
        void g_notification_add_button_with_target_value(long _self, long label, long action, long target);
        void g_notification_add_button_with_target_value(long _self, String label, String action, long target);
        void g_notification_set_body(long _self, long body);
        void g_notification_set_body(long _self, String body);
        void g_notification_set_category(long _self, long category);
        void g_notification_set_category(long _self, String category);
        void g_notification_set_default_action(long _self, long detailed_action);
        void g_notification_set_default_action(long _self, String detailed_action);
        void g_notification_set_default_action_and_target(long _self, long action, long target_format, java.lang.Object... _elipse);
        void g_notification_set_default_action_and_target(long _self, String action, String target_format, java.lang.Object... _elipse);
        void g_notification_set_default_action_and_target_value(long _self, long action, long target);
        void g_notification_set_default_action_and_target_value(long _self, String action, long target);
        void g_notification_set_icon(long _self, long icon);
        void g_notification_set_priority(long _self, int priority);
        void g_notification_set_title(long _self, long title);
        void g_notification_set_title(long _self, String title);
        long g_notification_get_type();
    }

}
