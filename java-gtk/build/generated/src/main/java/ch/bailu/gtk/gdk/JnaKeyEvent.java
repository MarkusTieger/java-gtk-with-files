/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaKeyEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_key_event_get_consumed_modifiers(long _self);
        int gdk_key_event_get_keycode(long _self);
        int gdk_key_event_get_keyval(long _self);
        int gdk_key_event_get_layout(long _self);
        int gdk_key_event_get_level(long _self);
        boolean gdk_key_event_is_modifier(long _self);
        int gdk_key_event_matches(long _self, int keyval, int modifiers);
        long gdk_key_event_get_type();
    }

}
