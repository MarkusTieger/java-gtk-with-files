/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaFileEnumerator {

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
        boolean g_file_enumerator_close(long _self, long cancellable, long _error);
        void g_file_enumerator_close_async(long _self, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean g_file_enumerator_close_finish(long _self, long result, long _error);
        long g_file_enumerator_get_child(long _self, long info);
        long g_file_enumerator_get_container(long _self);
        boolean g_file_enumerator_has_pending(long _self);
        boolean g_file_enumerator_is_closed(long _self);
        long g_file_enumerator_next_file(long _self, long cancellable, long _error);
        void g_file_enumerator_next_files_async(long _self, int num_files, int io_priority, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_file_enumerator_next_files_finish(long _self, long result, long _error);
        void g_file_enumerator_set_pending(long _self, boolean pending);
        long g_file_enumerator_get_type();
    }

}
