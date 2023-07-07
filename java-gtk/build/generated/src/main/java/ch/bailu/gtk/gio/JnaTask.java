/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaTask {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnSourceFunc extends com.sun.jna.Callback {
        boolean invoke(long user_data);
    }

    @FunctionalInterface
    public interface OnDestroyNotify extends com.sun.jna.Callback {
        void invoke(long data);
    }

    @FunctionalInterface
    public interface OnTaskThreadFunc extends com.sun.jna.Callback {
        void invoke(long task, long source_object, long task_data, long cancellable);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_task_new(long source_object, long cancellable, com.sun.jna.Callback callback, long callback_data);
        void g_task_attach_source(long _self, long source, com.sun.jna.Callback callback);
        long g_task_get_cancellable(long _self);
        boolean g_task_get_check_cancellable(long _self);
        boolean g_task_get_completed(long _self);
        long g_task_get_context(long _self);
        long g_task_get_name(long _self);
        int g_task_get_priority(long _self);
        boolean g_task_get_return_on_cancel(long _self);
        long g_task_get_source_object(long _self);
        long g_task_get_source_tag(long _self);
        long g_task_get_task_data(long _self);
        boolean g_task_had_error(long _self);
        boolean g_task_propagate_boolean(long _self, long _error);
        long g_task_propagate_int(long _self, long _error);
        long g_task_propagate_pointer(long _self, long _error);
        boolean g_task_propagate_value(long _self, long value, long _error);
        void g_task_return_boolean(long _self, boolean result);
        void g_task_return_error(long _self, long error);
        boolean g_task_return_error_if_cancelled(long _self);
        void g_task_return_int(long _self, long result);
        void g_task_return_new_error(long _self, int domain, int code, long format, java.lang.Object... _elipse);
        void g_task_return_new_error(long _self, int domain, int code, String format, java.lang.Object... _elipse);
        void g_task_return_pointer(long _self, long result, com.sun.jna.Callback result_destroy);
        void g_task_return_value(long _self, long result);
        void g_task_run_in_thread(long _self, com.sun.jna.Callback task_func);
        void g_task_run_in_thread_sync(long _self, com.sun.jna.Callback task_func);
        void g_task_set_check_cancellable(long _self, boolean check_cancellable);
        void g_task_set_name(long _self, long name);
        void g_task_set_name(long _self, String name);
        void g_task_set_priority(long _self, int priority);
        boolean g_task_set_return_on_cancel(long _self, boolean return_on_cancel);
        void g_task_set_source_tag(long _self, long source_tag);
        void g_task_set_task_data(long _self, long task_data, com.sun.jna.Callback task_data_destroy);
        boolean g_task_is_valid(long result, long source_object);
        void g_task_report_error(long source_object, com.sun.jna.Callback callback, long callback_data, long source_tag, long error);
        void g_task_report_new_error(long source_object, com.sun.jna.Callback callback, long callback_data, long source_tag, int domain, int code, long format, java.lang.Object... _elipse);
        long g_task_get_type();
    }

}
