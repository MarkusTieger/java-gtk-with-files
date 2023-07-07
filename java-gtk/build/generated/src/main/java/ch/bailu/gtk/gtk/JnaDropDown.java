/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaDropDown {

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
        long gtk_drop_down_new(long model, long expression);
        long gtk_drop_down_new_from_strings(long strings);
        boolean gtk_drop_down_get_enable_search(long _self);
        long gtk_drop_down_get_expression(long _self);
        long gtk_drop_down_get_factory(long _self);
        long gtk_drop_down_get_list_factory(long _self);
        long gtk_drop_down_get_model(long _self);
        int gtk_drop_down_get_selected(long _self);
        long gtk_drop_down_get_selected_item(long _self);
        boolean gtk_drop_down_get_show_arrow(long _self);
        void gtk_drop_down_set_enable_search(long _self, boolean enable_search);
        void gtk_drop_down_set_expression(long _self, long expression);
        void gtk_drop_down_set_factory(long _self, long factory);
        void gtk_drop_down_set_list_factory(long _self, long factory);
        void gtk_drop_down_set_model(long _self, long model);
        void gtk_drop_down_set_selected(long _self, int position);
        void gtk_drop_down_set_show_arrow(long _self, boolean show_arrow);
        long gtk_drop_down_get_type();
    }

}
