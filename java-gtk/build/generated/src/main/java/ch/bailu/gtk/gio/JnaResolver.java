/* this file is machine generated */
package ch.bailu.gtk.gio;




class JnaResolver {

    @FunctionalInterface
    public interface OnAsyncReadyCallback extends com.sun.jna.Callback {
        void invoke(long source_object, long res, long user_data);
    }

    @FunctionalInterface
    public interface OnReload extends com.sun.jna.Callback {
        void invoke(long _self, long _data);
    }



    private static Instance INSTANCE;
    
    static Instance INST() {
        if (INSTANCE == null) {
            INSTANCE = ch.bailu.gtk.lib.jna.Loader.load("gio-2.0", Instance.class);
        }
        return INSTANCE;
    }
    
    public interface Instance extends com.sun.jna.Library {
        long g_resolver_lookup_by_address(long _self, long address, long cancellable, long _error);
        void g_resolver_lookup_by_address_async(long _self, long address, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_resolver_lookup_by_address_finish(long _self, long result, long _error);
        long g_resolver_lookup_by_name(long _self, long hostname, long cancellable, long _error);
        long g_resolver_lookup_by_name(long _self, String hostname, long cancellable, long _error);
        void g_resolver_lookup_by_name_async(long _self, long hostname, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_resolver_lookup_by_name_async(long _self, String hostname, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_resolver_lookup_by_name_finish(long _self, long result, long _error);
        long g_resolver_lookup_by_name_with_flags(long _self, long hostname, int flags, long cancellable, long _error);
        long g_resolver_lookup_by_name_with_flags(long _self, String hostname, int flags, long cancellable, long _error);
        void g_resolver_lookup_by_name_with_flags_async(long _self, long hostname, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_resolver_lookup_by_name_with_flags_async(long _self, String hostname, int flags, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_resolver_lookup_by_name_with_flags_finish(long _self, long result, long _error);
        long g_resolver_lookup_records(long _self, long rrname, int record_type, long cancellable, long _error);
        long g_resolver_lookup_records(long _self, String rrname, int record_type, long cancellable, long _error);
        void g_resolver_lookup_records_async(long _self, long rrname, int record_type, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_resolver_lookup_records_async(long _self, String rrname, int record_type, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_resolver_lookup_records_finish(long _self, long result, long _error);
        long g_resolver_lookup_service(long _self, long service, long protocol, long domain, long cancellable, long _error);
        long g_resolver_lookup_service(long _self, String service, String protocol, String domain, long cancellable, long _error);
        void g_resolver_lookup_service_async(long _self, long service, long protocol, long domain, long cancellable, com.sun.jna.Callback callback, long user_data);
        void g_resolver_lookup_service_async(long _self, String service, String protocol, String domain, long cancellable, com.sun.jna.Callback callback, long user_data);
        long g_resolver_lookup_service_finish(long _self, long result, long _error);
        void g_resolver_set_default(long _self);
        void g_resolver_free_addresses(long addresses);
        void g_resolver_free_targets(long targets);
        long g_resolver_get_default();
        long g_resolver_get_type();
    }

}
