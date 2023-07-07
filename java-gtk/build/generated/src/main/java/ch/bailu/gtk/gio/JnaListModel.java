/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaListModel {

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
        long g_list_model_get_item(long _self, int position);
        long g_list_model_get_item_type(long _self);
        int g_list_model_get_n_items(long _self);
        long g_list_model_get_object(long _self, int position);
        void g_list_model_items_changed(long _self, int position, int removed, int added);
        long g_list_model_get_type();
    }

}
