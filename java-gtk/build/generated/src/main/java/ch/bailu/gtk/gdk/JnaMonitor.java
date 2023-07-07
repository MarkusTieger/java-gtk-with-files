/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaMonitor {

    @FunctionalInterface
    public interface OnInvalidate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_monitor_get_connector(long _self);
        long gdk_monitor_get_display(long _self);
        void gdk_monitor_get_geometry(long _self, long geometry);
        int gdk_monitor_get_height_mm(long _self);
        long gdk_monitor_get_manufacturer(long _self);
        long gdk_monitor_get_model(long _self);
        int gdk_monitor_get_refresh_rate(long _self);
        int gdk_monitor_get_scale_factor(long _self);
        int gdk_monitor_get_subpixel_layout(long _self);
        int gdk_monitor_get_width_mm(long _self);
        boolean gdk_monitor_is_valid(long _self);
        long gdk_monitor_get_type();
    }

}
