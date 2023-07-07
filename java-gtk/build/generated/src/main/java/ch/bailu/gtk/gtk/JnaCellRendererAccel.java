/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellRendererAccel {

    @FunctionalInterface
    public interface OnAccelCleared extends com.sun.jna.Callback {
        void invoke(long _self, long path_string, long _data);
    }

    @FunctionalInterface
    public interface OnAccelEdited extends com.sun.jna.Callback {
        void invoke(long _self, long path_string, int accel_key, int accel_mods, int hardware_keycode, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_renderer_accel_new();
        long gtk_cell_renderer_accel_get_type();
    }

}
