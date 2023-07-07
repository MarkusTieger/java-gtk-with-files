/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaColorButton {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnColorSet extends com.sun.jna.Callback {
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
        long gtk_color_button_new();
        long gtk_color_button_new_with_rgba(long rgba);
        boolean gtk_color_button_get_modal(long _self);
        long gtk_color_button_get_title(long _self);
        void gtk_color_button_set_modal(long _self, boolean modal);
        void gtk_color_button_set_title(long _self, long title);
        void gtk_color_button_set_title(long _self, String title);
        long gtk_color_button_get_type();
    }

}
