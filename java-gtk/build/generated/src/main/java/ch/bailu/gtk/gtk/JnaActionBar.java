/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaActionBar {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_action_bar_new();
        long gtk_action_bar_get_center_widget(long _self);
        boolean gtk_action_bar_get_revealed(long _self);
        void gtk_action_bar_pack_end(long _self, long child);
        void gtk_action_bar_pack_start(long _self, long child);
        void gtk_action_bar_remove(long _self, long child);
        void gtk_action_bar_set_center_widget(long _self, long center_widget);
        void gtk_action_bar_set_revealed(long _self, boolean revealed);
        long gtk_action_bar_get_type();
    }

}
