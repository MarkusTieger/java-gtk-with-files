/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMultiSelection {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_multi_selection_new(long model);
        long gtk_multi_selection_get_model(long _self);
        void gtk_multi_selection_set_model(long _self, long model);
        long gtk_multi_selection_get_type();
    }

}
