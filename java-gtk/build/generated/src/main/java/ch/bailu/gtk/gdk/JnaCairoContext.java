/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaCairoContext {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_cairo_context_cairo_create(long _self);
        long gdk_cairo_context_get_type();
    }

}
