/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMenu {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_menu_new();
        void g_menu_append(long _self, long label, long detailed_action);
        void g_menu_append(long _self, String label, String detailed_action);
        void g_menu_append_item(long _self, long item);
        void g_menu_append_section(long _self, long label, long section);
        void g_menu_append_section(long _self, String label, long section);
        void g_menu_append_submenu(long _self, long label, long submenu);
        void g_menu_append_submenu(long _self, String label, long submenu);
        void g_menu_freeze(long _self);
        void g_menu_insert(long _self, int position, long label, long detailed_action);
        void g_menu_insert(long _self, int position, String label, String detailed_action);
        void g_menu_insert_item(long _self, int position, long item);
        void g_menu_insert_section(long _self, int position, long label, long section);
        void g_menu_insert_section(long _self, int position, String label, long section);
        void g_menu_insert_submenu(long _self, int position, long label, long submenu);
        void g_menu_insert_submenu(long _self, int position, String label, long submenu);
        void g_menu_prepend(long _self, long label, long detailed_action);
        void g_menu_prepend(long _self, String label, String detailed_action);
        void g_menu_prepend_item(long _self, long item);
        void g_menu_prepend_section(long _self, long label, long section);
        void g_menu_prepend_section(long _self, String label, long section);
        void g_menu_prepend_submenu(long _self, long label, long submenu);
        void g_menu_prepend_submenu(long _self, String label, long submenu);
        void g_menu_remove(long _self, int position);
        void g_menu_remove_all(long _self);
        long g_menu_get_type();
    }

}
