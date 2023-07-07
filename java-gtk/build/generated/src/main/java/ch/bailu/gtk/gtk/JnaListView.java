/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaListView {

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
        long gtk_list_view_new(long model, long factory);
        boolean gtk_list_view_get_enable_rubberband(long _self);
        long gtk_list_view_get_factory(long _self);
        long gtk_list_view_get_model(long _self);
        boolean gtk_list_view_get_show_separators(long _self);
        boolean gtk_list_view_get_single_click_activate(long _self);
        void gtk_list_view_set_enable_rubberband(long _self, boolean enable_rubberband);
        void gtk_list_view_set_factory(long _self, long factory);
        void gtk_list_view_set_model(long _self, long model);
        void gtk_list_view_set_show_separators(long _self, boolean show_separators);
        void gtk_list_view_set_single_click_activate(long _self, boolean single_click_activate);
        long gtk_list_view_get_type();
    }

}
