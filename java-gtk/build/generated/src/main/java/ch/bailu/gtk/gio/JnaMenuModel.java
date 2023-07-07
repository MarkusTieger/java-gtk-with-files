/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaMenuModel {

    @FunctionalInterface
    public interface OnItemsChanged extends com.sun.jna.Callback {
        void invoke(long _self, int position, int removed, int added, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean g_menu_model_get_item_attribute(long _self, int item_index, long attribute, long format_string, java.lang.Object... _elipse);
        boolean g_menu_model_get_item_attribute(long _self, int item_index, String attribute, String format_string, java.lang.Object... _elipse);
        long g_menu_model_get_item_attribute_value(long _self, int item_index, long attribute, long expected_type);
        long g_menu_model_get_item_attribute_value(long _self, int item_index, String attribute, long expected_type);
        long g_menu_model_get_item_link(long _self, int item_index, long link);
        long g_menu_model_get_item_link(long _self, int item_index, String link);
        int g_menu_model_get_n_items(long _self);
        boolean g_menu_model_is_mutable(long _self);
        void g_menu_model_items_changed(long _self, int position, int removed, int added);
        long g_menu_model_iterate_item_attributes(long _self, int item_index);
        long g_menu_model_iterate_item_links(long _self, int item_index);
        long g_menu_model_get_type();
    }

}
