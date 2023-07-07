/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEditable {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnDeleteText extends com.sun.jna.Callback {
        void invoke(long _self, int start_pos, int end_pos, long _data);
    }

    @FunctionalInterface
    public interface OnInsertText extends com.sun.jna.Callback {
        void invoke(long _self, long text, int length, long position, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_editable_delete_selection(long _self);
        void gtk_editable_delete_text(long _self, int start_pos, int end_pos);
        void gtk_editable_finish_delegate(long _self);
        float gtk_editable_get_alignment(long _self);
        long gtk_editable_get_chars(long _self, int start_pos, int end_pos);
        long gtk_editable_get_delegate(long _self);
        boolean gtk_editable_get_editable(long _self);
        boolean gtk_editable_get_enable_undo(long _self);
        int gtk_editable_get_max_width_chars(long _self);
        int gtk_editable_get_position(long _self);
        boolean gtk_editable_get_selection_bounds(long _self, long start_pos, long end_pos);
        long gtk_editable_get_text(long _self);
        int gtk_editable_get_width_chars(long _self);
        void gtk_editable_init_delegate(long _self);
        void gtk_editable_insert_text(long _self, long text, int length, long position);
        void gtk_editable_insert_text(long _self, String text, int length, long position);
        void gtk_editable_select_region(long _self, int start_pos, int end_pos);
        void gtk_editable_set_alignment(long _self, float xalign);
        void gtk_editable_set_editable(long _self, boolean is_editable);
        void gtk_editable_set_enable_undo(long _self, boolean enable_undo);
        void gtk_editable_set_max_width_chars(long _self, int n_chars);
        void gtk_editable_set_position(long _self, int position);
        void gtk_editable_set_text(long _self, long text);
        void gtk_editable_set_text(long _self, String text);
        void gtk_editable_set_width_chars(long _self, int n_chars);
        boolean gtk_editable_delegate_get_property(long object, int prop_id, long value, long pspec);
        boolean gtk_editable_delegate_set_property(long object, int prop_id, long value, long pspec);
        int gtk_editable_install_properties(long object_class, int first_prop);
        long gtk_editable_get_type();
    }

}
