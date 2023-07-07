/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaAppChooserButton {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCustomItemActivated extends com.sun.jna.Callback {
        void invoke(long _self, long item_name, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_app_chooser_button_new(long content_type);
        long gtk_app_chooser_button_new(String content_type);
        void gtk_app_chooser_button_append_custom_item(long _self, long name, long label, long icon);
        void gtk_app_chooser_button_append_custom_item(long _self, String name, String label, long icon);
        void gtk_app_chooser_button_append_separator(long _self);
        long gtk_app_chooser_button_get_heading(long _self);
        boolean gtk_app_chooser_button_get_modal(long _self);
        boolean gtk_app_chooser_button_get_show_default_item(long _self);
        boolean gtk_app_chooser_button_get_show_dialog_item(long _self);
        void gtk_app_chooser_button_set_active_custom_item(long _self, long name);
        void gtk_app_chooser_button_set_active_custom_item(long _self, String name);
        void gtk_app_chooser_button_set_heading(long _self, long heading);
        void gtk_app_chooser_button_set_heading(long _self, String heading);
        void gtk_app_chooser_button_set_modal(long _self, boolean modal);
        void gtk_app_chooser_button_set_show_default_item(long _self, boolean setting);
        void gtk_app_chooser_button_set_show_dialog_item(long _self, boolean setting);
        long gtk_app_chooser_button_get_type();
    }

}
