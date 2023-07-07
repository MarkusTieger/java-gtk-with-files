/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellArea {

    @FunctionalInterface
    public interface OnCellCallback extends com.sun.jna.Callback {
        boolean invoke(long renderer, long data);
    }

    @FunctionalInterface
    public interface OnCellAllocCallback extends com.sun.jna.Callback {
        boolean invoke(long renderer, long cell_area, long cell_background, long data);
    }

    @FunctionalInterface
    public interface OnAddEditable extends com.sun.jna.Callback {
        void invoke(long _self, long renderer, long editable, long cell_area, long path, long _data);
    }

    @FunctionalInterface
    public interface OnApplyAttributes extends com.sun.jna.Callback {
        void invoke(long _self, long model, long iter, boolean is_expander, boolean is_expanded, long _data);
    }

    @FunctionalInterface
    public interface OnFocusChanged extends com.sun.jna.Callback {
        void invoke(long _self, long renderer, long path, long _data);
    }

    @FunctionalInterface
    public interface OnRemoveEditable extends com.sun.jna.Callback {
        void invoke(long _self, long renderer, long editable, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_cell_area_activate(long _self, long context, long widget, long cell_area, int flags, boolean edit_only);
        boolean gtk_cell_area_activate_cell(long _self, long widget, long renderer, long event, long cell_area, int flags);
        void gtk_cell_area_add(long _self, long renderer);
        void gtk_cell_area_add_focus_sibling(long _self, long renderer, long sibling);
        void gtk_cell_area_add_with_properties(long _self, long renderer, long first_prop_name, java.lang.Object... _elipse);
        void gtk_cell_area_add_with_properties(long _self, long renderer, String first_prop_name, java.lang.Object... _elipse);
        void gtk_cell_area_apply_attributes(long _self, long tree_model, long iter, boolean is_expander, boolean is_expanded);
        void gtk_cell_area_attribute_connect(long _self, long renderer, long attribute, int column);
        void gtk_cell_area_attribute_connect(long _self, long renderer, String attribute, int column);
        void gtk_cell_area_attribute_disconnect(long _self, long renderer, long attribute);
        void gtk_cell_area_attribute_disconnect(long _self, long renderer, String attribute);
        int gtk_cell_area_attribute_get_column(long _self, long renderer, long attribute);
        int gtk_cell_area_attribute_get_column(long _self, long renderer, String attribute);
        void gtk_cell_area_cell_get(long _self, long renderer, long first_prop_name, java.lang.Object... _elipse);
        void gtk_cell_area_cell_get(long _self, long renderer, String first_prop_name, java.lang.Object... _elipse);
        void gtk_cell_area_cell_get_property(long _self, long renderer, long property_name, long value);
        void gtk_cell_area_cell_get_property(long _self, long renderer, String property_name, long value);
        void gtk_cell_area_cell_set(long _self, long renderer, long first_prop_name, java.lang.Object... _elipse);
        void gtk_cell_area_cell_set(long _self, long renderer, String first_prop_name, java.lang.Object... _elipse);
        void gtk_cell_area_cell_set_property(long _self, long renderer, long property_name, long value);
        void gtk_cell_area_cell_set_property(long _self, long renderer, String property_name, long value);
        long gtk_cell_area_copy_context(long _self, long context);
        long gtk_cell_area_create_context(long _self);
        int gtk_cell_area_event(long _self, long context, long widget, long event, long cell_area, int flags);
        boolean gtk_cell_area_focus(long _self, int direction);
        void gtk_cell_area_foreach(long _self, com.sun.jna.Callback callback, long callback_data);
        void gtk_cell_area_foreach_alloc(long _self, long context, long widget, long cell_area, long background_area, com.sun.jna.Callback callback, long callback_data);
        void gtk_cell_area_get_cell_allocation(long _self, long context, long widget, long renderer, long cell_area, long allocation);
        long gtk_cell_area_get_cell_at_position(long _self, long context, long widget, long cell_area, int x, int y, long alloc_area);
        long gtk_cell_area_get_current_path_string(long _self);
        long gtk_cell_area_get_edit_widget(long _self);
        long gtk_cell_area_get_edited_cell(long _self);
        long gtk_cell_area_get_focus_cell(long _self);
        long gtk_cell_area_get_focus_from_sibling(long _self, long renderer);
        long gtk_cell_area_get_focus_siblings(long _self, long renderer);
        void gtk_cell_area_get_preferred_height(long _self, long context, long widget, long minimum_height, long natural_height);
        void gtk_cell_area_get_preferred_height_for_width(long _self, long context, long widget, int width, long minimum_height, long natural_height);
        void gtk_cell_area_get_preferred_width(long _self, long context, long widget, long minimum_width, long natural_width);
        void gtk_cell_area_get_preferred_width_for_height(long _self, long context, long widget, int height, long minimum_width, long natural_width);
        int gtk_cell_area_get_request_mode(long _self);
        boolean gtk_cell_area_has_renderer(long _self, long renderer);
        void gtk_cell_area_inner_cell_area(long _self, long widget, long cell_area, long inner_area);
        boolean gtk_cell_area_is_activatable(long _self);
        boolean gtk_cell_area_is_focus_sibling(long _self, long renderer, long sibling);
        void gtk_cell_area_remove(long _self, long renderer);
        void gtk_cell_area_remove_focus_sibling(long _self, long renderer, long sibling);
        void gtk_cell_area_request_renderer(long _self, long renderer, int orientation, long widget, int for_size, long minimum_size, long natural_size);
        void gtk_cell_area_set_focus_cell(long _self, long renderer);
        void gtk_cell_area_snapshot(long _self, long context, long widget, long snapshot, long background_area, long cell_area, int flags, boolean paint_focus);
        void gtk_cell_area_stop_editing(long _self, boolean canceled);
        long gtk_cell_area_get_type();
    }

}
