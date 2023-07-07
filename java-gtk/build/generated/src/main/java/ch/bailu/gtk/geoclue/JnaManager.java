/* this file is machine generated */
package ch.bailu.gtk.geoclue;




class JnaManager {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnHandleAddAgent extends com.sun.jna.Callback {
        boolean invoke(long _self, long invocation, long arg_id, long _data);
    }

    @FunctionalInterface
    public interface OnHandleCreateClient extends com.sun.jna.Callback {
        boolean invoke(long _self, long invocation, long _data);
    }

    @FunctionalInterface
    public interface OnHandleDeleteClient extends com.sun.jna.Callback {
        boolean invoke(long _self, long invocation, long arg_client, long _data);
    }

    @FunctionalInterface
    public interface OnHandleGetClient extends com.sun.jna.Callback {
        boolean invoke(long _self, long invocation, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("geoclue-2", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        void gclue_manager_call_add_agent(long _self, long arg_id, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gclue_manager_call_add_agent(long _self, String arg_id, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gclue_manager_call_add_agent_finish(long _self, long res, long _error);
        boolean gclue_manager_call_add_agent_sync(long _self, long arg_id, long cancellable, long _error);
        boolean gclue_manager_call_add_agent_sync(long _self, String arg_id, long cancellable, long _error);
        void gclue_manager_call_create_client(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gclue_manager_call_delete_client(long _self, long arg_client, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gclue_manager_call_delete_client(long _self, String arg_client, long cancellable, com.sun.jna.Callback callback, long user_data);
        boolean gclue_manager_call_delete_client_finish(long _self, long res, long _error);
        boolean gclue_manager_call_delete_client_sync(long _self, long arg_client, long cancellable, long _error);
        boolean gclue_manager_call_delete_client_sync(long _self, String arg_client, long cancellable, long _error);
        void gclue_manager_call_get_client(long _self, long cancellable, com.sun.jna.Callback callback, long user_data);
        void gclue_manager_complete_add_agent(long _self, long invocation);
        void gclue_manager_complete_create_client(long _self, long invocation, long client);
        void gclue_manager_complete_create_client(long _self, long invocation, String client);
        void gclue_manager_complete_delete_client(long _self, long invocation);
        void gclue_manager_complete_get_client(long _self, long invocation, long client);
        void gclue_manager_complete_get_client(long _self, long invocation, String client);
        int gclue_manager_get_available_accuracy_level(long _self);
        boolean gclue_manager_get_in_use(long _self);
        void gclue_manager_set_available_accuracy_level(long _self, int value);
        void gclue_manager_set_in_use(long _self, boolean value);
        long gclue_manager_interface_info();
        int gclue_manager_override_properties(long klass, int property_id_begin);
        long gclue_manager_get_type();
    }

}
