/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaLockButton {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_lock_button_new(long permission);
        long gtk_lock_button_get_permission(long _self);
        void gtk_lock_button_set_permission(long _self, long permission);
        long gtk_lock_button_get_type();
    }

}
