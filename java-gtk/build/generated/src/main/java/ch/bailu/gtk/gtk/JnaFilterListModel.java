/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFilterListModel {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_filter_list_model_new(long model, long filter);
        long gtk_filter_list_model_get_filter(long _self);
        boolean gtk_filter_list_model_get_incremental(long _self);
        long gtk_filter_list_model_get_model(long _self);
        int gtk_filter_list_model_get_pending(long _self);
        void gtk_filter_list_model_set_filter(long _self, long filter);
        void gtk_filter_list_model_set_incremental(long _self, boolean incremental);
        void gtk_filter_list_model_set_model(long _self, long model);
        long gtk_filter_list_model_get_type();
    }

}
