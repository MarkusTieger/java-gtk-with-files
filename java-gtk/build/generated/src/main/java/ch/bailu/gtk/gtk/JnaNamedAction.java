/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaNamedAction {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_named_action_new(long name);
        long gtk_named_action_new(String name);
        long gtk_named_action_get_action_name(long _self);
        long gtk_named_action_get_type();
    }

}
