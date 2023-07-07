/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontFace {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_font_face_describe(long _self);
        long pango_font_face_get_face_name(long _self);
        long pango_font_face_get_family(long _self);
        boolean pango_font_face_is_synthesized(long _self);
        long pango_font_face_get_type();
    }

}
