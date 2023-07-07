/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPopoverMenuBar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_popover_menu_bar_new_from_model(long model);
        boolean gtk_popover_menu_bar_add_child(long _self, long child, long id);
        boolean gtk_popover_menu_bar_add_child(long _self, long child, String id);
        long gtk_popover_menu_bar_get_menu_model(long _self);
        boolean gtk_popover_menu_bar_remove_child(long _self, long child);
        void gtk_popover_menu_bar_set_menu_model(long _self, long model);
        long gtk_popover_menu_bar_get_type();
    }

}
