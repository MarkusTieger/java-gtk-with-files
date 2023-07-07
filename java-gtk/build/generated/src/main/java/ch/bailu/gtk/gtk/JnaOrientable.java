/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaOrientable {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gtk_orientable_get_orientation(long _self);
        void gtk_orientable_set_orientation(long _self, int orientation);
        long gtk_orientable_get_type();
    }

}
