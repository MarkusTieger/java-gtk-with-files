/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaInitiallyUnowned {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_initially_unowned_get_type();
    }

}
