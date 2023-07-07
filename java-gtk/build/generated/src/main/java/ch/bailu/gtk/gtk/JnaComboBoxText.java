/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaComboBoxText {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_combo_box_text_new();
        long gtk_combo_box_text_new_with_entry();
        void gtk_combo_box_text_append(long _self, long id, long text);
        void gtk_combo_box_text_append(long _self, String id, String text);
        void gtk_combo_box_text_append_text(long _self, long text);
        void gtk_combo_box_text_append_text(long _self, String text);
        long gtk_combo_box_text_get_active_text(long _self);
        void gtk_combo_box_text_insert(long _self, int position, long id, long text);
        void gtk_combo_box_text_insert(long _self, int position, String id, String text);
        void gtk_combo_box_text_insert_text(long _self, int position, long text);
        void gtk_combo_box_text_insert_text(long _self, int position, String text);
        void gtk_combo_box_text_prepend(long _self, long id, long text);
        void gtk_combo_box_text_prepend(long _self, String id, String text);
        void gtk_combo_box_text_prepend_text(long _self, long text);
        void gtk_combo_box_text_prepend_text(long _self, String text);
        void gtk_combo_box_text_remove(long _self, int position);
        void gtk_combo_box_text_remove_all(long _self);
        long gtk_combo_box_text_get_type();
    }

}
