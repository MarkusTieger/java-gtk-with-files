/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSingleSelection {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_single_selection_new(long model);
        boolean gtk_single_selection_get_autoselect(long _self);
        boolean gtk_single_selection_get_can_unselect(long _self);
        long gtk_single_selection_get_model(long _self);
        int gtk_single_selection_get_selected(long _self);
        long gtk_single_selection_get_selected_item(long _self);
        void gtk_single_selection_set_autoselect(long _self, boolean autoselect);
        void gtk_single_selection_set_can_unselect(long _self, boolean can_unselect);
        void gtk_single_selection_set_model(long _self, long model);
        void gtk_single_selection_set_selected(long _self, int position);
        long gtk_single_selection_get_type();
    }

}
