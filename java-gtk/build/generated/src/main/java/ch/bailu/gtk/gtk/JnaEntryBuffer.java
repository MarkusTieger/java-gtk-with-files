/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaEntryBuffer {

    @FunctionalInterface
    public interface OnDeletedText extends com.sun.jna.Callback {
        void invoke(long _self, int position, int n_chars, long _data);
    }

    @FunctionalInterface
    public interface OnInsertedText extends com.sun.jna.Callback {
        void invoke(long _self, int position, long chars, int n_chars, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_entry_buffer_new(long initial_chars, int n_initial_chars);
        long gtk_entry_buffer_new(String initial_chars, int n_initial_chars);
        int gtk_entry_buffer_delete_text(long _self, int position, int n_chars);
        void gtk_entry_buffer_emit_deleted_text(long _self, int position, int n_chars);
        void gtk_entry_buffer_emit_inserted_text(long _self, int position, long chars, int n_chars);
        void gtk_entry_buffer_emit_inserted_text(long _self, int position, String chars, int n_chars);
        long gtk_entry_buffer_get_bytes(long _self);
        int gtk_entry_buffer_get_length(long _self);
        int gtk_entry_buffer_get_max_length(long _self);
        long gtk_entry_buffer_get_text(long _self);
        int gtk_entry_buffer_insert_text(long _self, int position, long chars, int n_chars);
        int gtk_entry_buffer_insert_text(long _self, int position, String chars, int n_chars);
        void gtk_entry_buffer_set_max_length(long _self, int max_length);
        void gtk_entry_buffer_set_text(long _self, long chars, int n_chars);
        void gtk_entry_buffer_set_text(long _self, String chars, int n_chars);
        long gtk_entry_buffer_get_type();
    }

}
