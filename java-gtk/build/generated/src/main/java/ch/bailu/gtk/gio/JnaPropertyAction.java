/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaPropertyAction {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_property_action_new(long name, long object, long property_name);
        long g_property_action_new(String name, long object, String property_name);
        long g_property_action_get_type();
    }

}
