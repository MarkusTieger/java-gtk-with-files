/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMenuItem {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_menu_item_new(long label, long detailed_action);
        long g_menu_item_new(String label, String detailed_action);
        long g_menu_item_new_from_model(long model, int item_index);
        long g_menu_item_new_section(long label, long section);
        long g_menu_item_new_section(String label, long section);
        long g_menu_item_new_submenu(long label, long submenu);
        long g_menu_item_new_submenu(String label, long submenu);
        boolean g_menu_item_get_attribute(long _self, long attribute, long format_string, java.lang.Object... _elipse);
        boolean g_menu_item_get_attribute(long _self, String attribute, String format_string, java.lang.Object... _elipse);
        long g_menu_item_get_attribute_value(long _self, long attribute, long expected_type);
        long g_menu_item_get_attribute_value(long _self, String attribute, long expected_type);
        long g_menu_item_get_link(long _self, long link);
        long g_menu_item_get_link(long _self, String link);
        void g_menu_item_set_action_and_target(long _self, long action, long format_string, java.lang.Object... _elipse);
        void g_menu_item_set_action_and_target(long _self, String action, String format_string, java.lang.Object... _elipse);
        void g_menu_item_set_action_and_target_value(long _self, long action, long target_value);
        void g_menu_item_set_action_and_target_value(long _self, String action, long target_value);
        void g_menu_item_set_attribute(long _self, long attribute, long format_string, java.lang.Object... _elipse);
        void g_menu_item_set_attribute(long _self, String attribute, String format_string, java.lang.Object... _elipse);
        void g_menu_item_set_attribute_value(long _self, long attribute, long value);
        void g_menu_item_set_attribute_value(long _self, String attribute, long value);
        void g_menu_item_set_detailed_action(long _self, long detailed_action);
        void g_menu_item_set_detailed_action(long _self, String detailed_action);
        void g_menu_item_set_icon(long _self, long icon);
        void g_menu_item_set_label(long _self, long label);
        void g_menu_item_set_label(long _self, String label);
        void g_menu_item_set_link(long _self, long link, long model);
        void g_menu_item_set_link(long _self, String link, long model);
        void g_menu_item_set_section(long _self, long section);
        void g_menu_item_set_submenu(long _self, long submenu);
        long g_menu_item_get_type();
    }

}
