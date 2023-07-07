/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDevice {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnToolChanged extends com.sun.jna.Callback {
        void invoke(long _self, long tool, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gdk_device_get_caps_lock_state(long _self);
        long gdk_device_get_device_tool(long _self);
        int gdk_device_get_direction(long _self);
        long gdk_device_get_display(long _self);
        boolean gdk_device_get_has_cursor(long _self);
        int gdk_device_get_modifier_state(long _self);
        long gdk_device_get_name(long _self);
        boolean gdk_device_get_num_lock_state(long _self);
        int gdk_device_get_num_touches(long _self);
        long gdk_device_get_product_id(long _self);
        boolean gdk_device_get_scroll_lock_state(long _self);
        long gdk_device_get_seat(long _self);
        int gdk_device_get_source(long _self);
        int gdk_device_get_timestamp(long _self);
        long gdk_device_get_vendor_id(long _self);
        boolean gdk_device_has_bidi_layouts(long _self);
        long gdk_device_get_type();
    }

}
