/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaListItem {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_list_item_get_activatable(long _self);
        long gtk_list_item_get_child(long _self);
        long gtk_list_item_get_item(long _self);
        int gtk_list_item_get_position(long _self);
        boolean gtk_list_item_get_selectable(long _self);
        boolean gtk_list_item_get_selected(long _self);
        void gtk_list_item_set_activatable(long _self, boolean activatable);
        void gtk_list_item_set_child(long _self, long child);
        void gtk_list_item_set_selectable(long _self, boolean selectable);
        long gtk_list_item_get_type();
    }

}
