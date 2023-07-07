/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellRendererToggle {

    @FunctionalInterface
    public interface OnToggled extends com.sun.jna.Callback {
        void invoke(long _self, long path, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_renderer_toggle_new();
        boolean gtk_cell_renderer_toggle_get_activatable(long _self);
        boolean gtk_cell_renderer_toggle_get_active(long _self);
        boolean gtk_cell_renderer_toggle_get_radio(long _self);
        void gtk_cell_renderer_toggle_set_activatable(long _self, boolean setting);
        void gtk_cell_renderer_toggle_set_active(long _self, boolean setting);
        void gtk_cell_renderer_toggle_set_radio(long _self, boolean radio);
        long gtk_cell_renderer_toggle_get_type();
    }

}
