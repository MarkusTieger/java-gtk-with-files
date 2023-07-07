/* this file is machine generated */
package ch.bailu.gtk.gobject;




class JnaSignalGroup {

    @FunctionalInterface
    public interface OnCallback extends com.sun.jna.Callback {
        void invoke();
    }

    @FunctionalInterface
    public interface OnClosureNotify extends com.sun.jna.Callback {
        void invoke(long data, long closure);
    }

    @FunctionalInterface
    public interface OnBind extends com.sun.jna.Callback {
        void invoke(long _self, long instance, long _data);
    }

    @FunctionalInterface
    public interface OnUnbind extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gobject-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_signal_group_new(long target_type);
        void g_signal_group_block(long _self);
        void g_signal_group_connect(long _self, long detailed_signal, com.sun.jna.Callback c_handler, long data);
        void g_signal_group_connect(long _self, String detailed_signal, com.sun.jna.Callback c_handler, long data);
        void g_signal_group_connect_after(long _self, long detailed_signal, com.sun.jna.Callback c_handler, long data);
        void g_signal_group_connect_after(long _self, String detailed_signal, com.sun.jna.Callback c_handler, long data);
        void g_signal_group_connect_closure(long _self, long detailed_signal, long closure, boolean after);
        void g_signal_group_connect_closure(long _self, String detailed_signal, long closure, boolean after);
        void g_signal_group_connect_data(long _self, long detailed_signal, com.sun.jna.Callback c_handler, long data, com.sun.jna.Callback notify, int flags);
        void g_signal_group_connect_data(long _self, String detailed_signal, com.sun.jna.Callback c_handler, long data, com.sun.jna.Callback notify, int flags);
        void g_signal_group_connect_object(long _self, long detailed_signal, com.sun.jna.Callback c_handler, long object, int flags);
        void g_signal_group_connect_object(long _self, String detailed_signal, com.sun.jna.Callback c_handler, long object, int flags);
        void g_signal_group_connect_swapped(long _self, long detailed_signal, com.sun.jna.Callback c_handler, long data);
        void g_signal_group_connect_swapped(long _self, String detailed_signal, com.sun.jna.Callback c_handler, long data);
        long g_signal_group_dup_target(long _self);
        void g_signal_group_set_target(long _self, long target);
        void g_signal_group_unblock(long _self);
        long g_signal_group_get_type();
    }

}
