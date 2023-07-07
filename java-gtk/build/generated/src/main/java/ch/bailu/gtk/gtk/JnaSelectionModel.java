/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSelectionModel {

    @FunctionalInterface
    public interface OnSelectionChanged extends com.sun.jna.Callback {
        void invoke(long _self, int position, int n_items, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_selection_model_get_selection(long _self);
        long gtk_selection_model_get_selection_in_range(long _self, int position, int n_items);
        boolean gtk_selection_model_is_selected(long _self, int position);
        boolean gtk_selection_model_select_all(long _self);
        boolean gtk_selection_model_select_item(long _self, int position, boolean unselect_rest);
        boolean gtk_selection_model_select_range(long _self, int position, int n_items, boolean unselect_rest);
        void gtk_selection_model_selection_changed(long _self, int position, int n_items);
        boolean gtk_selection_model_set_selection(long _self, long selected, long mask);
        boolean gtk_selection_model_unselect_all(long _self);
        boolean gtk_selection_model_unselect_item(long _self, int position);
        boolean gtk_selection_model_unselect_range(long _self, int position, int n_items);
        long gtk_selection_model_get_type();
    }

}
