/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaPadController {



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_pad_controller_new(long group, long pad);
        void gtk_pad_controller_set_action(long _self, int type, int index, int mode, long label, long action_name);
        void gtk_pad_controller_set_action(long _self, int type, int index, int mode, String label, String action_name);
        long gtk_pad_controller_get_type();
    }

}
