/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaCheckButton {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

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
        long gtk_check_button_new();
        long gtk_check_button_new_with_label(long label);
        long gtk_check_button_new_with_label(String label);
        long gtk_check_button_new_with_mnemonic(long label);
        long gtk_check_button_new_with_mnemonic(String label);
        boolean gtk_check_button_get_active(long _self);
        long gtk_check_button_get_child(long _self);
        boolean gtk_check_button_get_inconsistent(long _self);
        long gtk_check_button_get_label(long _self);
        boolean gtk_check_button_get_use_underline(long _self);
        void gtk_check_button_set_active(long _self, boolean setting);
        void gtk_check_button_set_child(long _self, long child);
        void gtk_check_button_set_group(long _self, long group);
        void gtk_check_button_set_inconsistent(long _self, boolean inconsistent);
        void gtk_check_button_set_label(long _self, long label);
        void gtk_check_button_set_label(long _self, String label);
        void gtk_check_button_set_use_underline(long _self, boolean setting);
        long gtk_check_button_get_type();
    }

}
