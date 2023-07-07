/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStringFilter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_string_filter_new(long expression);
        long gtk_string_filter_get_expression(long _self);
        boolean gtk_string_filter_get_ignore_case(long _self);
        int gtk_string_filter_get_match_mode(long _self);
        long gtk_string_filter_get_search(long _self);
        void gtk_string_filter_set_expression(long _self, long expression);
        void gtk_string_filter_set_ignore_case(long _self, boolean ignore_case);
        void gtk_string_filter_set_match_mode(long _self, int mode);
        void gtk_string_filter_set_search(long _self, long search);
        void gtk_string_filter_set_search(long _self, String search);
        long gtk_string_filter_get_type();
    }

}
