/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaDebugControllerDBus {

    @FunctionalInterface
    public interface OnAuthorize extends com.sun.jna.Callback {
        boolean invoke(long _self, long invocation, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_debug_controller_dbus_new(long connection, long cancellable, long _error);
        void g_debug_controller_dbus_stop(long _self);
        long g_debug_controller_dbus_get_type();
    }

}
