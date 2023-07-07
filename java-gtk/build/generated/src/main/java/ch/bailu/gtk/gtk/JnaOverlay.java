/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaOverlay {

    @FunctionalInterface
    public interface OnGetChildPosition extends com.sun.jna.Callback {
        boolean invoke(long _self, long widget, long allocation, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_overlay_new();
        void gtk_overlay_add_overlay(long _self, long widget);
        long gtk_overlay_get_child(long _self);
        boolean gtk_overlay_get_clip_overlay(long _self, long widget);
        boolean gtk_overlay_get_measure_overlay(long _self, long widget);
        void gtk_overlay_remove_overlay(long _self, long widget);
        void gtk_overlay_set_child(long _self, long child);
        void gtk_overlay_set_clip_overlay(long _self, long widget, boolean clip_overlay);
        void gtk_overlay_set_measure_overlay(long _self, long widget, boolean measure);
        long gtk_overlay_get_type();
    }

}
