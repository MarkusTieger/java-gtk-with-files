/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMultiFilter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_multi_filter_append(long _self, long filter);
        void gtk_multi_filter_remove(long _self, int position);
        long gtk_multi_filter_get_type();
    }

}
