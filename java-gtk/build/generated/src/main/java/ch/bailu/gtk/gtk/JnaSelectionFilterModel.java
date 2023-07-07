/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSelectionFilterModel {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_selection_filter_model_new(long model);
        long gtk_selection_filter_model_get_model(long _self);
        void gtk_selection_filter_model_set_model(long _self, long model);
        long gtk_selection_filter_model_get_type();
    }

}
