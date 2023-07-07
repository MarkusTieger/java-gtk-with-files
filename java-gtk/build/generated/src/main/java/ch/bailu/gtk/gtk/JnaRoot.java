/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaRoot {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_root_get_display(long _self);
        long gtk_root_get_focus(long _self);
        void gtk_root_set_focus(long _self, long focus);
        long gtk_root_get_type();
    }

}
