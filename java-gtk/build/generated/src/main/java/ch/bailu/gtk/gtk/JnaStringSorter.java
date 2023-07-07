/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStringSorter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_string_sorter_new(long expression);
        long gtk_string_sorter_get_expression(long _self);
        boolean gtk_string_sorter_get_ignore_case(long _self);
        void gtk_string_sorter_set_expression(long _self, long expression);
        void gtk_string_sorter_set_ignore_case(long _self, boolean ignore_case);
        long gtk_string_sorter_get_type();
    }

}
