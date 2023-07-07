/* this file is machine generated */
package ch.bailu.gtk.pangocairo;




class JnaFont {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("pangocairo-1.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long pango_cairo_font_get_scaled_font(long _self);
        long pango_cairo_font_get_type();
    }

}
