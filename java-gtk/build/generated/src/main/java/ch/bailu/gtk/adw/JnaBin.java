/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaBin {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_bin_new();
        long adw_bin_get_child(long _self);
        void adw_bin_set_child(long _self, long child);
        long adw_bin_get_type();
    }

}
