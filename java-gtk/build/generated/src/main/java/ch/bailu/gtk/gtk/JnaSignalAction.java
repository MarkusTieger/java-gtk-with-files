/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSignalAction {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_signal_action_new(long signal_name);
        long gtk_signal_action_new(String signal_name);
        long gtk_signal_action_get_signal_name(long _self);
        long gtk_signal_action_get_type();
    }

}
