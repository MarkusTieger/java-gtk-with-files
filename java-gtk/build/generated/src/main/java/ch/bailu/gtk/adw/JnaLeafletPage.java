/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaLeafletPage {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_leaflet_page_get_child(long _self);
        long adw_leaflet_page_get_name(long _self);
        boolean adw_leaflet_page_get_navigatable(long _self);
        void adw_leaflet_page_set_name(long _self, long name);
        void adw_leaflet_page_set_name(long _self, String name);
        void adw_leaflet_page_set_navigatable(long _self, boolean navigatable);
        long adw_leaflet_page_get_type();
    }

}
