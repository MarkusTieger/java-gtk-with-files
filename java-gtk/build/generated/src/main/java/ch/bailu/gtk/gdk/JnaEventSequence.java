/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaEventSequence {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gdk_event_sequence_get_type();
    }

}
