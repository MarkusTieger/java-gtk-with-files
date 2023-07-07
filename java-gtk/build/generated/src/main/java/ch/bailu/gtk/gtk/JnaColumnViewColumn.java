/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaColumnViewColumn {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_column_view_column_new(long title, long factory);
        long gtk_column_view_column_new(String title, long factory);
        long gtk_column_view_column_get_column_view(long _self);
        boolean gtk_column_view_column_get_expand(long _self);
        long gtk_column_view_column_get_factory(long _self);
        int gtk_column_view_column_get_fixed_width(long _self);
        long gtk_column_view_column_get_header_menu(long _self);
        boolean gtk_column_view_column_get_resizable(long _self);
        long gtk_column_view_column_get_sorter(long _self);
        long gtk_column_view_column_get_title(long _self);
        boolean gtk_column_view_column_get_visible(long _self);
        void gtk_column_view_column_set_expand(long _self, boolean expand);
        void gtk_column_view_column_set_factory(long _self, long factory);
        void gtk_column_view_column_set_fixed_width(long _self, int fixed_width);
        void gtk_column_view_column_set_header_menu(long _self, long menu);
        void gtk_column_view_column_set_resizable(long _self, boolean resizable);
        void gtk_column_view_column_set_sorter(long _self, long sorter);
        void gtk_column_view_column_set_title(long _self, long title);
        void gtk_column_view_column_set_title(long _self, String title);
        void gtk_column_view_column_set_visible(long _self, boolean visible);
        long gtk_column_view_column_get_type();
    }

}
