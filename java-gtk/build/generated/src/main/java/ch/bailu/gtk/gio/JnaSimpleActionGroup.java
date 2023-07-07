/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSimpleActionGroup {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_simple_action_group_new();
        long g_simple_action_group_get_type();
    }

}
