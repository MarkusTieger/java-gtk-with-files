/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaPasswordEntryRow {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_password_entry_row_new();
        long adw_password_entry_row_get_type();
    }

}
