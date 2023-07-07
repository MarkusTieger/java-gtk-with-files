/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFileChooserNative {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_file_chooser_native_new(long title, long parent, int action, long accept_label, long cancel_label);
        long gtk_file_chooser_native_new(String title, long parent, int action, String accept_label, String cancel_label);
        long gtk_file_chooser_native_get_accept_label(long _self);
        long gtk_file_chooser_native_get_cancel_label(long _self);
        void gtk_file_chooser_native_set_accept_label(long _self, long accept_label);
        void gtk_file_chooser_native_set_accept_label(long _self, String accept_label);
        void gtk_file_chooser_native_set_cancel_label(long _self, long cancel_label);
        void gtk_file_chooser_native_set_cancel_label(long _self, String cancel_label);
        long gtk_file_chooser_native_get_type();
    }

}
