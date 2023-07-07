/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDeviceTool {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_device_tool_get_axes(long _self);
        long gdk_device_tool_get_hardware_id(long _self);
        long gdk_device_tool_get_serial(long _self);
        int gdk_device_tool_get_tool_type(long _self);
        long gdk_device_tool_get_type();
    }

}
