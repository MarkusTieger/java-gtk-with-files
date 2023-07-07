/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSortListModel {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_sort_list_model_new(long model, long sorter);
        boolean gtk_sort_list_model_get_incremental(long _self);
        long gtk_sort_list_model_get_model(long _self);
        int gtk_sort_list_model_get_pending(long _self);
        long gtk_sort_list_model_get_sorter(long _self);
        void gtk_sort_list_model_set_incremental(long _self, boolean incremental);
        void gtk_sort_list_model_set_model(long _self, long model);
        void gtk_sort_list_model_set_sorter(long _self, long sorter);
        long gtk_sort_list_model_get_type();
    }

}
