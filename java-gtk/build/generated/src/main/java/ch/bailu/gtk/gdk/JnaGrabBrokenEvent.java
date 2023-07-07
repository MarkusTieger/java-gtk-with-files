/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaGrabBrokenEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_grab_broken_event_get_grab_surface(long _self);
        boolean gdk_grab_broken_event_get_implicit(long _self);
        long gdk_grab_broken_event_get_type();
    }

}
