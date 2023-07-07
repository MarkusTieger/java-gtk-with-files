/* this file is machine generated */
package ch.bailu.gtk.pango;




class JnaFontFamily {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pango-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_font_family_get_face(long _self, long name);
        long pango_font_family_get_face(long _self, String name);
        long pango_font_family_get_name(long _self);
        boolean pango_font_family_is_monospace(long _self);
        boolean pango_font_family_is_variable(long _self);
        long pango_font_family_get_type();
    }

}
