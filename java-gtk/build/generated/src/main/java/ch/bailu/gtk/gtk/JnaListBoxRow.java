/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaListBoxRow {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_list_box_row_new();
        void gtk_list_box_row_changed(long _self);
        boolean gtk_list_box_row_get_activatable(long _self);
        long gtk_list_box_row_get_child(long _self);
        long gtk_list_box_row_get_header(long _self);
        int gtk_list_box_row_get_index(long _self);
        boolean gtk_list_box_row_get_selectable(long _self);
        boolean gtk_list_box_row_is_selected(long _self);
        void gtk_list_box_row_set_activatable(long _self, boolean activatable);
        void gtk_list_box_row_set_child(long _self, long child);
        void gtk_list_box_row_set_header(long _self, long header);
        void gtk_list_box_row_set_selectable(long _self, boolean selectable);
        long gtk_list_box_row_get_type();
    }

}
