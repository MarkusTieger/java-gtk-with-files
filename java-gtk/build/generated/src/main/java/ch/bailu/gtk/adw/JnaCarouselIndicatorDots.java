/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaCarouselIndicatorDots {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_carousel_indicator_dots_new();
        long adw_carousel_indicator_dots_get_carousel(long _self);
        void adw_carousel_indicator_dots_set_carousel(long _self, long carousel);
        long adw_carousel_indicator_dots_get_type();
    }

}
