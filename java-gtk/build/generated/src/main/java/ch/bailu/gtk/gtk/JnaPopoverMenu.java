/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPopoverMenu {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_popover_menu_new_from_model(long model);
        long gtk_popover_menu_new_from_model_full(long model, int flags);
        boolean gtk_popover_menu_add_child(long _self, long child, long id);
        boolean gtk_popover_menu_add_child(long _self, long child, String id);
        long gtk_popover_menu_get_menu_model(long _self);
        boolean gtk_popover_menu_remove_child(long _self, long child);
        void gtk_popover_menu_set_menu_model(long _self, long model);
        long gtk_popover_menu_get_type();
    }

}
