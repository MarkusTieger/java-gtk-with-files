/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaClient {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnHandleStart extends com.sun.jna.Callback {
        boolean invoke(long _self, long invocation, long _data);
    }

    @FunctionalInterface
    public interface OnHandleStop extends com.sun.jna.Callback {
        boolean invoke(long _self, long invocation, long _data);
    }

    @FunctionalInterface
    public interface OnLocationUpdated extends com.sun.jna.Callback {
        void invoke(long _self, long arg_old, long arg_new, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gclue_client_call_start(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gclue_client_call_start_finish(long _self, long res, long _error);
        boolean gclue_client_call_start_sync(long _self, long cancellable, long _error);
        void gclue_client_call_stop(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gclue_client_call_stop_finish(long _self, long res, long _error);
        boolean gclue_client_call_stop_sync(long _self, long cancellable, long _error);
        void gclue_client_complete_start(long _self, long invocation);
        void gclue_client_complete_stop(long _self, long invocation);
        long gclue_client_dup_desktop_id(long _self);
        long gclue_client_dup_location(long _self);
        void gclue_client_emit_location_updated(long _self, long arg_old, long arg_new);
        void gclue_client_emit_location_updated(long _self, String arg_old, String arg_new);
        boolean gclue_client_get_active(long _self);
        long gclue_client_get_desktop_id(long _self);
        int gclue_client_get_distance_threshold(long _self);
        long gclue_client_get_location(long _self);
        int gclue_client_get_requested_accuracy_level(long _self);
        int gclue_client_get_time_threshold(long _self);
        void gclue_client_set_active(long _self, boolean value);
        void gclue_client_set_desktop_id(long _self, long value);
        void gclue_client_set_desktop_id(long _self, String value);
        void gclue_client_set_distance_threshold(long _self, int value);
        void gclue_client_set_location(long _self, long value);
        void gclue_client_set_location(long _self, String value);
        void gclue_client_set_requested_accuracy_level(long _self, int value);
        void gclue_client_set_time_threshold(long _self, int value);
        long gclue_client_interface_info();
        int gclue_client_override_properties(long klass, int property_id_begin);
        long gclue_client_get_type();
    }

}
