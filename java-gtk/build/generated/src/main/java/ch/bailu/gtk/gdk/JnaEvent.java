/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_event_get_device(long _self);
        long gdk_event_get_device_tool(long _self);
        long gdk_event_get_display(long _self);
        long gdk_event_get_event_sequence(long _self);
        int gdk_event_get_event_type(long _self);
        int gdk_event_get_modifier_state(long _self);
        boolean gdk_event_get_pointer_emulated(long _self);
        long gdk_event_get_seat(long _self);
        long gdk_event_get_surface(long _self);
        int gdk_event_get_time(long _self);
        long gdk_event_ref(long _self);
        boolean gdk_event_triggers_context_menu(long _self);
        void gdk_event_unref(long _self);
        long gdk_event_get_type();
    }

}
