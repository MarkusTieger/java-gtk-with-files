/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFont {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_font_describe(long _self);
        long pango_font_describe_with_absolute_size(long _self);
        long pango_font_get_coverage(long _self, long language);
        long pango_font_get_face(long _self);
        long pango_font_get_font_map(long _self);
        long pango_font_get_metrics(long _self, long language);
        boolean pango_font_has_char(long _self, byte wc);
        long pango_font_serialize(long _self);
        long pango_font_deserialize(long context, long bytes, long _error);
        long pango_font_get_type();
    }

}
