/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaRevealer {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_revealer_new();
        long gtk_revealer_get_child(long _self);
        boolean gtk_revealer_get_child_revealed(long _self);
        boolean gtk_revealer_get_reveal_child(long _self);
        int gtk_revealer_get_transition_duration(long _self);
        int gtk_revealer_get_transition_type(long _self);
        void gtk_revealer_set_child(long _self, long child);
        void gtk_revealer_set_reveal_child(long _self, boolean reveal_child);
        void gtk_revealer_set_transition_duration(long _self, int duration);
        void gtk_revealer_set_transition_type(long _self, int transition);
        long gtk_revealer_get_type();
    }

}
