/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaWindowGroup {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_window_group_new();
        void gtk_window_group_add_window(long _self, long window);
        long gtk_window_group_list_windows(long _self);
        void gtk_window_group_remove_window(long _self, long window);
        long gtk_window_group_get_type();
    }

}
