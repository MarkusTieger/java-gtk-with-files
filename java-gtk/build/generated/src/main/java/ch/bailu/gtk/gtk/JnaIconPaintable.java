/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaIconPaintable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_icon_paintable_new_for_file(long file, int size, int scale);
        long gtk_icon_paintable_get_file(long _self);
        long gtk_icon_paintable_get_icon_name(long _self);
        boolean gtk_icon_paintable_is_symbolic(long _self);
        long gtk_icon_paintable_get_type();
    }

}
