/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaColorChooser {

    @FunctionalInterface
    public interface OnColorActivated extends com.sun.jna.Callback {
        void invoke(long _self, long color, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gtk_color_chooser_get_rgba(long _self, long color);
        boolean gtk_color_chooser_get_use_alpha(long _self);
        void gtk_color_chooser_set_rgba(long _self, long color);
        void gtk_color_chooser_set_use_alpha(long _self, boolean use_alpha);
        long gtk_color_chooser_get_type();
    }

}
