/* this file is machine generated */
package ch.bailu.gtk.glib;




class JnaThread {

    @FunctionalInterface
    public interface OnThreadFunc extends com.sun.jna.Callback {
        long invoke(long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("glib-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_thread_new(long name, com.sun.jna.Callback func, long data);
        long g_thread_new(String name, com.sun.jna.Callback func, long data);
        long g_thread_try_new(long name, com.sun.jna.Callback func, long data, long _error);
        long g_thread_try_new(String name, com.sun.jna.Callback func, long data, long _error);
        long g_thread_join(long _self);
        long g_thread_ref(long _self);
        void g_thread_unref(long _self);
        int g_thread_error_quark();
        void g_thread_exit(long retval);
        long g_thread_self();
        void g_thread_yield();
        long g_thread_get_type();
    }

}
