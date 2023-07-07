/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaPadEvent {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_pad_event_get_button(long _self);
        long gdk_pad_event_get_type();
    }

}
