/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaMenuButton {

    @FunctionalInterface
    public interface OnMenuButtonCreatePopupFunc extends com.sun.jna.Callback {
        void invoke(long menu_button, long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
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
        long gtk_menu_button_new();
        boolean gtk_menu_button_get_always_show_arrow(long _self);
        long gtk_menu_button_get_child(long _self);
        int gtk_menu_button_get_direction(long _self);
        boolean gtk_menu_button_get_has_frame(long _self);
        long gtk_menu_button_get_icon_name(long _self);
        long gtk_menu_button_get_label(long _self);
        long gtk_menu_button_get_menu_model(long _self);
        long gtk_menu_button_get_popover(long _self);
        boolean gtk_menu_button_get_primary(long _self);
        boolean gtk_menu_button_get_use_underline(long _self);
        void gtk_menu_button_popdown(long _self);
        void gtk_menu_button_popup(long _self);
        void gtk_menu_button_set_always_show_arrow(long _self, boolean always_show_arrow);
        void gtk_menu_button_set_child(long _self, long child);
        void gtk_menu_button_set_create_popup_func(long _self, com.sun.jna.Callback func, long user_data, com.sun.jna.Callback destroy_notify);
        void gtk_menu_button_set_direction(long _self, int direction);
        void gtk_menu_button_set_has_frame(long _self, boolean has_frame);
        void gtk_menu_button_set_icon_name(long _self, long icon_name);
        void gtk_menu_button_set_icon_name(long _self, String icon_name);
        void gtk_menu_button_set_label(long _self, long label);
        void gtk_menu_button_set_label(long _self, String label);
        void gtk_menu_button_set_menu_model(long _self, long menu_model);
        void gtk_menu_button_set_popover(long _self, long popover);
        void gtk_menu_button_set_primary(long _self, boolean primary);
        void gtk_menu_button_set_use_underline(long _self, boolean use_underline);
        long gtk_menu_button_get_type();
    }

}
