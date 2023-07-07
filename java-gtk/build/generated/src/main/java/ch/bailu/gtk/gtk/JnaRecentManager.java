/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaRecentManager {

    @FunctionalInterface
    public interface OnChanged extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_recent_manager_new();
        boolean gtk_recent_manager_add_full(long _self, long uri, long recent_data);
        boolean gtk_recent_manager_add_full(long _self, String uri, long recent_data);
        boolean gtk_recent_manager_add_item(long _self, long uri);
        boolean gtk_recent_manager_add_item(long _self, String uri);
        long gtk_recent_manager_get_items(long _self);
        boolean gtk_recent_manager_has_item(long _self, long uri);
        boolean gtk_recent_manager_has_item(long _self, String uri);
        long gtk_recent_manager_lookup_item(long _self, long uri, long _error);
        long gtk_recent_manager_lookup_item(long _self, String uri, long _error);
        boolean gtk_recent_manager_move_item(long _self, long uri, long new_uri, long _error);
        boolean gtk_recent_manager_move_item(long _self, String uri, String new_uri, long _error);
        int gtk_recent_manager_purge_items(long _self, long _error);
        boolean gtk_recent_manager_remove_item(long _self, long uri, long _error);
        boolean gtk_recent_manager_remove_item(long _self, String uri, long _error);
        long gtk_recent_manager_get_default();
        long gtk_recent_manager_get_type();
    }

}
