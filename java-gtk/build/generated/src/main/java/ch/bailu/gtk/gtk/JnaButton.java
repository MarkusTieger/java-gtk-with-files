/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaButton {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnClicked extends com.sun.jna.Callback {
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
        long gtk_button_new();
        long gtk_button_new_from_icon_name(long icon_name);
        long gtk_button_new_from_icon_name(String icon_name);
        long gtk_button_new_with_label(long label);
        long gtk_button_new_with_label(String label);
        long gtk_button_new_with_mnemonic(long label);
        long gtk_button_new_with_mnemonic(String label);
        long gtk_button_get_child(long _self);
        boolean gtk_button_get_has_frame(long _self);
        long gtk_button_get_icon_name(long _self);
        long gtk_button_get_label(long _self);
        boolean gtk_button_get_use_underline(long _self);
        void gtk_button_set_child(long _self, long child);
        void gtk_button_set_has_frame(long _self, boolean has_frame);
        void gtk_button_set_icon_name(long _self, long icon_name);
        void gtk_button_set_icon_name(long _self, String icon_name);
        void gtk_button_set_label(long _self, long label);
        void gtk_button_set_label(long _self, String label);
        void gtk_button_set_use_underline(long _self, boolean use_underline);
        long gtk_button_get_type();
    }

}
