/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaTouchEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        boolean gdk_touch_event_get_emulating_pointer(long _self);
        long gdk_touch_event_get_type();
    }

}
