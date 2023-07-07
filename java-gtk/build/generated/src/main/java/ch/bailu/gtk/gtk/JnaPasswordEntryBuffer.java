/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPasswordEntryBuffer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_password_entry_buffer_new();
        long gtk_password_entry_buffer_get_type();
    }

}
