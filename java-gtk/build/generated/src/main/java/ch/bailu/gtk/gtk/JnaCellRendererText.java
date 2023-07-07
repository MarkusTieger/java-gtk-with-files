/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCellRendererText {

    @FunctionalInterface
    public interface OnEdited extends com.sun.jna.Callback {
        void invoke(long _self, long path, long new_text, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_cell_renderer_text_new();
        void gtk_cell_renderer_text_set_fixed_height_from_font(long _self, int number_of_rows);
        long gtk_cell_renderer_text_get_type();
    }

}
