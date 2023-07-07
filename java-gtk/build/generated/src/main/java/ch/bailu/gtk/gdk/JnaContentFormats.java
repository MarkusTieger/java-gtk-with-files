/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaContentFormats {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_content_formats_new(long mime_types, int n_mime_types);
        long gdk_content_formats_new_for_gtype(long type);
        boolean gdk_content_formats_contain_gtype(long _self, long type);
        boolean gdk_content_formats_contain_mime_type(long _self, long mime_type);
        boolean gdk_content_formats_contain_mime_type(long _self, String mime_type);
        long gdk_content_formats_get_mime_types(long _self, long n_mime_types);
        boolean gdk_content_formats_match(long _self, long second);
        long gdk_content_formats_match_gtype(long _self, long second);
        long gdk_content_formats_match_mime_type(long _self, long second);
        void gdk_content_formats_print(long _self, long string);
        long gdk_content_formats_ref(long _self);
        long gdk_content_formats_to_string(long _self);
        long gdk_content_formats_union(long _self, long second);
        long gdk_content_formats_union_deserialize_gtypes(long _self);
        long gdk_content_formats_union_deserialize_mime_types(long _self);
        long gdk_content_formats_union_serialize_gtypes(long _self);
        long gdk_content_formats_union_serialize_mime_types(long _self);
        void gdk_content_formats_unref(long _self);
        long gdk_content_formats_parse(long string);
        long gdk_content_formats_get_type();
    }

}
