/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBoxLayout {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_box_layout_new(int orientation);
        int gtk_box_layout_get_baseline_position(long _self);
        boolean gtk_box_layout_get_homogeneous(long _self);
        int gtk_box_layout_get_spacing(long _self);
        void gtk_box_layout_set_baseline_position(long _self, int position);
        void gtk_box_layout_set_homogeneous(long _self, boolean homogeneous);
        void gtk_box_layout_set_spacing(long _self, int spacing);
        long gtk_box_layout_get_type();
    }

}
