/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSubprocess {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void g_subprocess_communicate_async(long _self, long stdin_buf, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_subprocess_communicate_utf8(long _self, long stdin_buf, long cancellable, long stdout_buf, long stderr_buf, long _error);
        boolean g_subprocess_communicate_utf8(long _self, String stdin_buf, long cancellable, long stdout_buf, long stderr_buf, long _error);
        void g_subprocess_communicate_utf8_async(long _self, long stdin_buf, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_subprocess_communicate_utf8_async(long _self, String stdin_buf, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_subprocess_communicate_utf8_finish(long _self, long result, long stdout_buf, long stderr_buf, long _error);
        void g_subprocess_force_exit(long _self);
        int g_subprocess_get_exit_status(long _self);
        long g_subprocess_get_identifier(long _self);
        boolean g_subprocess_get_if_exited(long _self);
        boolean g_subprocess_get_if_signaled(long _self);
        int g_subprocess_get_status(long _self);
        long g_subprocess_get_stderr_pipe(long _self);
        long g_subprocess_get_stdin_pipe(long _self);
        long g_subprocess_get_stdout_pipe(long _self);
        boolean g_subprocess_get_successful(long _self);
        int g_subprocess_get_term_sig(long _self);
        void g_subprocess_send_signal(long _self, int signal_num);
        boolean g_subprocess_wait(long _self, long cancellable, long _error);
        void g_subprocess_wait_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_subprocess_wait_check(long _self, long cancellable, long _error);
        void g_subprocess_wait_check_async(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_subprocess_wait_check_finish(long _self, long result, long _error);
        boolean g_subprocess_wait_finish(long _self, long result, long _error);
        long g_subprocess_get_type();
    }

}
