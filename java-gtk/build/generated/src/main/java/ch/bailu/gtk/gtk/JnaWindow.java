/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaWindow {

    @FunctionalInterface
    public interface OnActivateDefault extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnActivateFocus extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnCloseRequest extends com.sun.jna.Callback {
        boolean invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnEnableDebugging extends com.sun.jna.Callback {
        boolean invoke(long _self, boolean toggle, long _data);
    }

    @FunctionalInterface
    public interface OnKeysChanged extends com.sun.jna.Callback {
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
        long gtk_window_new();
        void gtk_window_close(long _self);
        void gtk_window_destroy(long _self);
        void gtk_window_fullscreen(long _self);
        void gtk_window_fullscreen_on_monitor(long _self, long monitor);
        long gtk_window_get_application(long _self);
        long gtk_window_get_child(long _self);
        boolean gtk_window_get_decorated(long _self);
        void gtk_window_get_default_size(long _self, long width, long height);
        long gtk_window_get_default_widget(long _self);
        boolean gtk_window_get_deletable(long _self);
        boolean gtk_window_get_destroy_with_parent(long _self);
        long gtk_window_get_focus(long _self);
        boolean gtk_window_get_focus_visible(long _self);
        long gtk_window_get_group(long _self);
        boolean gtk_window_get_handle_menubar_accel(long _self);
        boolean gtk_window_get_hide_on_close(long _self);
        long gtk_window_get_icon_name(long _self);
        boolean gtk_window_get_mnemonics_visible(long _self);
        boolean gtk_window_get_modal(long _self);
        boolean gtk_window_get_resizable(long _self);
        long gtk_window_get_title(long _self);
        long gtk_window_get_titlebar(long _self);
        long gtk_window_get_transient_for(long _self);
        boolean gtk_window_has_group(long _self);
        boolean gtk_window_is_active(long _self);
        boolean gtk_window_is_fullscreen(long _self);
        boolean gtk_window_is_maximized(long _self);
        void gtk_window_maximize(long _self);
        void gtk_window_minimize(long _self);
        void gtk_window_present(long _self);
        void gtk_window_present_with_time(long _self, int timestamp);
        void gtk_window_set_application(long _self, long application);
        void gtk_window_set_child(long _self, long child);
        void gtk_window_set_decorated(long _self, boolean setting);
        void gtk_window_set_default_size(long _self, int width, int height);
        void gtk_window_set_default_widget(long _self, long default_widget);
        void gtk_window_set_deletable(long _self, boolean setting);
        void gtk_window_set_destroy_with_parent(long _self, boolean setting);
        void gtk_window_set_display(long _self, long display);
        void gtk_window_set_focus(long _self, long focus);
        void gtk_window_set_focus_visible(long _self, boolean setting);
        void gtk_window_set_handle_menubar_accel(long _self, boolean handle_menubar_accel);
        void gtk_window_set_hide_on_close(long _self, boolean setting);
        void gtk_window_set_icon_name(long _self, long name);
        void gtk_window_set_icon_name(long _self, String name);
        void gtk_window_set_mnemonics_visible(long _self, boolean setting);
        void gtk_window_set_modal(long _self, boolean modal);
        void gtk_window_set_resizable(long _self, boolean resizable);
        void gtk_window_set_startup_id(long _self, long startup_id);
        void gtk_window_set_startup_id(long _self, String startup_id);
        void gtk_window_set_title(long _self, long title);
        void gtk_window_set_title(long _self, String title);
        void gtk_window_set_titlebar(long _self, long titlebar);
        void gtk_window_set_transient_for(long _self, long parent);
        void gtk_window_unfullscreen(long _self);
        void gtk_window_unmaximize(long _self);
        void gtk_window_unminimize(long _self);
        long gtk_window_get_default_icon_name();
        long gtk_window_get_toplevels();
        long gtk_window_list_toplevels();
        void gtk_window_set_auto_startup_notification(boolean setting);
        void gtk_window_set_default_icon_name(long name);
        void gtk_window_set_interactive_debugging(boolean enable);
        long gtk_window_get_type();
    }

}
