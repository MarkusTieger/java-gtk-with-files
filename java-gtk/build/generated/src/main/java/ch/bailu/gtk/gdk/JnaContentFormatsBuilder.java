/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaContentFormatsBuilder {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_content_formats_builder_new();
        void gdk_content_formats_builder_add_formats(long _self, long formats);
        void gdk_content_formats_builder_add_gtype(long _self, long type);
        void gdk_content_formats_builder_add_mime_type(long _self, long mime_type);
        void gdk_content_formats_builder_add_mime_type(long _self, String mime_type);
        long gdk_content_formats_builder_free_to_formats(long _self);
        long gdk_content_formats_builder_ref(long _self);
        long gdk_content_formats_builder_to_formats(long _self);
        void gdk_content_formats_builder_unref(long _self);
        long gdk_content_formats_builder_get_type();
    }

}
