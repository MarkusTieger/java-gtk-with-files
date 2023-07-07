/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaSqueezerPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_squeezer_page_get_child(long _self);
        boolean adw_squeezer_page_get_enabled(long _self);
        void adw_squeezer_page_set_enabled(long _self, boolean enabled);
        long adw_squeezer_page_get_type();
    }

}
