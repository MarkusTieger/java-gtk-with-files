/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaSubprocessLauncher {

    @FunctionalInterface
    public interface OnSpawnChildSetupFunc extends com.sun.jna.Callback {
        void invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_subprocess_launcher_new(int flags);
        void g_subprocess_launcher_close(long _self);
        long g_subprocess_launcher_getenv(long _self, long variable);
        long g_subprocess_launcher_getenv(long _self, String variable);
        void g_subprocess_launcher_set_child_setup(long _self, com.sun.jna.Callback child_setup, long user_data, com.sun.jna.Callback destroy_notify);
        void g_subprocess_launcher_set_cwd(long _self, long cwd);
        void g_subprocess_launcher_set_cwd(long _self, String cwd);
        void g_subprocess_launcher_set_flags(long _self, int flags);
        void g_subprocess_launcher_set_stderr_file_path(long _self, long path);
        void g_subprocess_launcher_set_stderr_file_path(long _self, String path);
        void g_subprocess_launcher_set_stdin_file_path(long _self, long path);
        void g_subprocess_launcher_set_stdin_file_path(long _self, String path);
        void g_subprocess_launcher_set_stdout_file_path(long _self, long path);
        void g_subprocess_launcher_set_stdout_file_path(long _self, String path);
        void g_subprocess_launcher_setenv(long _self, long variable, long value, boolean overwrite);
        void g_subprocess_launcher_setenv(long _self, String variable, String value, boolean overwrite);
        void g_subprocess_launcher_take_fd(long _self, int source_fd, int target_fd);
        void g_subprocess_launcher_take_stderr_fd(long _self, int fd);
        void g_subprocess_launcher_take_stdin_fd(long _self, int fd);
        void g_subprocess_launcher_take_stdout_fd(long _self, int fd);
        void g_subprocess_launcher_unsetenv(long _self, long variable);
        void g_subprocess_launcher_unsetenv(long _self, String variable);
        long g_subprocess_launcher_get_type();
    }

}
