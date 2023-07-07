/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaComboBox {

    @FunctionalInterface
    public interface OnTreeViewRowSeparatorFunc extends com.sun.jna.Callback {
        boolean invoke(long model, long iter, long data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnFormatEntryText extends com.sun.jna.Callback {
        long invoke(long _self, long path, long _data);
    }

    @FunctionalInterface
    public interface OnMoveActive extends com.sun.jna.Callback {
        void invoke(long _self, int scroll_type, long _data);
    }

    @FunctionalInterface
    public interface OnPopdown extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnPopup extends com.sun.jna.Callback {
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
        long gtk_combo_box_new();
        long gtk_combo_box_new_with_entry();
        long gtk_combo_box_new_with_model(long model);
        long gtk_combo_box_new_with_model_and_entry(long model);
        int gtk_combo_box_get_active(long _self);
        long gtk_combo_box_get_active_id(long _self);
        boolean gtk_combo_box_get_active_iter(long _self, long iter);
        int gtk_combo_box_get_button_sensitivity(long _self);
        long gtk_combo_box_get_child(long _self);
        int gtk_combo_box_get_entry_text_column(long _self);
        boolean gtk_combo_box_get_has_entry(long _self);
        int gtk_combo_box_get_id_column(long _self);
        long gtk_combo_box_get_model(long _self);
        boolean gtk_combo_box_get_popup_fixed_width(long _self);
        void gtk_combo_box_popdown(long _self);
        void gtk_combo_box_popup(long _self);
        void gtk_combo_box_popup_for_device(long _self, long device);
        void gtk_combo_box_set_active(long _self, int index_);
        boolean gtk_combo_box_set_active_id(long _self, long active_id);
        boolean gtk_combo_box_set_active_id(long _self, String active_id);
        void gtk_combo_box_set_active_iter(long _self, long iter);
        void gtk_combo_box_set_button_sensitivity(long _self, int sensitivity);
        void gtk_combo_box_set_child(long _self, long child);
        void gtk_combo_box_set_entry_text_column(long _self, int text_column);
        void gtk_combo_box_set_id_column(long _self, int id_column);
        void gtk_combo_box_set_model(long _self, long model);
        void gtk_combo_box_set_popup_fixed_width(long _self, boolean fixed);
        void gtk_combo_box_set_row_separator_func(long _self, com.sun.jna.Callback func, long data, com.sun.jna.Callback destroy);
        long gtk_combo_box_get_type();
    }

}
