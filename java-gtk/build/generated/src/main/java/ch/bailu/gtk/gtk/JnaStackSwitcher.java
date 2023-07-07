/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaStackSwitcher {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_stack_switcher_new();
        long gtk_stack_switcher_get_stack(long _self);
        void gtk_stack_switcher_set_stack(long _self, long stack);
        long gtk_stack_switcher_get_type();
    }

}
