/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSliceListModel {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_slice_list_model_new(long model, int offset, int size);
        long gtk_slice_list_model_get_model(long _self);
        int gtk_slice_list_model_get_offset(long _self);
        int gtk_slice_list_model_get_size(long _self);
        void gtk_slice_list_model_set_model(long _self, long model);
        void gtk_slice_list_model_set_offset(long _self, int offset);
        void gtk_slice_list_model_set_size(long _self, int size);
        long gtk_slice_list_model_get_type();
    }

}
