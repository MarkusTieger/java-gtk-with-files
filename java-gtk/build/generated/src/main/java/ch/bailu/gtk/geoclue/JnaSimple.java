/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaSimple {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long gclue_simple_new_finish(long result, long _error);
        long gclue_simple_new_sync(long desktop_id, int accuracy_level, long cancellable, long _error);
        long gclue_simple_new_sync(String desktop_id, int accuracy_level, long cancellable, long _error);
        long gclue_simple_new_with_thresholds_finish(long result, long _error);
        long gclue_simple_new_with_thresholds_sync(long desktop_id, int accuracy_level, int time_threshold, int distance_threshold, long cancellable, long _error);
        long gclue_simple_new_with_thresholds_sync(String desktop_id, int accuracy_level, int time_threshold, int distance_threshold, long cancellable, long _error);
        long gclue_simple_get_client(long _self);
        long gclue_simple_get_location(long _self);
        void gclue_simple_new(long desktop_id, int accuracy_level, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gclue_simple_new_with_thresholds(long desktop_id, int accuracy_level, int time_threshold, int distance_threshold, long cancellable, com.sun.jna.Callback callback, long user_data);
        long gclue_simple_get_type();
    }

}
