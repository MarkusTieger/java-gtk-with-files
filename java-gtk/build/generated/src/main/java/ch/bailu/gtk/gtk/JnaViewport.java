/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaViewport {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_viewport_new(long hadjustment, long vadjustment);
        long gtk_viewport_get_child(long _self);
        boolean gtk_viewport_get_scroll_to_focus(long _self);
        void gtk_viewport_set_child(long _self, long child);
        void gtk_viewport_set_scroll_to_focus(long _self, boolean scroll_to_focus);
        long gtk_viewport_get_type();
    }

}
