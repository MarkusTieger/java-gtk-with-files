/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMultiSorter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_multi_sorter_new();
        void gtk_multi_sorter_append(long _self, long sorter);
        void gtk_multi_sorter_remove(long _self, int position);
        long gtk_multi_sorter_get_type();
    }

}
