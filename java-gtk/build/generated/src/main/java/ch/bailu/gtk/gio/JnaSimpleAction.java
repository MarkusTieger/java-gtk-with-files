/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSimpleAction {

    @FunctionalInterface
    public interface OnActivate extends com.sun.jna.Callback {
        void invoke(long _self, long parameter, long _data);
    }

    @FunctionalInterface
    public interface OnChangeState extends com.sun.jna.Callback {
        void invoke(long _self, long value, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_simple_action_new(long name, long parameter_type);
        long g_simple_action_new(String name, long parameter_type);
        long g_simple_action_new_stateful(long name, long parameter_type, long state);
        long g_simple_action_new_stateful(String name, long parameter_type, long state);
        void g_simple_action_set_enabled(long _self, boolean enabled);
        void g_simple_action_set_state(long _self, long value);
        void g_simple_action_set_state_hint(long _self, long state_hint);
        long g_simple_action_get_type();
    }

}
