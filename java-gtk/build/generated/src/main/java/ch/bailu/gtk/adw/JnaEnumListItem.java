/* this file is machine generated */
package ch.bailu.gtk.adw;




class JnaEnumListItem {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("adwaita-1", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long adw_enum_list_item_get_name(long _self);
        long adw_enum_list_item_get_nick(long _self);
        int adw_enum_list_item_get_value(long _self);
        long adw_enum_list_item_get_type();
    }

}
