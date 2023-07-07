/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaCrossingEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_crossing_event_get_detail(long _self);
        boolean gdk_crossing_event_get_focus(long _self);
        int gdk_crossing_event_get_mode(long _self);
        long gdk_crossing_event_get_type();
    }

}
