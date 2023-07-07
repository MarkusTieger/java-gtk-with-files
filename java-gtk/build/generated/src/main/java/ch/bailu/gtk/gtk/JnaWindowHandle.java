/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaWindowHandle {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_window_handle_new();
        long gtk_window_handle_get_child(long _self);
        void gtk_window_handle_set_child(long _self, long child);
        long gtk_window_handle_get_type();
    }

}
