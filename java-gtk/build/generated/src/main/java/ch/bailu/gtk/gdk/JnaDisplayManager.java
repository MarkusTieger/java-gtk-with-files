/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDisplayManager {

    @FunctionalInterface
    public interface OnDisplayOpened extends com.sun.jna.Callback {
        void invoke(long _self, long display, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_display_manager_get_default_display(long _self);
        long gdk_display_manager_list_displays(long _self);
        long gdk_display_manager_open_display(long _self, long name);
        long gdk_display_manager_open_display(long _self, String name);
        void gdk_display_manager_set_default_display(long _self, long display);
        long gdk_display_manager_get();
        long gdk_display_manager_get_type();
    }

}
