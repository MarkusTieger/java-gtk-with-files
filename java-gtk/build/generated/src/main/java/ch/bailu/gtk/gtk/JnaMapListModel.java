/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMapListModel {

    @FunctionalInterface
    public interface OnMapListModelMapFunc extends com.sun.jna.Callback {
        long invoke(long item, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_map_list_model_new(long model, com.sun.jna.Callback map_func, long user_data, com.sun.jna.Callback user_destroy);
        long gtk_map_list_model_get_model(long _self);
        boolean gtk_map_list_model_has_map(long _self);
        void gtk_map_list_model_set_map_func(long _self, com.sun.jna.Callback map_func, long user_data, com.sun.jna.Callback user_destroy);
        void gtk_map_list_model_set_model(long _self, long model);
        long gtk_map_list_model_get_type();
    }

}
