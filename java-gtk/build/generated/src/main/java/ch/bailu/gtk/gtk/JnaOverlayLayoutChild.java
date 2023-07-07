/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaOverlayLayoutChild {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gtk_overlay_layout_child_get_clip_overlay(long _self);
        boolean gtk_overlay_layout_child_get_measure(long _self);
        void gtk_overlay_layout_child_set_clip_overlay(long _self, boolean clip_overlay);
        void gtk_overlay_layout_child_set_measure(long _self, boolean measure);
        long gtk_overlay_layout_child_get_type();
    }

}
