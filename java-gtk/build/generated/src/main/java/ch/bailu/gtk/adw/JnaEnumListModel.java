/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaEnumListModel {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_enum_list_model_new(long enum_type);
        int adw_enum_list_model_find_position(long _self, int value);
        long adw_enum_list_model_get_enum_type(long _self);
        long adw_enum_list_model_get_type();
    }

}
