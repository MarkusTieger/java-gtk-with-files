/* this file is machine generated */
package ch.bailu.gtk.cairo;




class JnaDevice {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("cairo", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long cairo_gobject_device_get_type();
    }

}
