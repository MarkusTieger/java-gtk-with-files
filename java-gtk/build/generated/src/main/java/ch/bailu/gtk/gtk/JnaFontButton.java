/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaFontButton {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnFontSet extends com.sun.jna.Callback {
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
        long gtk_font_button_new();
        long gtk_font_button_new_with_font(long fontname);
        long gtk_font_button_new_with_font(String fontname);
        boolean gtk_font_button_get_modal(long _self);
        long gtk_font_button_get_title(long _self);
        boolean gtk_font_button_get_use_font(long _self);
        boolean gtk_font_button_get_use_size(long _self);
        void gtk_font_button_set_modal(long _self, boolean modal);
        void gtk_font_button_set_title(long _self, long title);
        void gtk_font_button_set_title(long _self, String title);
        void gtk_font_button_set_use_font(long _self, boolean use_font);
        void gtk_font_button_set_use_size(long _self, boolean use_size);
        long gtk_font_button_get_type();
    }

}
