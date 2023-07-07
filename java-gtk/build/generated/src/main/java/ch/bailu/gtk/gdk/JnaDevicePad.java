/* this file is machine generated */
package ch.bailu.gtk.gdk;




class JnaDevicePad {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        int gdk_device_pad_get_feature_group(long _self, int feature, int feature_idx);
        int gdk_device_pad_get_group_n_modes(long _self, int group_idx);
        int gdk_device_pad_get_n_features(long _self, int feature);
        int gdk_device_pad_get_n_groups(long _self);
        long gdk_device_pad_get_type();
    }

}
