/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaScrollEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_scroll_event_get_direction(long _self);
        int gdk_scroll_event_get_unit(long _self);
        boolean gdk_scroll_event_is_stop(long _self);
        long gdk_scroll_event_get_type();
    }

}
