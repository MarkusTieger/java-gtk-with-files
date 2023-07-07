/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaColumnView {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, int position, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_column_view_new(long model);
        void gtk_column_view_append_column(long _self, long column);
        long gtk_column_view_get_columns(long _self);
        boolean gtk_column_view_get_enable_rubberband(long _self);
        long gtk_column_view_get_model(long _self);
        boolean gtk_column_view_get_reorderable(long _self);
        boolean gtk_column_view_get_show_column_separators(long _self);
        boolean gtk_column_view_get_show_row_separators(long _self);
        boolean gtk_column_view_get_single_click_activate(long _self);
        long gtk_column_view_get_sorter(long _self);
        void gtk_column_view_insert_column(long _self, int position, long column);
        void gtk_column_view_remove_column(long _self, long column);
        void gtk_column_view_set_enable_rubberband(long _self, boolean enable_rubberband);
        void gtk_column_view_set_model(long _self, long model);
        void gtk_column_view_set_reorderable(long _self, boolean reorderable);
        void gtk_column_view_set_show_column_separators(long _self, boolean show_column_separators);
        void gtk_column_view_set_show_row_separators(long _self, boolean show_row_separators);
        void gtk_column_view_set_single_click_activate(long _self, boolean single_click_activate);
        void gtk_column_view_sort_by_column(long _self, long column, int direction);
        long gtk_column_view_get_type();
    }

}
