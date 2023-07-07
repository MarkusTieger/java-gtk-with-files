/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPasswordEntry {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
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
        long gtk_password_entry_new();
        long gtk_password_entry_get_extra_menu(long _self);
        boolean gtk_password_entry_get_show_peek_icon(long _self);
        void gtk_password_entry_set_extra_menu(long _self, long model);
        void gtk_password_entry_set_show_peek_icon(long _self, boolean show_peek_icon);
        long gtk_password_entry_get_type();
    }

}
