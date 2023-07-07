/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFileFilter {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_file_filter_new();
        long gtk_file_filter_new_from_gvariant(long variant);
        void gtk_file_filter_add_mime_type(long _self, long mime_type);
        void gtk_file_filter_add_mime_type(long _self, String mime_type);
        void gtk_file_filter_add_pattern(long _self, long pattern);
        void gtk_file_filter_add_pattern(long _self, String pattern);
        void gtk_file_filter_add_pixbuf_formats(long _self);
        void gtk_file_filter_add_suffix(long _self, long suffix);
        void gtk_file_filter_add_suffix(long _self, String suffix);
        long gtk_file_filter_get_attributes(long _self);
        long gtk_file_filter_get_name(long _self);
        void gtk_file_filter_set_name(long _self, long name);
        void gtk_file_filter_set_name(long _self, String name);
        long gtk_file_filter_to_gvariant(long _self);
        long gtk_file_filter_get_type();
    }

}
