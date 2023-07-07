/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBitsetIter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gtk_bitset_iter_get_value(long _self);
        boolean gtk_bitset_iter_is_valid(long _self);
        long gtk_bitset_iter_get_type();
    }

}
