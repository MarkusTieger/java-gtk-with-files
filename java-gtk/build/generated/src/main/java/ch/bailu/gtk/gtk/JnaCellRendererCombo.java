/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellRendererCombo {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long path_string, long new_iter, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_renderer_combo_new();
        long gtk_cell_renderer_combo_get_type();
    }

}
