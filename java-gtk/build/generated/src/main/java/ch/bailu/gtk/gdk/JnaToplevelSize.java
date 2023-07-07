/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaToplevelSize {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gdk_toplevel_size_get_bounds(long _self, long bounds_width, long bounds_height);
        void gdk_toplevel_size_set_min_size(long _self, int min_width, int min_height);
        void gdk_toplevel_size_set_shadow_width(long _self, int left, int right, int top, int bottom);
        void gdk_toplevel_size_set_size(long _self, int width, int height);
    }

}
