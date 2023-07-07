/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaToplevelLayout {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_toplevel_layout_new();
        long gdk_toplevel_layout_copy(long _self);
        boolean gdk_toplevel_layout_equal(long _self, long other);
        boolean gdk_toplevel_layout_get_fullscreen(long _self, long fullscreen);
        long gdk_toplevel_layout_get_fullscreen_monitor(long _self);
        boolean gdk_toplevel_layout_get_maximized(long _self, long maximized);
        boolean gdk_toplevel_layout_get_resizable(long _self);
        long gdk_toplevel_layout_ref(long _self);
        void gdk_toplevel_layout_set_fullscreen(long _self, boolean fullscreen, long monitor);
        void gdk_toplevel_layout_set_maximized(long _self, boolean maximized);
        void gdk_toplevel_layout_set_resizable(long _self, boolean resizable);
        void gdk_toplevel_layout_unref(long _self);
        long gdk_toplevel_layout_get_type();
    }

}
