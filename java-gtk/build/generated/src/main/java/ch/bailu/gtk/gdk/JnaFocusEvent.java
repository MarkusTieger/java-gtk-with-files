/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaFocusEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gdk_focus_event_get_in(long _self);
        long gdk_focus_event_get_type();
    }

}
