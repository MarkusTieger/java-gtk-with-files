/* this file is machine generated */
package ch.bailu.gtk.gsk;




class JnaBroadwayRenderer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gsk_broadway_renderer_new();
        long gsk_broadway_renderer_get_type();
    }

}
