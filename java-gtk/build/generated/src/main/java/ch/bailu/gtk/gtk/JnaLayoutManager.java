/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaLayoutManager {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_layout_manager_allocate(long _self, long widget, int width, int height, int baseline);
        long gtk_layout_manager_get_layout_child(long _self, long child);
        int gtk_layout_manager_get_request_mode(long _self);
        long gtk_layout_manager_get_widget(long _self);
        void gtk_layout_manager_layout_changed(long _self);
        void gtk_layout_manager_measure(long _self, long widget, int orientation, int for_size, long minimum, long natural, long minimum_baseline, long natural_baseline);
        long gtk_layout_manager_get_type();
    }

}
