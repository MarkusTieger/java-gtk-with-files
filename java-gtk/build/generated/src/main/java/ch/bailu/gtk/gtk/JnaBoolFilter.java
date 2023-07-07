/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaBoolFilter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_bool_filter_new(long expression);
        long gtk_bool_filter_get_expression(long _self);
        boolean gtk_bool_filter_get_invert(long _self);
        void gtk_bool_filter_set_expression(long _self, long expression);
        void gtk_bool_filter_set_invert(long _self, boolean invert);
        long gtk_bool_filter_get_type();
    }

}
