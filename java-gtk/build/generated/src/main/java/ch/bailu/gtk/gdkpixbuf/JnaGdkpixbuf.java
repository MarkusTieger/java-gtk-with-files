/* this file is machine generated */
package ch.bailu.gtk.gdkpixbuf;




class JnaGdkpixbuf {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gdk_pixbuf-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_pixbuf_error_quark();
    }

}
