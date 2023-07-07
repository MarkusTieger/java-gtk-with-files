/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDisplay {

    @FunctionalInterface
    public interface OnClosed extends com.sun.jna.Callback {
        void invoke(long _self, boolean is_error, long _data);
    }

    @FunctionalInterface
    public interface OnOpened extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnSeatAdded extends com.sun.jna.Callback {
        void invoke(long _self, long seat, long _data);
    }

    @FunctionalInterface
    public interface OnSeatRemoved extends com.sun.jna.Callback {
        void invoke(long _self, long seat, long _data);
    }

    @FunctionalInterface
    public interface OnSettingChanged extends com.sun.jna.Callback {
        void invoke(long _self, long setting, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gdk_display_beep(long _self);
        void gdk_display_close(long _self);
        long gdk_display_create_gl_context(long _self, long _error);
        boolean gdk_display_device_is_grabbed(long _self, long device);
        void gdk_display_flush(long _self);
        long gdk_display_get_app_launch_context(long _self);
        long gdk_display_get_clipboard(long _self);
        long gdk_display_get_default_seat(long _self);
        long gdk_display_get_monitor_at_surface(long _self, long surface);
        long gdk_display_get_monitors(long _self);
        long gdk_display_get_name(long _self);
        long gdk_display_get_primary_clipboard(long _self);
        boolean gdk_display_get_setting(long _self, long name, long value);
        boolean gdk_display_get_setting(long _self, String name, long value);
        long gdk_display_get_startup_notification_id(long _self);
        boolean gdk_display_is_closed(long _self);
        boolean gdk_display_is_composited(long _self);
        boolean gdk_display_is_rgba(long _self);
        long gdk_display_list_seats(long _self);
        void gdk_display_notify_startup_complete(long _self, long startup_id);
        void gdk_display_notify_startup_complete(long _self, String startup_id);
        boolean gdk_display_prepare_gl(long _self, long _error);
        void gdk_display_put_event(long _self, long event);
        boolean gdk_display_supports_input_shapes(long _self);
        void gdk_display_sync(long _self);
        long gdk_display_get_default();
        long gdk_display_open(long display_name);
        long gdk_display_get_type();
    }

}
