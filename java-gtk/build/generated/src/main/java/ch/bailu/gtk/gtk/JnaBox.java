/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBox {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_box_new(int orientation, int spacing);
        void gtk_box_append(long _self, long child);
        int gtk_box_get_baseline_position(long _self);
        boolean gtk_box_get_homogeneous(long _self);
        int gtk_box_get_spacing(long _self);
        void gtk_box_insert_child_after(long _self, long child, long sibling);
        void gtk_box_prepend(long _self, long child);
        void gtk_box_remove(long _self, long child);
        void gtk_box_reorder_child_after(long _self, long child, long sibling);
        void gtk_box_set_baseline_position(long _self, int position);
        void gtk_box_set_homogeneous(long _self, boolean homogeneous);
        void gtk_box_set_spacing(long _self, int spacing);
        long gtk_box_get_type();
    }

}
