/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaToggleButton {

    @FunctionalInterface
    public interface OnToggled extends com.sun.jna.Callback {
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
        long gtk_toggle_button_new();
        long gtk_toggle_button_new_with_label(long label);
        long gtk_toggle_button_new_with_label(String label);
        long gtk_toggle_button_new_with_mnemonic(long label);
        long gtk_toggle_button_new_with_mnemonic(String label);
        boolean gtk_toggle_button_get_active(long _self);
        void gtk_toggle_button_set_active(long _self, boolean is_active);
        void gtk_toggle_button_set_group(long _self, long group);
        void gtk_toggle_button_toggled(long _self);
        long gtk_toggle_button_get_type();
    }

}
