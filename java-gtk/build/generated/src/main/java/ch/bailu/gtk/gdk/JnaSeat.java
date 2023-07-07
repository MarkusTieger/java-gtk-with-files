/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaSeat {

    @FunctionalInterface
    public interface OnDeviceAdded extends com.sun.jna.Callback {
        void invoke(long _self, long device, long _data);
    }

    @FunctionalInterface
    public interface OnDeviceRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long device, long _data);
    }

    @FunctionalInterface
    public interface OnToolAdded extends com.sun.jna.Callback {
        void invoke(long _self, long tool, long _data);
    }

    @FunctionalInterface
    public interface OnToolRemoved extends com.sun.jna.Callback {
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
        int gdk_seat_get_capabilities(long _self);
        long gdk_seat_get_devices(long _self, int capabilities);
        long gdk_seat_get_display(long _self);
        long gdk_seat_get_keyboard(long _self);
        long gdk_seat_get_pointer(long _self);
        long gdk_seat_get_tools(long _self);
        long gdk_seat_get_type();
    }

}
