/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDragSurface {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gdk_drag_surface_present(long _self, int width, int height);
        long gdk_drag_surface_get_type();
    }

}
