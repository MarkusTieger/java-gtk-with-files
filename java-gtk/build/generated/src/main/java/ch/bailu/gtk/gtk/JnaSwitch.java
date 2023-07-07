/* this file is machine generated */
package ch.bailu.gtk.gtk;




class JnaSwitch {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }

    @FunctionalInterface
    public interface OnStateSet extends com.sun.jna.Callback {
        boolean invoke(long _self, boolean state, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gtk-4", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gtk_switch_new();
        boolean gtk_switch_get_active(long _self);
        boolean gtk_switch_get_state(long _self);
        void gtk_switch_set_active(long _self, boolean is_active);
        void gtk_switch_set_state(long _self, boolean state);
        long gtk_switch_get_type();
    }

}
