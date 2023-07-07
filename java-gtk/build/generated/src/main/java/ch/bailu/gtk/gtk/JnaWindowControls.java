/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaWindowControls {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_window_controls_new(int side);
        long gtk_window_controls_get_decoration_layout(long _self);
        boolean gtk_window_controls_get_empty(long _self);
        int gtk_window_controls_get_side(long _self);
        void gtk_window_controls_set_decoration_layout(long _self, long layout);
        void gtk_window_controls_set_decoration_layout(long _self, String layout);
        void gtk_window_controls_set_side(long _self, int side);
        long gtk_window_controls_get_type();
    }

}
