/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaTreeRowReference {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_tree_row_reference_new(long model, long path);
        long gtk_tree_row_reference_new_proxy(long proxy, long model, long path);
        long gtk_tree_row_reference_copy(long _self);
        void gtk_tree_row_reference_free(long _self);
        long gtk_tree_row_reference_get_model(long _self);
        long gtk_tree_row_reference_get_path(long _self);
        boolean gtk_tree_row_reference_valid(long _self);
        void gtk_tree_row_reference_deleted(long proxy, long path);
        void gtk_tree_row_reference_inserted(long proxy, long path);
        void gtk_tree_row_reference_reordered(long proxy, long path, long iter, long new_order);
        long gtk_tree_row_reference_get_type();
    }

}
