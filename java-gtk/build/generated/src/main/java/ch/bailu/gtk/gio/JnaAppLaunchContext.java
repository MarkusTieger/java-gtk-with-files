/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaAppLaunchContext {

    @FunctionalInterface
    public interface OnLaunchFailed extends com.sun.jna.Callback {
        void invoke(long _self, long startup_notify_id, long _data);
    }

    @FunctionalInterface
    public interface OnLaunchStarted extends com.sun.jna.Callback {
        void invoke(long _self, long info, long platform_data, long _data);
    }

    @FunctionalInterface
    public interface OnLaunched extends com.sun.jna.Callback {
        void invoke(long _self, long info, long platform_data, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_app_launch_context_new();
        long g_app_launch_context_get_display(long _self, long info, long files);
        long g_app_launch_context_get_environment(long _self);
        long g_app_launch_context_get_startup_notify_id(long _self, long info, long files);
        void g_app_launch_context_launch_failed(long _self, long startup_notify_id);
        void g_app_launch_context_launch_failed(long _self, String startup_notify_id);
        void g_app_launch_context_setenv(long _self, long variable, long value);
        void g_app_launch_context_setenv(long _self, String variable, String value);
        void g_app_launch_context_unsetenv(long _self, long variable);
        void g_app_launch_context_unsetenv(long _self, String variable);
        long g_app_launch_context_get_type();
    }

}
